//package app;
//
//import javax.swing.*;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//
//class Pedido {
//
//    String nombreCliente;
//    int numeroMesa;
//    ArrayList<String> listaPlatos;
//    ArrayList<Double> preciosPlatos;
//
//    public Pedido(String nombreCliente, int numeroMesa) {
//        this.nombreCliente = nombreCliente;
//        this.numeroMesa = numeroMesa;
//        this.listaPlatos = new ArrayList<>();
//        this.preciosPlatos = new ArrayList<>();
//    }
//
//    public void agregarPlato(String plato, double precio) {
//        this.listaPlatos.add(plato);
//        this.preciosPlatos.add(precio);
//    }
//
//    public double calcularTotal() {
//        double total = 0;
//        for (double precio : preciosPlatos) {
//            total += precio;
//        }
//        return total;
//    }
//}
//
//public class Restaurante {
//
//    private static ArrayList<Pedido> pedidos = new ArrayList<>();
//
//    public static void main(String[] args) {
//        String seleccion;
//
//        do {
//            String[] opciones = {"Mostrar Pedidos", "Registrar Pedido", "Actualizar Pedido", "Eliminar Pedido", "Salir"};
//            seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Gestión de Pedidos", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
//
//            if (seleccion != null) {
//                switch (seleccion) {
//                    case "Mostrar Pedidos" ->
//                        mostrarPedidos();
//                    case "Registrar Pedido" ->
//                        registrarPedido();
//                    case "Actualizar Pedido" ->
//                        actualizarPedido();
//                    case "Eliminar Pedido" ->
//                        eliminarPedido();
//                    case "Salir" ->
//                        JOptionPane.showMessageDialog(null, "Saliendo del programa.");
//                    default ->
//                        JOptionPane.showMessageDialog(null, "Seleccione una opción válida.");
//                }
//            } else {
//                JOptionPane.showMessageDialog(null, "Seleccione una opción.");
//            }
//        } while (!"Salir".equals(seleccion));
//    }
//
//    private static void mostrarPedidos() {
//        StringBuilder listaPedidos = new StringBuilder("Lista de pedidos:\n");
//        for (Pedido pedido : pedidos) {
//            listaPedidos.append("Nombre del cliente: ").append(pedido.nombreCliente).append("\n")
//                    .append("Número demesa: ").append(pedido.numeroMesa).append("\n")
//                    .append("Listado de platos: ").append(pedido.listaPlatos).append("\n")
//                    .append("Precio de los platos: ").append(pedido.preciosPlatos).append("\n\n");
//        }
//        JOptionPane.showMessageDialog(null, listaPedidos.toString());
//    }
//
//    private static void registrarPedido() {
//        String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
//        int numeroMesa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de mesa:"));
//
//        Pedido nuevoPedido = new Pedido(nombreCliente, numeroMesa);
//
//        String continuar;
//        do {
//            String plato = JOptionPane.showInputDialog("Ingrese el nombre del plato:");
//            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del plato:"));
//            nuevoPedido.agregarPlato(plato, precio);
//            continuar = JOptionPane.showInputDialog("¿Desea agregar otro plato? (sí/no):");
//        } while ("sí".equalsIgnoreCase(continuar));
//
//        pedidos.add(nuevoPedido);
//        JOptionPane.showMessageDialog(null, "Pedido registrado con éxito.");
//    }
//
//    private static void actualizarPedido() {
//        String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente del pedido a actualizar:");
//        Pedido pedido = buscarPedidoPorCliente(nombreCliente);
//
//        if (pedido != null) {
//            String plato = JOptionPane.showInputDialog("Ingrese el nombre del plato:");
//            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del plato:"));
//            pedido.agregarPlato(plato, precio);
//            JOptionPane.showMessageDialog(null, "Pedido actualizado con éxito.");
//        } else {
//            JOptionPane.showMessageDialog(null, "Pedido no encontrado.");
//        }
//    }
//
//    private static void eliminarPedido() {
//        String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente del pedido a eliminar:");
//        Pedido pedido = buscarPedidoPorCliente(nombreCliente);
//
//        if (pedido != null) {
//            pedidos.remove(pedido);
//            JOptionPane.showMessageDialog(null, "Pedido eliminado con éxito.");
//        } else {
//            JOptionPane.showMessageDialog(null, "Pedido no encontrado.");
//        }
//    }
//
//    private static Pedido buscarPedidoPorCliente(String nombreCliente) {
//        for (Pedido pedido : pedidos) {
//            if (pedido.nombreCliente.equalsIgnoreCase(nombreCliente)) {
//                return pedido;
//            }
//        }
//        return null;
//    }
//}
