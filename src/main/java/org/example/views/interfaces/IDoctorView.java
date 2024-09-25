package org.example.views.interfaces;

import org.example.core.IViews;
import org.example.data.entities.Doctor;

public interface IDoctorView extends IViews<Doctor> {
    int askId();
}
