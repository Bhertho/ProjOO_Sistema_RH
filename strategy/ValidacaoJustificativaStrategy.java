package strategy;

import model.SolicitaJustificaAusencia;

public interface ValidacaoJustificativaStrategy {
    boolean validar(SolicitaJustificaAusencia s);
}