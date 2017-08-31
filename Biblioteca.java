import java.util.ArrayList;

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
     */
    public void agregarCancion(String nombreArchivo)
    {
        canciones.add(nombreArchivo);
    }
    
    public void repoducirCancion(int numeroCancion)
    {
        reproductor.reproducirCancion(canciones.get(numeroCancion));
    }
}

