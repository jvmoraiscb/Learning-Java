package src;

import java.util.LinkedList;

public class Empresa {
    private String nome;
    private LinkedList<Departamento> departamentos;

    public Empresa(String nome){
        this.nome = nome;
        this.departamentos = new LinkedList<Departamento>();
    }

    public String getNome() {
        return nome;
    }

    public LinkedList<Departamento> getDepartamentos(){
        return this.departamentos;
    }

    public void addDepartamento(Departamento departamento){
        this.departamentos.addLast(departamento);
    }

    public void removeDepartamento(Departamento departamento){
        this.departamentos.remove(departamento);
    }

    public void aumentaSalarioEmpresa(float porcentagem){
        for(Departamento d : this.departamentos){
            for(Funcionario f : d.getFuncionarios()){
                f.aumentaSalario(porcentagem);
            }
        }
    }

    public String toString(){        
        String string = "\nEmpresa: " + this.getNome() + "\n";
        for(Departamento d : this.getDepartamentos()){
            string += d.toString();
        }

        return string;
    }

}
