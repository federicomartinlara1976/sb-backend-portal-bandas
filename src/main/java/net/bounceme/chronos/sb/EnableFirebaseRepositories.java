package net.bounceme.chronos.sb;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
@Documented
@Import(FirebaseConfiguration.class)
public @interface EnableFirebaseRepositories {
}
