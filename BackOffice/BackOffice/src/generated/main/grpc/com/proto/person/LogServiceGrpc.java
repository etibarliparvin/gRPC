package com.proto.person;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: person/log.proto")
public final class LogServiceGrpc {

  private LogServiceGrpc() {}

  public static final String SERVICE_NAME = "person.LogService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.person.LogRequest,
      com.proto.person.LogResponse> getLoggingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "logging",
      requestType = com.proto.person.LogRequest.class,
      responseType = com.proto.person.LogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.person.LogRequest,
      com.proto.person.LogResponse> getLoggingMethod() {
    io.grpc.MethodDescriptor<com.proto.person.LogRequest, com.proto.person.LogResponse> getLoggingMethod;
    if ((getLoggingMethod = LogServiceGrpc.getLoggingMethod) == null) {
      synchronized (LogServiceGrpc.class) {
        if ((getLoggingMethod = LogServiceGrpc.getLoggingMethod) == null) {
          LogServiceGrpc.getLoggingMethod = getLoggingMethod =
              io.grpc.MethodDescriptor.<com.proto.person.LogRequest, com.proto.person.LogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "logging"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.person.LogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.person.LogResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogServiceMethodDescriptorSupplier("logging"))
              .build();
        }
      }
    }
    return getLoggingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LogServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogServiceStub>() {
        @java.lang.Override
        public LogServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogServiceStub(channel, callOptions);
        }
      };
    return LogServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LogServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogServiceBlockingStub>() {
        @java.lang.Override
        public LogServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogServiceBlockingStub(channel, callOptions);
        }
      };
    return LogServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LogServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogServiceFutureStub>() {
        @java.lang.Override
        public LogServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogServiceFutureStub(channel, callOptions);
        }
      };
    return LogServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class LogServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *  rpc createBlog(Blog) returns(BlogId);
     *  rpc readBlog(BlogId) returns(Blog);
     *  rpc updateBlog(Blog) returns(google.protobuf.Empty);
     *  rpc deleteBlog(BlogId) returns(google.protobuf.Empty);
     *  rpc listBlogs(google.protobuf.Empty) returns(stream Blog);
     * </pre>
     */
    public void logging(com.proto.person.LogRequest request,
        io.grpc.stub.StreamObserver<com.proto.person.LogResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoggingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoggingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.person.LogRequest,
                com.proto.person.LogResponse>(
                  this, METHODID_LOGGING)))
          .build();
    }
  }

  /**
   */
  public static final class LogServiceStub extends io.grpc.stub.AbstractAsyncStub<LogServiceStub> {
    private LogServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *  rpc createBlog(Blog) returns(BlogId);
     *  rpc readBlog(BlogId) returns(Blog);
     *  rpc updateBlog(Blog) returns(google.protobuf.Empty);
     *  rpc deleteBlog(BlogId) returns(google.protobuf.Empty);
     *  rpc listBlogs(google.protobuf.Empty) returns(stream Blog);
     * </pre>
     */
    public void logging(com.proto.person.LogRequest request,
        io.grpc.stub.StreamObserver<com.proto.person.LogResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoggingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LogServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<LogServiceBlockingStub> {
    private LogServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *  rpc createBlog(Blog) returns(BlogId);
     *  rpc readBlog(BlogId) returns(Blog);
     *  rpc updateBlog(Blog) returns(google.protobuf.Empty);
     *  rpc deleteBlog(BlogId) returns(google.protobuf.Empty);
     *  rpc listBlogs(google.protobuf.Empty) returns(stream Blog);
     * </pre>
     */
    public com.proto.person.LogResponse logging(com.proto.person.LogRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoggingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LogServiceFutureStub extends io.grpc.stub.AbstractFutureStub<LogServiceFutureStub> {
    private LogServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *  rpc createBlog(Blog) returns(BlogId);
     *  rpc readBlog(BlogId) returns(Blog);
     *  rpc updateBlog(Blog) returns(google.protobuf.Empty);
     *  rpc deleteBlog(BlogId) returns(google.protobuf.Empty);
     *  rpc listBlogs(google.protobuf.Empty) returns(stream Blog);
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.person.LogResponse> logging(
        com.proto.person.LogRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoggingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGGING = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LogServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LogServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGGING:
          serviceImpl.logging((com.proto.person.LogRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.person.LogResponse>) responseObserver);
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

  private static abstract class LogServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LogServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.person.Log.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LogService");
    }
  }

  private static final class LogServiceFileDescriptorSupplier
      extends LogServiceBaseDescriptorSupplier {
    LogServiceFileDescriptorSupplier() {}
  }

  private static final class LogServiceMethodDescriptorSupplier
      extends LogServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LogServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LogServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LogServiceFileDescriptorSupplier())
              .addMethod(getLoggingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
