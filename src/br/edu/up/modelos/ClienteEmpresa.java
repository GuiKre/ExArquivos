package br.edu.up.modelos;

public class ClienteEmpresa extends Cliente{

    private String cnpj;
    private String iEstadual;
    private int anoFundacao;
    
    public ClienteEmpresa() {
        super();
    }
    public ClienteEmpresa(String nome, String telefone, String email, String cnpj, String iEstadual, int anoFundacao) {
        super(nome, telefone, email);
        this.cnpj = cnpj;
        this.iEstadual = iEstadual;
        this.anoFundacao = anoFundacao;
    }

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getiEstadual() {
        return iEstadual;
    }
    public void setiEstadual(String iEstadual) {
        this.iEstadual = iEstadual;
    }
    public int getAnoFundacao() {
        return anoFundacao;
    }
    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }
    @Override
    public String toString() {
        return "ClienteEmpresa [ nome=" + getNome() +"cnpj=" + cnpj + ", iEstadual=" + iEstadual + ", anoFundacao=" + anoFundacao
                +  ", getTelefone()=" + getTelefone() + ", getEmail()=" + getEmail() + "]";
    }

    

}
