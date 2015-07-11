package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	private PostRepository repository;
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

	@Override
	public void run(String... args) throws Exception {
		repository.deleteAll();

		// save a couple of Posts
		repository.save(new Post("A Little Intro", "Why the lights? Don't you do anything else?"));
		repository.save(new Post("Neopixel Goggles", "They were cool, and then I lost them."));

	}
}
