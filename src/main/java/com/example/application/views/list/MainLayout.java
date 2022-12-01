package com.example.application.views.list;

import com.example.application.security.SecurityService;
import com.vaadin.flow.component.Unit;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.router.HighlightConditions;
import com.vaadin.flow.router.RouterLink;

public class MainLayout extends AppLayout {
    private SecurityService securityService;

    public MainLayout(SecurityService securityService) {

        this.securityService = securityService;
        createDrawer();
    }

    private void createDrawer() {
        // Logo image section
        VerticalLayout logo = new VerticalLayout();
        logo.setAlignItems(Alignment.CENTER);

        Image prodalogo = new Image("images/prodalogo.png", "ProDA logo");
        prodalogo.setHeight(20, Unit.PERCENTAGE);
        prodalogo.setWidth(45, Unit.PERCENTAGE);

        logo.add(prodalogo);

        // Links section
        VerticalLayout links = new VerticalLayout();
        links.setAlignItems(Alignment.CENTER);

        RouterLink homelink = new RouterLink("Home", HomeView.class);
        RouterLink listlink = new RouterLink("View Employees", ListView.class);
        RouterLink dashlink = new RouterLink("Workforce Overview", DashboardView.class);

        links.add(homelink);
        links.add(listlink);
        links.add(dashlink);

        // Logout Button section
        VerticalLayout logOutButton = new VerticalLayout();
        logOutButton.setAlignItems(Alignment.CENTER);

        Button logOut = new Button("Log Out", e -> securityService.logout());

        logOutButton.add(logOut);

        // Display on screen
        addToDrawer(logo, links, logOutButton);
    }
}
