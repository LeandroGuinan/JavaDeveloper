package it.com.gm.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//toda clase que sea de configuracion, debe tener la anotacion:
@Configuration
//de lo contrario no se reconocera como configuracion de spring

//se debe activar la seguridad web, con la anotacion:
@EnableWebSecurity
//para poder agregar los usuarios que vamos a utilizar
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    
    //este metodo nos permite personalizar los usuarios que tendran acceso a nuestra aplicacion(autenticacion)
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("admin").password("{noop}123").roles("ADMIN","USER").and().withUser("user").password("{noop}123").roles("USER");
    }
    
    //este metodo los usaremos para restringir las url's a las que los usuarios pueden
    //acceder dependiendo de su rol(autorizacion)
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //con esta llamada, hacemos que este restringido todos los path's que se accedan desde editar
        http.authorizeRequests().antMatchers("/editar/**","/agregar/**","/eliminar").hasRole("ADMIN").antMatchers("/").hasAnyRole("USER","ADMIN").and().formLogin().loginPage("/login").and().exceptionHandling().accessDeniedPage("/errores/403");
        //y tambien agregamos una pagina de login
        //ademas establecemos cual sera la pagina de error para esta esta autorizacion
    }
    
    

    
    
    
}
