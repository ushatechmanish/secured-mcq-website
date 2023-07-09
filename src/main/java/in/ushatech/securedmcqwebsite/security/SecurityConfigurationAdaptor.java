package in.ushatech.securedmcqwebsite.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
public class SecurityConfigurationAdaptor extends WebSecurityConfigurerAdapter
{
    @Deprecated
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user")
                .password("{noop}pa55w0rd")
                .roles("USER");
    }

    protected void configure(HttpSecurity http) throws Exception
    {
//        http.authorizeRequests().antMatchers("*/**").permitAll();
        http.authorizeRequests().antMatchers("/").permitAll().anyRequest().authenticated();
    }
}
