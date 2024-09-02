package app;

import javax.swing.JOptionPane;

class Reserva {

    String nombreCliente;
    String pelicula;
    int numeroEntradas;
    double precioTotal;

    public Reserva(String nombreCliente, String pelicula, int numeroEntradas, double precioTotal) {
        this.nombreCliente = nombreCliente;
        this.pelicula = pelicula;
        this.numeroEntradas = numeroEntradas;
        this.precioTotal = precioTotal;
    }
}

public class Entradas_Cine {

    public static void main(String[] args) {
        Reserva[] reservas = new Reserva[20];

        reservas[0] = new Reserva("Juan Perez", "Avengers", 2, 20.0);
        reservas[1] = new Reserva("Ana Gomez", "Titanic", 3, 30.0);
        reservas[2] = new Reserva("Carlos Ruiz", "Matrix", 1, 10.0);

        String seleccion;

        do {
            String[] opciones = {"Mostrar Reservas", "Agregar Reserva", "Actualizar Entradas", "Buscar Reserva", "Calcular Ingreso Total", "Salir"};
            seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Funciones", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            if (seleccion != null) {
                switch (seleccion) {
                    case "Mostrar Reservas" ->
                        mostrarReservas(reservas);
                    case "Agregar Reserva" ->
                        agregarReserva(reservas);
                    case "Actualizar Entradas" ->
                        actualizarEntradas(reservas);
                    case "Buscar Reserva" ->
                        buscarReservas(reservas);
                    case "Calcular Ingreso Total" ->
                        calcularIngresoTotal(reservas);
                    case "Salir" ->
                        JOptionPane.showConfirmDialog(null, "Salir del programa?");
                    default ->
                        JOptionPane.showMessageDialog(null, "Seleccione una opción correcta");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Elija una opción");
            }
        } while (!"Salir".equals(seleccion));
    }

    private static void mostrarReservas(Reserva[] reservas) {
        StringBuilder listaReservas = new StringBuilder("Lista de reservas:\n");
        for (Reserva reserva : reservas) {
            if (reserva != null) {
                listaReservas.append("Nombre del cliente: ").append(reserva.nombreCliente).append("\n")
                .append("Nombre de la Película: ").append(reserva.pelicula).append("\n")
                .append("Número de entradas: ").append(reserva.numeroEntradas).append("\n")
                .append("Precio Total:  $").append(reserva.precioTotal).append("\n\n");
            }
        }
        JOptionPane.showMessageDialog(null, listaReservas.toString());
    }

    private static void agregarReserva(Reserva[] reservas) {
        String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
        String pelicula = JOptionPane.showInputDialog("Ingrese el nombre de la película:");
        int numeroEntradas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de entradas:"));
        double precioTotal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio total:"));

        for (int i = 0; i < reservas.length; i++) {
            if (reservas[i] == null) {
                reservas[i] = new Reserva(nombreCliente, pelicula, numeroEntradas, precioTotal);
                JOptionPane.showMessageDialog(null, "Reserva agregada con éxito.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "No se pudo agregar la reserva. Array lleno.");
    }

    private static void actualizarEntradas(Reserva[] reservas) {
        String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente de la reserva a actualizar:");
        int nuevasEntradas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo número de entradas:"));

        for (Reserva reserva : reservas) {
            if (reserva != null && reserva.nombreCliente.equalsIgnoreCase(nombreCliente)) {
                reserva.numeroEntradas = nuevasEntradas;
                reserva.precioTotal = nuevasEntradas * (reserva.precioTotal / reserva.numeroEntradas);
                JOptionPane.showMessageDialog(null, "Número de entradas actualizado con éxito.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Reserva no encontrada.");
    }

    private static void buscarReservas(Reserva[] reservas) {
        String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente a buscar:");
        StringBuilder resultado = new StringBuilder("Resultados de la búsqueda:\n");
        for (Reserva reserva : reservas) {
            if (reserva != null && reserva.nombreCliente.equalsIgnoreCase(nombreCliente)) {
                resultado.append("Nombre del cliente: ").append(reserva.nombreCliente).append("\n")
                .append("Nombre de la Película: ").append(reserva.pelicula).append("\n")
                .append("Número de entradas: ").append(reserva.numeroEntradas).append("\n")
                .append("Precio Total:  $").append(reserva.precioTotal).append("\n\n");
            }
        }
        JOptionPane.showMessageDialog(null, resultado.length() > 0 ? resultado.toString() : "Reserva no encontrada.");
    }

    private static void calcularIngresoTotal(Reserva[] reservas) {
        double ingresoTotal = 0;
        for (Reserva reserva : reservas) {
            if (reserva != null) {
                ingresoTotal += reserva.precioTotal;
            }
        }
        JOptionPane.showMessageDialog(null, "El ingreso total generado por las reservas es: $" + ingresoTotal);
    }
}
