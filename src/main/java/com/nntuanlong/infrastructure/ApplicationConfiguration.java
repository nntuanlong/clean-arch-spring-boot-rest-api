package com.nntuanlong.infrastructure;

import com.nntuanlong.adapters.presenters.CreateUserPresenter;
import com.nntuanlong.domain.ports.input.createuser.InputBoundary;
import com.nntuanlong.domain.ports.output.createUser.OutputBoundary;
import com.nntuanlong.domain.usecases.CreateUserInteractor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
    @Bean
    public InputBoundary getInputBoundary(OutputBoundary outputBoundary) {
        return new CreateUserInteractor(outputBoundary);
    }

    @Bean
    public OutputBoundary getOutputBoundary() {
        return new CreateUserPresenter();
    }
}
