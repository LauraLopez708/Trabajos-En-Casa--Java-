//package app;
//
//import javax.swing.*;
//import java.util.ArrayList;
//import java.util.List;
//
//class Cliente {
//
//    String nombre;
//    int edad;
//    String categoria;
//    int mesesMembresia;
//
//    public Cliente(String nombre, int edad, String categoria, int mesesMembresia) {
//        this.nombre = nombre;
//        this.edad = edad;
//        this.categoria = categoria;
//        this.mesesMembresia = mesesMembresia;
//    }
//}
//
//public class Gimnasio_Nobsa {
//
//    private static ArrayList<Cliente> clientes = new ArrayList<>();
//
//    public static void main(String[] args) {
//        String seleccion;
//
//        do {
//            String[] opciones = {"Ingresar Cliente", "Calcular Estadísticas", "Salir"};
//            seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Análisis de Clientes", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
//
//            if (seleccion != null) {
//                switch (seleccion) {
//                    case "Ingresar Cliente" ->
//                        ingresarCliente();
//                    case "Calcular Estadísticas" ->
//                        calcularEstadisticas();
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
//    private static void ingresarCliente() {
//        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
//        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del cliente:"));
//        String categoria = JOptionPane.showInputDialog("Ingrese la categoría del cliente (Pesas, Cardio, Yoga, Natación, Boxeo):");
//        int mesesMembresia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los meses de membresía del cliente:"));
//
//        clientes.add(new Cliente(nombre, edad, categoria, mesesMembresia));
//        JOptionPane.showMessageDialog(null, "Cliente registrado con éxito.");
//    }
//
//    private static void calcularEstadisticas() {
//        if (clientes.isEmpty()) {
//            JOptionPane.showMessageDialog(null, "No hay clientes registrados.");
//            return;
//        }
//
//        double promedioPesas = calcularPromedioEdad("Pesas");
//        double promedioCardio = calcularPromedioEdad("Cardio");
//        double promedioYoga = calcularPromedioEdad("Yoga");
//        double promedioNatacion = calcularPromedioEdad("Natación");
//        double promedioBoxeo = calcularPromedioEdad("Boxeo");
//
//        double porcentaje18_25 = calcularPorcentajeEdad(18, 25);
//        double porcentaje26_35 = calcularPorcentajeEdad(26, 35);
//        double porcentajeMayor35 = calcularPorcentajeEdad(36, Integer.MAX_VALUE);
//
//        int total1_5 = contarClientesMembresia(1, 5);
//        int total6_10 = contarClientesMembresia(6, 10);
//        int total11_15 = contarClientesMembresia(11, 15);
//        int total16_20 = contarClientesMembresia(16, 20);
//        int totalMayor20 = contarClientesMembresia(21, Integer.MAX_VALUE);
//
//        StringBuilder resultado = new StringBuilder();
//        resultado.append("Promedio de edad de los clientes en la categoría de Pesas: ").append(promedioPesas).append("\n");
//        resultado.append("Promedio de edad de los clientes en la categoría de Cardio: ").append(promedioCardio).append("\n");
//        resultado.append("Promedio de edad de los clientes en la categoría de Yoga: ").append(promedioYoga).append("\n");
//        resultado.append("Promedio de edad de los clientes en la categoría de Natación: ").append(promedioNatacion).append("\n");
//        resultado.append("Promedio de edad de los clientes en la categoría de Boxeo: ").append(promedioBoxeo).append("\n");
//        resultado.append("Porcentaje de clientes con edades entre 18 y 25 años: ").append(porcentaje18_25).append("%\n");
//        resultado.append("Porcentaje de clientes con edades entre 26 y 35 años: ").append(porcentaje26_35).append("%\n");
//        resultado.append("Porcentaje de clientes con edades superiores a 35 años: ").append(porcentajeMayor35).append("%\n");
//        resultado.append("Total de clientes con membresía entre 1 y 5 meses: ").append(total1_5).append("\n");
//        resultado.append("Total de clientes con membresía entre 6 y 10 meses: ").append(total6_10).append("\n");
//        resultado.append("Total de clientes con membresía entre 11 y 15 meses: ").append(total11_15).append("\n");
//        resultado.append("Total de clientes con membresía entre 16 y 20 meses: ").append(total16_20).append("\n");
//        resultado.append("Total de clientes con membresía superior a 20 meses: ").append(totalMayor20).append("\n");
//
//        JOptionPane.showMessageDialog(null, resultado.toString());
//    }
//
//    private static double calcularPromedioEdad(String categoria) {
//        int sumaEdades = 0;
//        int contador = 0;
//        for (Cliente cliente : clientes) {
//            if (cliente.categoria.equalsIgnoreCase(categoria)) {
//                sumaEdades += cliente.edad;
//                contador++;
//            }
//        }
//        return contador == 0 ? 0 : (double) sumaEdades / contador;
//    }
//
//    private static double calcularPorcentajeEdad(int edadMin, int edadMax) {
//        int contador = 0;
//        for (Cliente cliente : clientes) {
//            if (cliente.edad >= edadMin && cliente.edad <= edadMax) {
//                contador++;
//            }
//        }
//        return (double) contador / clientes.size() * 100;
//    }
//
//    private static int contarClientesMembresia(int mesesMin, int mesesMax) {
//        int contador = 0;
//        for (Cliente cliente : clientes) {
//            if (cliente.mesesMembresia >= mesesMin && cliente.mesesMembresia <= mesesMax) {
//                contador++;
//            }
//        }
//        return contador;
//    }
//}
