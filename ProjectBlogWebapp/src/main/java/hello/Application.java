package hello;

import java.io.File;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.ObjectMapper;


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
		
		ObjectMapper mapper = new ObjectMapper();
		Post aPost = mapper.readValue(new File("src/main/resources/postJSON.json"), Post.class);
		
		// save a couple of Posts
		repository.save(new Post(1, "A Little Intro", ""));
		repository.save(aPost);
		repository.save(new Post(3, "Some Placeholder", "More text for space taking.", "img/goggles/IMG_20150414_184028121.jpg", "Jake the Dog", new Date()));
	}
}
