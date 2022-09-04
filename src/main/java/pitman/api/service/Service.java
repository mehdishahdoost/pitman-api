package pitman.api.service;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface Service {
    ServiceType type();
}
