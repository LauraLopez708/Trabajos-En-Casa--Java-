//package app;
//
//import javax.swing.JOptionPane;
//
//class club {
//
//    String nombre;
//    int edad;
//    String deporte;
//    double cuotaMensual;
//
//    public club(String nombre, int edad, String deporte, double cuotaMensual) {
//        this.nombre = nombre;
//        this.edad = edad;
//        this.deporte = deporte;
//        this.cuotaMensual = cuotaMensual;
//    }
//}
//
//public class Club_Deportes {
//
//    public static void main(String[] args) {
//        club[] miembros = new club[10];
//
//        miembros[0] = new club("Juan", 25, "Fútbol", 50000.0);
//        miembros[1] = new club("María", 30, "Natación", 60000.0);
//        miembros[2] = new club("Carlos", 20, "Tenis", 55000.0);
//        miembros[3] = new club("Ana", 28, "Baloncesto", 50000.0);
//        miembros[4] = new club("Luis", 35, "Atletismo", 65000.0);
//
//        String seleccion;
//        do {
//            String[] opciones = {"Mostrar miembros", "Agregar Nuevos Miembros", "Actualizar Cuota Mensual", "Buscar Miembro", "Calcular promedio", "Salir"};
//            seleccion = (String) JOptionPane.showInputDialog(null, "Selecciones una opción", "Menú", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
//
//            if (seleccion != null) {
//                switch (seleccion) {
//                    case "Mostrar miembros" ->
//                        listarMiembros(miembros);
//                    case "Agregar Nuevos Miembros" ->
//                        agregarMiembros(miembros);
//                    case "Actualizar Cuota Mensual" ->
//                        actualizarCuotaMensual(miembros);
//                    case "Buscar Miembro" ->
//                        buscarMiembros(miembros);
//                    case "Calcular promedio" ->
//                        edadPromedio(miembros);
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
//    private static void listarMiembros(club[] miembros) {
//        StringBuilder listaMiembros = new StringBuilder("Lista de miembros:\n");
//        for (club miembro : miembros) {
//            if (miembro != null) {
//                listaMiembros.append("Nombre del miembro: ").append(miembro.nombre).append("\n")
//                        .append("Edad: ").append(miembro.edad).append("\n")
//                        .append("Deporte: ").append(miembro.deporte).append("\n")
//                        .append("Cuota Mensual: ").append(miembro.cuotaMensual).append("\n\n");
//            }
//        }
//        JOptionPane.showMessageDialog(null, listaMiembros.toString());
//    }
//
//    private static void agregarMiembros(club[] miembros) {
//        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del nuevo miembro:");
//        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del nuevo miembro:"));
//        String deporte = JOptionPane.showInputDialog("Ingrese el deporte del nuevo miembro:");
//        double cuotaMensual = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cuota mensual del nuevo miembro:"));
//
//        for (int i = 0; i < miembros.length; i++) {
//            if (miembros[i] == null) {
//                miembros[i] = new club(nombre, edad, deporte, cuotaMensual);
//                JOptionPane.showMessageDialog(null, "Miembro agregado con éxito.");
//                return;
//            }
//        }
//        JOptionPane.showMessageDialog(null, "No se pudo agregar el miembro. Array lleno.");
//    }
//
//    private static void actualizarCuotaMensual(club[] miembros) {
//        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del miembro cuya cuota desea actualizar:");
//        double nuevaCuota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nueva cuota mensual:"));
//
//        for (club miembro : miembros) {
//            if (miembro != null && miembro.nombre.equalsIgnoreCase(nombre)) {
//                miembro.cuotaMensual = nuevaCuota;
//                JOptionPane.showMessageDialog(null, "Cuota mensual actualizada con éxito.");
//                return;
//            }
//        }
//        JOptionPane.showMessageDialog(null, "Miembro no encontrado.");
//    }
//
//    private static void buscarMiembros(club[] miembros) {
//        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del miembro a buscar:");
//        StringBuilder resultado = new StringBuilder("Resultados de la búsqueda:\n");
//        for (club miembro : miembros) {
//            if (miembro != null && miembro.nombre.equalsIgnoreCase(nombre)) {
//                resultado.append(miembro).append("\n");
//            }
//        }
//        JOptionPane.showMessageDialog(null, resultado.length() > 0 ? resultado.toString() : "Miembro no encontrado.");
//    }
//
//    private static void edadPromedio(club[] miembros) {
//        int sumaEdades = 0;
//        int contador = 0;
//
//        for (club miembro : miembros) {
//            if (miembro != null) {
//                sumaEdades += miembro.edad;
//                contador++;
//            }
//        }
//
//        if (contador > 0) {
//            double promedioEdad = (double) sumaEdades / contador;
//            JOptionPane.showMessageDialog(null, "El promedio de edad de los miembros es: " + promedioEdad);
//        } else {
//            JOptionPane.showMessageDialog(null, "No hay miembros en el club.");
//        }
//    }
//
//}
