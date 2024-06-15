package com.blog.payloads;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class UserDto {
	    
		private int id;
		@NotEmpty
		@Size(min=4,message="username must be min 4 character")
		private String name;
		@Email(message="email addressis not valid")
		private  String email;
		@NotEmpty
		@Size(min=4,max=10,message="password  must be min 3 chars and max 10 character")
		@Pattern(regexp="")
		private String password;
		@NotEmpty
		private String about;

}
