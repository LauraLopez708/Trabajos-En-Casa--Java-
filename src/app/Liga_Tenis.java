//package app;
//
//import javax.swing.JOptionPane;
//
//class ClasificacionTenistas {
//
//    String tenistasQueClasifican;
//    String tenistasQueNoClasifican;
//    String tenistaMejorRanking;
//    String tenistaPeorRanking;
//
//    public ClasificacionTenistas(String tenistasQueClasifican, String tenistasQueNoClasifican, String tenistaMejorRanking, String tenistaPeorRanking) {
//        this.tenistasQueClasifican = tenistasQueClasifican;
//        this.tenistasQueNoClasifican = tenistasQueNoClasifican;
//        this.tenistaMejorRanking = tenistaMejorRanking;
//        this.tenistaPeorRanking = tenistaPeorRanking;
//    }
//}
//
//public class Liga_Tenis {
//
//    public static void main(String[] args) {
//        String[] nombres = {"Juan", "Carlos", "Ana", "Beatriz", "Elena"};
//        int[] rankings = {5, 10, 15, 20, 25};
//        int[] edades = {22, 28, 30, 18, 26};
//
//        double promedioRanking = calcularPromedioRanking(rankings);
//
//        ClasificacionTenistas clasificacion = clasificarTenistas(nombres, rankings, edades, promedioRanking);
//
//        JOptionPane.showMessageDialog(null, "Tenistas que clasifican:\n" + clasificacion.tenistasQueClasifican);
//        JOptionPane.showMessageDialog(null, "Tenistas que no clasifican:\n" + clasificacion.tenistasQueNoClasifican);
//        JOptionPane.showMessageDialog(null, "Tenista que clasificó con el mejor ranking:\n" + clasificacion.tenistaMejorRanking);
//        JOptionPane.showMessageDialog(null, "Tenista que clasificó con el peor ranking:\n" + clasificacion.tenistaPeorRanking);
//    }
//
//    private static double calcularPromedioRanking(int[] rankings) {
//        int suma = 0;
//        for (int ranking : rankings) {
//            suma += ranking;
//        }
//        return (double) suma / rankings.length;
//    }
//
//    private static ClasificacionTenistas clasificarTenistas(String[] nombres, int[] rankings, int[] edades, double promedioRanking) {
//        StringBuilder tenistasQueClasifican = new StringBuilder();
//        StringBuilder tenistasQueNoClasifican = new StringBuilder();
//        String tenistaMejorRanking = "";
//        String tenistaPeorRanking = "";
//        int mejorRanking = Integer.MAX_VALUE;
//        int peorRanking = Integer.MIN_VALUE;
//
//        for (int i = 0; i < nombres.length; i++) {
//            boolean clasifica = (rankings[i] < promedioRanking && edades[i] <= 30)
//                    || (rankings[i] == promedioRanking && edades[i] >= 20);
//
//            if (clasifica) {
//                tenistasQueClasifican.append(nombres[i]).append("\n");
//                if (rankings[i] < mejorRanking) {
//                    mejorRanking = rankings[i];
//                    tenistaMejorRanking = nombres[i];
//                }
//                if (rankings[i] > peorRanking) {
//                    peorRanking = rankings[i];
//                    tenistaPeorRanking = nombres[i];
//                }
//            } else {
//                tenistasQueNoClasifican.append(nombres[i]).append("\n");
//            }
//        }
//
//        return new ClasificacionTenistas(tenistasQueClasifican.toString(), tenistasQueNoClasifican.toString(), tenistaMejorRanking, tenistaPeorRanking);
//    }
//}
