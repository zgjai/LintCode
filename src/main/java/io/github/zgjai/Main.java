package io.github.zgjai;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangguijiang on 2018/8/29.
 */
public class Main {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        int count = 10000000;
        int str = 99999999;
        String finalStr = "";
        for (int i = 0; i<count; i++) {
            finalStr = String.valueOf(i);
        }
        System.out.println(System.currentTimeMillis() - time);

        time = System.currentTimeMillis();
        for (int i = 0; i<count; i++) {
            finalStr = Integer.toString(i);
        }
        System.out.println(System.currentTimeMillis() - time);

        time = System.currentTimeMillis();
        for (int i = 0; i<count; i++) {
            finalStr = i + "";
        }
        System.out.println(System.currentTimeMillis() - time);
        System.out.println(finalStr);
    }
}
