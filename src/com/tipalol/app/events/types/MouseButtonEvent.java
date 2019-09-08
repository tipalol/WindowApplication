package com.tipalol.app.events.types;

import com.tipalol.app.events.Event;

public class MouseButtonEvent extends Event {
    int keyCode;
    int x, y;

    protected MouseButtonEvent(Type type, int keyCode, int  x, int y) {
        super(type);
        this.keyCode = keyCode;
        this.x = x;
        this.y = y;
    }

    public int getKeyCode() {
        return keyCode;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
