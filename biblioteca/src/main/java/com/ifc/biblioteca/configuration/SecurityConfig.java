package com.ifc.biblioteca.configuration;
// package com.ifc.biblioteca.config;

// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

// @Configuration
// @EnableWebSecurity
// public class SecurityConfig extends WebSecurityConfigurerAdapter {

//     @Override
//     protected void configure(HttpSecurity http) throws Exception {
//         http
//             .authorizeRequests()
//             .antMatchers("/", "/login", "/cadastro").permitAll()
//             .anyRequest().authenticated()
//             .and()
//             .formLogin()
//             .loginPage("/login")
//             .defaultSuccessUrl("/", true)
//             .permitAll()
//             .and()
//             .logout()
//             .permitAll();
//     }
// }