package net.bounceme.chronos.sb.document;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Created by fabio on 02/12/2018.
 */
@Documented
@Target(FIELD)
@Retention(RUNTIME)
public @interface FirebaseId {

}
