package com.sudhar.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigurationPropertiesExampleApplication {

    private static final Logger logger = LoggerFactory.getLogger(ConfigurationPropertiesExampleApplication.class);

    @Autowired
    private RootLevelProperty rootLevelProperty;

    @Autowired
    private MultiLevelProperty multiLevelProperty;

    public static void main(final String[] args) {
        SpringApplication.run(ConfigurationPropertiesExampleApplication.class, args);
    }

    @GetMapping("/")
    public RootLevelProperty getRootLevelProperty() {
        logger.debug("Root level property : {} ", this.rootLevelProperty);

        logger.debug("Multi level property: {}", this.multiLevelProperty);
        return rootLevelProperty;
    }
}
