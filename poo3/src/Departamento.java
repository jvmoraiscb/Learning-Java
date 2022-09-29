package src;

import java.util.LinkedList;

public class Departamento {
    private String nome;
    private LinkedList<Funcionario> funcionarios;


    public Departamento(String nome){
        this.nome = nome;
        this.funcionarios = new LinkedList<Funcionario>();
    }

    public String getNome(){
        return this.nome;
    }

    public LinkedList<Funcionario> getFuncionarios(){
        return this.funcionarios;
    }

    public void addFuncionario(Funcionario funcionario){
        this.funcionarios.addLast(funcionario);
    }

    public void removeFuncionario(Funcionario funcionario){
        this.funcionarios.remove(funcionario);
    }

    public void aumentaSalarioDepartamento(float porcentagem){
        for(Funcionario f : this.funcionarios){
            f.aumentaSalario(porcentagem);
        }
    }

    public String toString(){
        String string = "\nDepartamento: " + this.getNome() + "\n";
        for(Funcionario f: this.funcionarios){
            string += f.toString() + "\n";
        }
        return string;
    }
}
