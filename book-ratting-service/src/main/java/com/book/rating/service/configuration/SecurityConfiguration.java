package com.book.rating.service.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

/**
 * @author vikas.bhardwaj3
 * 2/11/202010:46 PM2020
 */
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {


    @Autowired
    DataSource dataSource;

    @Autowired
    UserDetailsService userDetailsService;

  /*   in memeory Authentication
  @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("vikas")
                .password("vikas")
                .roles("USER")
                .and()
                .withUser("blah")
                .password("{noop}blah")
                .roles("ADMIN");
    }*/

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService);
        // auth.jdbcAuthentication().dataSource(dataSource);
             /*  This is used if scema is diff we can pass query to get
              .usersByUsernameQuery("select username,password,enabled " + "from users")
                .authoritiesByUsernameQuery(("select username,authority " + "from authorities"
                        + "where username =? "
                ));*/

              /*  .withDefaultSchema()
                .withUser(   //This is for default scema
                        User.withUsername("Admin")
                                .password("{noop}Password")
                                .roles("ADMIN")
                );*/
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/swagger-ui.html","/v2/api-docs","/swagger-resources/**").permitAll()
                .antMatchers("/rating/createRatings").hasRole("ADMIN")
                .antMatchers("/{ratingId}").hasRole("USER")
                .antMatchers("/ratingList").hasRole("ADMIN")
                .antMatchers("/").permitAll()
                .and().formLogin();
    }

    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

}
