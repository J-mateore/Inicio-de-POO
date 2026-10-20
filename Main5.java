import java.util.Locale;

class Libro {
    String titulo;
    String autor;
    boolean disponible;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true; // Todo libro inicia disponible
    }
}

class Socio {
    String nombre;
    int librosPrestados;

    public Socio(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = 0;
    }

    public void prestarLibro(Libro libro) {
        if (libro.disponible) {
            libro.disponible = false;
            this.librosPrestados++;
        } else {
            System.out.println("El libro " + libro.titulo + " no esta disponible.");
        }
    }
}

public class Main5 {
    public static void main(String[] args) {
        // Crear 4 libros
        Libro l1 = new Libro("Cien anos de soledad", "Gabriel Garcia Marquez");
        Libro l2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes");
        Libro l3 = new Libro("El principito", "Antoine de Saint-Exupery");
        Libro l4 = new Libro("Rayuela", "Julio Cortazar");

        Libro[] libros = {l1, l2, l3, l4};

        // Crear 2 socios
        Socio s1 = new Socio("Juan");
        Socio s2 = new Socio("Maria");

        // El primer socio presta 2 libros
        s1.prestarLibro(l1);
        s1.prestarLibro(l2);

        // El segundo socio presta 1 libro
        s2.prestarLibro(l3);

        // Imprimir cada libro con el formato titulo : Disponible / Prestado
        System.out.println("=== ESTADO DE LOS LIBROS ===");
        int disponiblesCount = 0;
        for (Libro l : libros) {
            String estado = l.disponible ? "Disponible" : "Prestado";
            System.out.printf(Locale.US, "%s : %s\n", l.titulo, estado);
            
            if (l.disponible) {
                disponiblesCount++;
            }
        }

        // Imprimir cada socio con el formato nombre : librosPrestados
        System.out.println("\n=== ESTADO DE LOS SOCIOS ===");
        System.out.printf(Locale.US, "%s : %d\n", s1.nombre, s1.librosPrestados);
        System.out.printf(Locale.US, "%s : %d\n", s2.nombre, s2.librosPrestados);

        // Imprimir cuántos libros quedan disponibles
        System.out.println("\nLibros disponibles en total: " + disponiblesCount);
    }
}