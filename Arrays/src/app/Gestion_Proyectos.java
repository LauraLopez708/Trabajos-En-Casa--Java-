//package app;
//
//import java.util.Arrays;
//import javax.swing.JOptionPane;
//
//class proyecto {
//
//    public String nombre;
//    public int duracion;
//    public String estado;
//
//    public proyecto(String nombre, int duracion, String estado) {
//        this.nombre = nombre;
//        this.duracion = duracion;
//        this.estado = estado;
//    }
//}
//
//public class Gestion_Proyectos {
//
//    public static void main(String[] args) {
//        proyecto[] gestion = new proyecto[20];
//
//        gestion[0] = new proyecto("Proyecto A", 30, "En progreso");
//        gestion[1] = new proyecto("Proyecto B", 45, "Completado");
//        gestion[2] = new proyecto("Proyecto C", 60, "En progreso");
//        gestion[3] = new proyecto("Proyecto D", 15, "Completado");
//        gestion[4] = new proyecto("Proyecto E", 90, "En progreso");
//        gestion[5] = new proyecto("Creación de un aplicativo educativo", 68, "En progreso");
//
//        String seleccion;
//
//        do {
//            String[] opciones = {"Mostrar Proyectos", "Agregar proyecto", "Actualizar estado", "Buscar proyecto", "Ordenar listado de proyectos", "Salir"};
//            seleccion = (String) JOptionPane.showInputDialog(null, "Selecciones una opción", "Funciones", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
//
//            if (seleccion != null) {
//                switch (seleccion) {
//                    case "Mostrar Proyectos" ->
//                        mostrarProyectos(gestion);
//                    case "Agregar proyecto" ->
//                        agregarProyecto(gestion);
//                    case "Actualizar estado" ->
//                        actualizarEstado(gestion);
//                    case "Buscar proyecto" ->
//                        buscarProyectos(gestion);
//                    case "Ordenar listado de proyectos" ->
//                        ordenarPorDuracion(gestion);
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
//private static void mostrarProyectos(proyecto[] gestion) {
//        StringBuilder listaProyectos = new StringBuilder("Lista de proyectos:\n");
//        for (proyecto proyecto : gestion) {
//            if (proyecto != null) {
//                listaProyectos.append("Nombre del proyecto: ").append(proyecto.nombre).append("\n")
//                .append("Duracion del proyecto: ").append(proyecto.duracion).append(" días\n")
//                .append("Estado: ").append(proyecto.estado).append(" \n\n");
//                        
//            }
//        }
//        JOptionPane.showMessageDialog(null, listaProyectos.toString());
//    }
//
//    private static void agregarProyecto(proyecto[] gestion) {
//        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del proyecto:");
//        int duracion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la duración del proyecto en días:"));
//        String estado = JOptionPane.showInputDialog("Ingrese el estado del proyecto (En progreso / Completado):");
//
//        for (int i = 0; i < gestion.length; i++) {
//            if (gestion[i] == null) {
//                gestion[i] = new proyecto(nombre, duracion, estado);
//                JOptionPane.showMessageDialog(null, "Proyecto agregado con éxito.");
//                return;
//            }
//        }
//        JOptionPane.showMessageDialog(null, "No se pudo agregar el proyecto. Array lleno.");
//    }
//
//    private static void actualizarEstado(proyecto[] gestion) {
//        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del proyecto a actualizar:");
//        String nuevoEstado = JOptionPane.showInputDialog("Ingrese el nuevo estado del proyecto (En progreso / Completado):");
//
//        for (proyecto proyecto : gestion) {
//            if (proyecto != null && proyecto.nombre.equalsIgnoreCase(nombre)) {
//                proyecto.estado = nuevoEstado;
//                JOptionPane.showMessageDialog(null, "Estado del proyecto actualizado con éxito.");
//                return;
//            }
//        }
//        JOptionPane.showMessageDialog(null, "Proyecto no encontrado.");
//    }
//
//    private static void buscarProyectos(proyecto[] gestion) {
//        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del proyecto a buscar:");
//        StringBuilder resultado = new StringBuilder("Resultados de la búsqueda:\n");
//        for (proyecto proyecto : gestion) {
//            if (proyecto != null && proyecto.nombre.equalsIgnoreCase(nombre)) {
//                resultado.append("Nombre del proyecto: ").append(proyecto.nombre).append("\n")
//                .append("Duracion del proyecto: ").append(proyecto.duracion).append(" días\n")
//                .append("Estado: ").append(proyecto.estado).append(" \n\n");
//            }
//        }
//        JOptionPane.showMessageDialog(null, resultado.length() > 0 ? resultado.toString() : "Proyecto no encontrado.");
//    }
//
//    private static void ordenarPorDuracion(proyecto[] gestion) {
//        Arrays.sort(gestion, (proyecto proyecto1, proyecto proyecto2) -> {
//            if (proyecto1 == null) return 1;
//            if (proyecto2 == null) return -1;
//            return Integer.compare(proyecto1.duracion, proyecto2.duracion);
//        });
//        JOptionPane.showMessageDialog(null, "Proyectos ordenados por duración.");
//    }
//}
