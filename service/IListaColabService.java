package service;
import model.Colaborador;

public interface IListaColabService {
    public void addColab(Colaborador colab);

    public void excColab(Colaborador colab);

    public int getQuantColab();
}
