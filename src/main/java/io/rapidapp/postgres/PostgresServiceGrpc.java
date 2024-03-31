package io.rapidapp.postgres;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: postgres.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PostgresServiceGrpc {

  private PostgresServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "postgres.PostgresService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.rapidapp.postgres.PostgresOuterClass.CreateRequest,
      io.rapidapp.postgres.PostgresOuterClass.PostgresId> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = io.rapidapp.postgres.PostgresOuterClass.CreateRequest.class,
      responseType = io.rapidapp.postgres.PostgresOuterClass.PostgresId.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.rapidapp.postgres.PostgresOuterClass.CreateRequest,
      io.rapidapp.postgres.PostgresOuterClass.PostgresId> getCreateMethod() {
    io.grpc.MethodDescriptor<io.rapidapp.postgres.PostgresOuterClass.CreateRequest, io.rapidapp.postgres.PostgresOuterClass.PostgresId> getCreateMethod;
    if ((getCreateMethod = PostgresServiceGrpc.getCreateMethod) == null) {
      synchronized (PostgresServiceGrpc.class) {
        if ((getCreateMethod = PostgresServiceGrpc.getCreateMethod) == null) {
          PostgresServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<io.rapidapp.postgres.PostgresOuterClass.CreateRequest, io.rapidapp.postgres.PostgresOuterClass.PostgresId>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.rapidapp.postgres.PostgresOuterClass.CreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.rapidapp.postgres.PostgresOuterClass.PostgresId.getDefaultInstance()))
              .setSchemaDescriptor(new PostgresServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      io.rapidapp.postgres.PostgresOuterClass.PostgresList> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.google.protobuf.Empty.class,
      responseType = io.rapidapp.postgres.PostgresOuterClass.PostgresList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      io.rapidapp.postgres.PostgresOuterClass.PostgresList> getListMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, io.rapidapp.postgres.PostgresOuterClass.PostgresList> getListMethod;
    if ((getListMethod = PostgresServiceGrpc.getListMethod) == null) {
      synchronized (PostgresServiceGrpc.class) {
        if ((getListMethod = PostgresServiceGrpc.getListMethod) == null) {
          PostgresServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, io.rapidapp.postgres.PostgresOuterClass.PostgresList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.rapidapp.postgres.PostgresOuterClass.PostgresList.getDefaultInstance()))
              .setSchemaDescriptor(new PostgresServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.rapidapp.postgres.PostgresOuterClass.GetRequest,
      io.rapidapp.postgres.PostgresOuterClass.Postgres> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = io.rapidapp.postgres.PostgresOuterClass.GetRequest.class,
      responseType = io.rapidapp.postgres.PostgresOuterClass.Postgres.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.rapidapp.postgres.PostgresOuterClass.GetRequest,
      io.rapidapp.postgres.PostgresOuterClass.Postgres> getGetMethod() {
    io.grpc.MethodDescriptor<io.rapidapp.postgres.PostgresOuterClass.GetRequest, io.rapidapp.postgres.PostgresOuterClass.Postgres> getGetMethod;
    if ((getGetMethod = PostgresServiceGrpc.getGetMethod) == null) {
      synchronized (PostgresServiceGrpc.class) {
        if ((getGetMethod = PostgresServiceGrpc.getGetMethod) == null) {
          PostgresServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<io.rapidapp.postgres.PostgresOuterClass.GetRequest, io.rapidapp.postgres.PostgresOuterClass.Postgres>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.rapidapp.postgres.PostgresOuterClass.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.rapidapp.postgres.PostgresOuterClass.Postgres.getDefaultInstance()))
              .setSchemaDescriptor(new PostgresServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.rapidapp.postgres.PostgresOuterClass.DeleteRequest,
      com.google.protobuf.Empty> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = io.rapidapp.postgres.PostgresOuterClass.DeleteRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.rapidapp.postgres.PostgresOuterClass.DeleteRequest,
      com.google.protobuf.Empty> getDeleteMethod() {
    io.grpc.MethodDescriptor<io.rapidapp.postgres.PostgresOuterClass.DeleteRequest, com.google.protobuf.Empty> getDeleteMethod;
    if ((getDeleteMethod = PostgresServiceGrpc.getDeleteMethod) == null) {
      synchronized (PostgresServiceGrpc.class) {
        if ((getDeleteMethod = PostgresServiceGrpc.getDeleteMethod) == null) {
          PostgresServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<io.rapidapp.postgres.PostgresOuterClass.DeleteRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.rapidapp.postgres.PostgresOuterClass.DeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new PostgresServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      io.rapidapp.postgres.PostgresOuterClass.PostgresList> getAdminListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AdminList",
      requestType = com.google.protobuf.Empty.class,
      responseType = io.rapidapp.postgres.PostgresOuterClass.PostgresList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      io.rapidapp.postgres.PostgresOuterClass.PostgresList> getAdminListMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, io.rapidapp.postgres.PostgresOuterClass.PostgresList> getAdminListMethod;
    if ((getAdminListMethod = PostgresServiceGrpc.getAdminListMethod) == null) {
      synchronized (PostgresServiceGrpc.class) {
        if ((getAdminListMethod = PostgresServiceGrpc.getAdminListMethod) == null) {
          PostgresServiceGrpc.getAdminListMethod = getAdminListMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, io.rapidapp.postgres.PostgresOuterClass.PostgresList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AdminList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.rapidapp.postgres.PostgresOuterClass.PostgresList.getDefaultInstance()))
              .setSchemaDescriptor(new PostgresServiceMethodDescriptorSupplier("AdminList"))
              .build();
        }
      }
    }
    return getAdminListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.rapidapp.postgres.PostgresOuterClass.GetRequest,
      io.rapidapp.postgres.PostgresOuterClass.Statistics> getGetStatisticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStatistics",
      requestType = io.rapidapp.postgres.PostgresOuterClass.GetRequest.class,
      responseType = io.rapidapp.postgres.PostgresOuterClass.Statistics.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.rapidapp.postgres.PostgresOuterClass.GetRequest,
      io.rapidapp.postgres.PostgresOuterClass.Statistics> getGetStatisticsMethod() {
    io.grpc.MethodDescriptor<io.rapidapp.postgres.PostgresOuterClass.GetRequest, io.rapidapp.postgres.PostgresOuterClass.Statistics> getGetStatisticsMethod;
    if ((getGetStatisticsMethod = PostgresServiceGrpc.getGetStatisticsMethod) == null) {
      synchronized (PostgresServiceGrpc.class) {
        if ((getGetStatisticsMethod = PostgresServiceGrpc.getGetStatisticsMethod) == null) {
          PostgresServiceGrpc.getGetStatisticsMethod = getGetStatisticsMethod =
              io.grpc.MethodDescriptor.<io.rapidapp.postgres.PostgresOuterClass.GetRequest, io.rapidapp.postgres.PostgresOuterClass.Statistics>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStatistics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.rapidapp.postgres.PostgresOuterClass.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.rapidapp.postgres.PostgresOuterClass.Statistics.getDefaultInstance()))
              .setSchemaDescriptor(new PostgresServiceMethodDescriptorSupplier("GetStatistics"))
              .build();
        }
      }
    }
    return getGetStatisticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.rapidapp.postgres.PostgresOuterClass.GetRequest,
      io.rapidapp.postgres.PostgresOuterClass.ActiveConnectionList> getGetActiveConnectionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetActiveConnections",
      requestType = io.rapidapp.postgres.PostgresOuterClass.GetRequest.class,
      responseType = io.rapidapp.postgres.PostgresOuterClass.ActiveConnectionList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.rapidapp.postgres.PostgresOuterClass.GetRequest,
      io.rapidapp.postgres.PostgresOuterClass.ActiveConnectionList> getGetActiveConnectionsMethod() {
    io.grpc.MethodDescriptor<io.rapidapp.postgres.PostgresOuterClass.GetRequest, io.rapidapp.postgres.PostgresOuterClass.ActiveConnectionList> getGetActiveConnectionsMethod;
    if ((getGetActiveConnectionsMethod = PostgresServiceGrpc.getGetActiveConnectionsMethod) == null) {
      synchronized (PostgresServiceGrpc.class) {
        if ((getGetActiveConnectionsMethod = PostgresServiceGrpc.getGetActiveConnectionsMethod) == null) {
          PostgresServiceGrpc.getGetActiveConnectionsMethod = getGetActiveConnectionsMethod =
              io.grpc.MethodDescriptor.<io.rapidapp.postgres.PostgresOuterClass.GetRequest, io.rapidapp.postgres.PostgresOuterClass.ActiveConnectionList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetActiveConnections"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.rapidapp.postgres.PostgresOuterClass.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.rapidapp.postgres.PostgresOuterClass.ActiveConnectionList.getDefaultInstance()))
              .setSchemaDescriptor(new PostgresServiceMethodDescriptorSupplier("GetActiveConnections"))
              .build();
        }
      }
    }
    return getGetActiveConnectionsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PostgresServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PostgresServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PostgresServiceStub>() {
        @java.lang.Override
        public PostgresServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PostgresServiceStub(channel, callOptions);
        }
      };
    return PostgresServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PostgresServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PostgresServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PostgresServiceBlockingStub>() {
        @java.lang.Override
        public PostgresServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PostgresServiceBlockingStub(channel, callOptions);
        }
      };
    return PostgresServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PostgresServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PostgresServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PostgresServiceFutureStub>() {
        @java.lang.Override
        public PostgresServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PostgresServiceFutureStub(channel, callOptions);
        }
      };
    return PostgresServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void create(io.rapidapp.postgres.PostgresOuterClass.CreateRequest request,
        io.grpc.stub.StreamObserver<io.rapidapp.postgres.PostgresOuterClass.PostgresId> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    default void list(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<io.rapidapp.postgres.PostgresOuterClass.PostgresList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     */
    default void get(io.rapidapp.postgres.PostgresOuterClass.GetRequest request,
        io.grpc.stub.StreamObserver<io.rapidapp.postgres.PostgresOuterClass.Postgres> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    default void delete(io.rapidapp.postgres.PostgresOuterClass.DeleteRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    default void adminList(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<io.rapidapp.postgres.PostgresOuterClass.PostgresList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAdminListMethod(), responseObserver);
    }

    /**
     */
    default void getStatistics(io.rapidapp.postgres.PostgresOuterClass.GetRequest request,
        io.grpc.stub.StreamObserver<io.rapidapp.postgres.PostgresOuterClass.Statistics> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStatisticsMethod(), responseObserver);
    }

    /**
     */
    default void getActiveConnections(io.rapidapp.postgres.PostgresOuterClass.GetRequest request,
        io.grpc.stub.StreamObserver<io.rapidapp.postgres.PostgresOuterClass.ActiveConnectionList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetActiveConnectionsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PostgresService.
   */
  public static abstract class PostgresServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PostgresServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PostgresService.
   */
  public static final class PostgresServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PostgresServiceStub> {
    private PostgresServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PostgresServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PostgresServiceStub(channel, callOptions);
    }

    /**
     */
    public void create(io.rapidapp.postgres.PostgresOuterClass.CreateRequest request,
        io.grpc.stub.StreamObserver<io.rapidapp.postgres.PostgresOuterClass.PostgresId> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<io.rapidapp.postgres.PostgresOuterClass.PostgresList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(io.rapidapp.postgres.PostgresOuterClass.GetRequest request,
        io.grpc.stub.StreamObserver<io.rapidapp.postgres.PostgresOuterClass.Postgres> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(io.rapidapp.postgres.PostgresOuterClass.DeleteRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void adminList(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<io.rapidapp.postgres.PostgresOuterClass.PostgresList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAdminListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStatistics(io.rapidapp.postgres.PostgresOuterClass.GetRequest request,
        io.grpc.stub.StreamObserver<io.rapidapp.postgres.PostgresOuterClass.Statistics> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStatisticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getActiveConnections(io.rapidapp.postgres.PostgresOuterClass.GetRequest request,
        io.grpc.stub.StreamObserver<io.rapidapp.postgres.PostgresOuterClass.ActiveConnectionList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetActiveConnectionsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PostgresService.
   */
  public static final class PostgresServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PostgresServiceBlockingStub> {
    private PostgresServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PostgresServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PostgresServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.rapidapp.postgres.PostgresOuterClass.PostgresId create(io.rapidapp.postgres.PostgresOuterClass.CreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.rapidapp.postgres.PostgresOuterClass.PostgresList list(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.rapidapp.postgres.PostgresOuterClass.Postgres get(io.rapidapp.postgres.PostgresOuterClass.GetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty delete(io.rapidapp.postgres.PostgresOuterClass.DeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.rapidapp.postgres.PostgresOuterClass.PostgresList adminList(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAdminListMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.rapidapp.postgres.PostgresOuterClass.Statistics getStatistics(io.rapidapp.postgres.PostgresOuterClass.GetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStatisticsMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.rapidapp.postgres.PostgresOuterClass.ActiveConnectionList getActiveConnections(io.rapidapp.postgres.PostgresOuterClass.GetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetActiveConnectionsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PostgresService.
   */
  public static final class PostgresServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PostgresServiceFutureStub> {
    private PostgresServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PostgresServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PostgresServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.rapidapp.postgres.PostgresOuterClass.PostgresId> create(
        io.rapidapp.postgres.PostgresOuterClass.CreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.rapidapp.postgres.PostgresOuterClass.PostgresList> list(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.rapidapp.postgres.PostgresOuterClass.Postgres> get(
        io.rapidapp.postgres.PostgresOuterClass.GetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> delete(
        io.rapidapp.postgres.PostgresOuterClass.DeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.rapidapp.postgres.PostgresOuterClass.PostgresList> adminList(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAdminListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.rapidapp.postgres.PostgresOuterClass.Statistics> getStatistics(
        io.rapidapp.postgres.PostgresOuterClass.GetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStatisticsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.rapidapp.postgres.PostgresOuterClass.ActiveConnectionList> getActiveConnections(
        io.rapidapp.postgres.PostgresOuterClass.GetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetActiveConnectionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_GET = 2;
  private static final int METHODID_DELETE = 3;
  private static final int METHODID_ADMIN_LIST = 4;
  private static final int METHODID_GET_STATISTICS = 5;
  private static final int METHODID_GET_ACTIVE_CONNECTIONS = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((io.rapidapp.postgres.PostgresOuterClass.CreateRequest) request,
              (io.grpc.stub.StreamObserver<io.rapidapp.postgres.PostgresOuterClass.PostgresId>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<io.rapidapp.postgres.PostgresOuterClass.PostgresList>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((io.rapidapp.postgres.PostgresOuterClass.GetRequest) request,
              (io.grpc.stub.StreamObserver<io.rapidapp.postgres.PostgresOuterClass.Postgres>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((io.rapidapp.postgres.PostgresOuterClass.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_ADMIN_LIST:
          serviceImpl.adminList((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<io.rapidapp.postgres.PostgresOuterClass.PostgresList>) responseObserver);
          break;
        case METHODID_GET_STATISTICS:
          serviceImpl.getStatistics((io.rapidapp.postgres.PostgresOuterClass.GetRequest) request,
              (io.grpc.stub.StreamObserver<io.rapidapp.postgres.PostgresOuterClass.Statistics>) responseObserver);
          break;
        case METHODID_GET_ACTIVE_CONNECTIONS:
          serviceImpl.getActiveConnections((io.rapidapp.postgres.PostgresOuterClass.GetRequest) request,
              (io.grpc.stub.StreamObserver<io.rapidapp.postgres.PostgresOuterClass.ActiveConnectionList>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.rapidapp.postgres.PostgresOuterClass.CreateRequest,
              io.rapidapp.postgres.PostgresOuterClass.PostgresId>(
                service, METHODID_CREATE)))
        .addMethod(
          getListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              io.rapidapp.postgres.PostgresOuterClass.PostgresList>(
                service, METHODID_LIST)))
        .addMethod(
          getGetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.rapidapp.postgres.PostgresOuterClass.GetRequest,
              io.rapidapp.postgres.PostgresOuterClass.Postgres>(
                service, METHODID_GET)))
        .addMethod(
          getDeleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.rapidapp.postgres.PostgresOuterClass.DeleteRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE)))
        .addMethod(
          getAdminListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              io.rapidapp.postgres.PostgresOuterClass.PostgresList>(
                service, METHODID_ADMIN_LIST)))
        .addMethod(
          getGetStatisticsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.rapidapp.postgres.PostgresOuterClass.GetRequest,
              io.rapidapp.postgres.PostgresOuterClass.Statistics>(
                service, METHODID_GET_STATISTICS)))
        .addMethod(
          getGetActiveConnectionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.rapidapp.postgres.PostgresOuterClass.GetRequest,
              io.rapidapp.postgres.PostgresOuterClass.ActiveConnectionList>(
                service, METHODID_GET_ACTIVE_CONNECTIONS)))
        .build();
  }

  private static abstract class PostgresServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PostgresServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.rapidapp.postgres.PostgresOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PostgresService");
    }
  }

  private static final class PostgresServiceFileDescriptorSupplier
      extends PostgresServiceBaseDescriptorSupplier {
    PostgresServiceFileDescriptorSupplier() {}
  }

  private static final class PostgresServiceMethodDescriptorSupplier
      extends PostgresServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PostgresServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PostgresServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PostgresServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getListMethod())
              .addMethod(getGetMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getAdminListMethod())
              .addMethod(getGetStatisticsMethod())
              .addMethod(getGetActiveConnectionsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
