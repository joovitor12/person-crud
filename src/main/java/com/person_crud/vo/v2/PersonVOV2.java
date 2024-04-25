package com.person_crud.vo.v2;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class PersonVOV2 implements Serializable {

        private static final long serialVersionUID = 1L;

        private Long id;

        private String firstName;

        private String lastName;

        private String address;

        private String gender;

        private Date birthDay;

        public PersonVOV2() {

        }

        public PersonVOV2(Long id, String firstName, String lastName, String address, String gender){
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.gender = gender;
        }
}
