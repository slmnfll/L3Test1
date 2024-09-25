package org.example;

import org.example.data.entities.*;

import org.example.data.repositories.interfaces.*;

import org.example.fabric.*;

import org.example.services.interfaces.*;

import org.example.views.interfaces.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int choice;

        Scanner scanner = new Scanner(System.in);

        IDoctorView doctorView = VuesFabric.instanceDoctorView();
        IMeetView meetView = VuesFabric.instanceMeetView();

        IDoctorRepository doctorRepository =  RepositoriesFabric.instanceDoctorRepository();
        IMeetRepository meetRepository = RepositoriesFabric.instanceMeetRepository();

        IDoctorService doctorService = ServicesFabric.instanceDoctorService();
        IMeetService meetService = ServicesFabric.instanceMeetService();

        do {
            switch (choice = menu(scanner)) {
                case 1 -> doctorService.save(doctorView.instance());
                case 2 -> {
                    Doctor doctor = doctorService.FindById(doctorView.askId());
                    if (doctor == null) {
                        System.out.println("[Doctor not found...]");
                    } else {
                        Meet meet = meetView.instance();
                        meet.setDoctor(doctor);
                        meetService.save(meet);
                        System.out.println("[Meet saved!...]");
                    }
                }
            }
        } while (choice != 5);


    }
    public static int menu(Scanner scanner) {
        System.out.println("1- Save a doctor");
        System.out.println("2- Save a meeting");
        System.out.println("3- List all meetings");
        System.out.println("4- List meetings by date");
        System.out.println("5- [Leave]");

        return scanner.nextInt();
    }
}

