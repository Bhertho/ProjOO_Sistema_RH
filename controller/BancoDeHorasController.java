package controller;

import model.BancoDeHoras;
import java.time.Duration;

public class BancoDeHorasController {

    public Duration consultarBanco(BancoDeHoras b) {
        return b.consultarBanco();
    }

    public void atualizarBanco(BancoDeHoras b, Duration novaQuantidade) {
        b.atualizarBanco(novaQuantidade);
    }

    public boolean validar(BancoDeHoras b) {
        return b.getQuantidade() != null;
    }
}