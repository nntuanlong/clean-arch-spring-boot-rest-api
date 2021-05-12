package com.nntuanlong.adapters.controllers;

import javax.validation.Valid;

import com.nntuanlong.adapters.controllers.shared.BaseController;
import com.nntuanlong.domain.ports.input.createUser.InputBoundary;
import com.nntuanlong.domain.ports.input.createUser.Request;
import com.nntuanlong.domain.ports.output.createUser.OutputBoundary;
import com.nntuanlong.domain.ports.output.createUser.Response;
import com.nntuanlong.domain.ports.output.createUser.ViewModel;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1/users")
@AllArgsConstructor
public class CreateUserController implements BaseController {
  private final InputBoundary useCase;
  private final OutputBoundary presenter;

  public ResponseEntity<ViewModel> execute(@RequestBody @Valid Request request) {


    return ResponseEntity.ok().body(presenter.getViewModel());
  }
}
