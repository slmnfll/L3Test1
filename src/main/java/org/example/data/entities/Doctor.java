package org.example.data.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode

public class Doctor {
    private int id;
    private String name;
    private String surname;
    private List<Meet> meets = new ArrayList<>();

    public Doctor(){}
    public Doctor(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }
    @Override
    public String toString() {
        return STR."Doctor{id=\{id}, name='\{name}\{'\''}, surname='\{surname}\{'\''}\{'}'}";
    }
}
