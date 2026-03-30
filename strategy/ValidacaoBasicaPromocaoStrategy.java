package strategy;

import model.SolicitaPromocao;

public class ValidacaoBasicaPromocaoStrategy implements ValidacaoPromocaoStrategy {

    @Override
    public boolean validar(SolicitaPromocao s) {

        if (s.getColaborador() == null || s.getCargo() == null) {
            return false;
        }

        if (s.getNovoSalario() <= 0) {
            return false;
        }

        return true;
    }
}