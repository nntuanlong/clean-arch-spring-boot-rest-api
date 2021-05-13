package com.nntuanlong.adapters.controllers.createuser;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class CreateUserRequest {
    @NotBlank
    @Email
    private String email;
    @Size(max = 255)
    private String name;
    @Pattern(regexp = "^\\d{10}$")
    private String phone;
    private long groupId;
}
