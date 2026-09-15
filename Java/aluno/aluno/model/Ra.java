package model;
import java.time.LocalDate;

public class Ra {
    int numero;
    LocalDate anoFeito;

    public Ra(int numero, LocalDate anoFeito){
        this.numero = numero;
        this.anoFeito = LocalDate.now();
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public LocalDate getAnoFeito() {
        return anoFeito;
    }
    public void setAnoFeito(LocalDate anoFeito) {
        this.anoFeito = anoFeito;
    }
    
}
