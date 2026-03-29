package sistema_RH.controller;

import java.util.Date;

import sistema_RH.model.SolicitaJustificaAusencia;

public class SolicitaJustificaAusenciaController {

	public void informarData(SolicitaJustificaAusencia s, Date inicio, Date fim) {
		s.informarData(inicio, fim);
	}
	
	public void anexarComprovante(SolicitaJustificaAusencia s, String comprovante) {
		s.anexarComprovante(comprovante);
	}
	
	public boolean validar(SolicitaJustificaAusencia s) {
		return s.validar();
	}
}