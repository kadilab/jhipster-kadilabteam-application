package com.kadilab.kadilabteam;

import com.kadilab.kadilabteam.KadilabTeamApp;
import com.kadilab.kadilabteam.config.AsyncSyncConfiguration;
import com.kadilab.kadilabteam.config.EmbeddedElasticsearch;
import com.kadilab.kadilabteam.config.EmbeddedMongo;
import com.kadilab.kadilabteam.config.EmbeddedRedis;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { KadilabTeamApp.class, AsyncSyncConfiguration.class })
@EmbeddedRedis
@EmbeddedMongo
@EmbeddedElasticsearch
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
