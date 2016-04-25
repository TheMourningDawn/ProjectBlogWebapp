package infinity.blog.entities;

import java.util.List;

import org.bson.types.ObjectId;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SupplyItem {
	private String id;
	
	private String description;
	private List<Link> links;
	
	public SupplyItem() {
		this.id = ObjectId.get().toString();
	}
	
	public SupplyItem(String description, List<Link> links) {
		System.out.println("======It's constructing. I can get a mongo id: " + ObjectId.get().toHexString());
		this.id = ObjectId.get().toHexString();
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
