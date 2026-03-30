package model;
import java.time.LocalDate;

public class Colaborador {
    private String nome, cpf, matricula;
    private LocalDate dtNasc, dtInicio, dtFim;
    private int situacao;
    private double salario;
    private Setor setor;
    private Turno turno;
    private Cargo cargo;
    private UnidadeNegocio unidadeNegocio;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(LocalDate dtNasc) {
        this.dtNasc = dtNasc;
    }

    public LocalDate getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(LocalDate dtInicio) {
        this.dtInicio = dtInicio;
    }

    public LocalDate getDtFim() {
        return dtFim;
    }

    public void setDtFim(LocalDate dtFim) {
        this.dtFim = dtFim;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Setor getSetor(){
        return this.setor;
    }

    public void setSetor(Setor setor){
        this.setor = setor;
    }

    public Cargo getCargo(){
        return this.cargo;
    }

    public void setCargo(Cargo cargo){
        this.cargo = cargo;
    }

    public Turno getTurno(){
        return this.turno;
    }

    public void setTurno(Turno turno){
        this.turno = turno;
    }

    public UnidadeNegocio getUnidadeNegocio(){
        return this.unidadeNegocio;
    }

    public void setUnidadeNegocio(UnidadeNegocio unidadeNegocio){
        this.unidadeNegocio = unidadeNegocio;
    }

    Colaborador (ColabBuilder builder){

        this.nome = builder.getNome();
        this.cpf = builder.getCpf();
        this.dtNasc = builder.getDtNasc();
        this.dtInicio = builder.getDtInicio();
        this.matricula = builder.getMatricula();
        this.situacao = builder.getSituacao();
        this.salario = builder.getSalario();

        this.setSetor(builder.getSetor());
        this.setCargo(builder.getCargo());
        this.setTurno(builder.getTurno());
        this.setUnidadeNegocio(builder.getUnidadeNegocio());
    }

}
