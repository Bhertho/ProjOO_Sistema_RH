package service;

import java.util.Date;

import model.SolicitaJustificaAusencia;
import strategy.ValidacaoJustificativaStrategy;

public class SolicitaJustificaAusenciaService {

    public void informarData(SolicitaJustificaAusencia s, Date inicio, Date fim) {
        s.setDtInicio(inicio);
        s.setDtFim(fim);
    }

    public void anexarComprovante(SolicitaJustificaAusencia s, String comprovante) {
        s.setComprovante(comprovante);
    }

    public boolean validar(SolicitaJustificaAusencia s, ValidacaoJustificativaStrategy strategy) {
        return strategy.validar(s);
    }
}