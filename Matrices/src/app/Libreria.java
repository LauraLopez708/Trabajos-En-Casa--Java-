package app;

import java.util.ArrayList;
import javax.swing.JOptionPane;

class Libro {

    String titulo;
    String autor;
    String isbn;
    double precio;
    int cantidadEnStock;

    public Libro(String titulo, String autor, String isbn, double precio, int cantidadEnStock) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    public double calcularValorTotal() {
        return precio * cantidadEnStock;
    }
}

public class Libreria {

    private static ArrayList<Libro> inventario = new ArrayList<>();

    public static void main(String[] args) {
        String seleccion;

        do {
            String[] opciones = {"Mostrar Inventario", "Agregar Libro", "Eliminar Libro", "Calcular Valor Total", "Salir"};
            seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Inventario Librería", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            if (seleccion != null) {
                switch (seleccion) {
                    case "Mostrar Inventario" ->
                        mostrarInventario();
                    case "Agregar Libro" ->
                        agregarLibro();
                    case "Eliminar Libro" ->
                        eliminarLibro();
                    case "Calcular Valor Total" ->
                        calcularValorTotalInventario();
                    case "Salir" ->
                        JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    default ->
                        JOptionPane.showMessageDialog(null, "Seleccione una opción válida.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione una opción.");
            }
        } while (!"Salir".equals(seleccion));
    }

    private static void mostrarInventario() {
        StringBuilder listaLibros = new StringBuilder("Inventario de la librería:\n");
        for (Libro libro : inventario) {
            listaLibros.append("titilo: ").append(libro.titulo).append("\n")
                    .append("Autor: ").append(libro.autor).append("\n")
                    .append("Isbn: ").append(libro.isbn).append("\n")
                    .append("Precio: ").append(libro.precio).append("\n")
                    .append("Cantidad en stock: ").append(libro.cantidadEnStock).append("\n");
        }
        JOptionPane.showMessageDialog(null, listaLibros.toString());
    }

    private static void agregarLibro() {
        String titulo = JOptionPane.showInputDialog("Ingrese el título del libro:");
        String autor = JOptionPane.showInputDialog("Ingrese el autor del libro:");
        String isbn = JOptionPane.showInputDialog("Ingrese el ISBN del libro:");
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del libro:"));
        int cantidadEnStock = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad en stock del libro:"));

        Libro nuevoLibro = new Libro(titulo, autor, isbn, precio, cantidadEnStock);
        inventario.add(nuevoLibro);
        JOptionPane.showMessageDialog(null, "Libro agregado con éxito.");
    }

    private static void eliminarLibro() {
        String isbn = JOptionPane.showInputDialog("Ingrese el ISBN del libro a eliminar:");
        boolean libroEncontrado = false;

        for (Libro libro : inventario) {
            if (libro.isbn.equals(isbn)) {
                inventario.remove(libro);
                libroEncontrado = true;
                JOptionPane.showMessageDialog(null, "Libro eliminado con éxito.");
                break;
            }
        }

        if (!libroEncontrado) {
            JOptionPane.showMessageDialog(null, "Libro no encontrado.");
        }
    }

    private static void calcularValorTotalInventario() {
        double valorTotal = 0;
        for (Libro libro : inventario) {
            valorTotal += libro.calcularValorTotal();
        }
        JOptionPane.showMessageDialog(null, "El valor total del inventario es: " + valorTotal);
    }
}
