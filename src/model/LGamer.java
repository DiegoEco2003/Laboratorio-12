package model;

public class LGamer extends Laptop {
    public LGamer(String m, String mod, int a, String p, double t) { super(m, mod, a, p, t); }

    @Override
    public void ejecutarPrueba() {
        System.out.println("Laptop Gamer: Optimizando recursos gráficos.");
        activarModoOverclock(); // Llamada interna
    }

    public void activarModoOverclock() {
        System.out.println("Modo Overclock activado.");
    }
}
