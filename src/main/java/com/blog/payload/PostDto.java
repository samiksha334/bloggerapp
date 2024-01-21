package com.blog.payload;

//import jakarta.validation.constraints.NotEmpty;
//import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {
    private long id;
    @NotEmpty
    @Size(min=2,message = "Title should be atleast two character")
    private String title;
    @NotEmpty
    @Size(min=2,message = "Description should be atleast 4 character")
    private String description;
    @NotEmpty
    @Size(min=2,message = "Description should be atleast 4 character")
    private String content;

}
