package it.academy.exam7.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("admin").password("{noop}12345").roles("ADMIN").and()
                .withUser("user").password("{noop}user12345").roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().and().authorizeRequests()
                .antMatchers(HttpMethod.POST, "/student/").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE,"/student/delete/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.GET,"/student/get/**").permitAll()
                .antMatchers(HttpMethod.POST, "/student/find").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST, "/course").hasAnyRole("ADMIN", "USER")
                .and().csrf().disable().headers().frameOptions().disable();
    }
}