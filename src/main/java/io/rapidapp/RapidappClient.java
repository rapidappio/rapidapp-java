package io.rapidapp;

import com.google.protobuf.Empty;
import io.rapidapp.postgres.PostgresOuterClass;
import io.rapidapp.postgres.PostgresServiceGrpc;
import io.rapidapp.site.Site;
import io.rapidapp.site.SiteServiceGrpc;
import io.grpc.*;

public class RapidappClient {

    public static String API_URL= "api.rapidapp.io";
    public static int API_PORT= 443;
    private final String apiKey;

    public RapidappClient(String apiKey) {
        this.apiKey = apiKey;
    }

    public Site.SiteResponse getSite() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(API_URL, API_PORT)
                .useTransportSecurity()
                .intercept(new ApiKeyInterceptor(apiKey))
                .build();
        SiteServiceGrpc.SiteServiceBlockingStub stub = SiteServiceGrpc.newBlockingStub(channel);
        return stub.get(Empty.newBuilder().build());
    }

    public PostgresOuterClass.PostgresList getPostgresDatabases() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(API_URL, API_PORT)
                .useTransportSecurity()
                .intercept(new ApiKeyInterceptor(apiKey))
                .build();
        PostgresServiceGrpc.PostgresServiceBlockingStub stub = PostgresServiceGrpc.newBlockingStub(channel);
        return stub.list(Empty.newBuilder().build());
    }

    public PostgresOuterClass.PostgresId createPostgresDatabase(String name) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(API_URL, API_PORT)
                .useTransportSecurity()
                .intercept(new ApiKeyInterceptor(apiKey))
                .build();
        PostgresServiceGrpc.PostgresServiceBlockingStub stub = PostgresServiceGrpc.newBlockingStub(channel);
        PostgresOuterClass.PostgresId postgresId = stub.create(PostgresOuterClass.CreateRequest.newBuilder().setName(name).build());
        return postgresId;
    }

    public PostgresOuterClass.Postgres getPostgresDatabase(String id) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(API_URL, API_PORT)
                .useTransportSecurity()
                .intercept(new ApiKeyInterceptor(apiKey))
                .build();
        PostgresServiceGrpc.PostgresServiceBlockingStub stub = PostgresServiceGrpc.newBlockingStub(channel);
        PostgresOuterClass.Postgres postgres = stub.get(PostgresOuterClass.GetRequest.newBuilder().setId(id).build());
        return postgres;
    }
}

class ApiKeyInterceptor implements ClientInterceptor {

    private final String apiKey;

    public ApiKeyInterceptor(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> method,
                                                               CallOptions callOptions, Channel next) {
        return new ForwardingClientCall.SimpleForwardingClientCall<ReqT, RespT>(next.newCall(method, callOptions)) {
            @Override
            public void start(Listener<RespT> responseListener, Metadata headers) {
                headers.put(Metadata.Key.of("x-api-key", Metadata.ASCII_STRING_MARSHALLER), apiKey);
                super.start(responseListener, headers);
            }
        };
    }
}
