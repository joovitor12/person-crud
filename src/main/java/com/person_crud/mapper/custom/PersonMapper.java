package com.person_crud.mapper.custom;

import com.person_crud.entities.Person;
import com.person_crud.vo.v2.PersonVOV2;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PersonMapper {

    public PersonVOV2 convertEntityToVO(Person person) {
        PersonVOV2 vo = new PersonVOV2();
        vo.setId(person.getId());
        vo.setFirstName(person.getFirstName());
        vo.setAddress(person.getAddress());
        vo.setBirthDay(new Date());
        vo.setLastName(person.getLastName());
        vo.setGender(person.getGender());

        return vo;

    }

    public Person convertVOToEntity(PersonVOV2 person) {
        Person entity = new Person();
        entity.setId(person.getId());
        entity.setFirstName(person.getFirstName());
        entity.setAddress(person.getAddress());

        entity.setLastName(person.getLastName());
        entity.setGender(person.getGender());

        return entity;

    }
}
