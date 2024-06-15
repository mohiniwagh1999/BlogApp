package com.blog.payloads;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
public class CategoryDto {

	@Id
	private Integer categoryId;
	@NotBlank
	@Size(min=4 ,message="min 4 char")
	private String  categoryTitle;
	@NotBlank
	@Size(min=10,message="min 10 char")
	private String  categoryDescription;
	
	
	
}
