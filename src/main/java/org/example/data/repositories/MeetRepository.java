package org.example.data.repositories;

import org.example.core.impls.RepositoriesImpl;
import org.example.data.entities.Meet;
import org.example.data.repositories.interfaces.IMeetRepository;

import java.util.List;

public class MeetRepository extends RepositoriesImpl<Meet> implements IMeetRepository {
    @Override
    public void insert(Meet object) {
        openConnection();
        executeUpdate(String.format("INSERT INTO `Meet` (`date`, `time`, `doctor_id`) VALUES ('%s', '%s', '%d')", object.getDate(), object.getTime()));
    }

    @Override
    public List<Meet> selectAll() {
        return null;
    }

    @Override
    public void FindByPhone(String object) {

    }
}
