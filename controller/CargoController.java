package controller;

import model.Cargo;
import model.Colaborador;
import service.ICargoService;
import service.IListaColabService;
import service.ListaColabService;

public class CargoController {
    private ICargoService servico;

    public String promover (
        Colaborador colab,
        Cargo cargo
    ) {
        return servico.promoverColab(colab, cargo);
    }

    public CargoController(ICargoService servico){
        this.servico = servico;
    }

    public Cargo novoCargo(
        String nome,
        String responsabilidades,
        double baseSalarial
    ){
        IListaColabService lista = new ListaColabService();
        Cargo cargo = new Cargo(nome, responsabilidades, baseSalarial, lista);
        return cargo;
    }

}
