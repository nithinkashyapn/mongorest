package code.nithin;

import code.nithin.entity.Asset;
import code.nithin.repository.AssetRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = EmbeddedMongoAutoConfiguration.class)
@ComponentScan({"code.nithin"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner init(AssetRepository assetRepository){
        return (args) -> {
            Asset test = new Asset(1, "https://example.com");
            System.out.println(assetRepository.save(test).getId());
        };
    }
}