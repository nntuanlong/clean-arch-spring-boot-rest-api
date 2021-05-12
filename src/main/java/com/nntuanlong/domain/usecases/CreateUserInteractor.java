package com.nntuanlong.domain.usecases;

import com.nntuanlong.domain.ports.input.createUser.InputBoundary;
import com.nntuanlong.domain.ports.input.createUser.Request;
import com.nntuanlong.domain.ports.output.createUser.OutputBoundary;
import com.nntuanlong.domain.ports.output.createUser.Response;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateUserInteractor implements InputBoundary {

  private final OutputBoundary outputBoundary;

  @Override
  public void execute(Request request) {
    Response response = new Response(1, request.getEmail(), request.getName(), request.getPhone(), request.getGroupId());
    outputBoundary.present(response);
  }

}
