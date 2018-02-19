package com.sudhar.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties("custom")
public class MultiLevelProperty {

    private String authentication;

    private List<Connector> connectors = new ArrayList<>();

    public static class Connector {
        private String host;

        private String port;

        private String type;

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public String getPort() {
            return port;
        }

        public void setPort(String port) {
            this.port = port;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "Connector{" +
                    "host='" + host + '\'' +
                    ", port='" + port + '\'' +
                    ", type='" + type + '\'' +
                    '}';
        }
    }

    public String getAuthentication() {
        return authentication;
    }

    public void setAuthentication(String authentication) {
        this.authentication = authentication;
    }

    public List<Connector> getConnectors() {
        return connectors;
    }

    public void setConnectors(List<Connector> connectors) {
        this.connectors = connectors;
    }

    @Override
    public String toString() {
        return "MultiLevelProperty{" +
                "'connectors='" +  connectors + '\'' +
                "authentication='" + authentication + '\'' +
                '}';
    }
}
