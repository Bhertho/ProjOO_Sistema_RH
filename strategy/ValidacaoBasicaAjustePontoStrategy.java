package strategy;

import model.SolicitaAjustePonto;

public class ValidacaoBasicaAjustePontoStrategy implements ValidacaoAjustePontoStrategy {

    @Override
    public boolean validar(SolicitaAjustePonto s) {

        if (s.getData() == null || s.getHora() == null) {
            return false;
        }

        return true;
    }
}