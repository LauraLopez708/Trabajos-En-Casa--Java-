//package app;
//
//import javax.swing.JOptionPane;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//
//class Reserva {
//
//    String nombre;
//    String apellido;
//    String cedula;
//    int numeroHabitacion;
//    Date fechaEntrada;
//    Date fechaSalida;
//    double precioPorNoche;
//
//    public Reserva(String nombre, String apellido, String cedula, int numeroHabitacion, Date fechaEntrada, Date fechaSalida, double precioPorNoche) {
//        this.nombre = nombre;
//        this.apellido = apellido;
//        this.cedula = cedula;
//        this.numeroHabitacion = numeroHabitacion;
//        this.fechaEntrada = fechaEntrada;
//        this.fechaSalida = fechaSalida;
//        this.precioPorNoche = precioPorNoche;
//    }
//
//    public int calcularNoches() {
//        long diff = fechaSalida.getTime() - fechaEntrada.getTime();
//        return (int) (diff / (1000 * 60 * 60 * 24));
//    }
//
//    public double calcularCostoTotal() {
//        return calcularNoches() * precioPorNoche;
//    }
//}
//
//public class Hotel {
//
//    private static ArrayList<Reserva> reservas = new ArrayList<>();
//    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//
//    public static void main(String[] args) {
//
//        try {
//            reservas.add(new Reserva("Juan", "Pérez", "123456789", 101, sdf.parse("20/07/2024"), sdf.parse("25/07/2024"), 50.0));
//            reservas.add(new Reserva("Ana", "García", "987654321", 102, sdf.parse("22/07/2024"), sdf.parse("27/07/2024"), 60.0));
//        } catch (ParseException e) {
//        }
//
//        String seleccion;
//
//        do {
//            String[] opciones = {"Mostrar Reservas", "Registrar Reserva", "Cancelar Reserva", "Salir"};
//            seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Gestión de Reservas de Hotel", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
//
//            if (seleccion != null) {
//                switch (seleccion) {
//                    case "Mostrar Reservas" ->
//                        mostrarReservas();
//                    case "Registrar Reserva" ->
//                        registrarReserva();
//                    case "Cancelar Reserva" ->
//                        cancelarReserva();
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
//    private static void mostrarReservas() {
//        StringBuilder listaReservas = new StringBuilder("Lista de reservas del hotel:\n");
//
//        for (Reserva reserva : reservas) {
//            listaReservas.append("Nombre: ").append(reserva.nombre).append("\n")
//                    .append("Apellido: ").append(reserva.apellido).append("\n")
//                    .append("Número de documento: ").append(reserva.cedula).append("\n")
//                    .append("Número de habitación: ").append(reserva.numeroHabitacion).append("\n")
//                    .append("Fecha de ingreso: ").append(reserva.fechaEntrada).append("\n")
//                    .append("Fecha de Salida: ").append(reserva.fechaSalida).append("\n")
//                    .append("Precio por noche: ").append(reserva.precioPorNoche).append("\n")
//                    .append("Costo total: ").append(reserva.calcularCostoTotal()).append("\n\n");
//        }
//        JOptionPane.showMessageDialog(null, listaReservas.toString());
//    }
//
//    private static void registrarReserva() {
//        try {
//            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del huésped:");
//            String apellido = JOptionPane.showInputDialog("Ingrese el apellido del huésped:");
//            String cedula = JOptionPane.showInputDialog("Ingrese la cédula del huésped:");
//            int numeroHabitacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de habitación:"));
//            Date fechaEntrada = sdf.parse(JOptionPane.showInputDialog("Ingrese la fecha de entrada (dd/MM/yyyy):"));
//            Date fechaSalida = sdf.parse(JOptionPane.showInputDialog("Ingrese la fecha de salida (dd/MM/yyyy):"));
//            double precioPorNoche = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio por noche:"));
//
//            reservas.add(new Reserva(nombre, apellido, cedula, numeroHabitacion, fechaEntrada, fechaSalida, precioPorNoche));
//            JOptionPane.showMessageDialog(null, "Reserva registrada con éxito.");
//        } catch (ParseException e) {
//            JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto. Inténtelo de nuevo.");
//        }
//    }
//
//    private static void cancelarReserva() {
//        String cedula = JOptionPane.showInputDialog("Ingrese la cédula de la reserva a cancelar:");
//        boolean reservaEncontrada = false;
//
//        for (Reserva reserva : reservas) {
//            if (reserva.cedula.equals(cedula)) {
//                reservas.remove(reserva);
//                reservaEncontrada = true;
//                JOptionPane.showMessageDialog(null, "Reserva cancelada con éxito.");
//                break;
//            }
//        }
//
//        if (!reservaEncontrada) {
//            JOptionPane.showMessageDialog(null, "Reserva no encontrada.");
//        }
//    }
//}
