package com.nntuanlong.domain.entities;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.nntuanlong.domain.entities.shared.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class User extends Entities {
  @NotBlank
  @Email
  private String email;
  @Size(max = 255)
  private String name;
  @Pattern(regexp = "^\\d{10}$")
  private String phone;
}
