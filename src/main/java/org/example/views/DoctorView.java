package org.example.views;

import org.example.core.impls.ViewsImpl;
import org.example.data.entities.Doctor;
import org.example.views.interfaces.IDoctorView;

public class DoctorView extends ViewsImpl<Doctor> implements IDoctorView {
    @Override
    public Doctor instance() {
        Doctor doctor = new Doctor();
        System.out.println("-> Input the name:");
        doctor.setName(scanner.nextLine());
        System.out.println("-> Input the name:");
        doctor.setSurname(scanner.nextLine());
        return doctor;
    }

    @Override
    public int askId() {
        System.out.println("-> Input the id of the doctor:");
        return scanner.nextInt();
    }
}
