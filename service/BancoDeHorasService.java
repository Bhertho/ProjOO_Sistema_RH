package service;

import java.time.Duration;

import model.BancoDeHoras;
import strategy.ValidacaoBancoHorasStrategy;

public class BancoDeHorasService {

    public Duration consultarBanco(BancoDeHoras b) {
        return b.getQuantidade();
    }

    public void atualizarBanco(BancoDeHoras b, Duration novaQuantidade) {
        b.setQuantidade(novaQuantidade);
    }

    public boolean validar(BancoDeHoras b, ValidacaoBancoHorasStrategy strategy) {
        return strategy.validar(b);
    }
}