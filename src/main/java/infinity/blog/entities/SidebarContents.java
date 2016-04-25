package infinity.blog.entities;

import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;

public class SidebarContents {
	@Id
	private String id;
	private int postNumber;
	
	private String guide;
	private Map<String, List<String>> supplies;
	private Map<String,String> furtherReadings;
	
	public SidebarContents(int postNumber, String guide, Map<String, List<String>> supplies, Map<String, String> furtherReadings) {
		this.postNumber = postNumber;
		this.guide = guide;
		this.supplies = supplies;
		this.furtherReadings = furtherReadings;
	}

	public String getGuide() {
		return guide;
	}

	public void setGuide(String guide) {
		this.guide = guide;
	}

	public Map<String, List<String>> getSupplies() {
		return supplies;
	}

	public void setSupplies(Map<String, List<String>> supplies) {
		this.supplies = supplies;
	}

	public Map<String, String> getFurtherReadings() {
		return furtherReadings;
	}

	public void setFurtherReadings(Map<String, String> furtherReadings) {
		this.furtherReadings = furtherReadings;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPostNumber() {
		return postNumber;
	}

	public void setPostNumber(int postNumber) {
		this.postNumber = postNumber;
	}
}
