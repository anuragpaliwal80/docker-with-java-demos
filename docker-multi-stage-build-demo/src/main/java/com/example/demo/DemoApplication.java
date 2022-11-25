package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	// public static void main(String[] args) {
	// 	SpringApplication.run(DemoApplication.class, args);
	// }

	public static void main(String []args) {
        for(int x = 0; x < 1000; x = x+1) {
            try {
                Thread.sleep(1000);
                DemoApplication.sayhello(x);
            } catch (Exception e) {
                System.out.println("Got an exception!" + e);
            }
        }
    }

    public static void sayhello(int num) throws Exception {
        try {
            num = getnum(num);
            String s=String.valueOf(num);

            System.out.println(s + ". Hello World");
        } catch (Exception e) { 
            throw e;
        }
    }

    public static int getnum(int num) {
        return num;
    }
}
