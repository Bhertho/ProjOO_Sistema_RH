package model;

import java.time.LocalDateTime;

public class Ponto {

    private LocalDateTime marcacao;
    private String relogio;

    public LocalDateTime getMarcacao() {
        return marcacao;
    }

    public void setMarcacao(LocalDateTime marcacao) {
        this.marcacao = marcacao;
    }

    public String getRelogio() {
        return relogio;
    }

    public void setRelogio(String relogio) {
        this.relogio = relogio;
    }
}