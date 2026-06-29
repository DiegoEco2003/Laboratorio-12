package builder;
import model.Laptop;

public abstract class LaptopFactory {
    public abstract Laptop crearLaptop(String m, String mod, int a, String p, double t);

    public final void fabricarYProbar(String m, String mod, int a, String p, double t) {
        Laptop laptop = crearLaptop(m, mod, a, p, t);
        laptop.ejecutarPrueba();
        System.out.println(laptop.toString() + "\n");
    }
}