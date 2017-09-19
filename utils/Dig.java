package org.networking.utils;

import javax.xml.crypto.Data;
import java.io.*;

public class Dig {


        public static String digIp(String command){

            String digResult = "";


            try {

               Process p = Runtime.getRuntime().exec(command);
                p.waitFor();
                BufferedReader inputStream = new BufferedReader(
                        new InputStreamReader(p.getInputStream()));

                String s = "";
                while ((s = inputStream.readLine()) != null) {
                    //System.out.println(s);
                    digResult += s;

                }

            } catch (Exception e) {
                e.printStackTrace();
            }
            return digResult;
        }

    }

