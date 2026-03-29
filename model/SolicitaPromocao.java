package sistema_RH.model;

public class SolicitaPromocao extends Solicitacao {
	
	private Colaborador colaborador;
	private Cargo cargo;
	private double novoSalario;
	
	public Colaborador getColaborador() {
		return colaborador;
	}
	
	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}
	
	public Cargo getCargo() {
		return cargo;
	}
	
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	public double getNovoSalario() {
		return novoSalario;
	}
	
	public void setNovoSalario(double novoSalario) {
		this.novoSalario = novoSalario;
	}
	
	public void preencherPromocao(Colaborador colaborador, Cargo cargo, double novoSalario) {
		this.colaborador = colaborador;
		this.cargo = cargo;
		this.novoSalario = novoSalario;
	}
	
	public void alterarColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}
	
	public void alterarNovoSalario(double novoSalario) {
		this.novoSalario = novoSalario;
	}
	
	public void alterarCargo (Cargo cargo) {
		this.cargo = cargo;
	}
	
	public boolean validar() {
		if (this.colaborador == null || this.cargo == null) {
			return false;
		}

		if (this.novoSalario <= 0) {
			return false;
		}

		return true;
	}
}