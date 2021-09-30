package com.filichkin.blog.db.blockingservice;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Component
public @interface LogExecutionTime {
}
