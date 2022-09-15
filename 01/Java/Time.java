package Java;
public class Time {
    private String nome;
    private Cidade cidadeSede;
    
    public Time(String nome, Cidade cidadeSede){
        this.nome = nome;
        this.cidadeSede = cidadeSede;
    }
    public Time(){}

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Cidade getCidadeSede() {
        return cidadeSede;
    }
    public void setCidadeSede(Cidade cidade) {
        this.cidadeSede = cidade;
    }

}
