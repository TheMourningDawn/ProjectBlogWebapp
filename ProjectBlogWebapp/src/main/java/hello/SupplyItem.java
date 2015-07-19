package hello;

import java.util.List;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SupplyItem {
	@Id
	private String id;
	
	private String description;
	private List<Link> links;
	
	public SupplyItem() {
		
	}
	
	public SupplyItem(String description, List<Link> links) {
		this.description = description;
		this.links = links;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}
	
	@Override
	public String toString() {
		return String.format(
				"Supply Item [id=%s, description='%s', links='%s']",
				id, description, links);
	}

}
