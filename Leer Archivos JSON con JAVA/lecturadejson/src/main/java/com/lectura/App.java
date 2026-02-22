package com.lectura;
//Permite interactuar con archivos del sistema (leer, escribir, mover)
import java.nio.file.Files;
//Para que java entienda o sepa la ruta donde guardare mi archivo JSON manipulado
import java.nio.file.Paths;
//Este se usa para datos que estan en []
import org.json.JSONArray;
//Este es para manejar los objetos que estan entre {}
import org.json.JSONObject;
import java.util.Iterator;

public class App 
{
    public static void main( String[] args )
    {
        //Usamos un try-catch por si hay algun error a la hora de leer el archivo JSON
        try {
            //Aqui leeremos el achivo
            //Paths.get() Localiza en donde esta guardado el archivo que estamos indicando
            //Files.readAllBytes(path) Convierte el archivo JSON a bytes para leer todo lo que hay escrito rapidisimo
            //new String() Esos bytes los transforma otra vez en texto para que nosotros lo podamos leer en ves de ver 0 y 1
            String contenido = new String(Files.readAllBytes(Paths.get("/home/gabriel/Documentos/lecturadejson/JSON/example_2 (1).json")));
            //con JSONObject(contenido) lee todo y lanzara un error JSONException y no hay separadores o un error de sintaxis
            JSONObject objetoRaiz = new JSONObject(contenido);
            //Con getJSONObject decimos que dentro de "quiz" = [] hay mas cosas"
            JSONObject quiz = objetoRaiz.getJSONObject("quiz");
            System.out.println("\n\n--- Contenido del Archivo JSON ---");

            //Iterar sobre las categorías (sport, maths, etc.)
            Iterator<String> categorias = quiz.keys();

            while (categorias.hasNext()) {
                String categoriaNombre = categorias.next();
                System.out.println("\nCategoría: " + categoriaNombre.toUpperCase());
                
                JSONObject preguntasCategoria = quiz.getJSONObject(categoriaNombre);
                Iterator<String> keysPreguntas = preguntasCategoria.keys();

                //Iterar sobre cada pregunta (q1, q2...)
                while (keysPreguntas.hasNext()) {
                    String idPregunta = keysPreguntas.next();
                    JSONObject detalle = preguntasCategoria.getJSONObject(idPregunta);

                    System.out.println(idPregunta + ": " + detalle.getString("question"));

                    //Uso de JSONArray para las opciones
                    JSONArray opciones = detalle.getJSONArray("options");
                    System.out.print("Opciones: ");
                    for (int i = 0; i < opciones.length(); i++) {
                        System.out.print("[" + opciones.get(i) + "] ");
                    }
                    
                    System.out.println("\nRespuesta Correcta: " + detalle.getString("answer"));
                }
            }
        }
        //Con catch en vez de que se muestres 50 lineas de error, se mostrara un mensaje que se guarda en el objeto "e" y dicho mensaje se mostrara con ".getMessage()"
        //e.getMessage() nos dira que tipo de error tenemos en ves de que solo diga que tenemos un error y ya
        catch (Exception e) {
            //Si ocurre un error , la consola nos lo hara saber
            System.out.println( "Ocurrio un error: " + e.getMessage());
        }
        
    }
}
