package com.jrsmiffy.springguru.petclinic.model.person;

import com.jrsmiffy.springguru.petclinic.model.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter // @Data?
public class Specialty extends BaseEntity {
    // Question: Specialty or Speciality? TLDR: both are acceptable
        // https://writingexplained.org/specialty-vs-speciality

    private String description;

}
