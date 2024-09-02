//package app;
//
//import javax.swing.JOptionPane;
//
//class Inscripcion {
//
//    public String nombreMiembro;
//    public String nivelNatacion;
//    public double cuotaMensual;
//
//    public Inscripcion(String nombreMiembro, String nivelNatacion, double cuotaMensual) {
//        this.nombreMiembro = nombreMiembro;
//        this.nivelNatacion = nivelNatacion;
//        this.cuotaMensual = cuotaMensual;
//    }
//}
//
//public class Club_Natacion {
//
//    public static void main(String[] args) {
//        Inscripcion[] inscripciones = new Inscripcion[20];
//
//        inscripciones[0] = new Inscripcion("Juan Perez", "Avanzado", 50.0);
//        inscripciones[1] = new Inscripcion("Ana Gomez", "Intermedio", 45.0);
//        inscripciones[2] = new Inscripcion("Carlos Ruiz", "Principiante", 40.0);
//
//        String seleccion;
//
//        do {
//            String[] opciones = {"Mostrar Inscripciones", "Agregar Inscripción", "Actualizar Nivel de Natación", "Buscar Inscripción", "Calcular Ingreso Total", "Salir"};
//            seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Funciones", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
//
//            if (seleccion != null) {
//                switch (seleccion) {
//                    case "Mostrar Inscripciones" ->
//                        mostrarInscripciones(inscripciones);
//                    case "Agregar Inscripción" ->
//                        agregarInscripcion(inscripciones);
//                    case "Actualizar Nivel de Natación" ->
//                        actualizarNivelNatacion(inscripciones);
//                    case "Buscar Inscripción" ->
//                        buscarInscripciones(inscripciones);
//                    case "Calcular Ingreso Total" ->
//                        calcularIngresoTotal(inscripciones);
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
//    private static void mostrarInscripciones(Inscripcion[] inscripciones) {
//        StringBuilder listaInscripciones = new StringBuilder("Lista de inscripciones:\n");
//        for (Inscripcion inscripcion : inscripciones) {
//            if (inscripcion != null) {
//                listaInscripciones.append("Nombre del miembro: ").append(inscripcion.nombreMiembro).append("\n")
//                        .append("Nivel de natacion: ").append(inscripcion.nivelNatacion).append("\n")
//                        .append("Cuota mensual: ").append(inscripcion.cuotaMensual).append("\n\n");
//            }
//        }
//        JOptionPane.showMessageDialog(null, listaInscripciones.toString());
//    }
//
//    private static void agregarInscripcion(Inscripcion[] inscripciones) {
//        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del miembro:");
//        String nivel = JOptionPane.showInputDialog("Ingrese el nivel de natación (Principiante, Intermedio, Avanzado):");
//        double cuota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cuota mensual:"));
//
//        for (int i = 0; i < inscripciones.length; i++) {
//            if (inscripciones[i] == null) {
//                inscripciones[i] = new Inscripcion(nombre, nivel, cuota);
//                JOptionPane.showMessageDialog(null, "Inscripción agregada con éxito.");
//                return;
//            }
//        }
//        JOptionPane.showMessageDialog(null, "No se pudo agregar la inscripción. Array lleno.");
//    }
//
//    private static void actualizarNivelNatacion(Inscripcion[] inscripciones) {
//        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del miembro a actualizar:");
//        String nuevoNivel = JOptionPane.showInputDialog("Ingrese el nuevo nivel de natación (Principiante, Intermedio, Avanzado):");
//
//        for (Inscripcion inscripcion : inscripciones) {
//            if (inscripcion != null && inscripcion.nombreMiembro.equalsIgnoreCase(nombre)) {
//                inscripcion.nivelNatacion = nuevoNivel;
//                JOptionPane.showMessageDialog(null, "Nivel de natación actualizado con éxito.");
//                return;
//            }
//        }
//        JOptionPane.showMessageDialog(null, "Miembro no encontrado.");
//    }
//
//    private static void buscarInscripciones(Inscripcion[] inscripciones) {
//        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del miembro a buscar:");
//        StringBuilder resultado = new StringBuilder("Resultados de la búsqueda:\n");
//        for (Inscripcion inscripcion : inscripciones) {
//            if (inscripcion != null && inscripcion.nombreMiembro.equalsIgnoreCase(nombre)) {
//                resultado.append("Nombre del miembro: ").append(inscripcion.nombreMiembro).append("\n")
//                        .append("Nivel de natacion: ").append(inscripcion.nivelNatacion).append("\n")
//                        .append("Cuota mensual: ").append(inscripcion.cuotaMensual).append("\n\n");
//            }
//        }
//        JOptionPane.showMessageDialog(null, resultado.length() > 0 ? resultado.toString() : "Miembro no encontrado.");
//    }
//
//    private static void calcularIngresoTotal(Inscripcion[] inscripciones) {
//        double ingresoTotal = 0.0;
//        for (Inscripcion inscripcion : inscripciones) {
//            if (inscripcion != null) {
//                ingresoTotal += inscripcion.cuotaMensual;
//            }
//        }
//        JOptionPane.showMessageDialog(null, "El ingreso total generado por las inscripciones mensuales es: $" + ingresoTotal);
//    }
//}
