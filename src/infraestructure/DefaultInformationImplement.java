package infraestructure;

import helpers.CustomMessage;

import java.util.Objects;

/**
 * Implementacion y centralizacion
 * de los servicios que permite realizar las acciones de insercion, listado, lectura y eliminacion de registros.
 */
public class DefaultInformationImplement {

    /**
     * Crea la informacion basica que requiere las clases, y los inserta en el nodo
     * @param name
     * @param description
     * @param codigo
     * @param siguiente
     * @return DefaultInformation
     */
    public DefaultInformation createImplement(String name, String description, String codigo, DefaultInformation siguiente) {
        return new DefaultInformation(
                name,
                description,
                codigo ,
                siguiente);
    }

    /**
     * Enlista los elementos de los nodos
     * @param defaultInformation
     */
    public void listImplement(DefaultInformation defaultInformation){
        if (defaultInformation != null) {
            DefaultInformation aux = defaultInformation;
            int i = 0;
            while (aux != null) {
                CustomMessage.outln(new String[]{
                        " | " + aux.getCodigo() +
                                " | " + aux.getName() +
                                " | " + aux.getDescription() + " |"});
                aux = aux.getSiguiente();
                i++;
            }
        } else {
            CustomMessage.outln(new String[]{"lista vacía"});
        }
        System.out.println();
        System.out.println();
    }

    /**
     * Busca elementos en el nodo indicado
     * @param param
     * @param defaultInformation
     */
    public void readImplement(String param , DefaultInformation defaultInformation){
        DefaultInformation aux = defaultInformation;
        boolean encontrado = false;
        while (aux != null && !encontrado) {
            if (param.equals(aux.getCodigo()))
                encontrado = true;
            if (!param.equals(aux.getCodigo()))
                aux = aux.getSiguiente();
        }
        if (!encontrado)
            CustomMessage.outln(new String[]{"El elemento " + param + " no esta en la lista"});
        if (encontrado)
            CustomMessage.outln(new String[]{"El elemento " + param + " se encontro en la lista"});
    }

    /**
     * Elimina elementos del Nodo
     * @param param
     * @param defaultInformation
     * @param contador
     * @return DefaultInformationResponse
     */
    public DefaultInformationResponse deleteImplement(String param , DefaultInformation defaultInformation, int contador){
        if (defaultInformation == null)
            CustomMessage.outln(new String[]{"lista vacía"});
        else if (defaultInformation.getCodigo() == param) {
            defaultInformation = defaultInformation.getSiguiente();
            contador--;
            CustomMessage.outln(new String[]{"El elemento " + param + " se elimino de la lista"});
        } else {
            DefaultInformation actual = defaultInformation;
            while (actual.getSiguiente() != null && !Objects.equals(actual.getSiguiente().getCodigo(), param))
                actual = actual.getSiguiente();
            if (actual.getSiguiente() == null)
                CustomMessage.outln(new String[]{"El elemento " + defaultInformation + " no esta en la lista"});
            else {
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                contador--;
            }
        }

        return new DefaultInformationResponse(defaultInformation, contador);
    }
}
