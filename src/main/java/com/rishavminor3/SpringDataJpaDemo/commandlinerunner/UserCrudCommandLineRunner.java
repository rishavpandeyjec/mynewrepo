package com.rishavminor3.SpringDataJpaDemo.commandlinerunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserCrudCommandLineRunner  implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        System.out.println("Hello aba....");
    }
}
