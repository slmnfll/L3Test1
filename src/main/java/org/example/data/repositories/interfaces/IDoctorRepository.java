package org.example.data.repositories.interfaces;

import org.example.core.IRepositories;
import org.example.data.entities.Doctor;

public interface IDoctorRepository extends IRepositories<Doctor> {
    Doctor FindById(int object);
}
