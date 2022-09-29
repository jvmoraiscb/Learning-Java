package src;

public class FuncionarioTempoIntegral extends Funcionario {
    
    private int horasSemanais;

    public FuncionarioTempoIntegral (int id, String nome, float salario){
        super(id, nome, salario);

        this.horasSemanais = 40;
    }

    public int getHorasSemanais() {
        return horasSemanais;
    }


    public void setHorasSemanais(int horasSemanais) {
        this.horasSemanais = horasSemanais;
    }

    @Override
    public String toString() {
        return "Funcionário: " + this.getNome() + " (ID: " + this.getId() + ") - Salário: R$" + this.getSalario() + " (" + this.getHorasSemanais() + " h/semana)";
    }

}
