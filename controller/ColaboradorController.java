package controller;

import model.ColabBuilder;
import model.Colaborador;
import java.time.LocalDate;
import service.ColaboradorService;

public class ColaboradorController {

    private ColaboradorService servico = new ColaboradorService();

    public Colaborador cadastrarColaborador(ColabBuilder builder){
        Colaborador colab = builder.build();
        colab.atualizarSituacao();
        
        return colab;
    }

    public String alterarNome(Colaborador colab, String nome){
        colab.setNome(nome);
        colab.atualizarSituacao();
        return "Nome alterado";
    }

    public String alterarCpf(Colaborador colab, String cpf){
        colab.setCpf(cpf);
        colab.atualizarSituacao();
        return "CPF alterado";
    }

    public String alterarDtNasc(Colaborador colab, LocalDate dtNasc){
        colab.setDtNasc(dtNasc);
        colab.atualizarSituacao();
        return "Data Nascimento alterada";
    }

    public String alterarDtInicio(Colaborador colab, LocalDate dtInicio){
        colab.setDtInicio(dtInicio);
        colab.atualizarSituacao();
        return "Data de inicio alterada";
    }

    public String alterarSalario(Colaborador colab, double salario){
        colab.setSalario(salario);
        colab.atualizarSituacao();
        return "Salario alterado";
    }

    public String cadastrarMatricula(Colaborador colab, String matricula){
        return servico.cadastrarMatricula(colab, matricula);
    }

    public String desligarColaborador(Colaborador colab){
        return servico.desligarColaborador(colab);
    }

}
