package org.networking.controller;

import org.networking.utils.*;
import java.net.*;
import java.util.*;
import java.util.function.Function;
import java.util.logging.Logger;
import java.io.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Controller {

    private static final Logger logger = Logger.getLogger(Controller.class.getName());
    private static final String FILENAME = "~/filename.txt";

    public static void main(String[] args) {



        List<String> commands = new ArrayList<>();
        commands.addAll(Arrays.asList("Dig", "Host", "NsLookUp", "TraceRoute", "Whois", "Ping"));
        Map<Integer,String> map =
                IntStream.range(0,commands.size())
                        .boxed()
                        .collect(Collectors.toMap (i -> i, i -> commands.get(i)));
        //map.forEach((x, y) -> System.out.println("Key: " + x +", value: "+ y));

        String ip = "ubitech.eu";
       // Scanner reader = new Scanner(System.in);
        System.out.println("Select Command from the list " + map);
        System.out.println("Default Ip is : " + ip);


        //Dig.digIp("dig " + ip);
        System.out.println(Dig.digIp("dig " + ip) + "\n");
        //Host.hostIp("host " + ip);
        System.out.println(Host.hostIp("host " + ip)+ "\n");
        //NsLookUp.nsLookUpIp("nslookup " + ip);
        System.out.println(NsLookUp.nsLookUpIp("nslookup " + ip)+ "\n");
        //Traceroute.traceIp("traceroute " + ip);
        System.out.println(Traceroute.traceIp("traceroute " + ip)+ "\n");
        //Whois.whoisIp("whois " + ip);
        System.out.println(Whois.whoisIp("whois " + ip)+ "\n");
        //Ping.pingIp("ping -c1 " + ip);
        System.out.println(Ping.pingIp("ping -c1 " + ip) + "\n");
        Nmap.nmapIp("nmap -sT " + ip);





    }

}

