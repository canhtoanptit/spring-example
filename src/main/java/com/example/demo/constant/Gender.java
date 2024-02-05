package com.example.demo.constant;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

public enum Gender {
    MALE('M'),
    FEMALE('F');

    private final char code;

    Gender(char code) {
        this.code = code;
    }

    public static Gender fromCode(char code) {
        if (code == 'M' || code == 'm') {
            return MALE;
        }
        if (code == 'F' || code == 'f') {
            return FEMALE;
        }
        throw new UnsupportedOperationException(
                "The code " + code + " is not supported!"
        );
    }

    public char getCode() {
        return code;
    }

    @Converter
    public static class GenderConverter implements AttributeConverter<Gender, Character> {

        public Character convertToDatabaseColumn(Gender value) {
            if (value == null) {
                return null;
            }

            return value.getCode();
        }

        public Gender convertToEntityAttribute(Character value) {
            if (value == null) {
                return null;
            }

            return Gender.fromCode(value);
        }
    }
}

