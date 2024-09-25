package org.example.fabric;

import org.example.data.repositories.DoctorRepository;
import org.example.data.repositories.MeetRepository;
import org.example.data.repositories.interfaces.IDoctorRepository;
import org.example.data.repositories.interfaces.IMeetRepository;
import org.example.views.DoctorView;
import org.example.views.MeetView;
import org.example.views.interfaces.IDoctorView;
import org.example.views.interfaces.IMeetView;

public class VuesFabric {
    private static IMeetView meetView = null;
    private static IDoctorView doctorView = null;

    private VuesFabric() {
    }

    public static IMeetView instanceMeetView() {
        if (meetView == null) {
            meetView = new MeetView();
        }
        return meetView;
    }

    public static IDoctorView instanceDoctorView() {
        if (doctorView == null) {
            doctorView = new DoctorView();
        }
        return doctorView;
    }
}
