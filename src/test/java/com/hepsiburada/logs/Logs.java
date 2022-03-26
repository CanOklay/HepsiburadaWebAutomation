package com.hepsiburada.logs;

import org.apache.log4j.PropertyConfigurator;

/**
 * Created by Fatih Can Oklay
 * Date: 26.03.2022
 */

public class Logs {

    public Logs() {
        PropertyConfigurator
                .configure(Logs.class.getClassLoader().getResource("log4j.properties"));
    }
}
