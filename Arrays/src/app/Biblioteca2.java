package app;

import java.util.Arrays;
import javax.swing.JOptionPane;

class Libro {

    String nombre;
    String autor;
    int cantidad;

    // Constructor
    public Libro(String nombre, String autor, int cantidad) {
        this.nombre = nombre;
        this.autor = autor;
        this.cantidad = cantidad;
    }
}

public class Biblioteca2 {

    public static void main(String[] args) {
        Libro[] biblioteca = new Libro[100];

        biblioteca[0] = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 6);
        biblioteca[1] = new Libro("Harry Potter", "J.K. Rowling", 4);
        biblioteca[2] = new Libro("Hamlet", "William Shakespeare", 1);
        biblioteca[3] = new Libro("Cien años de soledad", "Gabriel García Márquez", 2);

        String seleccion;
        do {
            String[] opciones = {"Inventario", "Agregar Copias", "Prestar Libro", "Buscar Libro", "Ordenar", "Salir"};
            seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione la función de la Biblioteca",
                    "Funciones",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);
            if (seleccion != null) {
                switch (seleccion) {
                    case "Inventario" -> mostrarInventario(biblioteca);
                    case "Agregar Copias" -> agregarCopias(biblioteca);
                    case "Prestar Libro" -> prestarLibro(biblioteca);
                    case "Buscar Libro" -> buscarLibro(biblioteca);
                    case "Ordenar" -> ordenarBiblioteca(biblioteca);
                    case "Salir" -> JOptionPane.showMessageDialog(null, "Saliendo...");
                    default -> JOptionPane.showMessageDialog(null, "Opción no válida");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Elija una opción");
            }
        } while (!"Salir".equals(seleccion));
    }

    private static void mostrarInventario(Libro[] biblioteca) {
        StringBuilder inventarioFin = new StringBuilder();
        for (Libro libro : biblioteca) {
            if (libro != null) {
                inventarioFin.append("Nombre: ").append(libro.nombre).append("\n")
                        .append("Autor: ").append(libro.autor).append("\n")
                        .append("Cantidad: ").append(libro.cantidad).append("\n\n");
            }
        }
        JOptionPane.showMessageDialog(null, inventarioFin.toString());
    }

    private static void agregarCopias(Libro[] biblioteca) {
        String nombreLibro = JOptionPane.showInputDialog("Ingrese el nombre del libro:");
        Libro libroEncontrado = buscarLibroPorNombre(biblioteca, nombreLibro);

        if (libroEncontrado != null) {
            int cantidadAAgregar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de copias a agregar:"));
            libroEncontrado.cantidad += cantidadAAgregar;
            JOptionPane.showMessageDialog(null, "Se agregaron " + cantidadAAgregar + " copias de " + nombreLibro);
        } else {
            JOptionPane.showMessageDialog(null, "El libro no se encontró en la biblioteca.");
        }
    }

    private static void prestarLibro(Libro[] biblioteca) {
        String nomLibro = JOptionPane.showInputDialog("Ingrese el nombre del libro a prestar:");
        Libro libroPrestar = buscarLibroPorNombre(biblioteca, nomLibro);

        if (libroPrestar != null) {
            if (libroPrestar.cantidad > 0) {
                libroPrestar.cantidad--;
                JOptionPane.showMessageDialog(null, "Libro prestado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No hay copias disponibles de este libro.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El libro no se encuentra en la biblioteca.");
        }
    }

    private static void buscarLibro(Libro[] biblioteca) {
        String buscarNombre = JOptionPane.showInputDialog("Nombre del libro a buscar:");
        Libro libroBuscar = buscarLibroPorNombre(biblioteca, buscarNombre);

        if (libroBuscar != null) {
            JOptionPane.showMessageDialog(null, "Libro " + libroBuscar.nombre + " encontrado, tiene " + libroBuscar.cantidad + " copias");
        } else {
            JOptionPane.showMessageDialog(null, "El Libro " + buscarNombre + " no se encuentra");
        }
    }

    private static void ordenarBiblioteca(Libro[] biblioteca) {
        Arrays.sort(biblioteca, (Libro libro1, Libro libro2) -> {
            if (libro1 == null) {
                return 1;
            }
            if (libro2 == null) {
                return -1;
            }
            return libro1.nombre.compareToIgnoreCase(libro2.nombre);
        });
        JOptionPane.showMessageDialog(null, "Libros ordenados por nombre.");
    }

    private static Libro buscarLibroPorNombre(Libro[] biblioteca, String nombre) {
        for (Libro libro : biblioteca) {
            if (libro != null && libro.nombre.equalsIgnoreCase(nombre)) {
                return libro;
            }
        }
        return null;
    }
}
