package strategy;

import model.SolicitaAjustePonto;

public interface ValidacaoAjustePontoStrategy {
    boolean validar(SolicitaAjustePonto s);
}