package strategy;

import model.Solicitacao;
import model.StatusSolicitacao;

public class AprovarStrategy implements AvaliacaoStrategy {

    @Override
    public void avaliar(Solicitacao s) {
        s.setStatus(StatusSolicitacao.APROVADA);
    }
}