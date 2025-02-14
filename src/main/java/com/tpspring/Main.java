package com.tpspring;

import com.tpspring.configuration.AppConfig;
import com.tpspring.services.AnnonceService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        AnnonceService annonceService = context.getBean(AnnonceService.class);

        annonceService.getAllAnnonces().forEach(System.out::println);

        context.close();

    }
}

