
import javax.swing.JOptionPane;

public class VectorPregunta2 {

    public static void main(String[] args) {
        //declaracion y ingreso de informacion
        int opc; // variable de tipo entero para la opcion del menu
        int num; // tamaño de los vectores paralelos
        num = LE.leerInt("Ingresa el numero de estudiantes "); // Ingresando el tamaño del vector
        // creando los vectores paralelos
        int[] codigos = new int[num];
        String[] nombres = new String[num];
        double[] promedio = new double[num];
        double[][] notas = new double[num][3];// 3 por las 3 notas

        do { // creando el menu
            opc = LE.leerInt("\t..:MENÚ:.."
                    + "\n1. Ingreso datos"
                    + "\n2. Mostrar nombre y promedio de cada alumno"
                    + "\n3. Mostrar todos los datos (todas las notas)"
                    + "\n4. Finalizar"
                    + "\n\nDigite una opcion: ");
            switch (opc) {
                case 1: // Ingresando datos al arreglo paralelo codigo y nombres
                    for (int i = 0; i < num; i++) {
                        codigos[i] = LE.leerInt("Ingresa el codigo del alumno[" + (i + 1) + "]");
                        nombres[i] = LE.leerString("ingrese el nombre del alumno [" + (i + 1) + "]");

                    }
                    // llenando la matriz de notas 3 notas para cada estudiante
                    for (int i = 0; i < nombres.length; i++) {
                        double acumuladoNota = 0; // variable q suma las 3 notas de cada estudiante
                        for (int j = 0; j < 3; j++) {

                            notas[i][j] = LE.leerDouble("ingrese nota " + (j + 1) + "del alumno[" + (i + 1) + "]");
                            acumuladoNota = acumuladoNota + notas[i][j]; // sumando notas de un alumno ocn su nota anterior
                        }
                        promedio[i] = acumuladoNota / 3; // calculando el promedio de las 3 notas por estudiante
                    }

                    break;
                case 2: // mostrando proemdios por alumno
                    String cadena = ""; // variable q acumula palabras con espacios para mostrar la informacion

                    for (int i = 0; i < num; i++) {
                        cadena += codigos[i] + ". " + nombres[i] + ". " + promedio[i] + "\n";
                    }

                    LE.mostrarInformacion("\tNOTAS\n" + cadena);
                    break;

                case 3: // mostrando todos los datos
                    String cadena2 = "";   // variable q acumula palabras con espacios para mostrar la informacion

                    for (int i = 0; i < nombres.length; i++) {
                        cadena2 += codigos[i] + ". " + nombres[i] + "\n"; // muestra el cod y nombre del alumno
                        for (int j = 0; j < 3; j++) { // mostrando las 3 notas por cada estudiante
                            cadena2 += notas[i][j] + "\n"; // juntando las palabras en una cadena
                        }
                    }
                    LE.mostrarInformacion("\tNOTAS\n\n" + cadena2);

                    break;

                case 4:// saliendo del programa

                    LE.mostrarInformacion("\tGRACIAS POR USAR EL MENÚ");
                    break;

            }
        } while (opc != 4);

    }

}
