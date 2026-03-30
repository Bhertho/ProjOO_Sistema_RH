package controller;

import java.time.LocalDateTime;

import model.Ponto;
import service.PontoService;
import strategy.ValidacaoPontoStrategy;

public class PontoController {

    private PontoService service;

    public PontoController(PontoService service) {
        this.service = service;
    }

    public void registrarPonto(Ponto p, LocalDateTime marcacao, String relogio) {
        service.registrarPonto(p, marcacao, relogio);
    }

    public void ajustarPonto(Ponto p, LocalDateTime novaMarcacao) {
        service.ajustarPonto(p, novaMarcacao);
    }

    public boolean validar(Ponto p, ValidacaoPontoStrategy strategy) {
        return service.validar(p, strategy);
    }
}