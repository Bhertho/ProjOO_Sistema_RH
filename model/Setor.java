package model;
import java.util.List;
import java.util.ArrayList;

public class Setor {
    private String nomeSetor;
    private List<Colaborador> colaboradores = new ArrayList<>();

    public void setNome(String nomeSetor){
        this.nomeSetor = nomeSetor;
    }

    public String getNomeSetor(){
        return nomeSetor;
    }

    public Setor(String nomeSetor){
        this.nomeSetor = nomeSetor;
    }

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
