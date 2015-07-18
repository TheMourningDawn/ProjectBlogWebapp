package hello;

import java.util.Date;
import org.springframework.data.annotation.Id;

public class Post {
	@Id
	private String id;
	private int postNumber;
	
	private String title;
	private String subTitle;
	private String headerImagePath;
	private String postedBy;
	private Date postDate;
	
	public Post() {}
	
	public Post(String title, String subTitle) {
		this.title = title;
		this.subTitle = subTitle;
		this.postedBy = "Anon";
		this.postDate = new Date();
		this.headerImagePath = "img/defaultHeaderBackground.jpg";
	}
	
	public Post(String title, String subTitle, int postNumber) {
		this.title = title;
		this.subTitle = subTitle;
		this.postedBy = "Anon";
		this.postDate = new Date();
		this.headerImagePath = "img/defaultHeaderBackground.jpg";
		this.postNumber = postNumber;
	}
	
	public Post(String title, String subTitle, String headerImagePath) {
		this.title = title;
		this.subTitle = subTitle;
		this.postedBy = "Anon";
		this.postDate = new Date();
		this.headerImagePath = headerImagePath;
	}
	
	public Post(String title, String subTitle, String headerImagePath, int postNumber) {
		this.title = title;
		this.subTitle = subTitle;
		this.postedBy = "Anon";
		this.postDate = new Date();
		this.headerImagePath = headerImagePath;
		this.postNumber = postNumber;
	}
	
	public Post(String title,String subTitle, String headerImagePath, String postedBy, Date postDate){
		this.title = title;
		this.subTitle = subTitle;
		this.postedBy = postedBy;
		this.postDate = postDate;
		this.headerImagePath = headerImagePath;
	}
	
	public Post(String title,String subTitle, String headerImagePath, String postedBy, Date postDate, int postNumber){
		this.title = title;
		this.subTitle = subTitle;
		this.postedBy = postedBy;
		this.postDate = postDate;
		this.headerImagePath = headerImagePath;
		this.postNumber = postNumber;
	}
	
	 public int getPostNumber() {
		return postNumber;
	}

	public void setPostNumber(int postNumber) {
		this.postNumber = postNumber;
	}

	@Override
	    public String toString() {
	        return String.format(
	                "Post[id=%s, title='%s', subTitle='%s', postNumber='%s']",
	                id, title, subTitle, postNumber);
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

}
