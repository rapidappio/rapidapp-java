package com.rapidapp.checkout;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: checkout.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CheckoutServiceGrpc {

  private CheckoutServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "checkout.CheckoutService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.rapidapp.checkout.Checkout.CreateCheckoutSessionRequest,
      com.rapidapp.checkout.Checkout.CheckoutSessionResponse> getCreateCheckoutSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCheckoutSession",
      requestType = com.rapidapp.checkout.Checkout.CreateCheckoutSessionRequest.class,
      responseType = com.rapidapp.checkout.Checkout.CheckoutSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.rapidapp.checkout.Checkout.CreateCheckoutSessionRequest,
      com.rapidapp.checkout.Checkout.CheckoutSessionResponse> getCreateCheckoutSessionMethod() {
    io.grpc.MethodDescriptor<com.rapidapp.checkout.Checkout.CreateCheckoutSessionRequest, com.rapidapp.checkout.Checkout.CheckoutSessionResponse> getCreateCheckoutSessionMethod;
    if ((getCreateCheckoutSessionMethod = CheckoutServiceGrpc.getCreateCheckoutSessionMethod) == null) {
      synchronized (CheckoutServiceGrpc.class) {
        if ((getCreateCheckoutSessionMethod = CheckoutServiceGrpc.getCreateCheckoutSessionMethod) == null) {
          CheckoutServiceGrpc.getCreateCheckoutSessionMethod = getCreateCheckoutSessionMethod =
              io.grpc.MethodDescriptor.<com.rapidapp.checkout.Checkout.CreateCheckoutSessionRequest, com.rapidapp.checkout.Checkout.CheckoutSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCheckoutSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rapidapp.checkout.Checkout.CreateCheckoutSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rapidapp.checkout.Checkout.CheckoutSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CheckoutServiceMethodDescriptorSupplier("CreateCheckoutSession"))
              .build();
        }
      }
    }
    return getCreateCheckoutSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.rapidapp.checkout.Checkout.PortalSessionResponse> getCreatePortalSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePortalSession",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.rapidapp.checkout.Checkout.PortalSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.rapidapp.checkout.Checkout.PortalSessionResponse> getCreatePortalSessionMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.rapidapp.checkout.Checkout.PortalSessionResponse> getCreatePortalSessionMethod;
    if ((getCreatePortalSessionMethod = CheckoutServiceGrpc.getCreatePortalSessionMethod) == null) {
      synchronized (CheckoutServiceGrpc.class) {
        if ((getCreatePortalSessionMethod = CheckoutServiceGrpc.getCreatePortalSessionMethod) == null) {
          CheckoutServiceGrpc.getCreatePortalSessionMethod = getCreatePortalSessionMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.rapidapp.checkout.Checkout.PortalSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePortalSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rapidapp.checkout.Checkout.PortalSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CheckoutServiceMethodDescriptorSupplier("CreatePortalSession"))
              .build();
        }
      }
    }
    return getCreatePortalSessionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CheckoutServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CheckoutServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CheckoutServiceStub>() {
        @java.lang.Override
        public CheckoutServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CheckoutServiceStub(channel, callOptions);
        }
      };
    return CheckoutServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CheckoutServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CheckoutServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CheckoutServiceBlockingStub>() {
        @java.lang.Override
        public CheckoutServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CheckoutServiceBlockingStub(channel, callOptions);
        }
      };
    return CheckoutServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CheckoutServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CheckoutServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CheckoutServiceFutureStub>() {
        @java.lang.Override
        public CheckoutServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CheckoutServiceFutureStub(channel, callOptions);
        }
      };
    return CheckoutServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createCheckoutSession(com.rapidapp.checkout.Checkout.CreateCheckoutSessionRequest request,
        io.grpc.stub.StreamObserver<com.rapidapp.checkout.Checkout.CheckoutSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCheckoutSessionMethod(), responseObserver);
    }

    /**
     */
    default void createPortalSession(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.rapidapp.checkout.Checkout.PortalSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePortalSessionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CheckoutService.
   */
  public static abstract class CheckoutServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CheckoutServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CheckoutService.
   */
  public static final class CheckoutServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CheckoutServiceStub> {
    private CheckoutServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CheckoutServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CheckoutServiceStub(channel, callOptions);
    }

    /**
     */
    public void createCheckoutSession(com.rapidapp.checkout.Checkout.CreateCheckoutSessionRequest request,
        io.grpc.stub.StreamObserver<com.rapidapp.checkout.Checkout.CheckoutSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCheckoutSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createPortalSession(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.rapidapp.checkout.Checkout.PortalSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePortalSessionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CheckoutService.
   */
  public static final class CheckoutServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CheckoutServiceBlockingStub> {
    private CheckoutServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CheckoutServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CheckoutServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.rapidapp.checkout.Checkout.CheckoutSessionResponse createCheckoutSession(com.rapidapp.checkout.Checkout.CreateCheckoutSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCheckoutSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.rapidapp.checkout.Checkout.PortalSessionResponse createPortalSession(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePortalSessionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CheckoutService.
   */
  public static final class CheckoutServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CheckoutServiceFutureStub> {
    private CheckoutServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CheckoutServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CheckoutServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rapidapp.checkout.Checkout.CheckoutSessionResponse> createCheckoutSession(
        com.rapidapp.checkout.Checkout.CreateCheckoutSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCheckoutSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rapidapp.checkout.Checkout.PortalSessionResponse> createPortalSession(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePortalSessionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CHECKOUT_SESSION = 0;
  private static final int METHODID_CREATE_PORTAL_SESSION = 1;

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
        case METHODID_CREATE_CHECKOUT_SESSION:
          serviceImpl.createCheckoutSession((com.rapidapp.checkout.Checkout.CreateCheckoutSessionRequest) request,
              (io.grpc.stub.StreamObserver<com.rapidapp.checkout.Checkout.CheckoutSessionResponse>) responseObserver);
          break;
        case METHODID_CREATE_PORTAL_SESSION:
          serviceImpl.createPortalSession((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.rapidapp.checkout.Checkout.PortalSessionResponse>) responseObserver);
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
          getCreateCheckoutSessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.rapidapp.checkout.Checkout.CreateCheckoutSessionRequest,
              com.rapidapp.checkout.Checkout.CheckoutSessionResponse>(
                service, METHODID_CREATE_CHECKOUT_SESSION)))
        .addMethod(
          getCreatePortalSessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.rapidapp.checkout.Checkout.PortalSessionResponse>(
                service, METHODID_CREATE_PORTAL_SESSION)))
        .build();
  }

  private static abstract class CheckoutServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CheckoutServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.rapidapp.checkout.Checkout.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CheckoutService");
    }
  }

  private static final class CheckoutServiceFileDescriptorSupplier
      extends CheckoutServiceBaseDescriptorSupplier {
    CheckoutServiceFileDescriptorSupplier() {}
  }

  private static final class CheckoutServiceMethodDescriptorSupplier
      extends CheckoutServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CheckoutServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CheckoutServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CheckoutServiceFileDescriptorSupplier())
              .addMethod(getCreateCheckoutSessionMethod())
              .addMethod(getCreatePortalSessionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
