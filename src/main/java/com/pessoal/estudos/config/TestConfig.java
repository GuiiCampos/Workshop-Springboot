package com.pessoal.estudos.config;

import com.pessoal.estudos.entities.Order;
import com.pessoal.estudos.entities.User;
import com.pessoal.estudos.repositories.OrderRepository;
import com.pessoal.estudos.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
        User u3 = new User(null, "Gui", "guiC@gmail.com", "99999999999", "123456");
        User u4 = new User(null, "Marilene", "marilene@gmail.com", "966666666666", "123456");


        Order o1 = new Order(null, Instant.parse("2019-07-20T19:53:07Z"), u1);
        Order o2 = new Order(null, Instant.parse("2019-06-21T03:42:10Z"), u2);
        Order o3 = new Order(null, Instant.parse("2019-06-22T15:21:22Z"), u1);

        userRepository.saveAll(Arrays.asList(u1, u2, u3, u4));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }

}
