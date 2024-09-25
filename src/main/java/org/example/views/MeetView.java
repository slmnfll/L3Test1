package org.example.views;

import org.example.core.impls.ViewsImpl;
import org.example.data.entities.Meet;
import org.example.views.interfaces.IMeetView;

public class MeetView extends ViewsImpl<Meet> implements IMeetView {
    @Override
    public Meet instance() {
        Meet meet = new Meet();
        System.out.println("-> Input the date:");
        meet.setDate(scanner.nextLine());
        System.out.println("-> Input the time:");
        meet.setTime(scanner.nextLine());
        return meet;
    }

    @Override
    public String askDate() {
        System.out.println("-> Input the date of the meeting:");
        return scanner.nextLine();
    }
}
