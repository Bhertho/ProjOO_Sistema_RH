package service;
import model.Colaborador;
import java.time.LocalDate;

public class ColaboradorService {
    
    public String cadastrarMatricula(Colaborador colab, String matricula){
        if (colab.getMatricula() != null){
            return "O colaborador já possui matrícula";
        }
        else{
            colab.setMatricula(matricula);
            colab.atualizarSituacao();
            return "Matrícula cadastrada";
        }
    }

    public String desligarColaborador (Colaborador colab){
        if (colab.getDtFim() == null){
            colab.setDtFim(LocalDate.now());
            colab.atualizarSituacao();
            return "Colaborador " + colab.getNome() + " foi desligado!";
        }
        else{
            return "Colaborador " + colab.getNome() + " já está desligado! \nNenhuma alteração foi realizada.";
        }
    }

}
