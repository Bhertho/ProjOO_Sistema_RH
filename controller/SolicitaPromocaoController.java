package controller;

import model.Cargo;
import model.Colaborador;
import model.SolicitaPromocao;
import service.SolicitaPromocaoService;
import strategy.ValidacaoPromocaoStrategy;

public class SolicitaPromocaoController {

    private SolicitaPromocaoService service;

    public SolicitaPromocaoController(SolicitaPromocaoService service) {
        this.service = service;
    }

    public void preencherPromocao(SolicitaPromocao s, Colaborador c, Cargo cargo, double salario) {
        service.preencherPromocao(s, c, cargo, salario);
    }

    public boolean validar(SolicitaPromocao s, ValidacaoPromocaoStrategy strategy) {
        return service.validar(s, strategy);
    }
}