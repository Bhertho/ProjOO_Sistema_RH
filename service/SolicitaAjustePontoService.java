package service;

import java.sql.Time;
import java.util.Date;

import model.SolicitaAjustePonto;
import strategy.ValidacaoAjustePontoStrategy;

public class SolicitaAjustePontoService {

    public void informarDataHora(SolicitaAjustePonto s, Date data, Time hora) {
        s.setData(data);
        s.setHora(hora);
    }

    public boolean validar(SolicitaAjustePonto s, ValidacaoAjustePontoStrategy strategy) {
        return strategy.validar(s);
    }
}