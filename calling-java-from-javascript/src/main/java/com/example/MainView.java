package com.example;

import com.vaadin.flow.component.ClientCallable;
import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@JavaScript("./script.js")
@Route
public class MainView extends Div {

    public MainView() {
        getElement().executeJs("RetrieveLocation($0)", getElement());
    }

    @ClientCallable
    public void clientPosition(String lon, String lat) {
        System.out.println("Client says hello to server");
        String longi="longitude is: " + lon;
        String lati="latitude is: " + lat;
        System.out.println(longi);
        System.out.println(lati);
    }
}
