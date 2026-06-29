package app;

import builder.LaptopFactory;
import model.*;

public class ProfecionalFactory extends LaptopFactory {
    @Override
    public Laptop crearLaptop(String m, String mod, int a, String p, double t) {
        return new LProfesional(m, mod, a, p, t);
    }
}