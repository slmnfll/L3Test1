package org.example.data.repositories;

import org.example.core.impls.RepositoriesImpl;
import org.example.data.entities.Doctor;
import org.example.data.repositories.interfaces.IDoctorRepository;
import org.example.views.DoctorView;

import java.sql.SQLException;
import java.util.List;

public class DoctorRepository extends RepositoriesImpl<Doctor> implements IDoctorRepository {
    @Override
    public void insert(Doctor object) {
        openConnection();
        executeUpdate(String.format("INSERT INTO `Doctor` (`name`, `surname`) VALUES ('%s', '%s')", object.getName(), object.getSurname()));
    }

    @Override
    public List<Doctor> selectAll() {
        return null;
    }

    @Override
    public Doctor FindById(int object) {
        Doctor doctor = null;
        try {
            openConnection();
            executeQuery(String.format("SELECT * FROM `Doctor` WHERE `id`= '%d';", object));
            while (resultSet.next()) {
                doctor = new Doctor(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("surname"));
            }
        } catch (SQLException e) {
            System.out.println("[Database operation failed!]");
        }
        return doctor;
    }
}
