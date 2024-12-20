package infraestructure;


/**
 * DefaultInformation
 * Clase creada para almacenar y acceder a valores asignados
 * Esta clase permite almacenar valores en una cola de valores.
 */
public class DefaultInformation {
    /**
     * Propiedad privada de tipo int
     * con sus metodos de accesos
     */
//    private int dato;
    private String name;
    private String description;
    private String codigo;

    /**
     * Propiedad privada de tipo DefaultInformation
     * con sus metodos de accesos
     */
    private DefaultInformation siguiente = null;

    public DefaultInformation(String name, String description, String codigo, DefaultInformation siguiente) {
        this.name = name;
        this.description = description;
        this.codigo = codigo;
        this.siguiente = siguiente;
    }

    public DefaultInformation getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(DefaultInformation siguiente) {
        this.siguiente = siguiente;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
