import java.time.LocalDate;

import src.Cidade;
import src.Estadio;
import src.Partida;
import src.Time;

public class App {
    public static void main(String args[]){
        Cidade rj = new Cidade("Rio de Janeiro", "Rio de Janeiro");
        Cidade sp = new Cidade("São Paulo", "São Paulo");
        
        Partida partida = new Partida( new Time("Flamengo", rj), new Time("Fluminense", rj), new Estadio("Morumbi", sp), LocalDate.of(2022, 3, 30) );

        partida.golTimeB();
        partida.golTimeB();

        System.out.println("Informações da partida: " + partida.getTimeA().getNome() + " x " + partida.getTimeB().getNome());
        System.out.println("Placar: " + partida.getGolsTimeA() + " x " + partida.getGolsTimeB());
        System.out.println("Estádio: " + partida.getEstadio().getNome() + " - " + partida.getEstadio().getCidade().getNome());
        System.out.println("Data: " + partida.getData());
    }
}