package poo_simulado_q3.src;

import java.util.LinkedList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Agencia> agencias;

    public Banco(String nome){
        this.nome       = nome;
        this.agencias   = new LinkedList<>();
    }

    public Agencia criaAgencia(String nome){
        Agencia agencia = new Agencia(nome);
        this.agencias.add(agencia);
        return agencia;
    }

    public String toString(){
        String string = "Nome do banco: " + this.nome + "\n";
        for(Agencia a: this.agencias){
            string += "Agência: " + a.getNome() + ", saldo médio: " + a.getSaldoMedio();
        }
        return string;
    }
}
