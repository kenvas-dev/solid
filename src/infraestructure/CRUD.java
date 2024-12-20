package infraestructure;

/**
 * Interface creada para imnplementar la segregacion de interfaces
 * Donde Entity es el generico o la clase que servira de Entidad,
 * Donde Search es el generico que resivira el parametro de busqueda
 */
public interface CRUD<Entity, Search> {

    /**
     * Se crea un recurso
     * @param param
     */
    void create(Entity param);

    /**
     * Se enlista los recursos
     */
    void list();

    /**
     * Se busca un recurso
     * @param param
     */
    void read(Search param);

    /**
     * Se elimina un recurso
     * @param param
     */
    void delete(Search param);
}
