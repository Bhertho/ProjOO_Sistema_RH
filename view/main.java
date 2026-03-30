package view;

import controller.*;

import java.time.LocalDate;
import java.time.LocalTime;
import model.*;
import service.CargoService;
import service.SetorService;
import service.TurnoService;
import service.UnidadeService;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

import facade.SistemaRHFacade;

public class main {
    public static void main(String[] args){

        /* Construindo setor, cargo, unidade, turno */

        // Turno
        TurnoService turno_Service = new TurnoService();

        TurnoController turno_Controller = new TurnoController(turno_Service);

        Turno turnoComercial = turno_Controller.novoTurno(
            "1º Turno",
            LocalTime.of(8, 0, 0),
            LocalTime.of(18, 0, 0)
        );

        Turno turnoTarde = turno_Controller.novoTurno(
            "2º Turno",
            LocalTime.of(14, 0, 0),
            LocalTime.of(22, 0, 0)
        );

        Turno turnoNoite = turno_Controller.novoTurno(
            "3º Turno",
            LocalTime.of(22, 0, 0),
            LocalTime.of(6, 0, 0)
        );

        // Setor
        SetorService setor_Service = new SetorService();

        SetorController setor_Controller = new SetorController(setor_Service);

        Setor comercial = setor_Controller.novoSetor("Comercial");
        Setor operacao = setor_Controller.novoSetor("Operação");
        Setor financeiro = setor_Controller.novoSetor("Financeiro");

        // Cargo
      
        CargoService cargo_Service = new CargoService();

        CargoController cargo_Controller = new CargoController(cargo_Service);

        Cargo assistente = cargo_Controller.novoCargo(
            "Assistente", 
            "Relatórios", 
            2000.00
        );
        Cargo analista = cargo_Controller.novoCargo(
            "Analista", 
            "Analisar resultado", 
            3000.00
        );
        Cargo gerente = cargo_Controller.novoCargo(
            "Gerente", 
            "Gerir setor e pessoas", 
            5000.00
        );

        // Unidade de Negocio

        UnidadeService unidade_service = new UnidadeService();

        UnidadeController unidade_controller = new UnidadeController(unidade_service);

        UnidadeNegocio sede = unidade_controller.novoUnidadeNegocio(
            "Sede", 
            "12.525.600/0001-01",
            "Stella SA",
            "Avenida Alberto Camelo, nº 666");

        UnidadeNegocio filial = unidade_controller.novoUnidadeNegocio(
            "Filial", 
            "12.525.600/0002-01",
            "Stella SA",
            "Avenida Francisco Camelo, nº 333");


        /* Construindo primeiro colaborador */

        ColabBuilder tiagoBuilder = new ColabBuilder(
            "Tiago Inocencio Gentil", 
            "559.887.653-88"
        ).turno(turnoComercial)
        .setor(comercial)
        .cargo(assistente)
        .unidadeNegocio(filial);

        ColaboradorController colab_controller = new ColaboradorController();

        Colaborador tiago = colab_controller.cadastrarColaborador(tiagoBuilder);

        System.out.println(tiago.getNome());

        System.out.println(tiago.getCpf());

        System.out.println(tiago.getCargo().getNome());

        System.out.println(tiago.getSalario());

        System.out.println(tiago.getSituacao());

        System.out.println("------------");

        System.out.println(colab_controller.alterarDtInicio(tiago, LocalDate.of(2025,5,1)));

        System.out.println(colab_controller.alterarDtNasc(tiago, LocalDate.of(1975,5,1)));

        System.out.println(colab_controller.alterarSalario(tiago, 2000.00));

        System.out.println(colab_controller.cadastrarMatricula(tiago, "A1002"));

        System.out.println(tiago.getSituacao());

        System.out.println("------------");

        /* Alterando objetos de colaborador */

        turno_Controller.mudarTurno(tiago, turnoNoite);

        System.out.println(tiago.getTurno().getNome());

        cargo_Controller.promover(tiago, gerente);

        System.out.println(tiago.getCargo().getNome());
        System.out.println(tiago.getSalario());

        System.out.println("------------");

        /* Construindo segundo colaborador */

        // Criando o cadastro do colaborador completo com o Builder
        ColabBuilder geraldoBuilder = new ColabBuilder(
            "Geraldo Inocencio Gentil", 
            "899.887.653-88"
        ).turno(turnoComercial)
        .setor(financeiro)
        .cargo(analista)
        .unidadeNegocio(sede)
        .matricula("B2200")
        .salario(2000.00)
        .dtNasc(LocalDate.of(1980,2,2))
        .dtInicio(LocalDate.of(2026,1,1));
        
        Colaborador geraldo = colab_controller.cadastrarColaborador(geraldoBuilder);

        System.out.println(geraldo.getSituacao());

        System.out.println("------------");

        /* Construindo Lider */

        // Criando o cadastro de lider com o Builder
        LiderBuilder fredBuilder = new LiderBuilder(
            "Geraldo Inocencio Gentil", 
            "899.887.653-88"
        ).setorResponsavel(financeiro)
        .nivelLideranca("Gerencia")
        .turno(turnoComercial)
        .setor(financeiro)
        .cargo(analista)
        .unidadeNegocio(sede)
        .matricula("B2200")
        .salario(2000.00)
        .dtNasc(LocalDate.of(1980,2,2));

        Lider fred = colab_controller.cadastrarColaborador(fredBuilder);

        colab_controller.alterarDtInicio(fred, LocalDate.of(2026, 1, 2));

        System.out.println(fred.getSituacao());

        System.out.println("------------");

        /* Construindo Funcionario de RH */

        // Criando o cadastro de FuncRH com o Builder
        RHBuilder angelaBuilder = new RHBuilder(
            "Geraldo Inocencio Gentil", 
            "899.887.653-88"
        ).areaAtuacao("Treinamento")
        .turno(turnoComercial)
        .setor(financeiro)
        .cargo(analista)
        .unidadeNegocio(sede)
        .matricula("B2200")
        .salario(2000.00)
        .dtNasc(LocalDate.of(1980,2,2));

        FuncRH angela = colab_controller.cadastrarColaborador(angelaBuilder);

        colab_controller.alterarDtInicio(angela, LocalDate.of(2026, 1, 2));

        System.out.println(angela.getSituacao());

        //////////////////////////////////////////
        /// 
        
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