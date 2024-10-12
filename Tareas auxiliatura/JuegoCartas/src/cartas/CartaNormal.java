package cartas;

public class CartaNormal extends Carta implements Coleccionable {

    public CartaNormal(int valor, String palo) {
        super(valor, palo);
    }

    @Override
    public void jugar() {
        System.out.println("Se ha jugado una carta normal: " + mostrarCarta());
    }

    @Override
    public void agregarAColeccion() {
        System.out.println("La carta normal " + mostrarCarta() + " ha sido agregada a la colección.");
    }
}
