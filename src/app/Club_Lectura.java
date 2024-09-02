//package app;
//
//import javax.swing.JOptionPane;
//
//class Socio {
//
//    public String nombre;
//    public int edad;
//    public String libroFavorito;
//
//    public Socio(String nombre, int edad, String libroFavorito) {
//        this.nombre = nombre;
//        this.edad = edad;
//        this.libroFavorito = libroFavorito;
//    }
//}
//
//public class Club_Lectura {
//
//    public static void main(String[] args) {
//        Socio[] socios = new Socio[20];
//
//        socios[0] = new Socio("Juan Perez", 25, "Cien años de soledad");
//        socios[1] = new Socio("Ana Gomez", 30, "El amor en los tiempos del cólera");
//        socios[2] = new Socio("Carlos Ruiz", 28, "Crónica de una muerte anunciada");
//
//        String seleccion;
//
//        do {
//            String[] opciones = {"Mostrar Socios", "Agregar Socio", "Actualizar Libro Favorito", "Buscar Socio", "Calcular Promedio de Edad", "Salir"};
//            seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Funciones", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
//
//            if (seleccion != null) {
//                switch (seleccion) {
//                    case "Mostrar Socios" ->
//                        mostrarSocios(socios);
//                    case "Agregar Socio" ->
//                        agregarSocio(socios);
//                    case "Actualizar Libro Favorito" ->
//                        actualizarLibroFavorito(socios);
//                    case "Buscar Socio" ->
//                        buscarSocios(socios);
//                    case "Calcular Promedio de Edad" ->
//                        calcularPromedioEdad(socios);
//                    case "Salir" ->
//                        JOptionPane.showConfirmDialog(null, "Salir del programa?");
//                    default ->
//                        JOptionPane.showMessageDialog(null, "Seleccione una opción correcta");
//                }
//            } else {
//                JOptionPane.showMessageDialog(null, "Elija una opción");
//            }
//        } while (!"Salir".equals(seleccion));
//    }
//
//    private static void mostrarSocios(Socio[] socios) {
//        StringBuilder listaSocios = new StringBuilder("Lista de socios:\n");
//        for (Socio socio : socios) {
//            if (socio != null) {
//                listaSocios.append("Nombre: ").append(socio.nombre).append("\n")
//                        .append("Edad: ").append(socio.edad).append("\n")
//                        .append("Libro Favorito: ").append(socio.libroFavorito).append("\n\n");
//            }
//        }
//        JOptionPane.showMessageDialog(null, listaSocios.toString());
//    }
//
//    private static void agregarSocio(Socio[] socios) {
//        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del socio:");
//        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del socio:"));
//        String libroFavorito = JOptionPane.showInputDialog("Ingrese el libro favorito del socio:");
//
//        for (int i = 0; i < socios.length; i++) {
//            if (socios[i] == null) {
//                socios[i] = new Socio(nombre, edad, libroFavorito);
//                JOptionPane.showMessageDialog(null, "Socio agregado con éxito.");
//                return;
//            }
//        }
//        JOptionPane.showMessageDialog(null, "No se pudo agregar el socio. Array lleno.");
//    }
//
//    private static void actualizarLibroFavorito(Socio[] socios) {
//        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del socio a actualizar:");
//        String nuevoLibroFavorito = JOptionPane.showInputDialog("Ingrese el nuevo libro favorito del socio:");
//
//        for (Socio socio : socios) {
//            if (socio != null && socio.nombre.equalsIgnoreCase(nombre)) {
//                socio.libroFavorito = nuevoLibroFavorito;
//                JOptionPane.showMessageDialog(null, "Libro favorito actualizado con éxito.");
//                return;
//            }
//        }
//        JOptionPane.showMessageDialog(null, "Socio no encontrado.");
//    }
//
//    private static void buscarSocios(Socio[] socios) {
//        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del socio a buscar:");
//        StringBuilder resultado = new StringBuilder("Resultados de la búsqueda:\n");
//        for (Socio socio : socios) {
//            if (socio != null && socio.nombre.equalsIgnoreCase(nombre)) {
//                resultado.append("Nombre: ").append(socio.nombre).append("\n")
//                        .append("Edad: ").append(socio.edad).append("\n")
//                        .append("Libro Favorito: ").append(socio.libroFavorito).append("\n\n");
//            }
//        }
//        JOptionPane.showMessageDialog(null, resultado.length() > 0 ? resultado.toString() : "Socio no encontrado.");
//    }
//
//    private static void calcularPromedioEdad(Socio[] socios) {
//        int totalEdad = 0;
//        int cantidadSocios = 0;
//        for (Socio socio : socios) {
//            if (socio != null) {
//                totalEdad += socio.edad;
//                cantidadSocios++;
//            }
//        }
//        double promedioEdad = (double) totalEdad / cantidadSocios;
//        JOptionPane.showMessageDialog(null, "El promedio de edad de los socios es: " + promedioEdad);
//    }
//}
