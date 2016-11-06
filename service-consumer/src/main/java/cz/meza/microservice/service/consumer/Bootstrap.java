package cz.meza.microservice.service.consumer;

import org.wildfly.swarm.Swarm;
import org.wildfly.swarm.bootstrap.Main;

import java.net.URL;

/**
 *
 */
public class Bootstrap {

    public static void main(String[] args) throws Exception {

        ClassLoader cl = Main.class.getClassLoader();
        URL stageConfig = cl.getResource("project-stages.yml");

        Swarm swarm = new Swarm(true)
                .withStageConfig(stageConfig);

        swarm.start().deploy();

    }
}
