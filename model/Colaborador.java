package model;

public class Colaborador {
    private String nome, cpf, dtNasc, dtInicio, dtFim;
    private int matricula, situacao;
    private double salario;
    private Setor setor;
    private Turno turno;
    private Cargo cargo;
    private UnidadeNegocio unidadeNegocio;
    private Lider lider;

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

    public String getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }

    public String getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(String dtInicio) {
        this.dtInicio = dtInicio;
    }

    public String getDtFim() {
        return dtFim;
    }

    public void setDtFim(String dtFim) {
        this.dtFim = dtFim;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
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

    public String getNomeSetor(){
        return this.setor.getNomeSetor();
    }

    public void setSetor(Setor setor){

        if (this.setor != null){
            this.setor.excColab(this);
        }

        this.setor = setor;

        if (this.setor != null){
            this.setor.addColab(this);
        }
    }

    public String getNomeCargo(){
        return this.cargo.getNome();
    }

    public void setCargo(Cargo cargo){

        if (this.cargo != null){
            this.cargo.excColab(this);
        }

        this.cargo = cargo;

        if (this.cargo != null){
            this.cargo.addColab(this);
        }
    }

    public String getNomeTurno(){
        return this.turno.getTurno();
    }

    public void setTurno(Turno turno){

        if (this.turno != null){
            this.turno.excColab(this);
        }

        this.turno = turno;

        if (this.turno != null){
            this.turno.addColab(this);
        }

    }

    public String getNomeUnNegocio(){
        return this.unidadeNegocio.getNome();
    }

    public void setUnidadeNegocio(UnidadeNegocio unidadeNegocio){

        if (this.unidadeNegocio != null){
            this.unidadeNegocio.excColab(this);
        }

        this.unidadeNegocio = unidadeNegocio;

        if (this.unidadeNegocio != null){
            this.unidadeNegocio.addColab(this);
        }
    }

    Colaborador (ColabBuilder builder){

        this.nome = builder.getNome();
        this.cpf = builder.getCpf();
        this.dtNasc = builder.getDtNasc();
        this.dtInicio = builder.getDtInicio();
        this.matricula = builder.getMatricula();
        this.situacao = builder.getSituacao();
        this.salario = builder.getSalario();
        this.lider = builder.getLider();

        this.setSetor(builder.getSetor());
        this.setCargo(builder.getCargo());
        this.setTurno(builder.getTurno());
        this.setUnidadeNegocio(builder.getUnidadeNegocio());
    }

    public Lider getLider() {
        return lider;
    }

    public void setLider(Lider lider) {
        this.lider = lider;
    }
    
}
