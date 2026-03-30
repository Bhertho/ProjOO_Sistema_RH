package strategy;

import model.FolhaDePonto;

public interface ValidacaoFolhaStrategy {
    boolean validar(FolhaDePonto f);
}