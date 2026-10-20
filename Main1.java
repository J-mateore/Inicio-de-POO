import java.util.Locale;

class Estudiante {
    String nombre;
    double nota1;
    double nota2;
    double nota3;
    double promedio;

    public Estudiante(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.calcularPromedio();
    }

    public void calcularPromedio() {
        this.promedio = (this.nota1 + this.nota2 + this.nota3) / 3.0;
    }

    public String obtenerEstado() {
        if (this.promedio >= 7.0) {
            return "Aprobado";
        } else if (this.promedio >= 5.0) {
            return "Supletorio";
        } else {
            return "Reprobado";
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
        Estudiante[] estudiantes = {
            new Estudiante("Carlos", 8.5, 9.0, 7.5),
            new Estudiante("Ana", 4.5, 5.0, 6.0),
            new Estudiante("Mateo", 9.5, 10.0, 9.0),
            new Estudiante("Lucía", 6.0, 6.5, 5.5),
            new Estudiante("David", 3.0, 4.0, 4.5)
        };

        int aprobadosCount = 0;

        System.out.println("=== NOTAS DEL CURSO ===");
        System.out.println();

        for (Estudiante est : estudiantes) {
            System.out.printf(Locale.US, "%s : %.2f - %s\n", est.nombre, est.promedio, est.obtenerEstado());
            
            if (est.promedio >= 7.0) {
                aprobadosCount++;
            }
        }

        System.out.println();
        System.out.println("Estudiantes aprobados: " + aprobadosCount);
    }
}