import java.util.Locale;

class Mascota {
    String nombre;
    String especie;
    int edad;
    double peso;

    public Mascota(String nombre, String especie, int edad, double peso) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
    }
}

public class Main3 {
    public static void main(String[] args) {
        // Crear 3 mascotas
        Mascota m1 = new Mascota("Max", "Perro", 3, 22.5);
        Mascota m2 = new Mascota("Michi", "Gato", 2, 4.0);
        Mascota m3 = new Mascota("Rocky", "Perro", 5, 25.0);

        Mascota[] mascotas = {m1, m2, m3};

        System.out.println("=== LISTA DE MASCOTAS ===");
        for (Mascota m : mascotas) {
            String alerta = (m.peso > 20.0) ? " - Revisar peso" : "";
            System.out.printf(Locale.US, "%s : %s : %.1f kg%s\n", m.nombre, m.especie, m.peso, alerta);
        }

        System.out.println();

        // Escribir Mascota m4 = m1; y sumar 1 a m4.edad
        Mascota m4 = m1;
        m4.edad += 1;

        // Imprimir m1.edad y explicar por qué cambió
        System.out.println("Edad de m1 despues de modificar m4: " + m1.edad);

        /*
         * EXPLICACIÓN:
         * m1 y m4 apuntan exactamente al mismo objeto en la memoria (al mismo espacio en el 
         * heap). Al hacer "Mascota m4 = m1;", no se crea una copia independiente de la mascota, 
         * sino una nueva referencia al objeto original. Por lo tanto, cualquier cambio realizado 
         * a través de la variable m4 (como sumar 1 a su edad) afecta directamente al objeto 
         * al que también hace referencia m1.
         */
    }
}