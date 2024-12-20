package presentation;

import Entities.DefaultInformationEntity;
import helpers.CustomMessage;

/**
 * Clase responsable de administrar las tareas, projectos y usuarios
 */
public class TaskManager {

    /**
     * Single Responsibility
     * El motodo user se encarga de ejecutar las funciones
     * o las instancias de las clase User para la ejecucion de sus metodos.
     */
    public void users(){
        CustomMessage.title("             CLASS USER             ");
        User user = new User();
        user.create(new DefaultInformationEntity("Juan", "Admin", "A00001"));
        user.create(new DefaultInformationEntity("Juan2", "Admin2", "A00002"));
        user.create(new DefaultInformationEntity("Juan3", "Admin3", "A00003"));
        user.list();
        user.read("A00003");
        user.delete("A00001");
        user.list();
    }

    /**
     * Single Responsibility
     * El motodo user se encarga de ejecutar las funciones
     * o las instancias de las clase Task para la ejecucion de sus metodos.
     */
    public void tasks(){
        CustomMessage.title("             CLASS TASK             ");
        Task task = new Task();
        task.create(new DefaultInformationEntity("Task 1", "Comment by task 1", "TASK00001"));
        task.create(new DefaultInformationEntity("Task 2", "Comment by task 2", "TASK00002"));
        task.create(new DefaultInformationEntity("Task 3", "Comment by task 3", "TASK00003"));
        task.list();
        task.read("TASK00001");
        task.delete("TASK00002");
        task.list();
    }

    /**
     * Single Responsibility
     * El motodo user se encarga de ejecutar las funciones
     * o las instancias de las clase Project para la ejecucion de sus metodos.
     */
    public void projects(){
        CustomMessage.title("           CLASS PROJECT            ");
        Project project = new Project();
        project.create(new DefaultInformationEntity("Project 1", "Comment by project 1", "PROJECT00001"));
        project.create(new DefaultInformationEntity("Project 2", "Comment by project 2", "PROJECT00002"));
        project.create(new DefaultInformationEntity("Project 3", "Comment by project 3", "PROJECT00003"));
        project.list();
        project.read("PROJECT00001");
        project.delete("PROJECT00002");
        project.list();
    }
}
