package com.tsb.transaction.controllerImpl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tsb.transaction.controller.TransactionController;
import com.tsb.transaction.dto.transactiondto.LinkedAccount;
import com.tsb.transaction.service.TransactionServiceImpl.AuthServiceImpl;
import com.tsb.transaction.service.TransactionServiceImpl.TransactionServiceImpl;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.reactive.function.client.WebClient;

import java.io.IOException;
import java.util.ArrayList;

@SpringBootTest()
@ExtendWith(SpringExtension.class)
@TestPropertySource(locations = "classpath:application-test.properties")
public class TransactionControllerTest {

  //  public static MockWebServer mockBackEnd;
    public static ObjectMapper objectMapper;
    @Autowired
    TransactionServiceImpl transactionService;
    @Mock
    private WebClient webClient;
    @InjectMocks
    private TransactionController transactionController;

//    @BeforeAll
//    static void setUp() throws IOException {
//        mockBackEnd = new MockWebServer();
//        objectMapper = new ObjectMapper();
//        mockBackEnd.start(8080);
//
//    }
//
//    @AfterAll
//    static void tearDown() throws IOException {
//        mockBackEnd.shutdown();
//    }

    @BeforeEach
    void initialize() {
        transactionController = new TransactionController(transactionService);
        transactionService = new TransactionServiceImpl(new AuthServiceImpl(), webClient);
    }

    @Test
    void getTransaction_test() throws JsonProcessingException, InterruptedException {

    }
}
