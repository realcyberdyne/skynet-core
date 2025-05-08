package com.cyberdyne.skynet;

import com.cyberdyne.skynet.Services.Config.Config;
import com.cyberdyne.skynet.Services.VPN.Functions.EncVPNCore;
import com.cyberdyne.skynet.Services.VPN.Functions.Proxy;
import com.cyberdyne.skynet.Services.VPN.Functions.VPNCore;

public class App
{
    public static void main( String[] args ) throws Exception
    {

        //Get config from file
        new Config();

        //Get begin tunnel
        new EncVPNCore(8085,"reza");

    }
}

