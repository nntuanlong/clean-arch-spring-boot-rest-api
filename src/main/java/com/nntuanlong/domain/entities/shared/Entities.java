package com.nntuanlong.domain.entities.shared;

import java.util.Date;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Entities {
  @NotNull
  private long id;
  private Date createdDate;
  private Date updatedDate;
}
