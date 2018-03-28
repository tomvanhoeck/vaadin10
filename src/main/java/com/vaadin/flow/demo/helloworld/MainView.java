package com.vaadin.flow.demo.helloworld;


import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
@HtmlImport("styles.html")
public class MainView extends VerticalLayout {

	public MainView() {
		add(new RendierComponent());
		add(new ExampleTemplate());


		/*
		ComponentEventListener<HasClickListeners.ClickEvent<Button>> eventListener = new ComponentEventListener<HasClickListeners.ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(HasClickListeners.ClickEvent<Button> buttonClickEvent) {
				System.out.println("It works....");
			}
		};
		*/
		add(new Button("Click me!",  buttonClickEvent -> add(new Label("added from button"))));
	}

}
