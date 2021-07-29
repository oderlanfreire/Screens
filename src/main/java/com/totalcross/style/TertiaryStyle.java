package com.totalcross.style;

import totalcross.io.IOException;
import totalcross.ui.Window;
import totalcross.ui.image.Image;
import totalcross.ui.image.ImageException;

public class TertiaryStyle extends Window {
    public static Image logo, figure, icon1, icon2, icon3, icon4, icon5;

    public TertiaryStyle() {

    }

    public static void loadImg() {
        try {
            logo = new Image("/img/Group7.png");
            figure = new Image("/img/image4.png");
        } catch (IOException | ImageException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
