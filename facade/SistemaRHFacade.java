package facade;

import java.time.LocalDateTime;
import java.sql.Time;
import java.time.Duration;
import java.util.Date;

import controller.*;
import model.*;
import service.*;
import strategy.*;

public class SistemaRHFacade {
	
	private SolicitacaoController solicitacaoController;
    private SolicitacaoService solicitacaoService;
    
    private SolicitaFeriasController solicitaFeriasController;
    private SolicitaFeriasService solicitaFeriasService;
    
    private SolicitaAjustePontoController ajustePontoController;
    private SolicitaAjustePontoService ajustePontoService;
    
    private SolicitaPromocaoController promocaoController;
    private SolicitaPromocaoService promocaoService;
    
    private PontoController pontoController;
    private PontoService pontoService;
    
    private FolhaDePontoController folhaController;
    private FolhaDePontoService folhaService;
    
    private BancoDeHorasController bancoController;
    private BancoDeHorasService bancoService;

    public SistemaRHFacade() {
    	
        this.solicitacaoService = new SolicitacaoService();
        this.solicitacaoController = new SolicitacaoController(solicitacaoService);
        
        this.solicitaFeriasService = new SolicitaFeriasService();
        this.solicitaFeriasController = new SolicitaFeriasController(solicitaFeriasService);
        
        this.ajustePontoService = new SolicitaAjustePontoService();
        this.ajustePontoController = new SolicitaAjustePontoController(ajustePontoService);
        
        this.promocaoService = new SolicitaPromocaoService();
        this.promocaoController = new SolicitaPromocaoController(promocaoService);
        
        this.pontoService = new PontoService();
        this.pontoController = new PontoController(pontoService);
        
        this.folhaService = new FolhaDePontoService();
        this.folhaController = new FolhaDePontoController(folhaService);
        
        this.bancoService = new BancoDeHorasService();
        this.bancoController = new BancoDeHorasController(bancoService);
    }
    //
	//SOLICITAÇÃO
	//
	public void criarSolicitacao(Solicitacao s) {
	    solicitacaoController.criarSolicitacao(s);
	}

	public void aprovarSolicitacao(Solicitacao s) {
	    solicitacaoController.avaliarSolicitacao(
	        s,
	        new AprovarStrategy()
	    );
	}

	public void rejeitarSolicitacao(Solicitacao s) {
	    solicitacaoController.avaliarSolicitacao(
	        s,
	        new RejeitarStrategy()
	    );
	}

	public void alterarJustificativa(Solicitacao s, String justificativa) {
	    solicitacaoController.alterarJustificativa(s, justificativa);
	}

	public void cancelarSolicitacao(Solicitacao s) {
	    solicitacaoController.cancelarSolicitacao(s);
	}
	//
	//SOLICITA-FERIAS
	//
	public void informarDatasFerias(SolicitaFerias s, Date inicio, Date fim) {
	    solicitaFeriasController.informarDatas(s, inicio, fim);
	}

	public int calcularFerias(SolicitaFerias s) {
		  return solicitaFeriasController.calcularPeriodo(
			        s,
			        new CalculoDiasCorridosStrategy()
	    ); 
	}
	//
	//SOLICITA-AJUSTE-PONTO
	//
	public void informarAjustePonto(SolicitaAjustePonto s, Date data, Time hora) {
	    ajustePontoController.informarDataHora(s, data, hora);
	}
	
	public boolean validarAjustePonto(SolicitaAjustePonto s) {

	    return ajustePontoController.validar(
	        s,
	        new ValidacaoBasicaAjustePontoStrategy()
	    );
	}
	//
	//SOLICITA-PROMOCAO
	//
	public void preencherPromocao(SolicitaPromocao s, Colaborador c, Cargo cargo, double salario) {
	    promocaoController.preencherPromocao(s, c, cargo, salario);
	}
	
	public boolean validarPromocao(SolicitaPromocao s) {

	    return promocaoController.validar(
	        s,
	        new ValidacaoBasicaPromocaoStrategy()
	    );
	}
	//
	//PONTO
	//
	public void registrarPonto(Ponto p, LocalDateTime marcacao, String relogio) {
	    pontoController.registrarPonto(p, marcacao, relogio);
	}
	
	public void ajustarPonto(Ponto p, LocalDateTime novaMarcacao) {
	    pontoController.ajustarPonto(p, novaMarcacao);
	}
	
	public boolean validarPonto(Ponto p) {

	    return pontoController.validar(
	        p,
	        new ValidacaoBasicaPontoStrategy()
	    );
	}
	//
	//FOLHA DE PONTO
	//
	public void definirPeriodoFolha(FolhaDePonto f, Date inicio, Date fim) {
	    folhaController.definirPeriodo(f, inicio, fim);
	}
	
	public boolean validarFolha(FolhaDePonto f) {

	    return folhaController.validar(
	        f,
	        new ValidacaoBasicaFolhaStrategy()
	    );
	}
	
	public String visualizarFolha(FolhaDePonto f) {

	    return folhaController.visualizar(
	        f,
	        new VisualizacaoSimplesStrategy()
	    );
	}
	
	public Duration consultarBancoHoras(BancoDeHoras b) {
	    return bancoController.consultarBanco(b);
	}
	
	public void atualizarBancoHoras(BancoDeHoras b, Duration novaQuantidade) {
	    bancoController.atualizarBanco(b, novaQuantidade);
	}
	
	public boolean validarBancoHoras(BancoDeHoras b) {

	    return bancoController.validar(
	        b,
	        new ValidacaoBasicaBancoHorasStrategy()
	    );
	}
}