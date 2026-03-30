package strategy;

import model.FolhaDePonto;

public class VisualizacaoSimplesStrategy implements VisualizacaoFolhaStrategy {

    @Override
    public String visualizar(FolhaDePonto f) {
        return "Folha de ponto de " + f.getDtInicio() + " até " + f.getDtFim();
    }
}