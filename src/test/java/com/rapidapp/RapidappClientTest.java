package com.rapidapp;

import com.rapidapp.postgres.PostgresOuterClass;
import com.rapidapp.site.Site;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RapidappClientTest {

    @Test
    void getSite() {
        RapidappClient client = new RapidappClient("test-api-key");
        Site.SiteResponse site = client.getSite();
        assertTrue(site.getWaitListEnabled());
    }

    @Test
    void getPostgresDatabases() {
        RapidappClient client = new RapidappClient("asdfasdfs");
        PostgresOuterClass.PostgresList postgresDatabases = client.getPostgresDatabases();
        assertNotNull(postgresDatabases);
    }
}