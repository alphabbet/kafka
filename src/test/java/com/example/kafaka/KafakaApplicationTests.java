package com.example.kafaka;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class KafakaApplicationTests {

    @Autowired
    private KafkaSender<Message> kafkaSender;


}
