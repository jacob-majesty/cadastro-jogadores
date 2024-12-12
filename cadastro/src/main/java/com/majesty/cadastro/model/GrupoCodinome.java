package com.majesty.cadastro.model;

public enum GrupoCodinome {
    VINGADORES("Vingadores", "https://raw.githubusercontent.com/uolhost/test-backEnd-Java/master/referencias/vingadores.json"), LIGA_DA_JUSTICA("Liga da Justica", "https://raw.githubusercontent.com/uolhost/test-backEnd-Java/master/referencias/liga_da_justica.xml");

    GrupoCodinome(String codinome, String uri) {
        this.codinome = codinome;
        this.uri = uri;
    }

    private final String codinome;
    private final String uri;

    public String getCodinome() {
        return codinome;
    }

    public String getUri() {
        return uri;
    }
    

}