package vehiculos;

public class SimulacionVehiculos {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Corolla", 180);
        coche.mostrarInfo();
        coche.acelerar();

        Moto moto = new Moto("Yamaha", "YZF-R3", 190);
        moto.mostrarInfo();
        moto.acelerar();
        moto.activarTurbo();
    }
}
