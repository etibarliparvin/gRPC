package az.etibarli.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: grpc/person-service.proto")
public final class PersonServiceGrpc {

  private PersonServiceGrpc() {}

  public static final String SERVICE_NAME = "PersonService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<az.etibarli.grpc.PersonRequest,
      az.etibarli.grpc.PersonResponse> getSavePersonMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "savePerson",
      requestType = az.etibarli.grpc.PersonRequest.class,
      responseType = az.etibarli.grpc.PersonResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<az.etibarli.grpc.PersonRequest,
      az.etibarli.grpc.PersonResponse> getSavePersonMethod() {
    io.grpc.MethodDescriptor<az.etibarli.grpc.PersonRequest, az.etibarli.grpc.PersonResponse> getSavePersonMethod;
    if ((getSavePersonMethod = PersonServiceGrpc.getSavePersonMethod) == null) {
      synchronized (PersonServiceGrpc.class) {
        if ((getSavePersonMethod = PersonServiceGrpc.getSavePersonMethod) == null) {
          PersonServiceGrpc.getSavePersonMethod = getSavePersonMethod =
              io.grpc.MethodDescriptor.<az.etibarli.grpc.PersonRequest, az.etibarli.grpc.PersonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "savePerson"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  az.etibarli.grpc.PersonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  az.etibarli.grpc.PersonResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PersonServiceMethodDescriptorSupplier("savePerson"))
              .build();
        }
      }
    }
    return getSavePersonMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PersonServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PersonServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PersonServiceStub>() {
        @java.lang.Override
        public PersonServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PersonServiceStub(channel, callOptions);
        }
      };
    return PersonServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PersonServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PersonServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PersonServiceBlockingStub>() {
        @java.lang.Override
        public PersonServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PersonServiceBlockingStub(channel, callOptions);
        }
      };
    return PersonServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PersonServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PersonServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PersonServiceFutureStub>() {
        @java.lang.Override
        public PersonServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PersonServiceFutureStub(channel, callOptions);
        }
      };
    return PersonServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PersonServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * unary
     * </pre>
     */
    public void savePerson(az.etibarli.grpc.PersonRequest request,
        io.grpc.stub.StreamObserver<az.etibarli.grpc.PersonResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSavePersonMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSavePersonMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                az.etibarli.grpc.PersonRequest,
                az.etibarli.grpc.PersonResponse>(
                  this, METHODID_SAVE_PERSON)))
          .build();
    }
  }

  /**
   */
  public static final class PersonServiceStub extends io.grpc.stub.AbstractAsyncStub<PersonServiceStub> {
    private PersonServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PersonServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary
     * </pre>
     */
    public void savePerson(az.etibarli.grpc.PersonRequest request,
        io.grpc.stub.StreamObserver<az.etibarli.grpc.PersonResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSavePersonMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PersonServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PersonServiceBlockingStub> {
    private PersonServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PersonServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary
     * </pre>
     */
    public az.etibarli.grpc.PersonResponse savePerson(az.etibarli.grpc.PersonRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSavePersonMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PersonServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PersonServiceFutureStub> {
    private PersonServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PersonServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<az.etibarli.grpc.PersonResponse> savePerson(
        az.etibarli.grpc.PersonRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSavePersonMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_PERSON = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PersonServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PersonServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_PERSON:
          serviceImpl.savePerson((az.etibarli.grpc.PersonRequest) request,
              (io.grpc.stub.StreamObserver<az.etibarli.grpc.PersonResponse>) responseObserver);
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

  private static abstract class PersonServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PersonServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return az.etibarli.grpc.PersonServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PersonService");
    }
  }

  private static final class PersonServiceFileDescriptorSupplier
      extends PersonServiceBaseDescriptorSupplier {
    PersonServiceFileDescriptorSupplier() {}
  }

  private static final class PersonServiceMethodDescriptorSupplier
      extends PersonServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PersonServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PersonServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PersonServiceFileDescriptorSupplier())
              .addMethod(getSavePersonMethod())
              .build();
        }
      }
    }
    return result;
  }
}
