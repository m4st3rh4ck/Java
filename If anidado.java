import java.util.Scanner; //Libreria para poder meter datos desde el teclado
public class edad
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in); //Metodo Scanner / nombre del metodo scanner / Instanciar el objeto = new Scanner(System.in)
        System.out.println("Ingresa tu edad: ");
        int edad = scanner.nextInt(); 
        
        if(edad < 18)
        {
            System.out.println("\nEres menor de edad");
        } else if(edad >= 18 && edad <= 60){
            System.out.println("\nEres mayor de edad");
        } else if(edad > 60){
            System.out.println("\nEres adulto de la tercera edad");
        }
    }
}

