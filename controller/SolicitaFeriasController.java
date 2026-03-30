package controller;

import java.util.Date;

import model.SolicitaFerias;
import service.SolicitaFeriasService;
import strategy.CalculoFeriasStrategy;

public class SolicitaFeriasController {

    private SolicitaFeriasService service;

    public SolicitaFeriasController(SolicitaFeriasService service) {
        this.service = service;
    }

    public void informarDatas(SolicitaFerias s, Date inicio, Date fim) {
        service.informarDatas(s, inicio, fim);
    }

    public void calcularPeriodo(SolicitaFerias s, CalculoFeriasStrategy strategy) {
        service.calcularPeriodo(s, strategy);
    }
}