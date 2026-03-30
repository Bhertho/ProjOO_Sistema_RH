package strategy;

import model.SolicitaJustificaAusencia;

public class ValidacaoBasicaStrategy implements ValidacaoJustificativaStrategy {

    @Override
    public boolean validar(SolicitaJustificaAusencia s) {

        if (s.getDtInicio() == null || s.getDtFim() == null) {
            return false;
        }

        if (s.getComprovante() == null || s.getComprovante().isEmpty()) {
            return false;
        }

        return true;
    }
}