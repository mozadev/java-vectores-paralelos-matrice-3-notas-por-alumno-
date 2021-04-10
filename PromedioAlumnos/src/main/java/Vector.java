
import javax.swing.JOptionPane;
import javax.xml.validation.SchemaFactoryLoader;

public class Vector {

    public static void main(String[] args) {
        //declaracion y ingreso de informacion
        int opc; // variable de tipo entero para la opcion del menu
        int num; // tamaño del vector
        num = LE.leerInt("Ingresa el numero de estudiantes"); // ingreso numero estudiantes
        int[] codigos = new int[num]; // creando el vector codigos
        String[] nombres = new String[num]; // creando el vector nombres
        double[] promedio = new double[num]; // creando el vector promedio

        do {// creando el menu
            opc = Integer.parseInt(JOptionPane.showInputDialog("\t..:MENÚ:.."
                    + "\n1. Ingreso datos"
                    + "\n2. Mostrar alumno con promedio mas alto"
                    + "\n3. Mostrar todos los datos"
                    + "\n4. Finalizar"
                    + "\n\nDigite una opcion: "));
            switch (opc) {
                case 1:
                    for (int i = 0; i < num; i++) {
                        codigos[i] = LE.leerInt("Ingresa el codigo del alumno[" + (i + 1) + "]");
                        nombres[i] = LE.leerString("ingrese el nombre del alumno [" + (i + 1) + "]");
                        promedio[i] = LE.leerDouble("ingrese el promedio del alumno[" + (i + 1) + "]");

                    }
                    break;
                case 2: // calculo del mayor promedio
                    double mayor = 0;
                    for (int i = 0; i < num; i++) {
                        if (mayor < promedio[i]) {
                            mayor = promedio[i];
                        }
                    }
                    JOptionPane.showMessageDialog(null, mayor);

                    break;

                case 3: // mostrando todos los datos
                    String cadena = "";

                    for (int i = 0; i < num; i++) {
                        cadena += codigos[i] + ". " + nombres[i] + ". " + promedio[i] + "\n";
                    }

                    LE.mostrarInformacion("\tNOTAS\n" + cadena);
                    break;

                case 4: // saliendo del programa

                    LE.mostrarInformacion("\tGRACIAS POR USAR EL MENÚ");
                    break;

            }
        } while (opc != 4);

    }

}
