package pitman.api.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface TestPlan {
  TestLibrary testLibrary();
}
