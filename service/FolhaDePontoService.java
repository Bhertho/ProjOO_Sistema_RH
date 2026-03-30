package service;

import java.util.Date;

import model.FolhaDePonto;
import strategy.ValidacaoFolhaStrategy;
import strategy.VisualizacaoFolhaStrategy;

public class FolhaDePontoService {

    public void definirPeriodo(FolhaDePonto f, Date inicio, Date fim) {
        f.setDtInicio(inicio);
        f.setDtFim(fim);
    }

    public boolean validar(FolhaDePonto f, ValidacaoFolhaStrategy strategy) {
        return strategy.validar(f);
    }

    public String visualizar(FolhaDePonto f, VisualizacaoFolhaStrategy strategy) {
        return strategy.visualizar(f);
    }
}