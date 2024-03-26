package uab.ready2go;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import uab.ready2go.logger.LogType;
import uab.ready2go.logger.UtilLogger;

@SpringBootApplication
public class Ready2goApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ready2goApplication.class, args);
		UtilLogger.registerInfo(Ready2goApplication.class, LogType.INFO, "[Ready2goApplication] Ready2go running... registering first log info");
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedOriginPatterns("*")
						.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS");
			}
		};
	}
}
