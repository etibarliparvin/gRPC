package com.proto.maximum;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.1)",
    comments = "Source: maximum/max.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MaximumServiceGrpc {

  private MaximumServiceGrpc() {}

  public static final String SERVICE_NAME = "maximum.MaximumService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.maximum.MaximunRequest,
      com.proto.maximum.MaximumResponse> getCalculateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "calculate",
      requestType = com.proto.maximum.MaximunRequest.class,
      responseType = com.proto.maximum.MaximumResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.maximum.MaximunRequest,
      com.proto.maximum.MaximumResponse> getCalculateMethod() {
    io.grpc.MethodDescriptor<com.proto.maximum.MaximunRequest, com.proto.maximum.MaximumResponse> getCalculateMethod;
    if ((getCalculateMethod = MaximumServiceGrpc.getCalculateMethod) == null) {
      synchronized (MaximumServiceGrpc.class) {
        if ((getCalculateMethod = MaximumServiceGrpc.getCalculateMethod) == null) {
          MaximumServiceGrpc.getCalculateMethod = getCalculateMethod =
              io.grpc.MethodDescriptor.<com.proto.maximum.MaximunRequest, com.proto.maximum.MaximumResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "calculate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.maximum.MaximunRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.maximum.MaximumResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MaximumServiceMethodDescriptorSupplier("calculate"))
              .build();
        }
      }
    }
    return getCalculateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MaximumServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MaximumServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MaximumServiceStub>() {
        @java.lang.Override
        public MaximumServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MaximumServiceStub(channel, callOptions);
        }
      };
    return MaximumServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MaximumServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MaximumServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MaximumServiceBlockingStub>() {
        @java.lang.Override
        public MaximumServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MaximumServiceBlockingStub(channel, callOptions);
        }
      };
    return MaximumServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MaximumServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MaximumServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MaximumServiceFutureStub>() {
        @java.lang.Override
        public MaximumServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MaximumServiceFutureStub(channel, callOptions);
        }
      };
    return MaximumServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MaximumServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.maximum.MaximunRequest> calculate(
        io.grpc.stub.StreamObserver<com.proto.maximum.MaximumResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCalculateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCalculateMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.proto.maximum.MaximunRequest,
                com.proto.maximum.MaximumResponse>(
                  this, METHODID_CALCULATE)))
          .build();
    }
  }

  /**
   */
  public static final class MaximumServiceStub extends io.grpc.stub.AbstractAsyncStub<MaximumServiceStub> {
    private MaximumServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MaximumServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MaximumServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.maximum.MaximunRequest> calculate(
        io.grpc.stub.StreamObserver<com.proto.maximum.MaximumResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getCalculateMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class MaximumServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MaximumServiceBlockingStub> {
    private MaximumServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MaximumServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MaximumServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class MaximumServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MaximumServiceFutureStub> {
    private MaximumServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MaximumServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MaximumServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_CALCULATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MaximumServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MaximumServiceImplBase serviceImpl, int methodId) {
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
        case METHODID_CALCULATE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.calculate(
              (io.grpc.stub.StreamObserver<com.proto.maximum.MaximumResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MaximumServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MaximumServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.maximum.Max.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MaximumService");
    }
  }

  private static final class MaximumServiceFileDescriptorSupplier
      extends MaximumServiceBaseDescriptorSupplier {
    MaximumServiceFileDescriptorSupplier() {}
  }

  private static final class MaximumServiceMethodDescriptorSupplier
      extends MaximumServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MaximumServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MaximumServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MaximumServiceFileDescriptorSupplier())
              .addMethod(getCalculateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
