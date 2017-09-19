package org.networking.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Host {
    public static String hostIp(String command) {
        String hostResult = "";

        try {
            Process p = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));

            String s = "";
            // reading output stream of the command
            while ((s = inputStream.readLine()) != null) {
                System.out.println(s);
                hostResult += s;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return hostResult;
    }


}
