package controller;

import java.util.Date;

import model.FolhaDePonto;
import service.FolhaDePontoService;
import strategy.ValidacaoFolhaStrategy;
import strategy.VisualizacaoFolhaStrategy;

public class FolhaDePontoController {

    private FolhaDePontoService service;

    public FolhaDePontoController(FolhaDePontoService service) {
        this.service = service;
    }

    public void definirPeriodo(FolhaDePonto f, Date inicio, Date fim) {
        service.definirPeriodo(f, inicio, fim);
    }

    public boolean validar(FolhaDePonto f, ValidacaoFolhaStrategy strategy) {
        return service.validar(f, strategy);
    }

    public String visualizar(FolhaDePonto f, VisualizacaoFolhaStrategy strategy) {
        return service.visualizar(f, strategy);
    }
}