package controller;

import java.time.Duration;

import model.BancoDeHoras;
import service.BancoDeHorasService;
import strategy.ValidacaoBancoHorasStrategy;

public class BancoDeHorasController {

    private BancoDeHorasService service;

    public BancoDeHorasController(BancoDeHorasService service) {
        this.service = service;
    }

    public Duration consultarBanco(BancoDeHoras b) {
        return service.consultarBanco(b);
    }

    public void atualizarBanco(BancoDeHoras b, Duration novaQuantidade) {
        service.atualizarBanco(b, novaQuantidade);
    }

    public boolean validar(BancoDeHoras b, ValidacaoBancoHorasStrategy strategy) {
        return service.validar(b, strategy);
    }
}