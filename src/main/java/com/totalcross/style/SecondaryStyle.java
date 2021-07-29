package com.totalcross.style;

import totalcross.io.IOException;
import totalcross.ui.image.Image;
import totalcross.ui.image.ImageException;

public class SecondaryStyle {
    public SecondaryStyle() {

    }

    public static Image logo, back;

    public static void loadImg() {
        try {
            logo = new Image("/img/Group7.png");
            back = new Image("/img/image3.png");
        } catch (IOException | ImageException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
