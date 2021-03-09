package it.com.gm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

//toda clase que sea de configuracion, debe tener la anotacion:
@Configuration
//de lo contrario no se reconocera como configuracion de spring

//se debe activar la seguridad web, con la anotacion:
@EnableWebSecurity
//para poder agregar los usuarios que vamos a utilizar

//y debemos extender de: ... para utilizar los metodos configure:
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    
    //inyectamos el uso de userDetailsServie: (la misma clase a la que llamamos el servicio en service)
    @Autowired
    private UserDetailsService userDetailsService;
    
    //creamos un bean para que pueda leer palabras encriptadas:
    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        //debe ser del mismo tipo que fue encriptada, de lo contrario no lo va a leer
        return new BCryptPasswordEncoder();
    }
    
    //inyectamos la configuracion global:
    @Autowired
    //con este comparamos los valores en memoria, con los valores ingresados, y los auntentifica:
    public void configurerGlobal(AuthenticationManagerBuilder build) throws Exception{
        //con este creamos el usuario creado haciendo uso de user...(clase cargada anteriormente) y el metodo
        //para leer las contraseñas:
        build.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
        
        //esta es toda la configuracion necesaria, solo si no esta creado el metodo configure, asignando las autorizaciones a cada rol.
    }

    //este metodo los usaremos para restringir las url's a las que los usuarios pueden
    //acceder dependiendo de su rol(autorizacion)
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //con esta llamada, hacemos que este restringido todos los path's que se accedan desde editar
        http.authorizeRequests().antMatchers("/editar/**", "/agregar/**", "/eliminar","/newUs/**").hasRole("ADMIN").antMatchers("/").hasAnyRole("USER", "ADMIN").and().formLogin().loginPage("/login").and().exceptionHandling().accessDeniedPage("/errores/403");
        //y tambien agregamos una pagina de login
        //ademas establecemos cual sera la pagina de error para esta esta autorizacion
    }

}
