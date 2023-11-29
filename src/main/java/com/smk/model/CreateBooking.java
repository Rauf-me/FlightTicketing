package com.smk.model;

import com.smk.MainView;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Create Booking")
@Route(value = "create-booking", layout = MainView.class)
public class CreateBooking extends VerticalLayout{
    public CreateBooking() {
        createForm();
    }

    private void createForm() {
        setAlignItems(Alignment.STRETCH); // Code untuk mengubah ukuran/posisi dari form
        ComboBox fromComboBox = new ComboBox("Dari");
        ComboBox toComboBox = new ComboBox("Ke");
        DatePicker departureDatePicker = new DatePicker("Tanggal Keberangkatan"); // Code untuk menambahkan tanggal
        DatePicker arriveDatePicker = new DatePicker("Tanggal Kepulangan"); // "Label" untuk menambahkan text

        Button SearchButton = new Button("Search");
        SearchButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        add(fromComboBox, toComboBox, departureDatePicker, arriveDatePicker, SearchButton); // Note: Code harus teratur dengan code diatas karena menggunakan extends VerticalLayout (atas }
    }
}