package service;

import model.Colaborador;
import model.Setor;

public interface IMudancaSetorService {
        public String mudarSetor(
        Colaborador colab,
        Setor setor
    );
}
