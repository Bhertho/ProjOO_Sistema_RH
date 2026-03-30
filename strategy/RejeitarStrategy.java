package strategy;

import model.Solicitacao;
import model.StatusSolicitacao;

public class RejeitarStrategy implements AvaliacaoStrategy {

    @Override
    public void avaliar(Solicitacao s) {
        s.setStatus(StatusSolicitacao.REJEITADA);
    }
}