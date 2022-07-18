package me.jake.securityjwttutorial;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncorderTest {

    @Test
    public void passwordEncorderTest() {

        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        String password = passwordEncoder.encode("admin");

        System.out.println(password);
    }
}
