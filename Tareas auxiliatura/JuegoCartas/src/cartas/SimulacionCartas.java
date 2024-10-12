package cartas;

public class SimulacionCartas {
    public static void main(String[] args) {
        CartaNormal cartaNormal = new CartaNormal(5, "Corazones");
        cartaNormal.jugar();
        cartaNormal.mostrarCarta();
        cartaNormal.agregarAColeccion();

        CartaEspecial cartaEspecial = new CartaEspecial(10, "Tréboles");
        cartaEspecial.jugar();
        cartaEspecial.realizarAccion();
    }
}
