package app;

import javax.swing.*;
import java.util.ArrayList;

class Paciente {

    String nombre;
    int edad;
    String area;
    int diasInternacion;

    public Paciente(String nombre, int edad, String area, int diasInternacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.area = area;
        this.diasInternacion = diasInternacion;
    }
}

public class Hospital {

    private static ArrayList<Paciente> pacientes = new ArrayList<>();

    public static void main(String[] args) {
        String seleccion;

        do {
            String[] opciones = {"Ingresar Paciente", "Calcular Estadísticas", "Salir"};
            seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Seguimiento de Pacientes", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            if (seleccion != null) {
                switch (seleccion) {
                    case "Ingresar Paciente" ->
                        ingresarPaciente();
                    case "Calcular Estadísticas" ->
                        calcularEstadisticas();
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

    private static void ingresarPaciente() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del paciente:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del paciente:"));
        String area = JOptionPane.showInputDialog("Ingrese el área del paciente (Cardiología, Neurología, Pediatría, Oncología, Traumatología):");
        int diasInternacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los días de internación del paciente:"));

        pacientes.add(new Paciente(nombre, edad, area, diasInternacion));
        JOptionPane.showMessageDialog(null, "Paciente registrado con éxito.");
    }

    private static void calcularEstadisticas() {
        if (pacientes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay pacientes registrados.");
            return;
        }

        double promedioCardiologia = calcularPromedioEdad("Cardiología");
        double promedioNeurologia = calcularPromedioEdad("Neurología");
        double promedioPediatria = calcularPromedioEdad("Pediatría");
        double promedioOncologia = calcularPromedioEdad("Oncología");
        double promedioTraumatologia = calcularPromedioEdad("Traumatología");

        double porcentaje18_25 = calcularPorcentajeEdad(18, 25);
        double porcentaje26_35 = calcularPorcentajeEdad(26, 35);
        double porcentajeMayor35 = calcularPorcentajeEdad(36, Integer.MAX_VALUE);

        int total1_5 = contarPacientesInternacion(1, 5);
        int total6_10 = contarPacientesInternacion(6, 10);
        int total11_15 = contarPacientesInternacion(11, 15);
        int total16_20 = contarPacientesInternacion(16, 20);
        int totalMayor20 = contarPacientesInternacion(21, Integer.MAX_VALUE);

        StringBuilder resultado = new StringBuilder();
        resultado.append("Promedio de edad de los pacientes en el área de Cardiología: ").append(promedioCardiologia).append("\n");
        resultado.append("Promedio de edad de los pacientes en el área de Neurología: ").append(promedioNeurologia).append("\n");
        resultado.append("Promedio de edad de los pacientes en el área de Pediatría: ").append(promedioPediatria).append("\n");
        resultado.append("Promedio de edad de los pacientes en el área de Oncología: ").append(promedioOncologia).append("\n");
        resultado.append("Promedio de edad de los pacientes en el área de Traumatología: ").append(promedioTraumatologia).append("\n");
        resultado.append("Porcentaje de pacientes con edades entre 18 y 25 años: ").append(porcentaje18_25).append("%\n");
        resultado.append("Porcentaje de pacientes con edades entre 26 y 35 años: ").append(porcentaje26_35).append("%\n");
        resultado.append("Porcentaje de pacientes con edades superiores a 35 años: ").append(porcentajeMayor35).append("%\n");
        resultado.append("Total de pacientes con tiempo de internación entre 1 y 5 días: ").append(total1_5).append("\n");
        resultado.append("Total de pacientes con tiempo de internación entre 6 y 10 días: ").append(total6_10).append("\n");
        resultado.append("Total de pacientes con tiempo de internación entre 11 y 15 días: ").append(total11_15).append("\n");
        resultado.append("Total de pacientes con tiempo de internación entre 16 y 20 días: ").append(total16_20).append("\n");
        resultado.append("Total de pacientes con tiempo de internación superior a 20 días: ").append(totalMayor20).append("\n");

        JOptionPane.showMessageDialog(null, resultado.toString());
    }

    private static double calcularPromedioEdad(String area) {
        int sumaEdades = 0;
        int contador = 0;
        for (Paciente paciente : pacientes) {
            if (paciente.area.equalsIgnoreCase(area)) {
                sumaEdades += paciente.edad;
                contador++;
            }
        }
        return contador == 0 ? 0 : (double) sumaEdades / contador;
    }

    private static double calcularPorcentajeEdad(int edadMin, int edadMax) {
        int contador = 0;
        for (Paciente paciente : pacientes) {
            if (paciente.edad >= edadMin && paciente.edad <= edadMax) {
                contador++;
            }
        }
        return (double) contador / pacientes.size() * 100;
    }

    private static int contarPacientesInternacion(int diasMin, int diasMax) {
        int contador = 0;
        for (Paciente paciente : pacientes) {
            if (paciente.diasInternacion >= diasMin && paciente.diasInternacion <= diasMax) {
                contador++;
            }
        }
        return contador;
    }
}
