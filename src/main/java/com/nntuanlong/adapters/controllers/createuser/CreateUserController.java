package com.nntuanlong.adapters.controllers.createuser;

import com.nntuanlong.adapters.controllers.shared.BaseController;
import com.nntuanlong.domain.ports.input.createuser.InputBoundary;
import com.nntuanlong.domain.ports.input.createuser.Request;
import com.nntuanlong.domain.ports.output.createUser.OutputBoundary;
import com.nntuanlong.domain.ports.output.createUser.ViewModel;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/users")
@AllArgsConstructor
public class CreateUserController implements BaseController {
    private final InputBoundary useCase;
    private final OutputBoundary presenter;

    @PostMapping
    public ResponseEntity<ViewModel> execute(@RequestBody @Valid CreateUserRequest createUserRequest) {
        this.useCase.execute(Request.builder()
                .email(createUserRequest.getEmail())
                .name(createUserRequest.getName())
                .phone(createUserRequest.getPhone())
                .groupId(createUserRequest.getGroupId())
                .build());
        return ResponseEntity.ok().body(this.presenter.getViewModel());
    }
}
