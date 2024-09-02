//package app;
//
//import java.util.Arrays;
//import javax.swing.JOptionPane;
//
//class productos {
//
//    String tipo;
//    int cantidadStock;
//    double precio;
//
//    public productos(String tipo, int cantidadStock, double precio) {
//        this.tipo = tipo;
//        this.cantidadStock = cantidadStock;
//        this.precio = precio;
//    }
//
//}
//
//public class TiendaRopa {
//
//    public static void main(String[] args) {
//        productos[] ropa = new productos[10];
//
//        ropa[0] = new productos("Camisa para niño", 50, 25000.00);
//        ropa[1] = new productos("Vestido de rayas", 4, 55000.00);
//        ropa[2] = new productos("Shorts blue Star", 23, 120000.00);
//        ropa[3] = new productos("Pantalones cargo", 12, 75000.00);
//
//        String seleccion;
//
//        do {
//            String[] opciones = {"Mostrar inventario", "Agregar nuevas unidades", "Vender Productos", "Buscar productos", "Ordenar inventario por precio", "Salir"};
//            seleccion = (String) JOptionPane.showInputDialog(null, "Selecciona una opción", "Menu", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
//
//            if (seleccion != null) {
//                switch (seleccion) {
//                    case "Mostrar inventario" ->
//                        inventario(ropa);
//                    case "Agregar nuevas unidades" ->
//                        agregarUnidades(ropa);
//                    case "Vender Productos" ->
//                        venderproductos(ropa);
//                    case "Buscar productos" ->
//                        buscarProductos(ropa);
//
//                    case "Ordenar Mesas" ->
//                        ordenarInventario(ropa);
//                    case "Ordenar inventario por precio" ->
//                        JOptionPane.showConfirmDialog(null, "Salir del programa?");
//                    default ->
//                        JOptionPane.showMessageDialog(null, "Saliendo...");
//                }
//            } else {
//                JOptionPane.showMessageDialog(null, "Elija una opción");
//            }
//        } while (!"Salir".equals(seleccion));
//    }
//
//    private static void inventario(productos[] ropa) {
//        StringBuilder mercancia = new StringBuilder();
//        for (productos prendas : ropa) {
//            if (prendas != null) {
//                mercancia.append("Tipo de Ropa: ").append(prendas.tipo).append("\n")
//                        .append("Cantidad en stock: ").append(prendas.cantidadStock).append("\n")
//                        .append("Precio: ").append(prendas.precio).append("\n\n");
//            }
//        }
//        JOptionPane.showMessageDialog(null, mercancia.toString());
//    }
//
//    private static void agregarUnidades(productos[] ropa) {
//        String tipo = JOptionPane.showInputDialog("Ingrese el tipo de producto a agregar:");
//        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a agregar:"));
//        for (productos producto : ropa) {
//            if (producto.tipo.equalsIgnoreCase(tipo)) {
//                producto.cantidadStock += cantidad;
//                JOptionPane.showMessageDialog(null, "Unidades agregadas con éxito.");
//                return;
//            }
//        }
//        JOptionPane.showMessageDialog(null, "Producto no encontrado.");
//    }
//
//    private static void venderproductos(productos[] ropa) {
//        String tipo = JOptionPane.showInputDialog("Ingrese el tipo de producto a vender:");
//        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a vender:"));
//        for (productos producto : ropa) {
//            if (producto.tipo.equalsIgnoreCase(tipo)) {
//                if (producto.cantidadStock >= cantidad) {
//                    producto.cantidadStock -= cantidad;
//                    JOptionPane.showMessageDialog(null, "Producto vendido con éxito.");
//                } else {
//                    JOptionPane.showMessageDialog(null, "No hay suficiente stock.");
//                }
//                return;
//            }
//        }
//        JOptionPane.showMessageDialog(null, "Producto no encontrado.");
//    }
//
//
//    private static void buscarProductos(productos[] ropa) {
//        String tipo = JOptionPane.showInputDialog("Ingrese el tipo de producto a buscar:");
//        StringBuilder resultado = new StringBuilder("Resultados de la búsqueda:\n");
//        for (productos producto : ropa) {
//            if (producto.tipo.equalsIgnoreCase(tipo)) {
//                resultado.append(producto).append("\n");
//            }
//        }
//        JOptionPane.showMessageDialog(null, resultado.length() > 0 ? resultado.toString() : "Producto no encontrado.");
//    }
//
//    private static void ordenarInventario(productos[] ropa) {
//        Arrays.sort(ropa, (productos ropa1, productos ropa2) -> Double.compare(ropa1.precio, ropa2.precio));
//        JOptionPane.showMessageDialog(null, "Inventario ordenado por precio.");
//    }
//
//}
