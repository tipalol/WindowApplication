package com.tipalol.app.events.types;

import com.tipalol.app.events.Event;

public class MouseReleasedEvent extends MouseButtonEvent {

    public MouseReleasedEvent(int keyCode, int x, int y) {
        super(Type.MOUSE_RELEASED, keyCode, x, y);
    }
}
