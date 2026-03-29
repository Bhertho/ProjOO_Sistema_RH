package model;

public class Setor {
    private String nomeSetor;
    private ListaColab colaboradores;

    public void setNomeSetor(String nomeSetor){
        this.nomeSetor = nomeSetor;
    }

    public String getNomeSetor(){
        return nomeSetor;
    }

    public Setor(String nomeSetor){
        this.nomeSetor = nomeSetor;
    }

    public ListaColab getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(ListaColab colaboradores) {
        this.colaboradores = colaboradores;
    }
    
}
