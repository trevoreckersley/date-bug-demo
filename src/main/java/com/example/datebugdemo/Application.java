package com.example.datebugdemo;

import com.example.datebugdemo.repository.EntityWithLocalDateRepository;
import com.example.datebugdemo.repository.EntityWithLocalDateTimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.ZoneOffset;
import java.util.TimeZone;

@SpringBootApplication
public class Application implements CommandLineRunner {

  @Autowired
  private EntityWithLocalDateRepository entityWithLocalDateRepository;

  @Autowired
  private EntityWithLocalDateTimeRepository entityWithLocalDateTimeRepository;

  public static void main(String[] args) {
    TimeZone.setDefault(TimeZone.getTimeZone(ZoneOffset.UTC));
    SpringApplication.run(Application.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    System.out.println("Getting values with LocalDateTime:");
    entityWithLocalDateTimeRepository.findAll().forEach(System.out::println);

    System.out.println();
    System.out.println("Getting values with LocalDate:");
    entityWithLocalDateRepository.findAll().forEach(System.out::println);
  }

}
