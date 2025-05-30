package example.cashcard;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
class SecurityConfig {

  @Bean
  SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http
      .authorizeHttpRequests(request -> request
        .requestMatchers("/cashcards/**")
        .hasRole("CARD-OWNER"))
      .httpBasic(Customizer.withDefaults())
      .csrf(csrf -> csrf.disable());

    return http.build();
  }

  @Bean
  UserDetailsService testOnlyUsers(PasswordEncoder passwordEncoder) {
    User.UserBuilder users = User.builder();

    UserDetails jowel = users
      .username("jowel")
      .password(passwordEncoder.encode("abc123"))
      .roles("CARD-OWNER")
      .build();

    UserDetails hankOwnsNoCards = users
      .username("hank-owns-no-cards")
      .password(passwordEncoder.encode("qrs456"))
      .roles("NON-OWNER")
      .build();

    UserDetails bocchi = users
      .username("bocchi")
      .password(passwordEncoder.encode("xyz789"))
      .roles("CARD-OWNER")
      .build();

    return new InMemoryUserDetailsManager(jowel, hankOwnsNoCards, bocchi);
  }

  @Bean
  PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }
}
