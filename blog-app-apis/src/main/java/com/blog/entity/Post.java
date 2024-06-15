package com.blog.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="post")

@Setter
@Getter
@NoArgsConstructor
public class Post {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer postId;
@Column(name="post_title", length=100 ,nullable=false)
private String title;
@Column(length=1000)
private String content;
private String imageName;

private Date addedDate;

@ManyToOne
@JoinColumn(name="category_id")
private Category category;
@ManyToOne
private User user;

@OneToMany(mappedBy="post" )
private Set<Comment> comments=new HashSet<>();



	
	
	
	

}
