package com.proto.ticket3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: ticket3/ticket3.proto")
public final class TicketServiceGrpc {

  private TicketServiceGrpc() {}

  public static final String SERVICE_NAME = "ticket3.TicketService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.ticket3.TicketRequest,
      com.proto.ticket3.TicketResponse> getGetAgentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAgent",
      requestType = com.proto.ticket3.TicketRequest.class,
      responseType = com.proto.ticket3.TicketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.ticket3.TicketRequest,
      com.proto.ticket3.TicketResponse> getGetAgentMethod() {
    io.grpc.MethodDescriptor<com.proto.ticket3.TicketRequest, com.proto.ticket3.TicketResponse> getGetAgentMethod;
    if ((getGetAgentMethod = TicketServiceGrpc.getGetAgentMethod) == null) {
      synchronized (TicketServiceGrpc.class) {
        if ((getGetAgentMethod = TicketServiceGrpc.getGetAgentMethod) == null) {
          TicketServiceGrpc.getGetAgentMethod = getGetAgentMethod =
              io.grpc.MethodDescriptor.<com.proto.ticket3.TicketRequest, com.proto.ticket3.TicketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAgent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.ticket3.TicketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.ticket3.TicketResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TicketServiceMethodDescriptorSupplier("getAgent"))
              .build();
        }
      }
    }
    return getGetAgentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TicketServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TicketServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TicketServiceStub>() {
        @java.lang.Override
        public TicketServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TicketServiceStub(channel, callOptions);
        }
      };
    return TicketServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TicketServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TicketServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TicketServiceBlockingStub>() {
        @java.lang.Override
        public TicketServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TicketServiceBlockingStub(channel, callOptions);
        }
      };
    return TicketServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TicketServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TicketServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TicketServiceFutureStub>() {
        @java.lang.Override
        public TicketServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TicketServiceFutureStub(channel, callOptions);
        }
      };
    return TicketServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TicketServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAgent(com.proto.ticket3.TicketRequest request,
        io.grpc.stub.StreamObserver<com.proto.ticket3.TicketResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAgentMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAgentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.ticket3.TicketRequest,
                com.proto.ticket3.TicketResponse>(
                  this, METHODID_GET_AGENT)))
          .build();
    }
  }

  /**
   */
  public static final class TicketServiceStub extends io.grpc.stub.AbstractAsyncStub<TicketServiceStub> {
    private TicketServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TicketServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TicketServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAgent(com.proto.ticket3.TicketRequest request,
        io.grpc.stub.StreamObserver<com.proto.ticket3.TicketResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAgentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TicketServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TicketServiceBlockingStub> {
    private TicketServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TicketServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TicketServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.ticket3.TicketResponse getAgent(com.proto.ticket3.TicketRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAgentMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TicketServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TicketServiceFutureStub> {
    private TicketServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TicketServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TicketServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.ticket3.TicketResponse> getAgent(
        com.proto.ticket3.TicketRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAgentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AGENT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TicketServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TicketServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AGENT:
          serviceImpl.getAgent((com.proto.ticket3.TicketRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.ticket3.TicketResponse>) responseObserver);
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

  private static abstract class TicketServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TicketServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.ticket3.Ticket3.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TicketService");
    }
  }

  private static final class TicketServiceFileDescriptorSupplier
      extends TicketServiceBaseDescriptorSupplier {
    TicketServiceFileDescriptorSupplier() {}
  }

  private static final class TicketServiceMethodDescriptorSupplier
      extends TicketServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TicketServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TicketServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TicketServiceFileDescriptorSupplier())
              .addMethod(getGetAgentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
