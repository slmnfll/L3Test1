package org.example.fabric;

import org.example.core.IRepositories;
import org.example.core.IServices;
import org.example.data.entities.Doctor;
import org.example.data.entities.Meet;
import org.example.data.repositories.interfaces.IMeetRepository;
import org.example.services.DoctorService;
import org.example.services.MeetService;
import org.example.services.interfaces.IDoctorService;
import org.example.services.interfaces.IMeetService;

public class ServicesFabric {
    private static IMeetService meetService = null;
    private static IDoctorService doctorService = null;

    private ServicesFabric() {
    }

    public static IMeetService instanceMeetService() {
        if (meetService == null) {
            meetService = new MeetService(RepositoriesFabric.instanceMeetRepository());
        }
        return meetService;
    }

    public static IDoctorService instanceDoctorService() {
        if (doctorService == null) {
            doctorService = new DoctorService(RepositoriesFabric.instanceDoctorRepository());
        }
        return doctorService;
    }
}
