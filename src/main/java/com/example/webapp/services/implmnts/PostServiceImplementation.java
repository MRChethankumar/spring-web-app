package com.example.webapp.services.implmnts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.webapp.models.Post;
import com.example.webapp.repositories.PostRepository;
import com.example.webapp.services.PostService;

@Service
public class PostServiceImplementation implements PostService {
	
	private PostRepository postRepository;

	public PostServiceImplementation(PostRepository postRepository) {
		super();
		this.postRepository = postRepository;
	}

	@Override
	public List<Post> getAllPost() {
		// TODO Auto-generated method stub
		return postRepository.findAll();
	}
	
	@Override
	public Post savePost(Post post) {
		return postRepository.save(post);
	}

	@Override
	public Post getPostById(Integer post_id) {
		return postRepository.findById(post_id).get();
	}

	@Override
	public Post updatePost(Post post) {
		// TODO Auto-generated method stub
		return postRepository.save(post);
	}

	@Override
	public void deletePostById(Integer post_id) {
		// TODO Auto-generated method stub
		postRepository.deleteById(post_id);
	}

}
