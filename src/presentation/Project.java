package presentation;

import Entities.DefaultInformationEntity;
import infraestructure.CRUD;
import infraestructure.DefaultInformation;
import infraestructure.DefaultInformationImplement;
import infraestructure.DefaultInformationResponse;

/**
 * Single Responsibility
 * Clase responsable de administrar los proyectos
 */
public class Project extends DefaultInformationImplement implements CRUD<DefaultInformationEntity, String> {

    private DefaultInformation defaultInformation;
    private int contador;

    public Project() {
        this.defaultInformation = null;
        contador = 0;
    }

    /**
     * Single Responsibility
     * El motodo create se encarga de crear los proyectos
     */
    @Override
    public void create(DefaultInformationEntity defaultInformationEntity) {
        this.defaultInformation = super.createImplement(
                defaultInformationEntity.name,
                defaultInformationEntity.description,
                defaultInformationEntity.codigo,
                defaultInformation);
        this.contador++;
    }

    /**
     * Single Responsibility
     * El motodo list se encarga de listar los proyectos
     */
    @Override
    public void list() {
        super.listImplement(defaultInformation);
    }

    /**
     * Single Responsibility
     * El motodo read se encarga de buscar un proyecto
     */
    @Override
    public void read(String param) {
        super.readImplement(param, defaultInformation);
    }

    /**
     * Single Responsibility
     * El motodo delete se encarga de eliminar un proyecto
     */
    @Override
    public void delete(String param) {
        DefaultInformationResponse response = super.deleteImplement(param, defaultInformation, contador);
        defaultInformation = response.getDefaultInformation();
        contador = response.getContador();
    }
}