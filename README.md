# APE-04-POO-JAVA

![](https://img.shields.io/badge/JAVA-orange?style=for-the-badge&logo=java&logoColor=white) ![](https://img.shields.io/badge/GITHUB-black?style=for-the-badge&logo=github&logoColor=white)

Este repositorio contiene la resolución de los 5 ejercicios prácticos propuestos en la **Guía APE 4** para la asignatura de **Algoritmos y Lógica de Programación**.

---

## 📋 Datos Informativos

| Campo | Detalle |
| :--- | :--- |
| **Estudiante** | J. Mateo |
| **Carrera** | Ingeniería de Software |
| **Semestre** | Primer Semestre |
| **Materia** | Algoritmos y Lógica de Programación |
| **Lenguaje** | Java |
| **Entorno de Desarrollo** | Visual Studio Code |

---

## Resolución de Ejercicios

---

### Ejercicio 1: Notas del curso

#### Enunciado:
Crear la clase Estudiante con los atributos nombre, nota1, nota2, nota3 y promedio. En main, crear 5 instancias, calcular el promedio de cada una e imprimirlas una debajo de otra con el formato nombre : promedio, agregando Aprobado (7 o más), Supletorio (de 5 a 6.99) o Reprobado (menos de 5). Al final, imprimir cuántos estudiantes aprobaron.

#### Descripción de la solución:
Se creó la clase Estudiante calculando el promedio automáticamente desde el constructor. En la clase principal se instanciaron 5 estudiantes en un arreglo, evaluando su rendimiento mediante un bucle e identificando el estado académico de cada uno junto con el conteo final de aprobados.

#### Evidencia de codificación:
*[AQUÍ VA LA CAPTURA DEL EJERCICIO 1]*

---

### Ejercicio 2: Inventario de una tienda

#### Enunciado:
Crear la clase Producto con nombre, precio y stock. Crear 4 productos e imprimirlos con el formato nombre : precio. Simular la venta de 3 unidades de dos de ellos, mostrar “Reponer” junto a cada producto que quede con menos de 5 unidades e imprimir el valor total del inventario (suma de precio por stock).

#### Descripción de la solución:
Se definió la clase Producto con un método para reducir el stock tras cada venta y calcular el valor total. En el método principal se imprimió el catálogo inicial, se simularon las ventas indicadas y se recorrió el arreglo para alertar los productos con bajo stock y calcular la suma global del inventario.

#### Evidencia de codificación:
*[AQUÍ VA LA CAPTURA DEL EJERCICIO 2]*

---

### Ejercicio 3: Veterinaria

#### Enunciado:
Crear la clase Mascota con nombre, especie, edad y peso. Crear 3 mascotas e imprimirlas con el formato nombre : especie : peso, mostrando “Revisar peso” si pesan más de 20 kg. Luego escribir Mascota m4 = m1;, sumar 1 a m4.edad, imprimir m1.edad y explicar en un comentario por qué cambió.

#### Descripción de la solución:
Se implementó la clase Mascota filtrando mediante condiciones los casos que superan los 20 kg. Adicionalmente, se demostró el concepto de asignación de referencias en memoria igualando `m4 = m1`, evidenciando que al alterar la edad desde `m4`, la variable `m1` se modifica por apuntar al mismo objeto en el Heap.

#### Evidencia de codificación:
*[AQUÍ VA LA CAPTURA DEL EJERCICIO 3]*

---

### Ejercicio 4: Cuenta de ahorro

#### Enunciado:
Crear la clase Cuenta con titular y saldo. Crear 2 cuentas, una con 200 y otra con 350. Con un while, depositar 50 por mes en cada cuenta hasta que llegue a 500, imprimiendo cada mes con el formato titular : saldo, y al final cuántos meses necesitó cada una (6 y 3).

#### Descripción de la solución:
Se creó la clase Cuenta almacenando el saldo inicial de cada titular. Mediante un bucle `while`, se realizaron depósitos mensuales de $50 incrementando un contador de meses de manera independiente hasta alcanzar la meta de $500, imprimiendo el desglose mes a mes de los saldos.

#### Evidencia de codificación:
*[AQUÍ VA LA CAPTURA DEL EJERCICIO 4]*

---

### Ejercicio 5: Biblioteca

#### Enunciado:
Crear las clases Libro (titulo, autor, disponible) y Socio (nombre, librosPrestados). Crear 4 libros y 2 socios, registrar que el primer socio presta 2 libros y el segundo presta 1 (disponible = false y aumentar librosPrestados), y al final imprimir cada libro con el formato titulo : Disponible o titulo : Prestado, cada socio con el formato nombre : librosPrestados y cuántos libros quedan disponibles.

#### Descripción de la solución:
Se modeló la relación entre las clases Libro y Socio mediante un método de préstamo que actualiza el estado de disponibilidad e incrementa los préstamos del socio. Al final, se recorren las colecciones para imprimir el catálogo actualizado, los registros por socio y el total de libros disponibles.

#### Evidencia de codificación:
*[AQUÍ VA LA CAPTURA DEL EJERCICIO 5]*
