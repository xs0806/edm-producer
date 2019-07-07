package com.edm.utils;

import com.fasterxml.uuid.EthernetAddress;
import com.fasterxml.uuid.Generators;
import com.fasterxml.uuid.impl.TimeBasedGenerator;

public class KeyUtil {

    public static String generatorUUID(){
        TimeBasedGenerator generator = Generators.timeBasedGenerator(EthernetAddress.fromInterface());
        return generator.generate().toString();
    }

    public static void main(String[] args) {
        System.out.println(KeyUtil.generatorUUID());
        System.out.println(KeyUtil.generatorUUID());
        System.out.println(KeyUtil.generatorUUID());
    }
}
