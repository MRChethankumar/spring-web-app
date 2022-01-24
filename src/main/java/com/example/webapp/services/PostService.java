package com.example.webapp.services;

import java.util.List;

import com.example.webapp.models.Post;

public interface PostService {
	List<Post> getAllPost();
	Post savePost(Post post);
	Post getPostById(Integer post_id);
	Post updatePost(Post post);
	void deletePostById(Integer post_id);
	
}
