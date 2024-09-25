package org.example.data.repositories.interfaces;

import org.example.core.IRepositories;
import org.example.data.entities.Meet;

public interface IMeetRepository extends IRepositories<Meet> {
    void FindByPhone(String object);
}
