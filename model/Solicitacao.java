package model;

public class Solicitacao {
	
	private String justificativa;
	private String status;
	
	public Solicitacao() {
}
	public String getJustificativa() {
		return justificativa;
	}
	
	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;	
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void criarSolicitacao() {
		this.status = "Pendente";
	}
	
	public void alterarStatus(String novoStatus) {
	    this.status = novoStatus;
	}
	
	public void alterarJustificativa(String novaJustificativa) {	
	    this.justificativa = novaJustificativa;
	}
	
	public void cancelarSolicitacao() {
		this.status = "Cancelada";	
		}
}