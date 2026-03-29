package controller;

import model.Solicitacao;

public class SolicitacaoController {

    public SolicitacaoController() {
    }

    public void criarSolicitacao(Solicitacao s) {
        s.criarSolicitacao();
    }

    public void avaliarSolicitacao(Solicitacao s, String decisao) {
        if (decisao.equalsIgnoreCase("aprovar")) {
            s.alterarStatus("Aprovada");
        } else if (decisao.equalsIgnoreCase("rejeitar")) {
            s.alterarStatus("Rejeitada");
        }
    }

    public void alterarJustificativa(Solicitacao s, String novaJustificativa) {
        s.setJustificativa(novaJustificativa);
    }

    public void cancelarSolicitacao(Solicitacao s) {
        s.cancelarSolicitacao();
    }
}