package com.totalcross.screens;

import com.totalcross.style.SecondaryStyle;

import totalcross.ui.Button;
import totalcross.ui.ComboBox;
import totalcross.ui.Edit;
import totalcross.ui.ImageControl;
import totalcross.ui.Label;
import totalcross.ui.Window;

public class Secondary extends Window {
    private static ImageControl logo, back;
    private Label name, email, office;
    private Edit nameEdit, emailEdit;
    private ComboBox officeBox;
    private Button btnsvn;

    public Secondary() {

    }

    protected void onPopup() {
        SecondaryStyle.loadImg();

        String[] jobs = { "Java Developer" };

        btnsvn = new Button("Save and Next", Button.BORDER_ROUND);
        back = new ImageControl(SecondaryStyle.back);
        logo = new ImageControl(SecondaryStyle.logo);
        name = new Label("Name:", LEFT);
        email = new Label("Email:", LEFT);
        office = new Label("Office:", LEFT);
        nameEdit = new Edit();
        emailEdit = new Edit();
        officeBox = new ComboBox(jobs);

        back.scaleToFit = true;
        back.centerImage = true;
        add(back, CENTER, CENTER);

        logo.scaleToFit = true;
        logo.centerImage = true;
        logo.transparentBackground = true;
        add(logo, CENTER, TOP + 30);

        add(name, LEFT + 20, TOP + 130);
        add(nameEdit, CENTER, TOP + 150, PARENTSIZE + 90, PARENTSIZE + 10);
        add(email, LEFT + 20, TOP + 210);
        add(emailEdit, CENTER, TOP + 230, PARENTSIZE + 90, PARENTSIZE + 10);
        add(office, LEFT + 20, TOP + 290);
        add(officeBox, CENTER, TOP + 310, PARENTSIZE + 90, PARENTSIZE + 10);

        btnsvn.setBackForeColors(0xFF0000, 0xFFFFFF);
        add(btnsvn, CENTER, BOTTOM - 40);

        btnsvn.addPressListener((event) -> {
            Tertiary te = new Tertiary();
            te.popupNonBlocking();
        });
    }

}
