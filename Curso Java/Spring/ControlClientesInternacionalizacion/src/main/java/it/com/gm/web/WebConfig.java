package it.com.gm.web;

import java.util.Locale;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

//para que la configuracion funcione se debe agregar la anotacion:
@Configuration
public class WebConfig implements WebMvcConfigurer{
    
    /*
    para crear un objeto local, se debe crear el bean:
    */
    @Bean
    public LocaleResolver localeResolver(){
        //creamos la session locale
        var slr = new SessionLocaleResolver();
        //establecemos el default:(es)
        slr.setDefaultLocale(new Locale("es"));
        return slr;
    }
    /*
    creamos el bean para dejar el alcance la variable para el cambio de idioma
    */
    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor(){
        //creamos la variable para locale change:
        var lci = new LocaleChangeInterceptor();
        //establecemos el nombre del parametro:
        lci.setParamName("lang");
        return lci;
    }
    
    //agregamos el metodo para registrar el interceptor de idioma
    @Override
    public void addInterceptors(InterceptorRegistry registro){
        registro.addInterceptor(localeChangeInterceptor());
    }
}
