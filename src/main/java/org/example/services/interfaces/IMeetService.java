package org.example.services.interfaces;

import org.example.core.IServices;
import org.example.data.entities.Meet;

public interface IMeetService extends IServices<Meet> {
    void FindByPhone(String object);
}
