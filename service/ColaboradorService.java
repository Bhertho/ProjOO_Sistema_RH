package service;
import model.Colaborador;

public class ColaboradorService {
    
    public String cadastrarMatricula(Colaborador colab, String matricula){
        if (colab.getMatricula() != null){
            return "O colaborador já possui mátricula";
        }
        else{
            colab.setMatricula(matricula);
            return "Matricula cadastrada";
        }
    }

}
