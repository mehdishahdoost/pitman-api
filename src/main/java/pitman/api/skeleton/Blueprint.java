package pitman.api.skeleton;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface Blueprint {
    String projectName();
    String workingDirectory();
    String basePackageName();
}
