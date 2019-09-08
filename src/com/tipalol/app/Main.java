package com.tipalol.app;

import com.tipalol.app.core.Window;
import com.tipalol.app.sandbox.Example;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Window window = new Window("Window", 960, 540);
        window.addLayer(new Example("One layer", Color.BLUE));
        window.addLayer(new Example("One layer", Color.YELLOW));
    }
}
