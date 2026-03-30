package strategy;

import model.Ponto;

public class ValidacaoBasicaPontoStrategy implements ValidacaoPontoStrategy {

    @Override
    public boolean validar(Ponto p) {

        if (p.getMarcacao() == null || p.getRelogio() == null) {
            return false;
        }

        return true;
    }
}