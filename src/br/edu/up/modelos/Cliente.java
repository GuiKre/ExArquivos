package br.edu.up.modelos;

public abstract class Cliente {

    private String nome;
    private String telefone;
    private String email;
    private Endereco endereco;
    private double vlrMaxCredito;
    private double vlrEmprestado;

    public Cliente() {
    }

    public Cliente(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public void emprestar(double valor){
        //TODO: implementar método
    }

    public double devolver(double valor){
        //TODO implementar método
        return 0;
    }

    public double getSaldo(){
        //TODO implementar método
        return 0;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    } 
    public void setEmail(String email) {
        this.email = email;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public double getVlrMaxCredito() {
        return vlrMaxCredito;
    }
    public void setVlrMaxCredito(double vlrMaxCredito) {
        this.vlrMaxCredito = vlrMaxCredito;
    }
    public double getVlrEmprestado() {
        return vlrEmprestado;
    } 
    public void setVlrEmprestado(double vlrEmprestado) {
        this.vlrEmprestado = vlrEmprestado;
    }
    
    public String toCSV(){
        return nome + ";" + telefone + ";" + email;
    }
    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", telefone=" + telefone + ", email=" + email + "]";
    }
    
}
