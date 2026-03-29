package model;

public class Usuario {
    private String login, senha;
    private int nivelAcesso;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public Usuario(
        String login, 
        String senha, 
        int nivelAcesso
    ) {
        this.login = login;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    

    
}
