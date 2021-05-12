package com.nntuanlong.domain.entities.shared;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;

import java.util.Date;

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
