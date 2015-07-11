package hello;

import java.util.Date;
import org.springframework.data.annotation.Id;

public class Post {
	@Id
	private String id;
	
	private String title;
	private String subTitle;
	private String headerImagePath;
	public String getHeaderImagePath() {
		return headerImagePath;
	}

	public void setHeaderImagePath(String headerImagePath) {
		this.headerImagePath = headerImagePath;
	}

	private String postedBy;
	private Date postDate;
	
	//Not even so sure I want to do this? If i want to write the html myself,
	//I might end up doing something stupid like using fragments and accociating an id...
	//private SOMEMARKUPEXCAPEDTYPE body
	
	public Post() {}
	
	public Post(String title, String subTitle) {
		this.title = title;
		this.subTitle = subTitle;
		this.postedBy = "Anon";
		this.postDate = new Date();
		this.headerImagePath = "img/defaultHeaderBackground.jpg";
	}
	
	public Post(String title, String subTitle, String headerImagePath) {
		this.title = title;
		this.subTitle = subTitle;
		this.postedBy = "Anon";
		this.postDate = new Date();
		this.headerImagePath = headerImagePath;
	}
	
	public Post(String title,String subTitle, String headerImagePath, String postedBy, Date postDate){
		this.title = title;
		this.subTitle = subTitle;
		this.postedBy = postedBy;
		this.postDate = postDate;
		this.headerImagePath = headerImagePath;
	}
	
	 @Override
	    public String toString() {
	        return String.format(
	                "Post[id=%s, title='%s', subTitle='%s']",
	                id, title, subTitle);
	    }

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
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
