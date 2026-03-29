package sistema_RH.model;

import java.sql.Time;
import java.util.Date;

public class SolicitaAjustePonto extends Solicitacao {

	private Date data;
	private Time hora;
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	public Time getHora() {
		return hora;
	}
	
	public void setHora(Time hora) {
		this.hora = hora;
	}
	
	public void informarDataHora(Date data, Time hora) {
		this.data = data;
		this.hora = hora;
	}
	
		public boolean validar() {
		if (this.data == null || this.hora == null) {
			return false;
		}
		return true;
	}
}