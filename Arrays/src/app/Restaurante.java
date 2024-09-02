//package app;
//
//import java.util.Arrays;
//import javax.swing.JOptionPane;
//
//class mesasRestaurante {
//
//    int numMesa;
//    boolean disponibilidad;
//    int capacidad;
//
//    public mesasRestaurante(int numMesa, boolean disponibilidad, int capacidad) {
//        this.numMesa = numMesa;
//        this.disponibilidad = disponibilidad;
//        this.capacidad = capacidad;
//    }
//
//}
//
//public class Restaurante {
//
//    public static void main(String[] args) {
//        mesasRestaurante[] mesas = new mesasRestaurante[50];
//        mesas[0] = new mesasRestaurante(1, true, 5);
//        mesas[1] = new mesasRestaurante(2, false, 3);
//        mesas[2] = new mesasRestaurante(3, true, 2);
//        mesas[3] = new mesasRestaurante(4, false, 6);
//        mesas[4] = new mesasRestaurante(5, true, 15);
//
//        String seleccion;
//
//        do {
//            String[] opciones = {"Mostrar disponibilidad", "Realizar reserva", "Cancelar reserva", "Buscar mesas", "Ordenar Mesas", "Salir"};
//            seleccion = (String) JOptionPane.showInputDialog(null, "Selecciones una opción", "Funciones", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
//
//            if (seleccion != null) {
//                switch (seleccion) {
//                    case "Mostrar disponibilidad" ->
//                        mostrarMesasDisponibles(mesas);
//                    case "Realizar reserva" ->
//                        realizarReservacion(mesas);
//                    case "Cancelar reserva" ->
//                        cancelarReservacion(mesas);
//                    case "Buscar mesas" ->
//                        buscarMesas(mesas);
//                    case "Ordenar Mesas" ->
//                        ordenarPorCapacidad(mesas);
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
//    private static void mostrarMesasDisponibles(mesasRestaurante[] mesas) {
//        StringBuilder mesasDisponibles = new StringBuilder();
//        for (mesasRestaurante mesasDis : mesas) {
//            if (mesasDis != null) {
//                mesasDisponibles.append("Numero de mesa: ").append(mesasDis.numMesa).append("\n")
//                        .append("Disponible: ").append(mesasDis.disponibilidad).append("\n")
//                        .append("Capacidad: ").append(mesasDis.capacidad).append("\n\n");
//            }
//        }
//        JOptionPane.showMessageDialog(null, mesasDisponibles.toString());
//    }
//
//    private static void realizarReservacion(mesasRestaurante[] mesas) {
//        int NUMmesa = Integer.parseInt(JOptionPane.showInputDialog("Indique el número de mesa: "));
//        for (mesasRestaurante mesa : mesas) {
//            if (mesa.numMesa == NUMmesa) {
//                if (mesa.disponibilidad) {
//                    mesa.disponibilidad = false;
//                    JOptionPane.showMessageDialog(null, "Reserva realizada con éxito.");
//                } else {
//                    JOptionPane.showMessageDialog(null, "La mesa ya está reservada.");
//                }
//                return;
//            }
//        }
//        JOptionPane.showMessageDialog(null, "Mesa no encontrada.");
//    }
//
//    private static void cancelarReservacion(mesasRestaurante[] mesas) {
//        int numeroMesa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de mesa a cancelar reserva:"));
//        for (mesasRestaurante mesa : mesas) {
//            if (mesa.numMesa == numeroMesa) {
//                if (!mesa.disponibilidad) {
//                    mesa.disponibilidad = true;
//                    JOptionPane.showMessageDialog(null, "Reserva cancelada con éxito.");
//                } else {
//                    JOptionPane.showMessageDialog(null, "La mesa no está reservada.");
//                }
//                return;
//            }
//        }
//        JOptionPane.showMessageDialog(null, "Mesa no encontrada.");
//    }
//
//    private static void buscarMesas(mesasRestaurante[] mesas) {
//        int capacidadMesa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad de la mesa a buscar:"));
//        StringBuilder resultado = new StringBuilder();
//        for (mesasRestaurante mesaDis : mesas) {
//            if (mesaDis != null) {
//                if (mesaDis.disponibilidad == true && mesaDis.capacidad == capacidadMesa) {
//                    resultado.append("Numero de mesa: ").append(mesaDis.numMesa).append("\n")
//                            .append("Disponible: si").append("\n")
//                            .append("Capacidad: ").append(mesaDis.capacidad).append("\n\n");
//                }
//
//            }
//        }
//        JOptionPane.showMessageDialog(null, resultado);
//    }
//
//    private static void ordenarPorCapacidad(mesasRestaurante[] mesas) {
//        Arrays.sort(mesas, (mesasRestaurante mesa1, mesasRestaurante mesa2) -> {
//            if (mesa1 == null) {
//                return 1;
//            }
//
//            if (mesa2 == null) {
//                return -1;
//            }
//            return Integer.compare(mesa1.capacidad, mesa2.capacidad);
//        });
//        JOptionPane.showMessageDialog(null, "Mesas ordenadas por capacidad.");
//    }
//
//}
