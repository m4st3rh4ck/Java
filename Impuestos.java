/*
Ejercicio: Sistema de cálculo de impuestos basado en ingresos**

Desarrolla un programa en Java que cumpla con las siguientes instrucciones:

1. Solicita al usuario que ingrese sus ingresos anuales usando el teclado.
2. Evalúa los ingresos y calcula los impuestos de acuerdo con estas reglas:
   - Si los ingresos son menores a 10,000 pesos: no se paga impuestos.
   - Si los ingresos están entre 10,000 y 50,000 pesos: se paga un impuesto del 10%.
   - Si los ingresos están entre 50,001 y 100,000 pesos: se paga un impuesto del 20%.
   - Si los ingresos son mayores a 100,000 pesos: se paga un impuesto del 30%.
3. Muestra el monto de impuestos a pagar (si aplica) en la consola.

El programa debe incluir:
- Uso de estructuras condicionales como `if` y `if` anidado.
- Operadores lógicos como `>`, `<`, `>=`, `<=`, `&&`.
- Operadores aritméticos como `*`, `/`.
*/
import java.util.Scanner;
public class sistema
{
 public static void main(String args[])
 {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Ingresa tus ingresos anuales: ");
     double ingresos = scanner.nextDouble();
     double impuesto = 0.0;
     if(ingresos <= 10000)
     {
         System.out.println("No se pagan impuestos");
     } else if(ingresos > 10000 && ingresos <= 50000)
     {
         impuesto = (ingresos * 10) / 100;
         System.out.println("El impuesto a pagar es de: " + impuesto);
     } else if(ingresos >= 50001 && ingresos <= 100000)
     {
         impuesto = (ingresos * 20) / 100;
         System.out.println("El impuesto a pagar es de: " + impuesto);
     } else if(ingresos > 100000)
     {
         impuesto = (ingresos * 30) / 100;
         System.out.println("El impuesto a pagar es de: " + impuesto);
     }
     
 }
}
