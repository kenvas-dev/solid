package Entities;

/**
 * Clase que sirve para tipar las propiedades basicas de las
 * distintas clases a implementarse.
 */
public class DefaultInformationEntity {
    public String codigo;
    public String name;
    public String description;

    public DefaultInformationEntity(String name, String description, String codigo) {
        this.name = name;
        this.description = description;
        this.codigo = codigo;
    }
}
