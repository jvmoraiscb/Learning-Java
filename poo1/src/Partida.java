package src;
import java.time.LocalDate;

public class Partida {
    private Time timeA;
    private int golsTimeA;
    private Time timeB;
    private int golsTimeB;

    private Estadio estadio;
    private LocalDate data;

    public Partida(){}

    public Partida(Time timeA, Time timeB, Estadio estadio, LocalDate data){
        this.timeA = timeA;
        this.timeB = timeB;
        this.estadio = estadio;
        this.data = data;
    }

    public int getGolsTimeB() {
        return golsTimeB;
    }

    public void golTimeA(){
        this.golsTimeA++;
    }

    public int getGolsTimeA() {
        return golsTimeA;
    }

    public void golTimeB(){
        this.golsTimeB++;
    }

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public Time getTimeA() {
        return timeA;
    }
    public void setTimeA(Time timeA) {
        this.timeA = timeA;
    }
    public Time getTimeB() {
        return timeB;
    }
    public void setTimeB(Time timeB) {
        this.timeB = timeB;
    }
    public Estadio getEstadio() {
        return estadio;
    }
    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }
}
