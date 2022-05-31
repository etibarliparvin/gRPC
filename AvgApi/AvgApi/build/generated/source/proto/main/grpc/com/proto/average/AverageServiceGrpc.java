package com.proto.average;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.1)",
    comments = "Source: average/averaging.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AverageServiceGrpc {

  private AverageServiceGrpc() {}

  public static final String SERVICE_NAME = "average.AverageService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.average.AverageRequest,
      com.proto.average.AverageResponse> getCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "count",
      requestType = com.proto.average.AverageRequest.class,
      responseType = com.proto.average.AverageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.average.AverageRequest,
      com.proto.average.AverageResponse> getCountMethod() {
    io.grpc.MethodDescriptor<com.proto.average.AverageRequest, com.proto.average.AverageResponse> getCountMethod;
    if ((getCountMethod = AverageServiceGrpc.getCountMethod) == null) {
      synchronized (AverageServiceGrpc.class) {
        if ((getCountMethod = AverageServiceGrpc.getCountMethod) == null) {
          AverageServiceGrpc.getCountMethod = getCountMethod =
              io.grpc.MethodDescriptor.<com.proto.average.AverageRequest, com.proto.average.AverageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "count"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.average.AverageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.average.AverageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AverageServiceMethodDescriptorSupplier("count"))
              .build();
        }
      }
    }
    return getCountMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AverageServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AverageServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AverageServiceStub>() {
        @java.lang.Override
        public AverageServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AverageServiceStub(channel, callOptions);
        }
      };
    return AverageServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AverageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AverageServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AverageServiceBlockingStub>() {
        @java.lang.Override
        public AverageServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AverageServiceBlockingStub(channel, callOptions);
        }
      };
    return AverageServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AverageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AverageServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AverageServiceFutureStub>() {
        @java.lang.Override
        public AverageServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AverageServiceFutureStub(channel, callOptions);
        }
      };
    return AverageServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AverageServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.average.AverageRequest> count(
        io.grpc.stub.StreamObserver<com.proto.average.AverageResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCountMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCountMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.proto.average.AverageRequest,
                com.proto.average.AverageResponse>(
                  this, METHODID_COUNT)))
          .build();
    }
  }

  /**
   */
  public static final class AverageServiceStub extends io.grpc.stub.AbstractAsyncStub<AverageServiceStub> {
    private AverageServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AverageServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AverageServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.average.AverageRequest> count(
        io.grpc.stub.StreamObserver<com.proto.average.AverageResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getCountMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class AverageServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AverageServiceBlockingStub> {
    private AverageServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AverageServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AverageServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class AverageServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AverageServiceFutureStub> {
    private AverageServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AverageServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AverageServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_COUNT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AverageServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AverageServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COUNT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.count(
              (io.grpc.stub.StreamObserver<com.proto.average.AverageResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AverageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AverageServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.average.Averaging.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AverageService");
    }
  }

  private static final class AverageServiceFileDescriptorSupplier
      extends AverageServiceBaseDescriptorSupplier {
    AverageServiceFileDescriptorSupplier() {}
  }

  private static final class AverageServiceMethodDescriptorSupplier
      extends AverageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AverageServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AverageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AverageServiceFileDescriptorSupplier())
              .addMethod(getCountMethod())
              .build();
        }
      }
    }
    return result;
  }
}
