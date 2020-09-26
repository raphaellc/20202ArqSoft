package br.unisinos.getfut.app;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootConfiguration(proxyBeanMethods = false)
@EnableJpaRepositories(basePackages = "br.unisinos.getfut.repositorios")
@EntityScan(basePackages = "br.unisinos.getfut.modelo")
@EnableWebMvc
@EnableWebSecurity
public class DefaultConfiguration {
}
