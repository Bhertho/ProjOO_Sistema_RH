package strategy;

import model.BancoDeHoras;

public interface ValidacaoBancoHorasStrategy {
    boolean validar(BancoDeHoras b);
}