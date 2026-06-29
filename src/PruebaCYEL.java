import app.*;
import builder.LaptopFactory;

public class PruebaCYEL {
    public static void main(String[] args) {
        System.out.println("=== INICIO DE FABRICACIÓN ===\n");

        LaptopFactory fabrica;

        fabrica = new GamerFactory();
        fabrica.fabricarYProbar("ASUS", "ROG", 2026, "i9", 17.3);

        fabrica = new BasicoFactory();
        fabrica.fabricarYProbar("Dell", "Inspiron", 2024, "i3", 15.6);

        fabrica = new ProfecionalFactory();
        fabrica.fabricarYProbar("Apple", "MacBook", 2025, "M3", 14.2);

        System.out.println("=== FIN DE LA FABRICACIÓN ===");
    }
}