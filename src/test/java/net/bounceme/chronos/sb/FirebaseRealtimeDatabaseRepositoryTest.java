package net.bounceme.chronos.sb;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@SpringBootTest(classes = FirebaseConfiguration.class)
@TestPropertySource(locations = "classpath:application.properties")
@EnableConfigurationProperties(FirebaseConfigurationProperties.class)
public @interface FirebaseRealtimeDatabaseRepositoryTest {
}
