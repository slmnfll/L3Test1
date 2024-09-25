package org.example.services.interfaces;

import org.example.core.IServices;
import org.example.data.entities.Doctor;

public interface IDoctorService extends IServices<Doctor> {
    Doctor FindById(int object);
}
