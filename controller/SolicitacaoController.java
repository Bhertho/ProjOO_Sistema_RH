package controller;

import model.Solicitacao;
import service.SolicitacaoService;
import strategy.AvaliacaoStrategy;

public class SolicitacaoController {
	
    private SolicitacaoService service;

    public SolicitacaoController(SolicitacaoService service) {
        this.service = service;
    }

    public void criarSolicitacao(Solicitacao s) {
        service.criar(s);
    }

    public void avaliarSolicitacao(Solicitacao s, AvaliacaoStrategy strategy) {
        strategy.avaliar(s);
    }

    public void alterarJustificativa(Solicitacao s, String justificativa) {
        service.alterarJustificativa(s, justificativa);
    }

    public void cancelarSolicitacao(Solicitacao s) {
        service.cancelar(s);
    }
}