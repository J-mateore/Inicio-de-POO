import java.util.Locale;

class Producto {
    String nombre;
    double precio;
    int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void vender(int cantidad) {
        if (cantidad <= this.stock) {
            this.stock -= cantidad;
        } else {
            System.out.println("No hay suficiente stock de " + this.nombre);
        }
    }

    public double calcularValorTotal() {
        return this.precio * this.stock;
    }
}

public class Main2 {
    public static void main(String[] args) {
        // Crear 4 productos
        Producto[] productos = {
            new Producto("Laptop", 850.00, 7),
            new Producto("Mouse", 25.50, 10),
            new Producto("Teclado", 45.00, 6),
            new Producto("Monitor", 180.00, 4)
        };

        // Imprimir lista inicial con formato: nombre : precio
        System.out.println("=== LISTA DE PRODUCTOS ===");
        for (Producto p : productos) {
            System.out.printf(Locale.US, "%s : $%.2f\n", p.nombre, p.precio);
        }
        System.out.println();

        // Simular la venta de 3 unidades de dos de ellos
        productos[0].vender(3); // Venta de 3 Laptops
        productos[2].vender(3); // Venta de 3 Teclados

        // Imprimir estado del inventario tras las ventas
        System.out.println("=== INVENTARIO TRAS VENTAS ===");
        double valorTotalInventario = 0;

        for (Producto p : productos) {
            String alerta = (p.stock < 5) ? " - Reponer" : "";
            System.out.printf(Locale.US, "%s : $%.2f | Stock: %d%s\n", p.nombre, p.precio, p.stock, alerta);
            valorTotalInventario += p.calcularValorTotal();
        }

        System.out.println();
        System.out.printf(Locale.US, "Valor total del inventario: $%.2f\n", valorTotalInventario);
    }
}