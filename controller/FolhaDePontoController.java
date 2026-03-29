package controller;

import model.FolhaDePonto;
import java.util.Date;

public class FolhaDePontoController {

    public void definirPeriodo(FolhaDePonto f, Date inicio, Date fim) {
        f.setDtInicio(inicio);
        f.setDtFim(fim);
    }

    public String visualizarEspelho(FolhaDePonto f) {
        return f.visualizarEspelho();
    }

    public boolean validar(FolhaDePonto f) {
        if (f.getDtInicio() == null || f.getDtFim() == null) {
            return false;
        }
        return true;
    }
}