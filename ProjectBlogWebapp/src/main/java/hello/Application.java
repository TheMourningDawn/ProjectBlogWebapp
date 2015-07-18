package hello;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	private PostRepository repository;
	@Autowired
	private HardwareItemRepository itemRepository;
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

	@Override
	public void run(String... args) throws Exception {
		repository.deleteAll();
		itemRepository.deleteAll();
		
		itemRepository.save(new ProjectHardwareItem("50mm Costume/Safety Goggles", Arrays.asList(new Link("Adafruit","http://www.adafruit.com/product/1577"),new Link("German Saftey Goggles","http://www.leevalley.com/us/wood/page.aspx?amp;cat=1%2C42207&amp;p=70788"))));
		itemRepository.save(new ProjectHardwareItem("2 x 16 LED NeoPixel Ring", Arrays.asList(new Link("Adafruit","http://www.adafruit.com/product/1463"))));
		

		// save a couple of Posts
		repository.save(new Post("A Little Intro", "", 1));
		repository.save(new Post("Neopixel Goggles", "They were cool, and then I lost them.", "img/goggles/IMG_20150415_211449721.jpg", 2));
		repository.save(new Post("Some Placeholder", "More text for space taking.", "img/goggles/IMG_20150414_184028121.jpg", "Jake the Dog", new Date(), 3));
	}
}
