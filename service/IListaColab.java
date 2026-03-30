package service;
import model.Colaborador;

public interface IListaColab {
    public void addColab(Colaborador colab);

    public void excColab(Colaborador colab);

    public int getQuantColab();
}
