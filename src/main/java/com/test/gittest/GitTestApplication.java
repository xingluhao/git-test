package com.test.gittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestApplication {

    public static void main(String[] args) {
        System.out.println("git2");
        System.out.println("git3");
        System.out.println("git4 hot-fix");
        System.out.println("master test");
        SpringApplication.run(GitTestApplication.class, args);
    }

}
