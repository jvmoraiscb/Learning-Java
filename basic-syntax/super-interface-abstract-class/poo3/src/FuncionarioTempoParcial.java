package src;

public class FuncionarioTempoParcial extends Funcionario{
    
    private int horasSemanais;

    public FuncionarioTempoParcial (int id, String nome, float salario){
        super(id, nome, salario);

        this.horasSemanais = 20;
    }

    public int getHorasSemanais() {
        return this.horasSemanais;
    }


    public void setHorasSemanais(int horasSemanais) {
        this.horasSemanais = horasSemanais;
    }

    @Override
    public String toString() {
        return "Funcionário: " + this.getNome() + " (ID: " + this.getId() + ") - Salário: R$" + this.getSalario() + " (" + this.getHorasSemanais() + " h/semana)";
    }

}
