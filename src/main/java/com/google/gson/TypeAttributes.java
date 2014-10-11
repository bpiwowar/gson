package com.google.gson;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collection;

/**
 * A data object that stores attributes of a type
 */
public interface TypeAttributes {
    Type getDeclaredType();

    Class<?> getDeclaredClass();

    <T extends Annotation> T getAnnotation(Class<T> annotation);

    Collection<Annotation> getAnnotations();
}
