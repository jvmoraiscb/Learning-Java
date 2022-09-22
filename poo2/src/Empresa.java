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


}
