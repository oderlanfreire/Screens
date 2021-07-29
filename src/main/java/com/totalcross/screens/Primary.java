package com.totalcross.screens;

import com.totalcross.style.PrimaryStyle;
import totalcross.ui.Button;
import totalcross.ui.ImageControl;
import totalcross.ui.Label;
import totalcross.ui.Window;
import totalcross.ui.font.Font;

public class Primary extends Window {
    private ImageControl logo, back;
    private Button btnst;
    public Label welcome;

    protected void onPopup() {
        PrimaryStyle.loadImg();

        btnst = new Button("To Start", Button.BORDER_ROUND);
        back = new ImageControl(PrimaryStyle.back);
        logo = new ImageControl(PrimaryStyle.logo);
        welcome = new Label("Welcome to TotalCross");

        welcome.setFont(Font.getFont("Lato Bold", true, 24));

        back.scaleToFit = true;
        back.centerImage = true;
        add(back, CENTER, CENTER);

        logo.scaleToFit = true;
        logo.centerImage = true;
        logo.transparentBackground = true;
        add(logo, CENTER, TOP + 30);

        welcome.transparentBackground = true;
        welcome.setForeColor(0xFF0000);
        btnst.setBackForeColors(0xFF0000, 0xFFFFFF);
        add(btnst, CENTER, BOTTOM - 40);

        add(welcome, CENTER, CENTER - 140);

        btnst.addPressListener((event) -> {
            Secondary se = new Secondary();
            se.popupNonBlocking();
        });
    }
}
