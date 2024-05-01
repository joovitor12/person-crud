package com.person_crud.vo.v1;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class PersonVO implements Serializable {

        private static final long serialVersionUID = 1L;

        private Long id;

        @JsonProperty("first_name")
        private String firstName;

        @JsonProperty("last_name")
        private String lastName;

        private String address;

        @JsonIgnore
        private String gender;

        public PersonVO() {

        }

        public PersonVO(Long id, String firstName, String lastName, String address, String gender){
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.gender = gender;
        }
}
