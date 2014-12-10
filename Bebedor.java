
/**
 * Una persona a la que le gusta beber.
 */
public class Bebedor
{
    // Almacena el nombre de la persona.
    private String nombre;
    //Almacena la cantida de alcohol que tiene ese persona en la sangre.
    private float nivelDeAlcohol;
    //Almacena el limite de alcohol que soporta esa persona.
    private float limite;
    //Almacena la masa corporal de la persona.
    private int masaCorporal;

    /**
     * Constructor de objectos de la clase Bebedor.
     */
    public Bebedor(String nombre, float limite, int masaCorporal)
    {
        this.nombre = nombre;
        nivelDeAlcohol = 0;
        this.limite = limite;
        this.masaCorporal = masaCorporal;
        if (masaCorporal < 0){
            System.out.println("ERROR: una persona no puede tener masa corporal no puede ser negativa");
        }
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
    public float getNivelDeAlcohol()
    {
        return nivelDeAlcohol;
    }
    
    /**
     * Devuelve el límite de alcohol que soporta esa persona.
     */
    public float getLimite()
    {
        return limite;
    }
    
    /**
     * Hace que la persona beba un cubata.
     */
    public void beberCubata(Cubata copa)
    {
        if ((nivelDeAlcohol <= limite)) {
             nivelDeAlcohol = nivelDeAlcohol + copa.getAlcohol() - (masaCorporal - 20);
        }
        else {
             System.out.println("Nope, esta persona ya está en TODO LO ALTO =D");
        }
    }
    
    /**
     * Pregunta a la persona si quiere beber más alcohol.
     */
    public void preguntar(String pregunta)
    {
        if ((pregunta.length() %2) == 0){
            System.out.println("Si.");
        }
        else if ((nivelDeAlcohol > limite) || (pregunta.contains(nombre))) {
            System.out.println("¡¡¡¡¡" + pregunta.toUpperCase() + "!!!!!");
        }
        else {
            System.out.println("No.");
        }
    }
}
