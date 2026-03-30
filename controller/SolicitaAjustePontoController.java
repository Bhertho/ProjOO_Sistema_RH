package controller;

import java.sql.Time;
import java.util.Date;

import model.SolicitaAjustePonto;
import service.SolicitaAjustePontoService;
import strategy.ValidacaoAjustePontoStrategy;

public class SolicitaAjustePontoController {

    private SolicitaAjustePontoService service;

    public SolicitaAjustePontoController(SolicitaAjustePontoService service) {
        this.service = service;
    }

    public void informarDataHora(SolicitaAjustePonto s, Date data, Time hora) {
        service.informarDataHora(s, data, hora);
    }

    public boolean validar(SolicitaAjustePonto s, ValidacaoAjustePontoStrategy strategy) {
        return service.validar(s, strategy);
    }
}