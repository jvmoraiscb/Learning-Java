package poo_simulado_q3.src;

import java.util.LinkedList;
import java.util.List;

public class Agencia {
    private String nome;
    private List<Conta> contas;

    public Agencia(String nome){
        this.nome   = nome;
        this.contas = new LinkedList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionaConta(Conta conta){
        this.contas.add(conta);
    }

    public List<Conta> getContas() {
        return contas;
    }

    public double getSaldoMedio(){
        double saldoTotal = 0;
        
        for(Conta c: this.contas){
           saldoTotal += c.getSaldo();
        }

        return saldoTotal/contas.size();
    }
}
