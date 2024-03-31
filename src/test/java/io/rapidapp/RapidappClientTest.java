package io.rapidapp;

import io.rapidapp.postgres.PostgresOuterClass;
import io.rapidapp.site.Site;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled
class RapidappClientTest {

    @Test
    void getSite() {
        RapidappClient client = new RapidappClient("test-api-key");
        Site.SiteResponse site = client.getSite();
        assertTrue(site.getWaitListEnabled());
    }

    @Test
    void getPostgresDatabases() {
        RapidappClient client = new RapidappClient("");
        PostgresOuterClass.PostgresList postgresDatabases = client.getPostgresDatabases();
        assertNotNull(postgresDatabases);
    }


    @Test
    void createPostgresDatabase() {
        RapidappClient client = new RapidappClient("");
        client.createPostgresDatabase("test-database");
    }
}