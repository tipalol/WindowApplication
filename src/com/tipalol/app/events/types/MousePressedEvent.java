package com.tipalol.app.events.types;

import com.tipalol.app.events.Event;

public class MousePressedEvent extends MouseButtonEvent {

    protected MousePressedEvent(int keyCode, int x, int y) {
        super(Type.MOUSE_PRESSED, keyCode, x, y);
    }
}
