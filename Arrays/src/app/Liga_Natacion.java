//package app;
//
//import javax.swing.JOptionPane;
//
//class ClasificacionNadadores {
//
//    String nadadoresQueClasifican;
//    String nadadoresQueNoClasifican;
//    String nadadorMenorTiempo;
//    String nadadorMayorTiempo;
//
//    public ClasificacionNadadores(String nadadoresQueClasifican, String nadadoresQueNoClasifican, String nadadorMenorTiempo, String nadadorMayorTiempo) {
//        this.nadadoresQueClasifican = nadadoresQueClasifican;
//        this.nadadoresQueNoClasifican = nadadoresQueNoClasifican;
//        this.nadadorMenorTiempo = nadadorMenorTiempo;
//        this.nadadorMayorTiempo = nadadorMayorTiempo;
//    }
//}
//
//public class Liga_Natacion {
//
//    public static void main(String[] args) {
//        String[] nombres = {"Ana", "Beatriz", "Carlos", "David", "Elena"};
//        double[] tiempos = {58.5, 62.3, 57.0, 61.5, 59.8};
//        int[] edades = {20, 22, 26, 18, 24};
//
//        double promedioTiempo = calcularPromedioTiempo(tiempos);
//
//        ClasificacionNadadores clasificacion = clasificarNadadores(nombres, tiempos, edades, promedioTiempo);
//
//        JOptionPane.showMessageDialog(null, "Nadadores que clasifican:\n" + clasificacion.nadadoresQueClasifican);
//        JOptionPane.showMessageDialog(null, "Nadadores que no clasifican:\n" + clasificacion.nadadoresQueNoClasifican);
//        JOptionPane.showMessageDialog(null, "Nadador que clasificó con el menor tiempo:\n" + clasificacion.nadadorMenorTiempo);
//        JOptionPane.showMessageDialog(null, "Nadador que clasificó con el mayor tiempo:\n" + clasificacion.nadadorMayorTiempo);
//    }
//
//    private static double calcularPromedioTiempo(double[] tiempos) {
//        double suma = 0;
//        for (double tiempo : tiempos) {
//            suma += tiempo;
//        }
//        return suma / tiempos.length;
//    }
//
//    private static ClasificacionNadadores clasificarNadadores(String[] nombres, double[] tiempos, int[] edades, double promedioTiempo) {
//        StringBuilder nadadoresQueClasifican = new StringBuilder();
//        StringBuilder nadadoresQueNoClasifican = new StringBuilder();
//        String nadadorMenorTiempo = "";
//        String nadadorMayorTiempo = "";
//        double menorTiempo = Double.MAX_VALUE;
//        double mayorTiempo = Double.MIN_VALUE;
//
//        for (int i = 0; i < nombres.length; i++) {
//            boolean clasifica = (tiempos[i] < promedioTiempo && edades[i] <= 25)
//                    || (tiempos[i] == promedioTiempo && edades[i] >= 18);
//
//            if (clasifica) {
//                nadadoresQueClasifican.append(nombres[i]).append("\n");
//                if (tiempos[i] < menorTiempo) {
//                    menorTiempo = tiempos[i];
//                    nadadorMenorTiempo = nombres[i];
//                }
//                if (tiempos[i] > mayorTiempo) {
//                    mayorTiempo = tiempos[i];
//                    nadadorMayorTiempo = nombres[i];
//                }
//            } else {
//                nadadoresQueNoClasifican.append(nombres[i]).append("\n");
//            }
//        }
//
//        return new ClasificacionNadadores(nadadoresQueClasifican.toString(), nadadoresQueNoClasifican.toString(), nadadorMenorTiempo, nadadorMayorTiempo);
//    }
//}
