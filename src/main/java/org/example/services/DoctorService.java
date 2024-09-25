package org.example.services;

import org.example.data.entities.Doctor;
import org.example.data.repositories.interfaces.IDoctorRepository;
import org.example.services.interfaces.IDoctorService;

import java.util.List;

public class DoctorService implements IDoctorService {
    private final IDoctorRepository doctorRepository;

    public DoctorService(IDoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Override
    public void save(Doctor object) {
        doctorRepository.insert(object);
    }
    @Override
    public List<Doctor> show() {
        return null;
    }

    @Override
    public Doctor FindById(int object) {
        return doctorRepository.FindById(object);
    }
}
