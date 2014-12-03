
/**
 * Una persona a la que le gusta beber.
 */
public class Bebedor
{
    // Almacena el nombre de la persona.
    private String nombre;
    //Almacena la cantida de alcohol que tiene ese persona en la sangre.
    private int nivelDeAlcohol;
    //Almacena el limite de alcohol que soporta esa persona.
    private int limite;

    /**
     * Constructor de objectos de la clase Bebedor.
     */
    public Bebedor(String nombre, int limite)
    {
        this.nombre = nombre;
        nivelDeAlcohol = 0;
        this.limite = limite;
    }
    
    /**
     * Devuelve el nombre de la persona.
     */
    public String getNombrePersona()
    {
        return nombre;
    }

    /**
     * Devuelve la cantidad de alcohol que tiene ese persona en la sangre.
     */
    public int getNivelDeAlcohol()
    {
        return nivelDeAlcohol;
    }
    
    /**
     * Devuelve el límite de alcohol que soporta esa persona.
     */
    public int getLimite()
    {
        return limite;
    }
    
    /**
     * Hace que la persona beba un cubata.
     */
    public void beberCubata(Cubata copa)
    {
        if (nivelDeAlcohol <= limite) {
            nivelDeAlcohol = nivelDeAlcohol + copa.getAlcohol();
        }
        else {
            System.out.println("Esta persona va bufas.");
        }
    }
    
    /**
     * Pregunta a la persona si quiere beber más alcohol
     */
    public void preguntar(String pregunta)
    {
        if (pregunta.length() %2 == 0){
            System.out.println("Si.");
        }
        else if (nivelDeAlcohol > limite || pregunta.contains(nombre)) {
            System.out.println("¡¡¡¡¡" + pregunta.toUpperCase() + "!!!!!");
        }
        else {
            System.out.println("No.");
        }
    }
}
