package hello;

import java.util.Date;

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
		repository.save(new Post("A Little Intro", "", 1));
		repository.save(new Post("Neopixel Goggles", "They were cool, and then I lost them.", "img/goggles/IMG_20150415_211449721.jpg", 2));
		repository.save(new Post("Some Placeholder", "More text for space taking.", "img/goggles/IMG_20150414_184028121.jpg", "Jake the Dog", new Date(), 3));
	}
}
