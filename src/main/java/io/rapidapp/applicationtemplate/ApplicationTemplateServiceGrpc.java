package io.rapidapp.applicationtemplate;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: application_template.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ApplicationTemplateServiceGrpc {

  private ApplicationTemplateServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "applicationtemplate.ApplicationTemplateService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.rapidapp.applicationtemplate.ApplicationTemplateOuterClass.SearchRequest,
      io.rapidapp.applicationtemplate.ApplicationTemplateOuterClass.ApplicationTemplateList> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = io.rapidapp.applicationtemplate.ApplicationTemplateOuterClass.SearchRequest.class,
      responseType = io.rapidapp.applicationtemplate.ApplicationTemplateOuterClass.ApplicationTemplateList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.rapidapp.applicationtemplate.ApplicationTemplateOuterClass.SearchRequest,
      io.rapidapp.applicationtemplate.ApplicationTemplateOuterClass.ApplicationTemplateList> getListMethod() {
    io.grpc.MethodDescriptor<io.rapidapp.applicationtemplate.ApplicationTemplateOuterClass.SearchRequest, io.rapidapp.applicationtemplate.ApplicationTemplateOuterClass.ApplicationTemplateList> getListMethod;
    if ((getListMethod = ApplicationTemplateServiceGrpc.getListMethod) == null) {
      synchronized (ApplicationTemplateServiceGrpc.class) {
        if ((getListMethod = ApplicationTemplateServiceGrpc.getListMethod) == null) {
          ApplicationTemplateServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<io.rapidapp.applicationtemplate.ApplicationTemplateOuterClass.SearchRequest, io.rapidapp.applicationtemplate.ApplicationTemplateOuterClass.ApplicationTemplateList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.rapidapp.applicationtemplate.ApplicationTemplateOuterClass.SearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.rapidapp.applicationtemplate.ApplicationTemplateOuterClass.ApplicationTemplateList.getDefaultInstance()))
              .setSchemaDescriptor(new ApplicationTemplateServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ApplicationTemplateServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApplicationTemplateServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApplicationTemplateServiceStub>() {
        @java.lang.Override
        public ApplicationTemplateServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApplicationTemplateServiceStub(channel, callOptions);
        }
      };
    return ApplicationTemplateServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ApplicationTemplateServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApplicationTemplateServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApplicationTemplateServiceBlockingStub>() {
        @java.lang.Override
        public ApplicationTemplateServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApplicationTemplateServiceBlockingStub(channel, callOptions);
        }
      };
    return ApplicationTemplateServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ApplicationTemplateServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApplicationTemplateServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApplicationTemplateServiceFutureStub>() {
        @java.lang.Override
        public ApplicationTemplateServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApplicationTemplateServiceFutureStub(channel, callOptions);
        }
      };
    return ApplicationTemplateServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void list(io.rapidapp.applicationtemplate.ApplicationTemplateOuterClass.SearchRequest request,
        io.grpc.stub.StreamObserver<io.rapidapp.applicationtemplate.ApplicationTemplateOuterClass.ApplicationTemplateList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ApplicationTemplateService.
   */
  public static abstract class ApplicationTemplateServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ApplicationTemplateServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ApplicationTemplateService.
   */
  public static final class ApplicationTemplateServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ApplicationTemplateServiceStub> {
    private ApplicationTemplateServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApplicationTemplateServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApplicationTemplateServiceStub(channel, callOptions);
    }

    /**
     */
    public void list(io.rapidapp.applicationtemplate.ApplicationTemplateOuterClass.SearchRequest request,
        io.grpc.stub.StreamObserver<io.rapidapp.applicationtemplate.ApplicationTemplateOuterClass.ApplicationTemplateList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ApplicationTemplateService.
   */
  public static final class ApplicationTemplateServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ApplicationTemplateServiceBlockingStub> {
    private ApplicationTemplateServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApplicationTemplateServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApplicationTemplateServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.rapidapp.applicationtemplate.ApplicationTemplateOuterClass.ApplicationTemplateList list(io.rapidapp.applicationtemplate.ApplicationTemplateOuterClass.SearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ApplicationTemplateService.
   */
  public static final class ApplicationTemplateServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ApplicationTemplateServiceFutureStub> {
    private ApplicationTemplateServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApplicationTemplateServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApplicationTemplateServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.rapidapp.applicationtemplate.ApplicationTemplateOuterClass.ApplicationTemplateList> list(
        io.rapidapp.applicationtemplate.ApplicationTemplateOuterClass.SearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;

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
        case METHODID_LIST:
          serviceImpl.list((io.rapidapp.applicationtemplate.ApplicationTemplateOuterClass.SearchRequest) request,
              (io.grpc.stub.StreamObserver<io.rapidapp.applicationtemplate.ApplicationTemplateOuterClass.ApplicationTemplateList>) responseObserver);
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
          getListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.rapidapp.applicationtemplate.ApplicationTemplateOuterClass.SearchRequest,
              io.rapidapp.applicationtemplate.ApplicationTemplateOuterClass.ApplicationTemplateList>(
                service, METHODID_LIST)))
        .build();
  }

  private static abstract class ApplicationTemplateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ApplicationTemplateServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.rapidapp.applicationtemplate.ApplicationTemplateOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ApplicationTemplateService");
    }
  }

  private static final class ApplicationTemplateServiceFileDescriptorSupplier
      extends ApplicationTemplateServiceBaseDescriptorSupplier {
    ApplicationTemplateServiceFileDescriptorSupplier() {}
  }

  private static final class ApplicationTemplateServiceMethodDescriptorSupplier
      extends ApplicationTemplateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ApplicationTemplateServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ApplicationTemplateServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ApplicationTemplateServiceFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
