package com.blog.payloads;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import com.blog.entity.Category;
import com.blog.entity.Comment;
import com.blog.entity.User;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {
	private Integer postId;
	private String title;
	private String content;
	
	private String imageName;

	private Date addedDate;
	

	private CategoryDto category;
	
	private UserDto user;
	
	private Set<CommentDto> comments=new HashSet();
	

}
