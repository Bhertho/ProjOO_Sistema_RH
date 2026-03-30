package controller;

import model.Ponto;
import java.time.LocalDateTime;

public class PontoController {

    public void registrarPonto(Ponto p, LocalDateTime marcacao, String relogio) {
        p.setMarcacao(marcacao);
        p.setRelogio(relogio);
    }

    public void ajustarPonto(Ponto p, LocalDateTime novaMarcacao) {
        p.ajustarPonto(novaMarcacao);
    }

    public boolean validar(Ponto p) {
        if (p.getMarcacao() == null || p.getRelogio() == null) {
            return false;
        }
        return true;
    }
}