package com.totalcross.style;

import totalcross.io.IOException;
import totalcross.ui.image.Image;
import totalcross.ui.image.ImageException;

public class PrimaryStyle {
    public static Image back, logo;

    public PrimaryStyle() {

    }

    public static void loadImg() {
        try {
            back = new Image("/img/image2.png");
            logo = new Image("/img/Group7.png");
        } catch (IOException | ImageException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
