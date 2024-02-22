package com.example.demo.domain;

import com.example.demo.constant.Gender;
import com.example.demo.constant.PhoneType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.PartitionKey;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Author {

    @Id
    @GeneratedValue
    private Long id;

    private Name name;

    private Phone phone;

    private LocalDate birthday;

    @PartitionKey
    private String tenantKey;

    @Enumerated
    @Convert(converter = Gender.GenderConverter.class)
    private Gender gender;

    // this will get mapped to CHAR or NCHAR with a conversion
    @Basic
    @Convert(converter = org.hibernate.type.YesNoConverter.class)
    private Boolean convertedYesNo;

    // this will get mapped to CHAR or NCHAR with a conversion
    @Basic
    @Convert(converter = org.hibernate.type.TrueFalseConverter.class)
    private Boolean convertedTrueFalse;

    // this will get mapped to TINYINT with a conversion
    @Basic
    @Convert(converter = org.hibernate.type.NumericBooleanConverter.class)
    private Boolean convertedNumeric;

    @Embeddable
    @Getter
    @Setter
    public static class Name {
        private String firstName;

        private String middleName;

        private String lastName;
    }

    @Embeddable
    @Getter
    @Setter
    public static class Phone {
        @Column(name = "phone_number")
        private String phoneNumber;

        @Enumerated
        @Column(name = "phone_type")
        private PhoneType phoneType;
    }
}
