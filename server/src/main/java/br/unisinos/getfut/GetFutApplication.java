package br.unisinos.getfut;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
public class GetFutApplication {

    private static final Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) {
        SpringApplication.run(GetFutApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner demo(JogadorRepository repository) {
//        return (args) -> {
//            // save a few customers
//            repository.save(new JogadorModel("Vinicius", ZonedDateTime.now().minusYears(21), "vinicius@gmail.com"));
//            repository.save(new JogadorModel("Miguel", ZonedDateTime.now().minusYears(20), "nathaliagmail.com"));
//
//            for (JogadorModel jogador : repository.findAll()) {
//                LOGGER.info(jogador.toString());
//            }
//        };
//    }
}
