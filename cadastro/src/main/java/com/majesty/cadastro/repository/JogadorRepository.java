package main.java.com.majesty.cadastro.repository;

import org.springframework.stereotype.Repository;


@Repository
public class JogadorRepository {

    private final JdbcClient jdbcClient;

    public JogadorRepository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public Jogador salvar (Jogador jogador) {
        jdbcClient.sql("""
                INSERT INTO JOGADORES( nome, email, telefone, codinome, grupo_codinome ) 
                VALUES ( ?, ?, ?, ?, ? )
                """)
                .param("nome", jogador.nome())
                .param("email", jogador.email())
                .param("telefone", jogador.telefone())
                .param("codinome", jogador.codinome())
                .param("grupo_codinome", jogador.grupoCodinome())
                .update();

        return jogador;
    }

}
