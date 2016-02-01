package com.empty;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.ImmutableSettings;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WebClientEsApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebClientEsApplication.class, args);
    }

    @Bean
   public Client provideEsClient() {
        Settings settings = ImmutableSettings.settingsBuilder()
                .put("cluster.name", "my_cluster").build();
        Client client = new TransportClient(settings)
                .addTransportAddress(new InetSocketTransportAddress("elasticsearch", 9300));
        return client;
    }
}
