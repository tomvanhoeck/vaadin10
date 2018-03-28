package com.vaadin.flow.demo.helloworld;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;

public class RendierComponent extends Composite<Div> implements HasComponents{

    public RendierComponent(){
        add(new Image("hero-reindeer.svg","alt rendier"));
        add(new Label("Hello Vaadin 10!"));
    }
}
