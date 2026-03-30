package service;

import model.Colaborador;
import model.Setor;

public interface IMudancaSetor {
        public String mudarSetor(
        Colaborador colab,
        Setor setor
    );
}
