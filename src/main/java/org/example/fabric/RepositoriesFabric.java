package org.example.fabric;

import org.example.core.IRepositories;
import org.example.data.entities.Doctor;
import org.example.data.entities.Meet;
import org.example.data.repositories.DoctorRepository;
import org.example.data.repositories.MeetRepository;
import org.example.data.repositories.interfaces.IDoctorRepository;
import org.example.data.repositories.interfaces.IMeetRepository;
import org.example.services.interfaces.IDoctorService;

public class RepositoriesFabric {
    private static IMeetRepository meetRepository = null;
    private static IDoctorRepository doctorRepository = null;

    private RepositoriesFabric() {
    }

    public static IMeetRepository instanceMeetRepository() {
        if (meetRepository == null) {
            meetRepository = new MeetRepository();
        }
        return meetRepository;
    }

    public static IDoctorRepository instanceDoctorRepository() {
        if (doctorRepository == null) {
            doctorRepository = new DoctorRepository();
        }
        return doctorRepository;
    }
}
