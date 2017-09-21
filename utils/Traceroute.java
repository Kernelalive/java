package org.networking.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Traceroute {
    public static String traceIp(String command) {
        String tracerouteResult="";
        long start = System.currentTimeMillis();
        long end = start + 100;

        try {
            Process p = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));

            String s = "";
            // reading output stream of the command
            while ((System.currentTimeMillis() < end)) {
                s = inputStream.readLine();
                System.out.println(s);
                tracerouteResult += s;

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return tracerouteResult;
    }

}
