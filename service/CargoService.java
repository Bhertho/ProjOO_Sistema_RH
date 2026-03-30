package service;
import model.Cargo;
import model.Colaborador;

public class CargoService implements ICargoService{

    public String promoverColab (
        Colaborador colab,
        Cargo cargo
    ) {

        if (colab.getSalario() > cargo.getBaseSalarial()){
            return "Não pode existir uma promoção que diminua o salário do colaborador\n" + 
                "Salário antigo: " + colab.getSalario() + " , base salarial do novo cargo: " + cargo.getBaseSalarial();
        }
        else {
            Cargo cargoAnterior = colab.getCargo();
            colab.getCargo().getColaboradores().excColab(colab);
            colab.setCargo(cargo);
            colab.getCargo().getColaboradores().addColab(colab);
            colab.setSalario(cargo.getBaseSalarial());
            return "O Colaborador " + colab.getNome() + "Foi promovido!\n" +
                "De: " + cargoAnterior.getNome() + " ,Para: " + colab.getCargo().getNome() + "\n" +
                "Seu novo salário é de: " + colab.getSalario();
        }

    }
}