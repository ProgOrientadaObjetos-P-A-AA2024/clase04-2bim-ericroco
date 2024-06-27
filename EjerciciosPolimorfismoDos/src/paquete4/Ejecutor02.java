package paquete4;

import java.util.*;
import paquete2.Arriendo;
import paquete3.ArriendoLocalComercial;
import paquete3.ArriendoLocalComida;
import paquete3.ArriendoLocalSesiones;

public class Ejecutor02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Arriendo> arriendos = new ArrayList<>();
        String nombre;
        double cuotaB;
        double valorAdicionalFijo;
        double valorLuz;
        double valorAgua;
        double iva;
        double valorSillas;
        double valorAmplificacion;
        int contador = 0;
        int instancias;
        int opc;

        System.out.println("Ingrese el número de locales que va a ingresar:");
        instancias = entrada.nextInt();

        while (contador < instancias) {
            System.out.printf("[1] Arriendo Local Comercial\n[2] Arriendo Local Comida\n[3] Arriendo Local Sesiones\n");
            opc = entrada.nextInt();
            entrada.nextLine();

            switch (opc) {
                case 1:
                    System.out.println("Ingrese el nombre del arrendatario:");
                    nombre = entrada.nextLine();
                    System.out.println("Ingrese la cuota base:");
                    cuotaB = entrada.nextDouble();
                    System.out.println("Ingrese el valor adicional fijo:");
                    valorAdicionalFijo = entrada.nextDouble();

                    ArriendoLocalComercial localComercial = new ArriendoLocalComercial(nombre, cuotaB);
                    localComercial.establecerValorAdicionalFijo(valorAdicionalFijo);
                    localComercial.establecerArriendoMensual();
                    arriendos.add(localComercial);

                    contador++;
                    break;

                case 2:
                    System.out.println("Ingrese el nombre del arrendatario:");
                    nombre = entrada.nextLine();
                    System.out.println("Ingrese la cuota base:");
                    cuotaB = entrada.nextDouble();
                    System.out.println("Ingrese el valor de la luz:");
                    valorLuz = entrada.nextDouble();
                    System.out.println("Ingrese el valor del agua:");
                    valorAgua = entrada.nextDouble();
                    System.out.println("Ingrese el IVA:");
                    iva = entrada.nextDouble();

                    ArriendoLocalComida localComida = new ArriendoLocalComida(nombre, cuotaB, valorLuz, valorAgua, iva);
                    localComida.establecerArriendoMensual();
                    arriendos.add(localComida);

                    contador++;
                    break;

                case 3:
                    System.out.println("Ingrese el nombre del arrendatario:");
                    nombre = entrada.nextLine();
                    System.out.println("Ingrese la cuota base:");
                    cuotaB = entrada.nextDouble();
                    System.out.println("Ingrese el valor de las sillas:");
                    valorSillas = entrada.nextDouble();
                    System.out.println("Ingrese el valor de la amplificación:");
                    valorAmplificacion = entrada.nextDouble();

                    ArriendoLocalSesiones localSesiones = new ArriendoLocalSesiones(nombre, cuotaB);
                    localSesiones.establecerValorSillas(valorSillas);
                    localSesiones.establecerValorAmplificacion(valorAmplificacion);
                    localSesiones.establecerArriendoMensual();
                    arriendos.add(localSesiones);

                    contador++;
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }

        entrada.close();

        System.out.println("\nInformación de todos los locales:");
        for (Arriendo arriendo : arriendos) {
            System.out.println(arriendo);
        }
    }
}
