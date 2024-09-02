//package app;
//
//import javax.swing.*;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//
//class Socio {
//
//    String nombre;
//    String apellido;
//    String numeroIdentificacion;
//    String tipoMembresia;
//    Map<String, Integer> actividades;
//
//    public Socio(String nombre, String apellido, String numeroIdentificacion, String tipoMembresia) {
//        this.nombre = nombre;
//        this.apellido = apellido;
//        this.numeroIdentificacion = numeroIdentificacion;
//        this.tipoMembresia = tipoMembresia;
//        this.actividades = new HashMap<>();
//    }
//
//    public void registrarActividad(String tipoActividad, int duracion) {
//        this.actividades.put(tipoActividad, this.actividades.getOrDefault(tipoActividad, 0) + duracion);
//    }
//}
//
//public class Gimnasio {
//
//    private static ArrayList<Socio> socios = new ArrayList<>();
//
//    public static void main(String[] args) {
//        String seleccion;
//
//        do {
//            String[] opciones = {"Mostrar Socios", "Registrar Socio", "Registrar Actividad", "Salir"};
//            seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Gestión de Socios del Gimnasio", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
//
//            if (seleccion != null) {
//                switch (seleccion) {
//                    case "Mostrar Socios" ->
//                        mostrarSocios();
//                    case "Registrar Socio" ->
//                        registrarSocio();
//                    case "Registrar Actividad" ->
//                        registrarActividad();
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
//    private static void mostrarSocios() {
//        StringBuilder listaSocios = new StringBuilder("Lista de socios:\n");
//        for (Socio socio : socios) {
//            listaSocios.append("Nombre: ").append(socio.nombre).append("\n")
//                    .append("Apellido: ").append(socio.apellido).append("\n")
//                    .append("Documento: ").append(socio.numeroIdentificacion).append("\n")
//                    .append("Tipo de membresia: ").append(socio.tipoMembresia).append("\n")
//                    .append("Actividades: ").append(socio.tipoMembresia).append("\n\n");
//        }
//        JOptionPane.showMessageDialog(null, listaSocios.toString());
//    }
//
//    private static void registrarSocio() {
//        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del socio:");
//        String apellido = JOptionPane.showInputDialog("Ingrese el apellido del socio:");
//        String numeroIdentificacion = JOptionPane.showInputDialog("Ingrese el número de identificación del socio:");
//        String tipoMembresia = JOptionPane.showInputDialog("Ingrese el tipo de membresía del socio:");
//
//        socios.add(new Socio(nombre, apellido, numeroIdentificacion, tipoMembresia));
//        JOptionPane.showMessageDialog(null, "Socio registrado con éxito.");
//    }
//
//    private static void registrarActividad() {
//        String numeroIdentificacion = JOptionPane.showInputDialog("Ingrese el número de identificación del socio:");
//        Socio socio = buscarSocioPorID(numeroIdentificacion);
//
//        if (socio != null) {
//            String tipoActividad = JOptionPane.showInputDialog("Ingrese el tipo de actividad:");
//            int duracion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la duración de la actividad (en minutos):"));
//            socio.registrarActividad(tipoActividad, duracion);
//            JOptionPane.showMessageDialog(null, "Actividad registrada con éxito.");
//        } else {
//            JOptionPane.showMessageDialog(null, "Socio no encontrado.");
//        }
//    }
//
//    private static Socio buscarSocioPorID(String numeroIdentificacion) {
//        for (Socio socio : socios) {
//            if (socio.numeroIdentificacion.equalsIgnoreCase(numeroIdentificacion)) {
//                return socio;
//            }
//        }
//        return null;
//    }
//}
