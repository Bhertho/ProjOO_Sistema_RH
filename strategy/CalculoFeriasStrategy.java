package strategy;

import model.SolicitaFerias;

public interface CalculoFeriasStrategy {
    int calcularDias(SolicitaFerias s);
}