//Programa que calcula el promedio de un alumno
public class promedio
{
    public static void main(String args[])
    {
        double  parcial1 = 6.7;
        double parcial2 = 7;
        double parcial3 = 8;
        double promedio = (parcial1 + parcial2 + parcial3) / 3;
        System.out.println("La calificacion final es: " + promedio);
        if(promedio >= 6)
        {
            System.out.println("Aprodabo");
        } else 
            {
            System.out.println("Reprobado");
            }
    }
}
