import java.util.ArrayList;
import java.util.Random;
/**
 * La clase Biblioteca es un objeto que contiene canciones
 */public class Biblioteca
{
    private ArrayList<String> canciones;
    private Reproductor reproductor;
    /**
     * Constructor de la clase Biblioteca
     */
    public Biblioteca ()
    {
        canciones = new ArrayList<String>();
        reproductor = new Reproductor();
    }
    
    /**
     * Agrega las canciones
     * @param nombreArchivo Parametro que representa el nombre de la cancion a agregar
     */
    public void agregarCancion(String nombreArchivo)
    {
        canciones.add(nombreArchivo);
    }
    /**
     * Reproduce una cancion
     * @param numeroCancion Parametro que representa el numero de cancion
     */
    public void repoducirCancion(int numeroCancion)
    {
        reproductor.reproducirCancion(canciones.get(numeroCancion));
    }
    
    /**
     * Da el numero de canciones en la biblioteca
     * @return Regresa el numero de canciones totales
     */
    public int totalCanciones()
    {
        return canciones.size();
    }
    
    /**
     * Reproduce toda la biblioteca 
     */
    public void reproducirBiblioteca()
    {
        for(int i=0;i<canciones.size();i++)
        {
            reproductor.reproducirCancion(canciones.get(i));
        }
    }
    
    /**
     * Elimina una cancion
     * @param numeroCancion Parametro que representa el numero de cancion a eliminar
     */
    public void borrarCancion(int numeroCancion)
    {
        canciones.remove(numeroCancion);
    }
    
    /**
     * Borra toda la biblioteca
     */
    public void borrarBiblioteca()
    {
        canciones.clear();
    }
    
    
    /**
     * Reproduce aleatoriamente una cancion
     */public void reproducirAleatorio()
    {
        Random aleatorios =new Random();
        reproductor.reproducirCancion(canciones.get(aleatorios.nextInt(canciones.size())));
       
    }
    
    
    /**
     * Reproduce una cancion aleatoria sin que se repita la cancion
     */public void reproducirBibliotecaAleatorio()
    {
        Random aleatorios = new Random();
        ArrayList<String> reproducido = new ArrayList<String>(); //lista para indicar que ya se reproducio la cancion
        String cancionReproducida = new String();;
     
        while(reproducido.size() != canciones.size())
        {
                cancionReproducida=canciones.get(aleatorios.nextInt(canciones.size()));
            
                if(reproducido.contains(cancionReproducida ) ==false)
                {   
                    reproducido.add(cancionReproducida); //agrega el nombre del archivo a la lista de reproducido
                    reproductor.reproducirCancion(cancionReproducida);//reproduce la cancion
                }
         
        }
        
    }
   
}

