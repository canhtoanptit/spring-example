package com.example.demo.domain.anotation;

import org.hibernate.annotations.ValueGenerationType;
import org.hibernate.id.uuid.UuidGenerator;
import org.hibernate.tuple.GenerationTiming;

import java.lang.annotation.*;

@ValueGenerationType(generatedBy = UuidGenerator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target( { ElementType.FIELD, ElementType.METHOD, ElementType.ANNOTATION_TYPE } )
@Inherited
public @interface GeneratedUuidValue {
    GenerationTiming timing();
}
