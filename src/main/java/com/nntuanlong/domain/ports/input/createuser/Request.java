package com.nntuanlong.domain.ports.input.createuser;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Request {
    private String email;
    private String name;
    private String phone;
    private long groupId;
}
