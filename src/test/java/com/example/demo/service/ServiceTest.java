package com.example.demo.service;

import org.junit.jupiter.api.Test;
import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.vm.VM;

public class ServiceTest {

    @Test
    void TestBit() {
        boolean[] bits = new boolean[1024];
        System.out.println(ClassLayout.parseInstance(bits).toPrintable());
        System.out.println(VM.current().details());
    }
}
