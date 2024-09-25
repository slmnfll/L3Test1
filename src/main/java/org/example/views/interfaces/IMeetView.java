package org.example.views.interfaces;

import org.example.core.IViews;
import org.example.data.entities.Meet;

public interface IMeetView extends IViews<Meet> {
    String askDate();
}
