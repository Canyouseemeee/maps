package com.app.maps;

import com.adedom.library.Dru;

import java.sql.Connection;

public class ConnectDB {
    public static String Base_URL = "192.168.1.41";
//    public static String Base_IMAGE = "http://" + Base_URL + "/basic-android/images/";

    public static Connection getConnection() {
        return Dru.connection(Base_URL, "Bank", "1234", "cs");
    }
}
