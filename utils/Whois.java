package org.networking.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Whois {
    public static String whoisIp(String command) {
        String whoisResult = "";
        try {
            Process p = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));

            String s = "";
            // reading output stream of the command
            while ((s = inputStream.readLine()) != null) {
                System.out.println(s);
                whoisResult += s;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return whoisResult;
    }

}
