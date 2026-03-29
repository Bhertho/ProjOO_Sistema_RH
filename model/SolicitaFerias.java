package model;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class SolicitaFerias extends Solicitacao {
	
	private Date dtInicio;
	private Date dtFim;
	private int quantidadeDias;
	
	public Date getDtInicio() {
		return dtInicio;
	}
	
	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}
	
	public Date getDtFim() {
		return dtFim;
	}
	
	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
	}
	
	public int getQuantidadeDias() {
		return quantidadeDias;
	}
	
	public void setQuantidadeDias(int quantidadeDias) {
		this.quantidadeDias = quantidadeDias;
	}
	
	public void informarDatas(Date inicio, Date fim) {
		this.dtInicio = inicio;
		this.dtFim = fim;
	}
	
	public void calcularPeriodo() {
		long diferenca = this.dtFim.getTime() - this.dtInicio.getTime();
		int dias = (int) TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
		this.quantidadeDias = dias;
	}
}