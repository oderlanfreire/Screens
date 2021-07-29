package com.totalcross.screens;

import com.totalcross.style.TertiaryStyle;

import totalcross.io.IOException;
import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.ImageControl;
import totalcross.ui.Label;
import totalcross.ui.Window;
import totalcross.ui.font.Font;
import totalcross.ui.image.Image;
import totalcross.ui.image.ImageException;

public class Tertiary extends Window {
    private static ImageControl logo, figure;
    private Label title, text;
    private Container bot_cont;

    public Tertiary() {

    }

    protected void onPopup() {
        TertiaryStyle.loadImg();

        // icons
        Image hm = null;
        Image mg = null;
        Image cld = null;
        Image pfl = null;
        Image ext = null;

        bot_cont = new Container();

        bot_cont.setBackColor(0xFF0000);
        add(bot_cont, LEFT, BOTTOM, FILL, SCREENSIZE + 10);

        try {
            hm = new Image("/img/Vector.png");
            mg = new Image("/img/Vector(1).png");
            cld = new Image("/img/Vector(2).png");
            pfl = new Image("/img/Vector(3).png");
            ext = new Image("/img/Vector(4).png");

            Button home = new Button("", hm.scaledBy(1, 1), CENTER, 0);
            Button msg = new Button("", mg.scaledBy(1, 1), CENTER, 0);
            Button clnd = new Button("", cld.scaledBy(1, 1), CENTER, 0);
            Button profile = new Button("", pfl.scaledBy(1, 1), CENTER, 0);
            Button exit = new Button("", ext.scaledBy(1, 1), CENTER, 0);

            home.setBackColor(0xFFFFFF);
            msg.setBackColor(0xFF0000);
            clnd.setBackColor(0xFF0000);
            profile.setBackColor(0xFF0000);
            exit.setBackColor(0xFF0000);

            add(home, LEFT, BOTTOM, PARENTSIZE + 21, PARENTSIZE + 10);
            add(msg, LEFT + 64, BOTTOM, PARENTSIZE + 21, PARENTSIZE + 10);
            add(clnd, LEFT + 127, BOTTOM, PARENTSIZE + 21, PARENTSIZE + 10);
            add(profile, LEFT + 190, BOTTOM, PARENTSIZE + 21, PARENTSIZE + 10);
            add(exit, RIGHT, BOTTOM, PARENTSIZE + 21, PARENTSIZE + 10);

            exit.addPressListener((event) -> {
                Primary pr = new Primary();
                pr.popupNonBlocking();
            });

        } catch (IOException | ImageException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        logo = new ImageControl(TertiaryStyle.logo);
        figure = new ImageControl(TertiaryStyle.figure);

        title = new Label("Welcome João Vitor!", CENTER);
        text = new Label("Here you can control your " + "\nschedules, communicate with "
                + "\nyour team and receive content " + " \ndiscs to improve your skills.", CENTER);

        //

        title.setFont(Font.getFont("Lato Bold", true, 24));
        title.setForeColor(0xFF0000);
        text.setFont(Font.getFont("Lato Light", false, 16));
        text.setForeColor(0x808080);

        logo.scaleToFit = true;
        logo.centerImage = true;
        logo.transparentBackground = true;

        add(logo, CENTER, TOP + 30);

        figure.scaleToFit = true;
        figure.centerImage = true;
        figure.transparentBackground = true;
        add(figure, CENTER, CENTER - 10, PARENTSIZE + 60, PARENTSIZE + 60);

        add(title, CENTER, CENTER - 140);
        add(text, CENTER, CENTER + 100, PARENTSIZE + 60, PARENTSIZE + 20);

    }
}
