import java.time.LocalDate;

import Java.Cidade;
import Java.Estadio;
import Java.Partida;
import Java.Time;

public class App {
    public static void main(String args[]){
        Partida partida = new Partida();
        Time fla = new Time();
        Time flu = new Time();
        Cidade rj = new Cidade();
        Cidade sp = new Cidade();
        Estadio estadio = new Estadio();

        rj.setNome("Rio de Janeiro");
        sp.setNome("São Paulo");

        fla.setNome("Flamengo");
        fla.setCidadeSede(rj);
        
        flu.setNome("Fluminense");
        flu.setCidadeSede(rj);

        estadio.setCidade(sp);
        estadio.setNome("Morumbi");

        partida.setTimeA(fla);
        partida.setTimeB(flu);
        partida.setEstadio(estadio);
        partida.setData(LocalDate.of(2022, 3, 30));

        partida.golTimeB();
        partida.golTimeB();

        System.out.println("Informações da partida: " + partida.getTimeA().getNome() + " x " + partida.getTimeB().getNome());
        System.out.println("Placar: " + partida.getGolsTimeA() + " x " + partida.getGolsTimeB());
        System.out.println("Estádio: " + partida.getEstadio().getNome() + " - " + partida.getEstadio().getCidade().getNome());
        System.out.println("Data: " + partida.getData());
    }
}