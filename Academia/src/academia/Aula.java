package academia;

public class Aula {

    private double valorDaDiaria = 100;
    private String tipoDeAula;

    public Aula(double valorDaDiaria, String tipoDeAula) {
        this.valorDaDiaria = valorDaDiaria;
        this.tipoDeAula = tipoDeAula;
    }

    public double getValorDaDiaria() {
        return this.valorDaDiaria;
    }

    public String getTipoDeAula() {
        return this.tipoDeAula;
    }
}
