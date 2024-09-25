package org.example.data.entities;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode

public class Meet {
    private int id;
    private String date;
    private String time;
    private Doctor doctor;

    @Override
    public String toString() {
        return STR."Meet{id=\{id}, date='\{date}\{'\''}, time='\{time}\{'\''}\{'}'}";
    }
}
