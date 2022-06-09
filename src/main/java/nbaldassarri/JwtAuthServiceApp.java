package nbaldassarri;

import java.util.ArrayList;
import java.util.Collections;

import lombok.RequiredArgsConstructor;
import nbaldassarri.model.Users;
import nbaldassarri.model.UserRoles;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import nbaldassarri.service.UserService;

@SpringBootApplication
@RequiredArgsConstructor
public class JwtAuthServiceApp {

  final UserService userService;

  public static void main(String[] args) {
    SpringApplication.run(JwtAuthServiceApp.class, args);
  }

  @Bean
  public ModelMapper modelMapper() {
    return new ModelMapper();
  }

}
