package service;

import java.util.Date;

import model.SolicitaFerias;
import strategy.CalculoFeriasStrategy;

public class SolicitaFeriasService {

    public void informarDatas(SolicitaFerias s, Date inicio, Date fim) {
        s.setDtInicio(inicio);
        s.setDtFim(fim);
    }

    public void calcularPeriodo(SolicitaFerias s, CalculoFeriasStrategy strategy) {
        int dias = strategy.calcularDias(s);
        s.setQuantidadeDias(dias);
    }
}