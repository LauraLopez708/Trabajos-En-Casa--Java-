package com.mycompany.desarrollo_funciones;

import javax.swing.JOptionPane;

public class Desarrollo_Funciones {

    public static void main(String[] args) {
        //1. GlobalTech

        //        double salarioMes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario mensual del empleado"));
        //        double retencion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el porcentaje de retencion en la fuente"));
        //        double salarioAño = salarioMes * 12;
        //        double retencionF = salarioAño * (retencion / 100);
        //
        //        JOptionPane.showMessageDialog(null, "El salario anual es de: $" + salarioAño + " y el Monto de deduccion: $" + retencionF);
        //    
        //2. SuperMart
        //        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nivel de stock del producto"));
        //        int nivelMin = 10;
        //
        //        if (cantidad < nivelMin) {
        //            JOptionPane.showMessageDialog(null, "El producto necesita pedido");
        //        } else {
        //            JOptionPane.showMessageDialog(null, "El producto No necesita pedido");
        //        }
        //    
        //3. Fabrica
        //        double costos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo de los materiales"));
        //        double manoObra = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo de la mano de obra"));
        //        double gastosGenerales = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo de demás gastos generales"));
        //        
        //        double costoTotal = costos +  manoObra + gastosGenerales;
        //        
        //        JOptionPane.showMessageDialog(null, "El costo total de produccion es de: $" + costoTotal);
        //        
        //    
        //4. FinTech
        //        int departamentos = Integer.parseInt(JOptionPane.showInputDialog("Numero de Departamentos"));
        //
        //        int trimestres = Integer.parseInt(JOptionPane.showInputDialog("Numero de trimestres"));
        //
        //        double[][] gananciasTrimestrales = new double[departamentos][trimestres];
        //
        //        for (int i = 0; i < departamentos; i++) {
        //            for (int j = 0; j < trimestres; j++) {
        //                String mensaje = "Ingrese las ganancias del departamento " + (i + 1) + " para el trimestre " + (j + 1) + ":";
        //                String input = JOptionPane.showInputDialog(mensaje);
        //                gananciasTrimestrales[i][j] = Double.parseDouble(input);
        //            }
        //
        //        }
        //        int mejorDepartamento = -1;
        //        double maxGanancias = Double.NEGATIVE_INFINITY;
        //
        //        for (int i = 0; i < gananciasTrimestrales.length; i++) {
        //            double totalGanancias = 0;
        //            for (int j = 0; j < gananciasTrimestrales[i].length; j++) {
        //                totalGanancias += gananciasTrimestrales[i][j];
        //            }
        //            if (totalGanancias > maxGanancias) {
        //                maxGanancias = totalGanancias;
        //                mejorDepartamento = i;                
        //            }
        //            JOptionPane.showMessageDialog(null,"El departamento con el mejor rendimiento es el departamento " + (mejorDepartamento + 1));
        //        }
        //
        //    
        //5. Empresa de Tecnologia
        //        double valorInicial = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor inicial"));
        //        double valorResidual = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor residual"));
        //        int vidaUtil = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la vida util del activo en años"));
        //        
        //        double depreciacion = (valorInicial  - valorResidual) / vidaUtil;
        //        
        //        JOptionPane.showMessageDialog(null, "La depreciación anual es de: " + depreciacion);
        //6. Asesor Financiero
//        double capitalInicial = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del capital inicial"));
//        double tasaInteres = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la tasa de interes anual"));
//        int años = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de años"));
//        
//        double rentabilidad = capitalInicial * Math.pow(1 + tasaInteres, años);
//        
//        JOptionPane.showMessageDialog(null,"La rentabilidad de inversion es de: " + rentabilidad);    
//
        //7. WorkHours 
//        int numEmpleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de empleados"));
//        String[] nombresEmpleados = new String[numEmpleados];
//        double[] horasExtras = new double[numEmpleados];
//
//        for (int i = 0; i < numEmpleados; i++) {
//            nombresEmpleados[i] = JOptionPane.showInputDialog("Ingrese el nombre del empleado " + (i + 1) + ":");
//            horasExtras[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las horas extras trabajadas por " + nombresEmpleados[i] + ":"));
//        }
//        
//        //FUNCIÓN PARA CREAR INFORMES
//        StringBuilder informe = new StringBuilder();
//        informe.append("Informe de Horas Extras Trabajadas:\n");
//        
//        for (int i = 0; i < nombresEmpleados.length; i++) {
//            informe.append("Empleado: ").append(nombresEmpleados[i])
//                   .append(", Horas Extras: ").append(horasExtras[i]).append("\n");
//        }
//        
//        JOptionPane.showMessageDialog(null, informe.toString());
//
//8.Constructora
//        double costos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo de los materiales"));
//        double manoObra = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo de la mano de obra"));
//        double equipos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo de los equipos"));
//
//        double total = costos + manoObra + equipos;
//
//        JOptionPane.showMessageDialog(null, "El costo total del proyecto es: $" + total);
//
//
//9. Empresa de Manufactura
//        int horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de horas trabajadas al día"));
//        double salarioHora = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario por hora trabajada"));
//
//        double nominaTotal = (horasTrabajadas * salarioHora) * 7;
//          JOptionPane.showMessageDialog(null, "La nomina semanal es de: $" + nominaTotal);
//
//11. Empresa de transporte
//
//        int distancia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la distancia recorrida en Km"));
//        int combustible = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de combustible consumido"));
//        int consumoPromedio = distancia / combustible;
//        JOptionPane.showMessageDialog(null, "El promedio de consumo de combustible es de: " + consumoPromedio);
//
//12. Liga Deportiva
//        String input = JOptionPane.showInputDialog("Ingrese el número de equipos en la liga:");
//        int numEquipos = Integer.parseInt(input);
//
//        String[] nombresEquipos = new String[numEquipos];
//        int[] puntosEquipos = new int[numEquipos];
//        for (int i = 0; i < numEquipos; i++) {
//            nombresEquipos[i] = JOptionPane.showInputDialog("Ingrese el nombre del equipo " + (i + 1) + ":");
//            input = JOptionPane.showInputDialog("Ingrese los puntos del equipo " + nombresEquipos[i] + ":");
//            puntosEquipos[i] = Integer.parseInt(input);
//        }
//
//        int maxPuntos = puntosEquipos[0];
//        String equipoConMasPuntos = nombresEquipos[0];
//
//        for (int i = 1; i < puntosEquipos.length; i++) {
//            if (puntosEquipos[i] > maxPuntos) {
//                maxPuntos = puntosEquipos[i];
//                equipoConMasPuntos = nombresEquipos[i];
//            }
//        }
//        JOptionPane.showMessageDialog(null, "El equipo con más puntos es: " + equipoConMasPuntos);
//
//13. Universidad
//        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de notas"));
//        double suma = 0;
//        for (int i = 1; i <= n; i++) {
//            double promedio = suma / n;
//
//            JOptionPane.showMessageDialog(null, "El promedio de notas es: " + promedio);
//        }
//
//14. Tienda en Linea
//        int numProductos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de Productos"));
//        String[] nombresProductos = new String[numProductos];
//        double[][] calificacionesProductos = new double[numProductos][];
//        for (int i = 0; i < numProductos; i++) {
//            nombresProductos[i] = JOptionPane.showInputDialog("Ingrese el nombre del producto " + (i + 1) + ":");
//            int numCalificaciones = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de calificaciones para el producto " + nombresProductos[i] + ":"));
//            calificacionesProductos[i] = new double[numCalificaciones];
//            for (int j = 0; j < numCalificaciones; j++) {
//                calificacionesProductos[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación " + (j + 1) + " para el producto " + nombresProductos[i] + ":"));
//
//                String mejorProducto = nombresProductos[0];
//                double mejorPromedio = 0;
//
//                double suma = 0;
//                for (double calificacion : calificacionesProductos[0]) {
//                    suma += calificacion;
//                }
//                mejorPromedio = suma / calificacionesProductos[0].length;
//
//                for (int x = 1; x < numProductos; x++) {
//                    suma = 0;
//                    for (double calificacion : calificacionesProductos[x]) {
//                        suma += calificacion;
//                    }
//                    double promedioActual = suma / calificacionesProductos[x].length;
//                    if (promedioActual > mejorPromedio) {
//                        mejorPromedio = promedioActual;
//                        mejorProducto = nombresProductos[x];
//                    }
//                }
//
//                JOptionPane.showMessageDialog(null, "El producto con la mejor calificación promedio es: " + mejorProducto + " con un promedio de " + mejorPromedio);
//            }
//        }
//
//15. Fabricante electrodomesticos
//        double consumo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el consumo de energia"));
//        double rendimiento = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el rendimiento del electrodomestico"));
//        
//        double eficiencia = consumo/rendimiento;
//        JOptionPane.showMessageDialog(null, "El promedio de eficicnecia energetica es de: " + eficiencia);
//        
//16. Organización de eventos
//        double alquiler = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo de alquiler"));
//        double catering = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo del catering"));
//        double entretenimiento = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo por entretenimiento"));
//        double otros = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de otros gastos"));
//        
//        double total = alquiler + catering + entretenimiento + otros;
//        JOptionPane.showMessageDialog(null, "El costo total del evento es de: " + total);
// 
//17. Atención al cleinte
//        int numClientes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de clientes:"));
//        double[] puntuacionesSatisfaccion = new double[numClientes];
//
//        for (int i = 0; i < numClientes; i++) {
//            puntuacionesSatisfaccion[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la puntuación de satisfacción del cliente " + (i + 1) + ":"));
//        }
//        double suma = 0;
//        for (double puntuacion : puntuacionesSatisfaccion) {
//            suma += puntuacion;
//        }
//        double promedioSatisfaccion = suma / numClientes;
//        JOptionPane.showMessageDialog(null, "El promedio de satisfacción del cliente es: " + promedioSatisfaccion);
//
//18. Departamento de ventas
//        int metasCumplidas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de metas cumplidas "));
//        int metasEstablecidas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de metas Establecidas"));
//
//        double cumplimiento = ((double) metasCumplidas / metasEstablecidas) * 100;
//        JOptionPane.showMessageDialog(null, "El porcentaje de cumplimiento de metas es: " + cumplimiento + "%");
//
//19. Centro de distribucion
//        int capacidadAlmacen = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad total del almacen"));
//        int espaciOcupado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el espacio occupado en el almacen"));
//        int capacidadRestante = capacidadAlmacen -= espaciOcupado;
//        JOptionPane.showMessageDialog(null, "El espacio restante en el almacen es de: " + capacidadRestante);
//       
//20. Empresa de taxis
//        int distancia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la distancia recorrida"));
//        double tarifaTotal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la tarifa total"));
//        double costoKm = tarifaTotal/=distancia;
//          JOptionPane.showMessageDialog(null, "El costo por kilometro de viaje es de: $" + costoKm);
    }
}
