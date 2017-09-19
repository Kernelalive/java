package org.networking.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ping {
    public static String pingIp(String command) {
        String pingResult="";

        try {
            Process p = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));

            String s = "";
            // reading output stream of the command
            while ((s = inputStream.readLine()) != null) {
                System.out.println(s);
                pingResult += s;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return pingResult;
    }

}
