package model;

public class LBasica extends Laptop {
    public LBasica(String m, String mod, int a, String p, double t) { super(m, mod, a, p, t); }

    @Override
    public void ejecutarPrueba() {
        System.out.println("Laptop Basica: Ejecutando tareas de oficina.");
        cifrarDiscoDuro(); // Llamada interna
    }

    public void cifrarDiscoDuro() {
        System.out.println("Disco duro cifrado.");
    }
}