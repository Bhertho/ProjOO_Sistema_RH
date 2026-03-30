package service;

import model.Cargo;
import model.Colaborador;
import model.SolicitaPromocao;
import strategy.ValidacaoPromocaoStrategy;

public class SolicitaPromocaoService {

    public void preencherPromocao(SolicitaPromocao s, Colaborador c, Cargo cargo, double salario) {
        s.setColaborador(c);
        s.setCargo(cargo);
        s.setNovoSalario(salario);
    }

    public boolean validar(SolicitaPromocao s, ValidacaoPromocaoStrategy strategy) {
        return strategy.validar(s);
    }
}