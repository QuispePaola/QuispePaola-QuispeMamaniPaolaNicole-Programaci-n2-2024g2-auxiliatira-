package cartas;

public abstract class Carta {
    protected int valor;
    protected String palo;

    public Carta(int valor, String palo) {
        this.valor = valor;
        this.palo = palo;
    }

    public abstract void jugar();
    
    public String mostrarCarta() {
        return "Valor: " + valor + ", Palo: " + palo;
    }
}
