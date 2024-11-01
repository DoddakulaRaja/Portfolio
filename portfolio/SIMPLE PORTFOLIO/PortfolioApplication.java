import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PortfolioApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortfolioApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Welcome to my portfolio website!";
    }

    @GetMapping("/projects")
    public String getProjects() {
        // Return a list of projects as JSON or HTML
        return "<h2>Projects</h2><ul><li>Project 1</li><li>Project 2</li></ul>";
    }
}
