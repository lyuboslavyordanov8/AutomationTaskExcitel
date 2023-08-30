package utils;

import pages.BasePage;

public class GstNumberSet extends BasePage {
    public static double userGstNumber;
    public static GstNumberSet gstNumberSetInstance = null;

    public GstNumberSet() {

    }

    public static void setUserGstNumber(double number) {
        userGstNumber = number;
    }

    public static GstNumberSet getInstance() {
        if (gstNumberSetInstance == null) {
            gstNumberSetInstance = new GstNumberSet();
        }
        return gstNumberSetInstance;
    }

    public static double getUserGstNumber() {
        return userGstNumber;
    }
}
