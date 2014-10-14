package net.eviera.tubecurator.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TubeEntry")
public class TubeEntry {

	@Id
	private Long id;

	@Column(name = "title")
	private String title;

	@Column(name = "comment")
	private String comment;

	@Column(name = "url")
	private String url;

	@Column(name = "creation_date")
	private Date creationDate;

	@Column(name = "tagcloud")
	private String tagCloud;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getTagCloud() {
		return tagCloud;
	}

	public void setTagCloud(String tagCloud) {
		this.tagCloud = tagCloud;
	}

	@Override
	public String toString() {
		return "TubeEntry [" + (id != null ? "id=" + id + ", " : "") + (title != null ? "title=" + title + ", " : "")
				+ (comment != null ? "comment=" + comment + ", " : "") + (url != null ? "url=" + url + ", " : "")
				+ (creationDate != null ? "creationDate=" + creationDate + ", " : "") + (tagCloud != null ? "tagCloud=" + tagCloud : "") + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((creationDate == null) ? 0 : creationDate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((tagCloud == null) ? 0 : tagCloud.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TubeEntry other = (TubeEntry) obj;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (creationDate == null) {
			if (other.creationDate != null)
				return false;
		} else if (!creationDate.equals(other.creationDate))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (tagCloud == null) {
			if (other.tagCloud != null)
				return false;
		} else if (!tagCloud.equals(other.tagCloud))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}

}
