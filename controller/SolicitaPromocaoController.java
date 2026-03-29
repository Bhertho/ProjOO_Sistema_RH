package controller;

import model.Cargo;
import model.Colaborador;
import model.SolicitaPromocao;

public class SolicitaPromocaoController {
	
	public void preencherPromocao(SolicitaPromocao s, Colaborador c, Cargo cargo, double salario) {
		s.preencherPromocao(c, cargo, salario);
	}
	
	public boolean validar(SolicitaPromocao s) {
		return s.validar();
	}
}