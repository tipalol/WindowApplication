package com.tipalol.app.sandbox;

import com.tipalol.app.events.Event;
import com.tipalol.app.layers.Layer;

public class Example extends Layer {

    public void onEvent(Event event) {
        //#debug
        System.out.println(event);
    }

}
