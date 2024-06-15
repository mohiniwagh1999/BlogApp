package com.blog.services;

import java.util.List;

import com.blog.entity.Post;
import com.blog.payloads.PostDto;
import com.blog.payloads.PostResponse;

public interface PostService {

	
	//create
   PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);	
   
   //update
   PostDto updatePost(PostDto postDto,Integer postId);	
   
   //delete
  public  void deletePost(Integer postId);	
   
   //get all posts
   PostResponse getAllPost(Integer pageNumber,Integer pageSize, String sortBy,String sortDir);
	
	//get single post
   PostDto getPostById(Integer postId);
   
   //get all post by category
   List<PostDto> getPostByCategory(Integer categoryId);
   
//   //get all post by user
  List<PostDto> getPostsByUser(Integer userId);
   
   //search post
   List<PostDto> searchPosts(String keyword);
   
   
}