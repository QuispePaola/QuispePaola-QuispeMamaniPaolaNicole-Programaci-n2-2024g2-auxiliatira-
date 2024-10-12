package cartas;

public class CartaEspecial extends Carta implements Accionable {

    public CartaEspecial(int valor, String palo) {
        super(valor, palo);
    }

    @Override
    public void jugar() {
        System.out.println("Se ha jugado una carta especial: " + mostrarCarta());
    }

    @Override
    public void realizarAccion() {
        System.out.println("La carta especial " + mostrarCarta() + " realiza una acción especial.");
    }
}
