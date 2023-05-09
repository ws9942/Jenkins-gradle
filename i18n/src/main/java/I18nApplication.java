import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.explme")
public class I18nApplication {

    public static void main(String[] args) {
        SpringApplication.run(I18nApplication.class,args);
    }
}
