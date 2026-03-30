package service;

import model.Colaborador;
import model.Setor;

public interface ISetorService {
        public String mudarSetor(
        Colaborador colab,
        Setor setor
    );
}
