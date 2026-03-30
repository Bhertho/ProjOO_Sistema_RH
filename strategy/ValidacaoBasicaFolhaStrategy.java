package strategy;

import model.FolhaDePonto;

public class ValidacaoBasicaFolhaStrategy implements ValidacaoFolhaStrategy {

    @Override
    public boolean validar(FolhaDePonto f) {

        if (f.getDtInicio() == null || f.getDtFim() == null) {
            return false;
        }

        return true;
    }
}