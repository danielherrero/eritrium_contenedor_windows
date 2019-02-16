package es.dhr.plugins;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class MiPlugin  implements Plugin<Project> {
    public void apply(Project project) {

        project.getTasks().create("hola", MiPluginTask.class, (task) -> {
           task.setMensaje("Hola desde mi plugin");
        });

    }
}
