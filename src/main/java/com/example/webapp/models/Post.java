package com.example.webapp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="posts")
public class Post {
	

	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Post(String content, String caption) {
		super();
		this.content = content;
		this.caption = caption;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer post_id;
	
	@Column
	private String content;
	
	@Column
	private String caption;

	public Integer getPost_id() {
		return post_id;
	}

	public void setPost_id(Integer post_id) {
		this.post_id = post_id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}
	
	
}
