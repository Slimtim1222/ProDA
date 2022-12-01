package com.example.application.views.list;

import com.example.application.data.entity.Contact;
//import com.sun.tools.javac.main.OptionHelper;
import com.example.application.data.service.CrmService;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import javax.annotation.security.PermitAll;

import org.springframework.security.core.userdetails.User;

import java.util.Collections;

@PageTitle("Home | ProDA")
@Route(value = "home", layout = MainLayout.class)
@PermitAll
public class HomeView extends VerticalLayout {
    H1 greeting = new H1("Greetings!");

    public HomeView() {
        addClassName("home-view");
        setSizeFull();

        add(greeting);
     }


}
