package com.joaolive.databoi;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;

public class ModulithArchitectureTest {

    @Test
    void verifyModularStructure() {
        // Initializes the application module model based on the main application class
        ApplicationModules modules = ApplicationModules.of(DataboiApplication.class);
        // Executes structural validation. The test fails if any module accesses
        // another module's internal package in violation of the defined boundaries
        modules.verify();
        // Outputs the module structure to the console for inspection and debugging purposes
        modules.forEach(System.out::println);
    }
}
