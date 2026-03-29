package controller;

import model.SolicitaAjustePonto;
import java.util.Date;
import java.sql.Time;

public class SolicitaAjustePontoController {
	
	public void informarDataHora(SolicitaAjustePonto s, Date data, Time hora) {
		s.informarDataHora(data, hora);
	}
	
	public boolean validar(SolicitaAjustePonto s) {
		return s.validar();
	}
}