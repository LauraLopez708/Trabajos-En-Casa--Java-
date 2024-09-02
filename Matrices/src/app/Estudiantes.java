//package app;
//
//import javax.swing.*;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//
//class Estudiante {
//
//    String nombre;
//    String apellido;
//    String numeroIdentificacion;
//    String curso;
//    Map<String, Double> notas;
//
//    public Estudiante(String nombre, String apellido, String numeroIdentificacion, String curso) {
//        this.nombre = nombre;
//        this.apellido = apellido;
//        this.numeroIdentificacion = numeroIdentificacion;
//        this.curso = curso;
//        this.notas = new HashMap<>();
//    }
//
//    public void agregarNota(String asignatura, double nota) {
//        this.notas.put(asignatura, nota);
//    }
//
//    public double calcularPromedio() {
//        if (notas.isEmpty()) {
//            return 0.0;
//        }
//        double suma = 0;
//        for (double nota : notas.values()) {
//            suma += nota;
//        }
//        return suma / notas.size();
//    }
//}
//
//public class Estudiantes {
//
//    private static ArrayList<Estudiante> estudiantes = new ArrayList<>();
//
//    public static void main(String[] args) {
//        String seleccion;
//
//        do {
//            String[] opciones = {"Mostrar Estudiantes", "Registrar Estudiante", "Ingresar Notas", "Salir"};
//            seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Registro de Notas de Estudiantes", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
//
//            if (seleccion != null) {
//                switch (seleccion) {
//                    case "Mostrar Estudiantes" ->
//                        mostrarEstudiantes();
//                    case "Registrar Estudiante" ->
//                        registrarEstudiante();
//                    case "Ingresar Notas" ->
//                        ingresarNotas();
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
//    private static void mostrarEstudiantes() {
//        StringBuilder listaEstudiantes = new StringBuilder("Lista de estudiantes:\n");
//        for (Estudiante estudiante : estudiantes) {
//            listaEstudiantes.append("Nombre: ").append(estudiante.nombre).append("\n")
//                    .append("Apellido: ").append(estudiante.apellido).append("\n")
//                    .append("Documento: ").append(estudiante.numeroIdentificacion).append("\n")
//                    .append("Curso: ").append(estudiante.curso).append("\n")
//                    .append("Notas: ").append(estudiante.notas).append("\n\n");
//        }
//        JOptionPane.showMessageDialog(null, listaEstudiantes.toString());
//    }
//
//    private static void registrarEstudiante() {
//        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
//        String apellido = JOptionPane.showInputDialog("Ingrese el apellido del estudiante:");
//        String numeroIdentificacion = JOptionPane.showInputDialog("Ingrese el número de identificación del estudiante:");
//        String curso = JOptionPane.showInputDialog("Ingrese el curso del estudiante:");
//
//        estudiantes.add(new Estudiante(nombre, apellido, numeroIdentificacion, curso));
//        JOptionPane.showMessageDialog(null, "Estudiante registrado con éxito.");
//    }
//
//    private static void ingresarNotas() {
//        String numeroIdentificacion = JOptionPane.showInputDialog("Ingrese el número de identificación del estudiante:");
//        Estudiante estudiante = buscarEstudiantePorID(numeroIdentificacion);
//
//        if (estudiante != null) {
//            String asignatura = JOptionPane.showInputDialog("Ingrese la asignatura:");
//            double nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota para " + asignatura + ":"));
//            estudiante.agregarNota(asignatura, nota);
//            JOptionPane.showMessageDialog(null, "Nota agregada con éxito.");
//        } else {
//            JOptionPane.showMessageDialog(null, "Estudiante no encontrado.");
//        }
//    }
//
//    private static Estudiante buscarEstudiantePorID(String numeroIdentificacion) {
//        for (Estudiante estudiante : estudiantes) {
//            if (estudiante.numeroIdentificacion.equals(numeroIdentificacion)) {
//                return estudiante;
//            }
//        }
//        return null;
//    }
//}
