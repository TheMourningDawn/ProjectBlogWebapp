package hello;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PostController {
	@Autowired
	private PostRepository posts;

	@RequestMapping("/index")
	public String index(Model model) {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("posts", posts.findAll());
		model.addAllAttributes(modelMap);
		return "index";
	}

	@RequestMapping("/post")
    public String post(@RequestParam(value="id", required=false) String id,  Model model, HttpServletRequest request) {
		List<String> imageNames = new ArrayList<String>();
    	String post = request.getSession().getServletContext().getRealPath("/img/goggles");
    	File imagePath = new File(post);
    	if(imagePath.exists() && imagePath.isDirectory()) {
            FilenameFilter fileNameFilter = new FilenameFilter() {
               @Override
               public boolean accept(File dir, String name) {
                  if(name.lastIndexOf('.')>0) {
                     int lastIndex = name.lastIndexOf('.');
                     String str = name.substring(lastIndex);
                     if(str.equals(".jpg")) {
                        return true;
                     }
                  }
                  return false;
               }
            };
    		for(String image : imagePath.list(fileNameFilter)) {
    			imageNames.add(image);
    		}
    	}
    	System.out.println(post);
    	model.addAttribute("post", posts.findById(id));
    	model.addAttribute("images", imageNames);
        return "post";
    }

	@RequestMapping("/testPost")
	public String testPost(@RequestParam(value = "id", required = false) String id, Model model) {
		return "post";
	}

	@RequestMapping("/about")
	public String about() {
		return "about";
	}

	// @RequestMapping("/contact")
	// public String contact() {
	// return "contact";
	// }

}
