package Conta;

import java.util.Date;

public class ContaComum {
    
    protected Long nroConta;
    double saldo;
    Date dateAber;
    boolean situacao;
    String senha;

    public ContaComum(Long nroConta, double saldo, Date dateAber, boolean situacao,String senha){
        this.nroConta = nroConta;
        this.saldo = saldo;
        this.dateAber = dateAber;
        this.situacao = situacao;;
        this.senha = senha;
    }


    public Long getNroConta() {
        return this.nroConta;
    }

    public void setNroConta(Long nroConta) {
        this.nroConta = nroConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Date getDateAber() {
        return this.dateAber;
    }

    public void setDateAber(Date dateAber) {
        this.dateAber = dateAber;
    }

    public boolean isSituacao() {
        return this.situacao;
    }

    public boolean getSituacao() {
        return this.situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }



}
