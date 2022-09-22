import src.Departamento;
import src.Empresa;
import src.Funcionario;

public class App {
    public static void main(String[] args) {
        
        Empresa empresa =       new Empresa("Casas Bahia");

        Departamento rh =       new Departamento("Recursos Humanos");
        Departamento vendas =   new Departamento("Vendas");
        Departamento ti =       new Departamento("Tecnologia da Informação");
        
        Funcionario joao =      new Funcionario(1, "João Victor Morais", 1212.0f);
        Funcionario talles =    new Funcionario(2, "Talles Cavalleiro", 1212.0f);
        Funcionario bruno =     new Funcionario(3, "Bruno Santos", 1212.0f);
        Funcionario celso =     new Funcionario(4, "Celso Nantes", 1212.0f);
        Funcionario thiago =    new Funcionario(5, "Thiago Lahass", 1212.0f);
        Funcionario gabriel =   new Funcionario(6, "Gabriel Gatti", 1212.0f);

        rh.addFuncionario(celso);

        vendas.addFuncionario(thiago);
        vendas.addFuncionario(gabriel);

        ti.addFuncionario(bruno);
        ti.addFuncionario(joao);
        ti.addFuncionario(talles);

        empresa.addDepartamento(rh);
        empresa.addDepartamento(vendas);
        empresa.addDepartamento(ti);

        System.out.println("\nEmpresa: " + empresa.getNome() + "\n");
        for(Departamento d : empresa.getDepartamentos()){
            System.out.println("Departamento " + d.getNome() + ":");
            for(Funcionario f : d.getFuncionarios()){
                System.out.printf("Funcionário %03d: %s (R$%.2f)\n", f.getId(), f.getNome(), f.getSalario());
            }
            System.out.println();
{}        }
    }
}