package service;
import java.util.List;
import java.util.ArrayList;
import model.Colaborador;

public class ListaColabService implements IListaColabService {
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
