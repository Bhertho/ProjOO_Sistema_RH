package service;

import model.Solicitacao;
import model.StatusSolicitacao;

public class SolicitacaoService {

    public void criar(Solicitacao s) {
        s.setStatus(StatusSolicitacao.PENDENTE);
    }

    public void cancelar(Solicitacao s) {
        s.setStatus(StatusSolicitacao.CANCELADA);
    }

    public void alterarJustificativa(Solicitacao s, String justificativa) {
        s.setJustificativa(justificativa);
    }
}