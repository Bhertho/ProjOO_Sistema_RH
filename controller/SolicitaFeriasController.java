package controller;

import java.util.Date;

import model.SolicitaFerias;

public class SolicitaFeriasController {
	
	public void informarDatas(SolicitaFerias s, Date inicio, Date fim) {
		s.informarDatas(inicio, fim);
	}
	
	public void calcularPeriodo(SolicitaFerias s) {
		s.calcularPeriodo();
	}
}