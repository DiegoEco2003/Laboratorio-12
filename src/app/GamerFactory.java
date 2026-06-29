package app;

import builder.LaptopFactory;
import model.*;

public class GamerFactory extends LaptopFactory {
    @Override
    public Laptop crearLaptop(String m, String mod, int a, String p, double t) {
        return new LGamer(m, mod, a, p, t);
    }
}
