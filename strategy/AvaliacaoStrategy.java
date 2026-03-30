package strategy;

import model.Solicitacao;

public interface AvaliacaoStrategy {
    void avaliar(Solicitacao s);
}