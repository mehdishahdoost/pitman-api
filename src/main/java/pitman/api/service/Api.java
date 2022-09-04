package pitman.api.service;

import pitman.api.service.http.HttpType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface Api {
  ApiType apiType();

  HttpType httpType() default HttpType.GET;
}
