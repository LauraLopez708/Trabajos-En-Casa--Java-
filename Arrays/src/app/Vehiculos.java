//package app;
//
//import java.util.Arrays;
//import javax.swing.JOptionPane;
//
//class vehiculo {
//
//    String modelo;
//    String matricula;
//    double precioDia;
//    String disponibilidad;
//
//    public vehiculo(String modelo, String matricula, double precioDia, String disponibilidad) {
//        this.modelo = modelo;
//        this.matricula = matricula;
//        this.precioDia = precioDia;
//        this.disponibilidad = disponibilidad;
//    }
//
//}
//
//public class Vehiculos {
//
//    public static void main(String[] args) {
//        vehiculo[] carro = new vehiculo[100];
//
//        carro[0] = new vehiculo("1994", "RXZ123", 250000.00, "si");
//        carro[1] = new vehiculo("Chevrolet Picanto", "AWQ176", 125000.00, "no");
//        carro[2] = new vehiculo("Mazda 323", "MNG456", 235480.00, "si");
//        carro[3] = new vehiculo("Picup", "ZCS102", 340000.00, "no");
//        carro[4] = new vehiculo("Toyota", "CJH592", 312000.00, "si");
//
//        String seleccion;
//
//        do {
//            String[] opciones = {"Lista de Vehiculos", "Alquilar Vehiculo", "Devolver Vehiculo", "Ordenar lista por precio", "Salir"};
//            seleccion = (String) JOptionPane.showInputDialog(null, "Selecciones una opción", "Funciones", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
//
//            if (seleccion != null) {
//                switch (seleccion) {
//                    case "Lista de Vehiculos" ->
//                        mostrarLista(carro);
//                    case "Alquilar Vehiculo" ->
//                        actualizarDisponibilidad(carro);
//                    case "Devolver Vehiculo" ->
//                        actualizarDisponibilidad(carro);
//                    case "Ordenar lista por precio" ->
//                        ordenarPorPrecio(carro);
//                    case "Salir" ->
//                        JOptionPane.showConfirmDialog(null, "Salir del programa?");
//                    default ->
//                        JOptionPane.showMessageDialog(null, "Seleccione una opcion correcta");
//                }
//            } else {
//                JOptionPane.showMessageDialog(null, "Elija una opción");
//            }
//        } while (!"Salir".equals(seleccion));
//    }
//
//    private static void mostrarLista(vehiculo[] carros) {
//        StringBuilder listaAutos = new StringBuilder();
//        for (vehiculo movil : carros) {
//            if (movil != null) {
//                listaAutos.append("Modelo: ").append(movil.modelo).append("\n")
//                        .append("Matricula: ").append(movil.matricula).append("\n")
//                        .append("Precio por día: $").append(movil.precioDia).append("\n")
//                        .append("Disponible: ").append(movil.disponibilidad).append("\n\n");
//            }
//        }
//        JOptionPane.showMessageDialog(null, listaAutos.toString());
//    }
//
//    private static void actualizarDisponibilidad(vehiculo[] carros) {
//        String matriculaAuto = JOptionPane.showInputDialog("Ingrese la matricula del automovil");
//        vehiculo carroEncontrado = buscarAutoMatricula(carros, matriculaAuto);
//
//        if (carroEncontrado != null) {
//            String cambiarDisponibilidad = JOptionPane.showInputDialog("Cambie la diaponibilidad del auto (si/no)");
//            carroEncontrado.disponibilidad = cambiarDisponibilidad;
//
//        } else {
//            JOptionPane.showMessageDialog(null, "El vehiculo de matricula : " + matriculaAuto + " No se encuentra registrado.");
//        }
//    }
//
//    private static void ordenarPorPrecio(vehiculo[] carros) {
//        Arrays.sort(carros, (vehiculo carro1, vehiculo carro2) -> {
//            if (carro1 == null) {
//                return 1;
//            }
//            if (carro2 == null) {
//                return -1;
//            }
//
//            return Double.compare(carro1.precioDia, carro2.precioDia);
//        });
//        JOptionPane.showMessageDialog(null, "Lista ordenada por modelo.");
//    }
//
//    private static vehiculo buscarAutoMatricula(vehiculo[] carros, String matricula) {
//        for (vehiculo movil : carros) {
//            if (movil != null && movil.matricula.equalsIgnoreCase(matricula)) {
//                return movil;
//            }
//
//        }
//        return null;
//    }
//}
