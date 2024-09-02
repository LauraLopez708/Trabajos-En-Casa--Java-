//package app;
//
//import javax.swing.JOptionPane;
//
//class ClasificacionJugadores {
//
//    String jugadoresQueClasifican;
//    String jugadoresQueNoClasifican;
//    String jugadorMenorPeso;
//    String jugadorMayorPeso;
//
//    public ClasificacionJugadores(String jugadoresQueClasifican, String jugadoresQueNoClasifican, String jugadorMenorPeso, String jugadorMayorPeso) {
//        this.jugadoresQueClasifican = jugadoresQueClasifican;
//        this.jugadoresQueNoClasifican = jugadoresQueNoClasifican;
//        this.jugadorMenorPeso = jugadorMenorPeso;
//        this.jugadorMayorPeso = jugadorMayorPeso;
//    }
//}
//
//public class Liga_Futbol {
//
//    public static void main(String[] args) {
//        String[] nombres = {"Juan", "Pedro", "Carlos", "Luis", "Miguel"};
//        double[] pesos = {70, 80, 75, 85, 65};
//        int[] edades = {25, 22, 28, 30, 18};
//
//        double promedioPeso = calcularPromedioPeso(pesos);
//
//        ClasificacionJugadores clasificacion = clasificarJugadores(nombres, pesos, edades, promedioPeso);
//
//        JOptionPane.showMessageDialog(null, "Jugadores que clasifican:\n" + clasificacion.jugadoresQueClasifican);
//        JOptionPane.showMessageDialog(null, "Jugadores que no clasifican:\n" + clasificacion.jugadoresQueNoClasifican);
//        JOptionPane.showMessageDialog(null, "Jugador que clasificó con el menor peso:\n" + clasificacion.jugadorMenorPeso);
//        JOptionPane.showMessageDialog(null, "Jugador que clasificó con el mayor peso:\n" + clasificacion.jugadorMayorPeso);
//    }
//
//    private static double calcularPromedioPeso(double[] pesos) {
//        double suma = 0;
//        for (double peso : pesos) {
//            suma += peso;
//        }
//        return suma / pesos.length;
//    }
//
//    private static ClasificacionJugadores clasificarJugadores(String[] nombres, double[] pesos, int[] edades, double promedioPeso) {
//        StringBuilder jugadoresQueClasifican = new StringBuilder();
//        StringBuilder jugadoresQueNoClasifican = new StringBuilder();
//        String jugadorMenorPeso = "";
//        String jugadorMayorPeso = "";
//        double menorPeso = Double.MAX_VALUE;
//        double mayorPeso = Double.MIN_VALUE;
//
//        for (int i = 0; i < nombres.length; i++) {
//            boolean clasifica = (pesos[i] < promedioPeso && edades[i] <= 30)
//                    || (pesos[i] == promedioPeso && edades[i] > 18);
//
//            if (clasifica) {
//                jugadoresQueClasifican.append(nombres[i]).append("\n");
//                if (pesos[i] < menorPeso) {
//                    menorPeso = pesos[i];
//                    jugadorMenorPeso = nombres[i];
//                }
//                if (pesos[i] > mayorPeso) {
//                    mayorPeso = pesos[i];
//                    jugadorMayorPeso = nombres[i];
//                }
//            } else {
//                jugadoresQueNoClasifican.append(nombres[i]).append("\n");
//            }
//        }
//
//        return new ClasificacionJugadores(jugadoresQueClasifican.toString(), jugadoresQueNoClasifican.toString(), jugadorMenorPeso, jugadorMayorPeso);
//    }
//}
