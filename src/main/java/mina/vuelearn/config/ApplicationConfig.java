package mina.vuelearn.config;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;

import javax.servlet.MultipartConfigElement;

@Configuration
public class ApplicationConfig {

    /*
    * 配置文件上传大小
    * */
    @Bean
    public MultipartConfigElement multipartConfigElement() {
        /*
        * 或者配置文件中
        * spring.servlet.multipart.max-file-size=128KB
          spring.servlet.multipart.max-request-size=128KB
        * */
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setMaxFileSize(DataSize.ofMegabytes(10));//MB
        factory.setMaxRequestSize(DataSize.ofMegabytes(1000));/*1000MB*/
        return factory.createMultipartConfig();
    }
}
