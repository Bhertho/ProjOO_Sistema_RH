package strategy;

import model.BancoDeHoras;

public class ValidacaoBasicaBancoHorasStrategy implements ValidacaoBancoHorasStrategy {

    @Override
    public boolean validar(BancoDeHoras b) {
        return b.getQuantidade() != null;
    }
}