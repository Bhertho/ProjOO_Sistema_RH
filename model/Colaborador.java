package model;

public class Colaborador {
    private String nome, cpf, dtNasc, dtInicio, dtFim;
    private int matricula, situacao;
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
        this.setor.addColab(this);
    }

    public String getNomeCargo(){
        return this.cargo.getNome();
    }

    public void setCargo(Cargo cargo){
        if (this.cargo != null){
            this.cargo.excColab(this);
        }
        this.cargo = cargo;
        this.cargo.addColab(this);
    }

    public String getNomeTurno(){
        return this.turno.getTurno();
    }

    public void setTurno(Turno turno){
        if (this.turno != null){
            this.turno.excColab(this);
        }
        this.turno = turno;
        this.turno.addColab(this);
    }

    public String getNomeUnNegocio(){
        return this.unidadeNegocio.getNome();
    }

    public void setUnidadeNegocio(UnidadeNegocio unidadeNegocio){
        if (this.unidadeNegocio != null){
            this.unidadeNegocio.excColab(this);
        }
        this.unidadeNegocio = unidadeNegocio;
        this.unidadeNegocio.addColab(this);
    }

    public Colaborador(
        String nome,
        String cpf, 
        String dtNasc,
        String dtInicio,
        int matricula,
        int situacao,
        double salario,
        Setor setor,
        Turno turno,
        Cargo cargo,
        UnidadeNegocio unidadeNegocio

    ) {
        this.nome = nome;
        this.cpf = cpf;
        this.dtNasc = dtNasc;
        this.dtInicio = dtInicio;
        this.matricula = matricula;
        this.situacao = situacao;
        this.salario = salario;
        this.setor = setor;
        this.turno = turno;
        this.cargo = cargo;
        this.unidadeNegocio = unidadeNegocio;
        setor.addColab(this);
        cargo.addColab(this);
        turno.addColab(this);
        unidadeNegocio.addColab(this);
    }

}
