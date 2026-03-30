package strategy;

import java.util.concurrent.TimeUnit;

import model.SolicitaFerias;

public class CalculoDiasCorridosStrategy implements CalculoFeriasStrategy {

    @Override
    public int calcularDias(SolicitaFerias s) {
        long diferenca = s.getDtFim().getTime() - s.getDtInicio().getTime();
        return (int) TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
    }
}