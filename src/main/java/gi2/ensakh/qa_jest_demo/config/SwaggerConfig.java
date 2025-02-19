package gi2.ensakh.qa_jest_demo.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(title = "Task Management API", version = "1.0", description = "API for managing users and tasks")
)
@Configuration
public class SwaggerConfig {
}
