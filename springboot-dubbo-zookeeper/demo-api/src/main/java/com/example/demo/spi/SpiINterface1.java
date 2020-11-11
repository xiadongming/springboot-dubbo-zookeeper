package com.example.demo.spi;

import sun.security.provider.ConfigFile;

/**
 * @Author: xiadongming
 * @Date: 2020/11/4 21:39
 * @描述:
 */
public class SpiINterface1 implements SpiInterface {
    @Override
    public void exec() {
        System.out.println("===== SpiINterface1 =====");
    }
}
