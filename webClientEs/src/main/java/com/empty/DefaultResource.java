package com.empty;

import org.elasticsearch.action.admin.cluster.stats.ClusterStatsResponse;
import org.elasticsearch.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultResource {

    @Autowired
    private Client client;

    @RequestMapping("/es")
    public String esStatus() {

        ClusterStatsResponse clusterStatsNodeResponses = client.admin()
                .cluster()
                .prepareClusterStats().get();

        return clusterStatsNodeResponses.getStatus().name();
    }

}