package hello;

import java.io.File;
import java.util.Arrays;
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
	@Autowired
	private SupplyItemRepository itemRepository;
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

	@Override
	public void run(String... args) throws Exception {
		repository.deleteAll();
		itemRepository.deleteAll();
		
		ObjectMapper mapper = new ObjectMapper();
		Post aPost = mapper.readValue(new File("src/main/resources/postJSON.json"), Post.class);
		
		System.out.println(aPost);
		
		itemRepository.save(new SupplyItem("50mm Costume/Safety Goggles", Arrays.asList(new Link("Adafruit","http://www.adafruit.com/product/1577"),new Link("German Saftey Goggles","http://www.leevalley.com/us/wood/page.aspx?amp;cat=1%2C42207&amp;p=70788"))));
		itemRepository.save(new SupplyItem("2 x 16 LED NeoPixel Ring", Arrays.asList(new Link("Adafruit","http://www.adafruit.com/product/1463"))));
		

		// save a couple of Posts
		repository.save(new Post(1, "A Little Intro", ""));
		repository.save(new Post(2, "Neopixel Goggles", "They were cool, and then I lost them.", "img/goggles/IMG_20150415_211449721.jpg"));
		repository.save(new Post(3, "Some Placeholder", "More text for space taking.", "img/goggles/IMG_20150414_184028121.jpg", "Jake the Dog", new Date()));
	}
}
