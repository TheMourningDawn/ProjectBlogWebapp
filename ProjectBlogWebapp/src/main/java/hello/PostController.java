package hello;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PostController {
	@Autowired
	private PostRepository posts;
	@Autowired
	private SupplyItemRepository supplies;
    
    @RequestMapping("/index")
    public String index(Model model) {
    	Map<String, Object> modelMap = new HashMap<String, Object>();
    	modelMap.put("posts", posts.findAll());
    	model.addAllAttributes(modelMap);
        return "index";
    }
    
    @RequestMapping("/post")
    public String post(@RequestParam(value="id", required=false) String id,  Model model) {
    	System.out.println(posts.findById(id));
    	model.addAttribute("post", posts.findById(id));
    	model.addAttribute("supplies", supplies.findAll());
        return "post";
    }
    
    @RequestMapping("/testPost") 
    public String testPost(@RequestParam(value="id", required=false) String id,  Model model) {
    	return "post";
    }
    
    @RequestMapping("/about")
    public String about() {
        return "about";
    }
    
//    @RequestMapping("/contact")
//    public String contact() {
//        return "contact";
//    }

}
