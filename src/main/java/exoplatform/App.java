package exoplatform;

import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MutablePicoContainer pico = new DefaultPicoContainer();
        pico.addComponent(Say.class);
        pico.addComponent(Hello.class);
        pico.addComponent(Goodbye.class);
        Say say = (Say) pico.getComponent(Say.class);
        say.hello.everyone();
        say.goodbye.everyone();
        System.out.println(say.hello.mama());
        System.out.println(say.goodbye.mama());
    }
}
