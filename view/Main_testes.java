package view;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

import facade.SistemaRHFacade;
import model.BancoDeHoras;
import model.FolhaDePonto;
import model.Ponto;
import model.SolicitaAjustePonto;
import model.SolicitaFerias;
import model.SolicitaPromocao;
import model.Solicitacao;
import util.DataInputUtil;

public class Main_testes {
	 public static void main(String[] args) {
		 
		 SistemaRHFacade facade = new SistemaRHFacade();
		 Solicitacao s = new Solicitacao();
		 
		 SolicitaFerias ferias = new SolicitaFerias();
		 //Scanner sc = new Scanner(System.in);
		 //Date inicio = DataInputUtil.lerData(sc, "Data Início (Dia/Mês/Ano): ");
		 //Date fim = DataInputUtil.lerData(sc, "Fim das férias (Dia/Mês/Ano): " );
		 //facade.informarDatasFerias(ferias, inicio, fim);
		 //int dias = facade.calcularFerias(ferias);
		
		 SolicitaAjustePonto ajuste = new SolicitaAjustePonto();
		 Date data = new Date();
		 Time hora = new Time(System.currentTimeMillis());
		 
		 //SolicitaPromocao promo = new SolicitaPromocao();
		 //Colaborador c = new Colaborador();
		 //Cargo cargo = new Cargo();
		 
		 Ponto ponto = new Ponto();
		 LocalDateTime agora = LocalDateTime.now();
		 
		 FolhaDePonto folha = new FolhaDePonto();
		 Date inicioF = new Date();
		 Date fimF = new Date();
		 
		 BancoDeHoras banco = new BancoDeHoras();
		 
		 //SOLICITACAO
		 //facade.criarSolicitacao(s);
		 //facade.aprovarSolicitacao(s);
		 //facade.rejeitarSolicitacao(s);
		 //facade.alterarJustificativa(s, "Teste");
		 //System.out.println(s.getStatus());
		 //System.out.println(s.getJustificativa());
		 //facade.informarDatasFerias(ferias, inicio, fim);
		 
		 //SOLICITAÇÃO-FERIAS
		 //facade.informarDatasFerias(ferias, inicio, fim);
		 //facade.calcularFerias(ferias);
		 //System.out.println(dias);
		 
		 //SOLICITAÇÃO-AJUSTE-PONTO
		 //facade.informarAjustePonto(ajuste, data, hora);
		 //boolean ok = facade.validarAjustePonto(ajuste);
		 //System.out.println(ok);
		 
		 //SOLICITACAO-PROMOÇÃO
		//facade.preencherPromocao(promo, c, cargo, novoSalario);
		//boolean ok1 = facade.validarPromocao(promo)
		//System.out.println(ok1);
		 
		 //PONTO
		 //facade.registrarPonto(ponto, agora, "Relogio A");
		 //facade.ajustarPonto(ponto, agora.plusHours(1));
		 //boolean ok2 = facade.validarPonto(ponto);
		 //System.out.print(ok2);
		 
		 //FOLHA-DE-PONTO
		 facade.definirPeriodoFolha(folha, inicioF, fimF);
		 boolean ok3 = facade.validarFolha(folha);
		 System.out.println("Folha válida? " + ok3);
		 String espelho = facade.visualizarFolha(folha);
		 System.out.println(espelho);
		 
		 //BANCO-DE-HORA
		 facade.atualizarBancoHoras(banco, Duration.ofHours(10));
		 Duration saldo = facade.consultarBancoHoras(banco);
		 System.out.println("Saldo: " + saldo);
		 boolean ok4 = facade.validarBancoHoras(banco);
		 System.out.println("Banco válido? " + ok4);
}
}