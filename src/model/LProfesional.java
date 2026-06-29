package model;

public class LProfesional extends Laptop {
    public LProfesional(String m, String mod, int a, String p, double t) { super(m, mod, a, p, t); }

    @Override
    public void ejecutarPrueba() {
        System.out.println("Laptop Profesional: Cifrando datos y compilando código.");
        activarAhorroBateria(); // Llamada interna
    }

    public void activarAhorroBateria() {
        System.out.println("Ahorro de batería activado.");
    }
}