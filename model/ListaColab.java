package model;
import java.util.List;
import java.util.ArrayList;

public class ListaColab {
    private List<Colaborador> colaboradores = new ArrayList<>();

    public void addColab(Colaborador colab){
        colaboradores.add(colab);
    }

    public void excColab(Colaborador colab){
        colaboradores.remove(colab);
    }

    public int getQuantColab(){
        return this.colaboradores.size();
    }
}
