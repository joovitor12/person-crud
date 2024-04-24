package com.test_connection_mysql.vo.v1;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class PersonVO implements Serializable {

        private static final long serialVersionUID = 1L;

        private Long id;

        private String firstName;

        private String lastName;

        private String address;

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
