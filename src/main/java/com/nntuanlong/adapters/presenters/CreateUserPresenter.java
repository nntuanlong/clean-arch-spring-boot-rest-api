package com.nntuanlong.adapters.presenters;

import com.nntuanlong.domain.ports.output.createUser.OutputBoundary;
import com.nntuanlong.domain.ports.output.createUser.Response;
import com.nntuanlong.domain.ports.output.createUser.ViewModel;

public class CreateUserPresenter implements OutputBoundary {
    private ViewModel viewModel;

    @Override
    public ViewModel getViewModel() {
        return this.viewModel;
    }

    @Override
    public void present(Response response) {
        this.viewModel = ViewModel.builder()
                .id(response.getId())
                .email(response.getEmail())
                .name(response.getName())
                .phone(response.getPhone())
                .groupId(response.getGroupId())
                .build();
    }
}
