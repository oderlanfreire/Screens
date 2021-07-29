package com.totalcross;

import totalcross.ui.MainWindow;
import com.totalcross.screens.Primary;
import totalcross.sys.Settings;

public class App extends MainWindow {

    public App() {
        setUIStyle(Settings.MATERIAL_UI);
    }

    @Override
    public void initUI() {
        Primary pr = new Primary();
        pr.popupNonBlocking();
    }

    static {
        Settings.applicationId = "TTCS";
        Settings.appVersion = "1.0.0";
        Settings.iosCFBundleIdentifier = "com.totalcross";
    }
}
