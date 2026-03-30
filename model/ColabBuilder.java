package model;
import java.time.LocalDate;

public class ColabBuilder implements IBuilder<Colaborador> {

    private String nome, cpf, matricula;
    private LocalDate dtNasc, dtInicio, dtFim;
    private int situacao;
    private double salario;
    private Setor setor;
    private Turno turno;
    private Cargo cargo;
    private UnidadeNegocio unidadeNegocio;

    public ColabBuilder(
        String nome, 
        String cpf,
        int situacao
    ) {
        this.nome = nome;
        this.cpf = cpf;
        this.situacao = situacao;
    }

    public ColabBuilder dtNasc (LocalDate dtNasc){
        this.dtNasc = dtNasc;
        return this;
    }

    public ColabBuilder dtInicio (LocalDate dtInicio){
        this.dtInicio = dtInicio;
        return this;
    }

    public ColabBuilder dtFim (LocalDate dtFim){
        this.dtFim = dtFim;
        return this;
    }

    public ColabBuilder matricula (String matricula){
        this.matricula = matricula;
        return this;
    }

    public ColabBuilder salario (double salario){
        this.salario = salario;
        return this;
    }

    public ColabBuilder setor (Setor setor){
        this.setor = setor;
        return this;
    }

    public ColabBuilder turno (Turno turno){
        this.turno = turno;
        return this;
    }

    public ColabBuilder cargo (Cargo cargo){
        this.cargo = cargo;
        return this;
    }

    public ColabBuilder unidadeNegocio (UnidadeNegocio unidadeNegocio){
        this.unidadeNegocio = unidadeNegocio;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDtNasc() {
        return dtNasc;
    }

    public LocalDate getDtInicio() {
        return dtInicio;
    }

    public LocalDate getDtFim() {
        return dtFim;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getSituacao() {
        return situacao;
    }

    public double getSalario() {
        return salario;
    }

    public Setor getSetor() {
        return setor;
    }

    public Turno getTurno() {
        return turno;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public UnidadeNegocio getUnidadeNegocio() {
        return unidadeNegocio;
    }

    @Override
    public Colaborador build() {
        return new Colaborador(this);
    }

}
