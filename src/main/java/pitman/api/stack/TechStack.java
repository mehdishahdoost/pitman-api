package pitman.api.stack;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface TechStack {
  Language language();

  Framework framework();

  BuildSystem buildSystem();

  Library library() default Library.LOMBOK;
}
