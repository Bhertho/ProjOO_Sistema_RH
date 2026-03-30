package service;

import java.time.LocalDateTime;

import model.Ponto;
import strategy.ValidacaoPontoStrategy;

public class PontoService {

    public void registrarPonto(Ponto p, LocalDateTime marcacao, String relogio) {
        p.setMarcacao(marcacao);
        p.setRelogio(relogio);
    }

    public void ajustarPonto(Ponto p, LocalDateTime novaMarcacao) {
        p.setMarcacao(novaMarcacao);
    }

    public boolean validar(Ponto p, ValidacaoPontoStrategy strategy) {
        return strategy.validar(p);
    }
}