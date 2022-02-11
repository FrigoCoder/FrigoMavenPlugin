package frigo;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "hello-world", defaultPhase = LifecyclePhase.VALIDATE)
public class HelloWorldMojo extends AbstractMojo {

    @Parameter(defaultValue = "Hello, World!", property = "hello.message", readonly = true)
    private String message;

    @Override
    public void execute() {
        getLog().info(message);
    }

}
