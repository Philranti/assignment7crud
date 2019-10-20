package za.ac.cput.projects.assignment7crud.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
@EnableWebSecurity
public class SoccerGameSecurity extends WebSecurityConfigurerAdapter {

    private static final String USER_ROLE = "USER";
    private static final String ADMIN_ROLE = "ADMIN";

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{

                auth.inMemoryAuthentication()
                .passwordEncoder(NoOpPasswordEncoder.getInstance())
                .withUser("admin").password("admin")
                .roles("USER", "ADMIN");

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests()
                .antMatchers("/login", "/h2_console/**").permitAll()
                .antMatchers(HttpMethod.POST,"/soccer_game/**/create").hasRole(ADMIN_ROLE)
                .antMatchers(HttpMethod.GET,"/soccer/**/read").hasAnyRole(ADMIN_ROLE,USER_ROLE)
                .antMatchers(HttpMethod.PUT,"/soccer/**/update").hasRole(ADMIN_ROLE)
                .antMatchers(HttpMethod.DELETE,"/soccer/**/delete").hasRole(ADMIN_ROLE)
                .antMatchers(HttpMethod.GET,"/soccer/**/getall").hasRole(USER_ROLE)
                .antMatchers("/soccer/hello").hasRole(USER_ROLE)
                .antMatchers("/soccer", "/*player*/**")
               // .antMatchers("/")
                .access("hasRole('USER')").and().formLogin();

        http.csrf().disable();
        http.headers().frameOptions().disable();

    }

    @Bean
    public PasswordEncoder encoder(){
        return new BCryptPasswordEncoder();
    }


}