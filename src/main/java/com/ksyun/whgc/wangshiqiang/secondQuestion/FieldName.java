package com.ksyun.whgc.wangshiqiang.secondQuestion;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FieldName {
    String value() default "";
}