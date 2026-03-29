package sistema_RH.controller;

import sistema_RH.model.Cargo;
import sistema_RH.model.Colaborador;
import sistema_RH.model.SolicitaPromocao;

public class SolicitaPromocaoController {
	
	public void preencherPromocao(SolicitaPromocao s, Colaborador c, Cargo cargo, double salario) {
		s.preencherPromocao(c, cargo, salario);
	}
	
	public boolean validar(SolicitaPromocao s) {
		return s.validar();
	}
}