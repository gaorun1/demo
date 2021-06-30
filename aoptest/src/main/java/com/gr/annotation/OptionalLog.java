package com.gr.annotation;

import java.lang.annotation.*;

/**
 * @author gaorun
 * @Description
 * @create 2021-06-30 13:49
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface  OptionalLog {
	String modules()  default "";
	String methods()  default "";
}
