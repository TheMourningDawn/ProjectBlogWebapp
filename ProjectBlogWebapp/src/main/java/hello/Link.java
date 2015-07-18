package hello;

import org.springframework.data.annotation.Id;

public class Link {
	@Id
	private String id;

	private String description;
	private String linkAddress;
	
	public Link(String description, String linkAddress) {
		super();
		this.description = description;
		this.linkAddress = linkAddress;
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

	public void setDescrivption(String description) {
		this.description = description;
	}

	public String getLinkAddress() {
		return linkAddress;
	}

	public void setLinkAddress(String linkAddress) {
		this.linkAddress = linkAddress;
	}

}
