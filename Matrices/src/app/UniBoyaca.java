//package app;
//
//import javax.swing.*;
//import java.util.ArrayList;
//import java.util.List;
//
//class Estudiante {
//
//    String nombre;
//    int edad;
//    String facultad;
//    double promedio;
//
//    public Estudiante(String nombre, int edad, String facultad, double promedio) {
//        this.nombre = nombre;
//        this.edad = edad;
//        this.facultad = facultad;
//        this.promedio = promedio;
//    }
//}
//
//public class UniBoyaca {
//
//    private static ArrayList<Estudiante> estudiantes = new ArrayList<>();
//
//    public static void main(String[] args) {
//        String seleccion;
//
//        do {
//            String[] opciones = {"Ingresar Estudiante", "Calcular Estadísticas", "Salir"};
//            seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Encuesta Universidad de Boyacá", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
//
//            if (seleccion != null) {
//                switch (seleccion) {
//                    case "Ingresar Estudiante" ->
//                        ingresarEstudiante();
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
//    private static void ingresarEstudiante() {
//        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
//        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante:"));
//        String facultad = JOptionPane.showInputDialog("Ingrese la facultad del estudiante:");
//        double promedio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el promedio del estudiante:"));
//
//        estudiantes.add(new Estudiante(nombre, edad, facultad, promedio));
//        JOptionPane.showMessageDialog(null, "Estudiante registrado con éxito.");
//    }
//
//    private static void calcularEstadisticas() {
//        if (estudiantes.isEmpty()) {
//            JOptionPane.showMessageDialog(null, "No hay estudiantes registrados.");
//            return;
//        }
//
//        double promedioIngenieria = calcularPromedioEdad("Ingeniería");
//        double promedioMedicina = calcularPromedioEdad("Medicina");
//        double promedioDerecho = calcularPromedioEdad("Derecho");
//        double promedioCienciasSociales = calcularPromedioEdad("Ciencias Sociales");
//        double promedioAdministracion = calcularPromedioEdad("Administración");
//
//        double porcentaje18_25 = calcularPorcentajeEdad(18, 25);
//        double porcentaje26_35 = calcularPorcentajeEdad(26, 35);
//        double porcentajeMayor35 = calcularPorcentajeEdad(36, Integer.MAX_VALUE);
//
//        int total1_2 = contarEstudiantesPromedio(1.0, 2.0);
//        int total2_1_3 = contarEstudiantesPromedio(2.1, 3.0);
//        int total3_1_4 = contarEstudiantesPromedio(3.1, 4.0);
//        int total4_1_5 = contarEstudiantesPromedio(4.1, 5.0);
//        int totalMayor5 = contarEstudiantesPromedio(5.1, Double.MAX_VALUE);
//
//        StringBuilder resultado = new StringBuilder();
//        resultado.append("Promedio de edad de los estudiantes en la facultad de Ingeniería: ").append(promedioIngenieria).append("\n");
//        resultado.append("Promedio de edad de los estudiantes en la facultad de Medicina: ").append(promedioMedicina).append("\n");
//        resultado.append("Promedio de edad de los estudiantes en la facultad de Derecho: ").append(promedioDerecho).append("\n");
//        resultado.append("Promedio de edad de los estudiantes en la facultad de Ciencias Sociales: ").append(promedioCienciasSociales).append("\n");
//        resultado.append("Promedio de edad de los estudiantes en la facultad de Administración: ").append(promedioAdministracion).append("\n");
//        resultado.append("Porcentaje de estudiantes con edades entre 18 y 25 años: ").append(porcentaje18_25).append("%\n");
//        resultado.append("Porcentaje de estudiantes con edades entre 26 y 35 años: ").append(porcentaje26_35).append("%\n");
//        resultado.append("Porcentaje de estudiantes con edades superiores a 35 años: ").append(porcentajeMayor35).append("%\n");
//        resultado.append("Total de estudiantes con promedio entre 1.0 y 2.0: ").append(total1_2).append("\n");
//        resultado.append("Total de estudiantes con promedio entre 2.1 y 3.0: ").append(total2_1_3).append("\n");
//        resultado.append("Total de estudiantes con promedio entre 3.1 y 4.0: ").append(total3_1_4).append("\n");
//        resultado.append("Total de estudiantes con promedio entre 4.1 y 5.0: ").append(total4_1_5).append("\n");
//        resultado.append("Total de estudiantes con promedio superior a 5.0: ").append(totalMayor5).append("\n");
//
//        JOptionPane.showMessageDialog(null, resultado.toString());
//    }
//
//    private static double calcularPromedioEdad(String facultad) {
//        int sumaEdades = 0;
//        int contador = 0;
//        for (Estudiante estudiante : estudiantes) {
//            if (estudiante.facultad.equalsIgnoreCase(facultad)) {
//                sumaEdades += estudiante.edad;
//                contador++;
//            }
//        }
//        return contador == 0 ? 0 : (double) sumaEdades / contador;
//    }
//
//    private static double calcularPorcentajeEdad(int edadMin, int edadMax) {
//        int contador = 0;
//        for (Estudiante estudiante : estudiantes) {
//            if (estudiante.edad >= edadMin && estudiante.edad <= edadMax) {
//                contador++;
//            }
//        }
//        return (double) contador / estudiantes.size() * 100;
//    }
//
//    private static int contarEstudiantesPromedio(double promedioMin, double promedioMax) {
//        int contador = 0;
//        for (Estudiante estudiante : estudiantes) {
//            if (estudiante.promedio >= promedioMin && estudiante.promedio <= promedioMax) {
//                contador++;
//            }
//        }
//        return contador;
//    }
//}
