package com.rapidapp.apikey;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: apikey.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ApiKeyServiceGrpc {

  private ApiKeyServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "apikey.ApiKeyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.rapidapp.apikey.Apikey.CreateApiKeyRequest,
      com.rapidapp.apikey.Apikey.ApiKey> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.rapidapp.apikey.Apikey.CreateApiKeyRequest.class,
      responseType = com.rapidapp.apikey.Apikey.ApiKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.rapidapp.apikey.Apikey.CreateApiKeyRequest,
      com.rapidapp.apikey.Apikey.ApiKey> getCreateMethod() {
    io.grpc.MethodDescriptor<com.rapidapp.apikey.Apikey.CreateApiKeyRequest, com.rapidapp.apikey.Apikey.ApiKey> getCreateMethod;
    if ((getCreateMethod = ApiKeyServiceGrpc.getCreateMethod) == null) {
      synchronized (ApiKeyServiceGrpc.class) {
        if ((getCreateMethod = ApiKeyServiceGrpc.getCreateMethod) == null) {
          ApiKeyServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.rapidapp.apikey.Apikey.CreateApiKeyRequest, com.rapidapp.apikey.Apikey.ApiKey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rapidapp.apikey.Apikey.CreateApiKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rapidapp.apikey.Apikey.ApiKey.getDefaultInstance()))
              .setSchemaDescriptor(new ApiKeyServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.rapidapp.apikey.Apikey.ApiKeyList> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.rapidapp.apikey.Apikey.ApiKeyList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.rapidapp.apikey.Apikey.ApiKeyList> getListMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.rapidapp.apikey.Apikey.ApiKeyList> getListMethod;
    if ((getListMethod = ApiKeyServiceGrpc.getListMethod) == null) {
      synchronized (ApiKeyServiceGrpc.class) {
        if ((getListMethod = ApiKeyServiceGrpc.getListMethod) == null) {
          ApiKeyServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.rapidapp.apikey.Apikey.ApiKeyList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rapidapp.apikey.Apikey.ApiKeyList.getDefaultInstance()))
              .setSchemaDescriptor(new ApiKeyServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.rapidapp.apikey.Apikey.DeleteApiKeyRequest,
      com.google.protobuf.Empty> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.rapidapp.apikey.Apikey.DeleteApiKeyRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.rapidapp.apikey.Apikey.DeleteApiKeyRequest,
      com.google.protobuf.Empty> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.rapidapp.apikey.Apikey.DeleteApiKeyRequest, com.google.protobuf.Empty> getDeleteMethod;
    if ((getDeleteMethod = ApiKeyServiceGrpc.getDeleteMethod) == null) {
      synchronized (ApiKeyServiceGrpc.class) {
        if ((getDeleteMethod = ApiKeyServiceGrpc.getDeleteMethod) == null) {
          ApiKeyServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.rapidapp.apikey.Apikey.DeleteApiKeyRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rapidapp.apikey.Apikey.DeleteApiKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ApiKeyServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ApiKeyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApiKeyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApiKeyServiceStub>() {
        @java.lang.Override
        public ApiKeyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApiKeyServiceStub(channel, callOptions);
        }
      };
    return ApiKeyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ApiKeyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApiKeyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApiKeyServiceBlockingStub>() {
        @java.lang.Override
        public ApiKeyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApiKeyServiceBlockingStub(channel, callOptions);
        }
      };
    return ApiKeyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ApiKeyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApiKeyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApiKeyServiceFutureStub>() {
        @java.lang.Override
        public ApiKeyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApiKeyServiceFutureStub(channel, callOptions);
        }
      };
    return ApiKeyServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void create(com.rapidapp.apikey.Apikey.CreateApiKeyRequest request,
        io.grpc.stub.StreamObserver<com.rapidapp.apikey.Apikey.ApiKey> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    default void list(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.rapidapp.apikey.Apikey.ApiKeyList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     */
    default void delete(com.rapidapp.apikey.Apikey.DeleteApiKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ApiKeyService.
   */
  public static abstract class ApiKeyServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ApiKeyServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ApiKeyService.
   */
  public static final class ApiKeyServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ApiKeyServiceStub> {
    private ApiKeyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApiKeyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApiKeyServiceStub(channel, callOptions);
    }

    /**
     */
    public void create(com.rapidapp.apikey.Apikey.CreateApiKeyRequest request,
        io.grpc.stub.StreamObserver<com.rapidapp.apikey.Apikey.ApiKey> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.rapidapp.apikey.Apikey.ApiKeyList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(com.rapidapp.apikey.Apikey.DeleteApiKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ApiKeyService.
   */
  public static final class ApiKeyServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ApiKeyServiceBlockingStub> {
    private ApiKeyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApiKeyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApiKeyServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.rapidapp.apikey.Apikey.ApiKey create(com.rapidapp.apikey.Apikey.CreateApiKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.rapidapp.apikey.Apikey.ApiKeyList list(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty delete(com.rapidapp.apikey.Apikey.DeleteApiKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ApiKeyService.
   */
  public static final class ApiKeyServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ApiKeyServiceFutureStub> {
    private ApiKeyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApiKeyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApiKeyServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rapidapp.apikey.Apikey.ApiKey> create(
        com.rapidapp.apikey.Apikey.CreateApiKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rapidapp.apikey.Apikey.ApiKeyList> list(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> delete(
        com.rapidapp.apikey.Apikey.DeleteApiKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_DELETE = 2;

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
          serviceImpl.create((com.rapidapp.apikey.Apikey.CreateApiKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.rapidapp.apikey.Apikey.ApiKey>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.rapidapp.apikey.Apikey.ApiKeyList>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.rapidapp.apikey.Apikey.DeleteApiKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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
              com.rapidapp.apikey.Apikey.CreateApiKeyRequest,
              com.rapidapp.apikey.Apikey.ApiKey>(
                service, METHODID_CREATE)))
        .addMethod(
          getListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.rapidapp.apikey.Apikey.ApiKeyList>(
                service, METHODID_LIST)))
        .addMethod(
          getDeleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.rapidapp.apikey.Apikey.DeleteApiKeyRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE)))
        .build();
  }

  private static abstract class ApiKeyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ApiKeyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.rapidapp.apikey.Apikey.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ApiKeyService");
    }
  }

  private static final class ApiKeyServiceFileDescriptorSupplier
      extends ApiKeyServiceBaseDescriptorSupplier {
    ApiKeyServiceFileDescriptorSupplier() {}
  }

  private static final class ApiKeyServiceMethodDescriptorSupplier
      extends ApiKeyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ApiKeyServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ApiKeyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ApiKeyServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getListMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
