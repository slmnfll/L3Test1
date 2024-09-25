package org.example.services;

import org.example.data.entities.Meet;
import org.example.data.repositories.interfaces.IMeetRepository;
import org.example.services.interfaces.IMeetService;

import java.util.List;

public class MeetService implements IMeetService {
    private final IMeetRepository meetRepository;

    public MeetService(IMeetRepository meetRepository) {
        this.meetRepository = meetRepository;
    }

    @Override
    public void save(Meet object) {
        meetRepository.insert(object);
    }

    @Override
    public List<Meet> show() {
        return null;
    }

    @Override
    public void FindByPhone(String object) {

    }
}
