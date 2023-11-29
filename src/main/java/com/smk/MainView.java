package com.smk;

import com.smk.model.CreateBooking;
import com.smk.model.SearchBooking;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.theme.lumo.LumoUtility;

@Route
public class MainView extends AppLayout {

    public MainView(){
        createHeader();
        createDrawer();
    }
    private void  createHeader(){
        H1 logo = new H1("Booking Flight");
        logo.addClassName(
                LumoUtility.FontSize.LARGE
        );
        var header = new HorizontalLayout(
                new DrawerToggle(), logo
        );
        header.setDefaultVerticalComponentAlignment(
                FlexComponent.Alignment.CENTER
        );
        header.expand(logo);
        header.setWidthFull();
        addToNavbar(header);
    }

    private void createDrawer() {
        addToDrawer(new VerticalLayout(new RouterLink("Create booking", CreateBooking.class),
                new RouterLink("Search booking", SearchBooking.class)));
    }

}