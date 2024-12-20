package infraestructure;

/**
 * Clase que es utilizada para tipar la respuesta cuando se elimina un elemento de un Nodo
 */
public class DefaultInformationResponse {
    private DefaultInformation defaultInformation;
    private int contador;

    public DefaultInformationResponse(DefaultInformation defaultInformation, int contador) {
        this.defaultInformation = defaultInformation;
        this.contador = contador;
    }

    public DefaultInformation getDefaultInformation() {
        return defaultInformation;
    }

    public void setDefaultInformation(DefaultInformation defaultInformation) {
        this.defaultInformation = defaultInformation;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
