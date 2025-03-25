/**Enunciado del Programa:

Crea un programa en Java que funcione como un "Conversor de Monedas". El programa debe permitir al usuario ingresar una cantidad en pesos mexicanos y seleccionar a qué moneda desea convertir el monto (por ejemplo, dólares, euros o yenes). Utiliza una estructura `switch` para realizar la conversión basada en la selección del usuario. Los datos deben ser introducidos por teclado.
Instrucciones:
1. Solicitar al usuario que introduzca un monto en pesos mexicanos.
2. Mostrar un menú con las opciones de monedas disponibles para la conversión:
   - 1: Dólares
   - 2: Euros
   - 3: Yenes
3. Utilizar un bloque `switch` para determinar la conversión correspondiente según la opción seleccionada por el usuario.
4. Mostrar el resultado de la conversión en pantalla.
5. Manejar casos en los que el usuario introduzca una opción no válida, mostrando un mensaje de error.

Fórmulas para la Conversión:
1. **De pesos mexicanos a dólares:** `monto_en_dólares = monto_en_pesos * 0.055`
2. **De pesos mexicanos a euros:** `monto_en_euros = monto_en_pesos * 0.051`
3. **De pesos mexicanos a yenes:** `monto_en_yenes = monto_en_pesos * 7.33` **/

import java.util.Scanner;
public class conversion
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
           int opcion = 0;
        do{
        System.out.println("Ingresa el monto a convertir (MXN): ");
        double pesos = scanner.nextDouble();
        System.out.println("\nSelecciona la conversion a aplicar: ");
        System.out.println("\n1.Dolares \n2.Euros \n3.Yenes \n4.Salir\n");
        opcion = scanner.nextInt();
        switch(opcion)
        {
        case 1:
            double monto_en_dolares = pesos * 0.050;
            System.out.println("\n" + pesos + " pesos, en dolares, son: " + monto_en_dolares);
        break;
        case 2:
            double monto_en_euros = pesos * 0.046;
            System.out.println("\n" + pesos + "pesos, en euros, son: " + monto_en_euros);
            break;
        case 3:
            double monto_en_yenes = pesos * 7.73;
            System.out.println("\n" + pesos + "pesos, en yenes, son: " + monto_en_yenes);
            break;
        case 4:
            System.out.println("\nPrograma Finalizado");
            break;
        default:
        System.out.println("Opcion no valida");
        break;
            }
        }while(opcion != 4);
    }
}
