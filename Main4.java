import java.util.Locale;

class Cuenta {
    String titular;
    double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
}

public class Main4 {
    public static void main(String[] args) {
        // Crear 2 cuentas
        Cuenta c1 = new Cuenta("Carlos", 200.0);
        Cuenta c2 = new Cuenta("Ana", 350.0);

        Cuenta[] cuentas = {c1, c2};

        System.out.println("=== PROCESO DE AHORRO HASTA $500 ===");
        System.out.println();

        for (Cuenta c : cuentas) {
            int meses = 0;
            System.out.println("Cuenta de: " + c.titular);
            
            // Simular con un while hasta que el saldo llegue a 500
            while (c.saldo < 500.0) {
                c.saldo += 50.0;
                meses++;
                System.out.printf(Locale.US, "Mes %d -> %s : $%.2f\n", meses, c.titular, c.saldo);
            }
            
            System.out.println("-> Meses que necesitó " + c.titular + ": " + meses);
            System.out.println();
        }
    }
}