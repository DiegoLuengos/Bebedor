
/**
 * Una copa de alcohol.
 */
public class Cubata
{
    //Almacena el nombre de la copa.
    private String nombreCubata;
    //Almacena la cantidad de alcohol que tiene ese cubata.
    private int cantidadDeAlcohol;

    /**
     * Constructor de objetos de la clase cubata
     */
    public Cubata(String nombreCubata, int cantidadDeAlcohol)
    {
        this.nombreCubata = nombreCubata;
        this.cantidadDeAlcohol = cantidadDeAlcohol;
    }
    
    /**
     * Devuelve el nombre del cubata.
     */
    public String nombreCubata()
    {
        return nombreCubata;
    }

    /**
     * Devuelve la cantidad de alcohol que tiene ese cubata.
     */
    public int getAlcohol()
    {
        return cantidadDeAlcohol;
    }
}
