package vehiculos;

public class Coche extends Vehiculo implements Electricidad {

    public Coche(String marca, String modelo, int velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }

    @Override
    public void acelerar() {
        System.out.println("El coche " + marca + " " + modelo + " está acelerando.");
    }

    @Override
    public void recargarBateria() {
        System.out.println("El coche " + marca + " " + modelo + " está recargando su batería.");
    }
}
