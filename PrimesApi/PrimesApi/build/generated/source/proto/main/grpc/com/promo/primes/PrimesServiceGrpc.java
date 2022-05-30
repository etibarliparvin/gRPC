package com.promo.primes;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.1)",
    comments = "Source: primes/primes.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PrimesServiceGrpc {

  private PrimesServiceGrpc() {}

  public static final String SERVICE_NAME = "primes.PrimesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.primes.PrimeRequest,
      com.proto.primes.PrimeResponse> getCalculateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "calculate",
      requestType = com.proto.primes.PrimeRequest.class,
      responseType = com.proto.primes.PrimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.primes.PrimeRequest,
      com.proto.primes.PrimeResponse> getCalculateMethod() {
    io.grpc.MethodDescriptor<com.proto.primes.PrimeRequest, com.proto.primes.PrimeResponse> getCalculateMethod;
    if ((getCalculateMethod = PrimesServiceGrpc.getCalculateMethod) == null) {
      synchronized (PrimesServiceGrpc.class) {
        if ((getCalculateMethod = PrimesServiceGrpc.getCalculateMethod) == null) {
          PrimesServiceGrpc.getCalculateMethod = getCalculateMethod =
              io.grpc.MethodDescriptor.<com.proto.primes.PrimeRequest, com.proto.primes.PrimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "calculate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.primes.PrimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.primes.PrimeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrimesServiceMethodDescriptorSupplier("calculate"))
              .build();
        }
      }
    }
    return getCalculateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PrimesServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrimesServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrimesServiceStub>() {
        @java.lang.Override
        public PrimesServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrimesServiceStub(channel, callOptions);
        }
      };
    return PrimesServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PrimesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrimesServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrimesServiceBlockingStub>() {
        @java.lang.Override
        public PrimesServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrimesServiceBlockingStub(channel, callOptions);
        }
      };
    return PrimesServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PrimesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrimesServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrimesServiceFutureStub>() {
        @java.lang.Override
        public PrimesServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrimesServiceFutureStub(channel, callOptions);
        }
      };
    return PrimesServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PrimesServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void calculate(com.proto.primes.PrimeRequest request,
        io.grpc.stub.StreamObserver<com.proto.primes.PrimeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCalculateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCalculateMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.primes.PrimeRequest,
                com.proto.primes.PrimeResponse>(
                  this, METHODID_CALCULATE)))
          .build();
    }
  }

  /**
   */
  public static final class PrimesServiceStub extends io.grpc.stub.AbstractAsyncStub<PrimesServiceStub> {
    private PrimesServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrimesServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrimesServiceStub(channel, callOptions);
    }

    /**
     */
    public void calculate(com.proto.primes.PrimeRequest request,
        io.grpc.stub.StreamObserver<com.proto.primes.PrimeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getCalculateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PrimesServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PrimesServiceBlockingStub> {
    private PrimesServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrimesServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrimesServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.proto.primes.PrimeResponse> calculate(
        com.proto.primes.PrimeRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getCalculateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PrimesServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PrimesServiceFutureStub> {
    private PrimesServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrimesServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrimesServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_CALCULATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PrimesServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PrimesServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CALCULATE:
          serviceImpl.calculate((com.proto.primes.PrimeRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.primes.PrimeResponse>) responseObserver);
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

  private static abstract class PrimesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PrimesServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.promo.primes.Primes.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PrimesService");
    }
  }

  private static final class PrimesServiceFileDescriptorSupplier
      extends PrimesServiceBaseDescriptorSupplier {
    PrimesServiceFileDescriptorSupplier() {}
  }

  private static final class PrimesServiceMethodDescriptorSupplier
      extends PrimesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PrimesServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PrimesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PrimesServiceFileDescriptorSupplier())
              .addMethod(getCalculateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
