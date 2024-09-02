//package app;
//
//import javax.swing.JOptionPane;
//
//class Miembro {
//
//    public String nombre;
//    public int edad;
//    public String nivelHabilidad;
//    public double cuotaMensual;
//
//    public Miembro(String nombre, int edad, String nivelHabilidad, double cuotaMensual) {
//        this.nombre = nombre;
//        this.edad = edad;
//        this.nivelHabilidad = nivelHabilidad;
//        this.cuotaMensual = cuotaMensual;
//    }
//}
//
//public class Ajedres {
//
//    public static void main(String[] args) {
//        Miembro[] miembros = new Miembro[20];
//
//        miembros[0] = new Miembro("Juan Perez", 30, "Avanzado", 50.0);
//        miembros[1] = new Miembro("Ana Gomez", 25, "Intermedio", 45.0);
//        miembros[2] = new Miembro("Carlos Ruiz", 20, "Principiante", 40.0);
//
//        String seleccion;
//
//        do {
//            String[] opciones = {"Mostrar Miembros", "Agregar Miembro", "Actualizar Nivel de Habilidad", "Buscar Miembro", "Calcular Promedio de Edad", "Salir"};
//            seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Funciones", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
//
//            if (seleccion != null) {
//                switch (seleccion) {
//                    case "Mostrar Miembros" ->
//                        mostrarMiembros(miembros);
//                    case "Agregar Miembro" ->
//                        agregarMiembro(miembros);
//                    case "Actualizar Nivel de Habilidad" ->
//                        actualizarNivelHabilidad(miembros);
//                    case "Buscar Miembro" ->
//                        buscarMiembro(miembros);
//                    case "Calcular Promedio de Edad" ->
//                        calcularPromedioEdad(miembros);
//                    case "Salir" ->
//                        JOptionPane.showConfirmDialog(null, "¿Salir del programa?");
//                    default ->
//                        JOptionPane.showMessageDialog(null, "Seleccione una opción correcta");
//                }
//            } else {
//                JOptionPane.showMessageDialog(null, "Elija una opción");
//            }
//        } while (!"Salir".equals(seleccion));
//    }
//
//    private static void mostrarMiembros(Miembro[] miembros) {
//        StringBuilder listaMiembros = new StringBuilder("Lista de miembros:\n");
//        for (Miembro miembro : miembros) {
//            if (miembro != null) {
//                listaMiembros.append("Nombre del miembro: ").append(miembro.nombre).append("\n")
//                        .append("Edad: ").append(miembro.edad).append("\n")
//                        .append("Nivel de habilidad: ").append(miembro.nivelHabilidad).append("\n")
//                        .append("Cuota mensual: ").append(miembro.cuotaMensual).append("\n\n");
//            }
//        }
//        JOptionPane.showMessageDialog(null, listaMiembros.toString());
//    }
//
//    private static void agregarMiembro(Miembro[] miembros) {
//        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del miembro:");
//        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del miembro:"));
//        String nivelHabilidad = JOptionPane.showInputDialog("Ingrese el nivel de habilidad (Principiante, Intermedio, Avanzado):");
//        double cuotaMensual = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cuota mensual:"));
//
//        for (int i = 0; i < miembros.length; i++) {
//            if (miembros[i] == null) {
//                miembros[i] = new Miembro(nombre, edad, nivelHabilidad, cuotaMensual);
//                JOptionPane.showMessageDialog(null, "Miembro agregado con éxito.");
//                return;
//            }
//        }
//        JOptionPane.showMessageDialog(null, "No se pudo agregar el miembro. Array lleno.");
//    }
//
//    private static void actualizarNivelHabilidad(Miembro[] miembros) {
//        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del miembro a actualizar:");
//        String nuevoNivelHabilidad = JOptionPane.showInputDialog("Ingrese el nuevo nivel de habilidad (Principiante, Intermedio, Avanzado):");
//
//        for (Miembro miembro : miembros) {
//            if (miembro != null && miembro.nombre.equalsIgnoreCase(nombre)) {
//                miembro.nivelHabilidad = nuevoNivelHabilidad;
//                JOptionPane.showMessageDialog(null, "Nivel de habilidad actualizado con éxito.");
//                return;
//            }
//        }
//        JOptionPane.showMessageDialog(null, "Miembro no encontrado.");
//    }
//
//    private static void buscarMiembro(Miembro[] miembros) {
//        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del miembro a buscar:");
//        StringBuilder resultado = new StringBuilder("Resultados de la búsqueda:\n");
//        for (Miembro miembro : miembros) {
//            if (miembro != null && miembro.nombre.equalsIgnoreCase(nombre)) {
//                resultado.append("Nombre del miembro: ").append(miembro.nombre).append("\n")
//                        .append("Edad: ").append(miembro.edad).append("\n")
//                        .append("Nivel de habilidad: ").append(miembro.nivelHabilidad).append("\n")
//                        .append("Cuota mensual: ").append(miembro.cuotaMensual).append("\n\n");
//            }
//        }
//        JOptionPane.showMessageDialog(null, resultado.length() > 0 ? resultado.toString() : "Miembro no encontrado.");
//    }
//
//    private static void calcularPromedioEdad(Miembro[] miembros) {
//        int totalEdad = 0;
//        int contador = 0;
//        for (Miembro miembro : miembros) {
//            if (miembro != null) {
//                totalEdad += miembro.edad;
//                contador++;
//            }
//        }
//        double promedioEdad = contador > 0 ? (double) totalEdad / contador : 0;
//        JOptionPane.showMessageDialog(null, "El promedio de edad de los miembros es: " + promedioEdad);
//    }
//}
