package incorporated.az.recruitme.Web;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                //.antMatchers("/css/**", "/index").permitAll()
//                .antMatchers("/**").hasRole("USER")
//                .antMatchers("/public/**").permitAll()
//                .and()
//                .formLogin()
//                .loginPage("/login").failureUrl("/login-error");
//    }

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//        http
//                .authorizeRequests()
//                .antMatchers("/**").hasRole("USER")
//        .and()
//                .formLogin()
//                .loginPage("/login").failureUrl("/login-error")
//                .permitAll()
//                ;
//    }
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth
//                .inMemoryAuthentication()
//                .withUser("user").password("password").roles("USER");
//    }

    @Bean
    public UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();

        manager.createUser(User.withDefaultPasswordEncoder()
                .username("user")
                .password("user")
                .roles("USER")
                .build()
        );

        //manager.createUser(User.withUsername("user").password("password")
        //        .roles("USER").build());
        return manager;
    }
}
