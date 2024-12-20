import helpers.CustomMessage;
import presentation.TaskManager;

public class Main {
    public static void main(String[] args) {

        /**
         * Metodo que inicializa la App
         */
        runApp();
    }

    /**
     * Single Responsibility
     * El motodo runApp se encarga de ejecutar las funciones
     * o las instancias de las clases requeridas para la ejecucion de la app.
     */
    public static void runApp() {
        CustomMessage.title("      CLEAN CODE - KEVIN AQUINO     ");

        TaskManager taskManager = new TaskManager();
        taskManager.users();
        taskManager.tasks();
        taskManager.projects();

    }
}