package org.networking.utils;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Nmap {
    public static String nmapIp(String command) {
        String nmapResult="";

        try {
            Process p = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));

            String s = "";
            // reading output stream of the command
            while ((s = inputStream.readLine()) != null) {
                System.out.println(s);
                nmapResult += s;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return nmapResult;
    }
}
