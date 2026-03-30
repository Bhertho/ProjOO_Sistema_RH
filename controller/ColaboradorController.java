package controller;

import model.ColabBuilder;
import model.Colaborador;
import java.time.LocalDate;
import service.ColaboradorService;

public class ColaboradorController {

    private Colaborador colab;
    private ColaboradorService servico = new ColaboradorService();

    public String cadastrarColaborador(ColabBuilder builder){
        Colaborador colab = builder.build();
        this.colab = colab;
        return "Colaborador " + colab.getNome() + " foi salvo!";
    }

    public String alterarNome(String nome){
        this.colab.setNome(nome);
        return "Nome alterado";
    }

    public String alterarCpf(String cpf){
        this.colab.setCpf(cpf);
        return "CPF alterado";
    }

    public String alterarDtNasc(LocalDate dtNasc){
        this.colab.setDtNasc(dtNasc);
        return "Data Nascimento alterada";
    }

    public String alterarDtInicio(LocalDate dtInicio){
        this.colab.setDtInicio(dtInicio);
        return "Data de inicio alterada";
    }

    public String cadastrarMatricula(String matricula){
        return servico.cadastrarMatricula(this.colab, matricula);
    }

    public String desligarColaborador(){
        return servico.desligarColaborador(this.colab);
    }

}
