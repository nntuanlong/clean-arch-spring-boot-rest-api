package com.nntuanlong.domain.ports.output.createUser;

public interface OutputBoundary {
    ViewModel getViewModel();

    void present(Response response);
}
