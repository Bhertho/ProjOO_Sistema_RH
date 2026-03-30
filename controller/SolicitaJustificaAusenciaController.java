package controller;

import java.util.Date;

import model.SolicitaJustificaAusencia;
import service.SolicitaJustificaAusenciaService;
import strategy.ValidacaoJustificativaStrategy;

public class SolicitaJustificaAusenciaController {

    private SolicitaJustificaAusenciaService service;

    public SolicitaJustificaAusenciaController(SolicitaJustificaAusenciaService service) {
        this.service = service;
    }

    public void informarData(SolicitaJustificaAusencia s, Date inicio, Date fim) {
        service.informarData(s, inicio, fim);
    }

    public void anexarComprovante(SolicitaJustificaAusencia s, String comprovante) {
        service.anexarComprovante(s, comprovante);
    }

    public boolean validar(SolicitaJustificaAusencia s, ValidacaoJustificativaStrategy strategy) {
        return service.validar(s, strategy);
    }
}