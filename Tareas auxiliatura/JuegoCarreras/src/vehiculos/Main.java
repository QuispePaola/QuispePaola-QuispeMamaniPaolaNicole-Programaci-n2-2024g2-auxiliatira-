package vehiculos;

public class Main {
    public static void main(String[] args) {
        // Crear un coche
        Coche coche = new Coche("Toyota", "Supra", 250);
        coche.mostrarInfo();
        coche.acelerar();

        // Crear una moto
        Moto moto = new Moto("Yamaha", "R1", 300);
        moto.mostrarInfo();
        moto.acelerar();
        moto.activarTurbo();
    }
}
