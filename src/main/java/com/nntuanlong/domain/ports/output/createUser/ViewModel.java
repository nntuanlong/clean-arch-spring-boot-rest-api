package com.nntuanlong.domain.ports.output.createUser;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ViewModel {
  private long id;
  private String email;
  private String name;
  private String phone;
  private long groupId;
}
