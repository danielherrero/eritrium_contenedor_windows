package es.dhr.plugins;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class MiPluginTask extends DefaultTask {
    protected String mensaje;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @TaskAction
    void sayGreeting() {

        System.out.printf(getMensaje() + "." +  getProject().getName());
    }
}
