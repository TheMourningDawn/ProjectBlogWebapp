package infinity.blog.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Post {
	@Id
	private String id;
	private int postNumber;

	private String title;
	private String subTitle;
	private String headerImagePath;
	private String postedBy;
	private Date postDate;

	private Link guideLink;
	
	@JsonUnwrapped
	private List<SupplyItem> supplies;
	
	private List<Link> furtherReading;

	public Post() {
	}

	//TODO: Oh, god, why? Dedup plz
	public Post(int postNumber, String title, String subTitle) {
		this.title = title;
		this.subTitle = subTitle;
		this.postedBy = "Anon";
		this.postDate = new Date();
		this.headerImagePath = "img/defaultHeaderBackground.jpg";
		this.postNumber = postNumber;
	}

	public Post(int postNumber, String title, String subTitle, String headerImagePath) {
		this.title = title;
		this.subTitle = subTitle;
		this.postedBy = "Anon";
		this.postDate = new Date();
		this.headerImagePath = headerImagePath;
		this.postNumber = postNumber;
	}

	public Post(int postNumber, String title, String subTitle, String headerImagePath, String postedBy, Date postDate) {
		this.title = title;
		this.subTitle = subTitle;
		this.postedBy = postedBy;
		this.postDate = postDate;
		this.headerImagePath = headerImagePath;
		this.postNumber = postNumber;
	}

	public Post(int postNumber, String title, String subTitle, String headerImagePath, Link guideLink,
			List<SupplyItem> supplies, List<Link> furtherReading, String postedBy, Date postDate) {
		this.title = title;
		this.subTitle = subTitle;
		this.postedBy = postedBy;
		this.postDate = postDate;
		this.headerImagePath = headerImagePath;
		this.postNumber = postNumber;
		this.guideLink = guideLink;
		this.supplies = supplies;
		this.furtherReading = furtherReading;
	}

	public int getPostNumber() {
		return postNumber;
	}

	public void setPostNumber(int postNumber) {
		this.postNumber = postNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHeaderImagePath() {
		return headerImagePath;
	}

	public void setHeaderImagePath(String headerImagePath) {
		this.headerImagePath = headerImagePath;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public String getPostedBy() {
		return postedBy;
	}

	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}

	public Date getPostDate() {
		return postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}

	public Link getGuideLink() {
		return guideLink;
	}

	public void setGuideLink(Link guideLink) {
		this.guideLink = guideLink;
	}

	public List<SupplyItem> getSupplies() {
		return supplies;
	}

	public void setSupplies(List<SupplyItem> supplies) {
		this.supplies = supplies;
	}

	public List<Link> getFurtherReading() {
		return furtherReading;
	}

	public void setFurtherReading(List<Link> furtherReading) {
		this.furtherReading = furtherReading;
	}
	
	@Override
	public String toString() {
		return String.format(
				"Post[id=%s, postNumber='%s', title='%s', subTitle='%s', guideLink='%s', supplies='%s', furtherReading='%s']",
				id, postNumber, title, subTitle, guideLink, supplies, furtherReading);
	}

}
