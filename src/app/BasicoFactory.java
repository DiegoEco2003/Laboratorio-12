package app;

import builder.LaptopFactory;
import model.*;

public class BasicoFactory extends LaptopFactory {
    @Override
    public Laptop crearLaptop(String m, String mod, int a, String p, double t) {
        return new LBasica(m, mod, a, p, t);
    }
}