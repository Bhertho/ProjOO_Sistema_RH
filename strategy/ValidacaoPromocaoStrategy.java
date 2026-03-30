package strategy;

import model.SolicitaPromocao;

public interface ValidacaoPromocaoStrategy {
    boolean validar(SolicitaPromocao s);
}