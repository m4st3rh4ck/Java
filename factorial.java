//Programa que calcula el factorial de un numero 
import java.util.Scanner;
public class factorial
{
public static void main(String args[])
  {
    Scanner scanner = new Scanner(System.in);
    long factorial = 1;
    System.out.println("Ingresa el numero a calcular el factorial: ");
    int numero = scanner.nextInt();
    
    if(numero == 0)
    {
        System.out.println("\nPor definicion del factorial, el factorial de 0, es 1");
    } else if(numero < 0)
    {
        System.out.println("\nLos factoriales de numeros negativos no existen");
    } else{
        
        for(int i = 1; i <= numero; i++)
        {
            factorial *= i; 
        }
        System.out.println("\nEl factorial de " + numero + " es " + factorial);
    }
  }    
}
