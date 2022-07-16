package az.etibarli.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: grpc/bank-service.proto")
public final class BankServiceGrpc {

  private BankServiceGrpc() {}

  public static final String SERVICE_NAME = "BankService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<az.etibarli.grpc.BalanceCheckRequest,
      az.etibarli.grpc.Balance> getGetBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBalance",
      requestType = az.etibarli.grpc.BalanceCheckRequest.class,
      responseType = az.etibarli.grpc.Balance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<az.etibarli.grpc.BalanceCheckRequest,
      az.etibarli.grpc.Balance> getGetBalanceMethod() {
    io.grpc.MethodDescriptor<az.etibarli.grpc.BalanceCheckRequest, az.etibarli.grpc.Balance> getGetBalanceMethod;
    if ((getGetBalanceMethod = BankServiceGrpc.getGetBalanceMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetBalanceMethod = BankServiceGrpc.getGetBalanceMethod) == null) {
          BankServiceGrpc.getGetBalanceMethod = getGetBalanceMethod =
              io.grpc.MethodDescriptor.<az.etibarli.grpc.BalanceCheckRequest, az.etibarli.grpc.Balance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  az.etibarli.grpc.BalanceCheckRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  az.etibarli.grpc.Balance.getDefaultInstance()))
              .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getBalance"))
              .build();
        }
      }
    }
    return getGetBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<az.etibarli.grpc.WithdrawRequest,
      az.etibarli.grpc.Money> getWithdrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "withdraw",
      requestType = az.etibarli.grpc.WithdrawRequest.class,
      responseType = az.etibarli.grpc.Money.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<az.etibarli.grpc.WithdrawRequest,
      az.etibarli.grpc.Money> getWithdrawMethod() {
    io.grpc.MethodDescriptor<az.etibarli.grpc.WithdrawRequest, az.etibarli.grpc.Money> getWithdrawMethod;
    if ((getWithdrawMethod = BankServiceGrpc.getWithdrawMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getWithdrawMethod = BankServiceGrpc.getWithdrawMethod) == null) {
          BankServiceGrpc.getWithdrawMethod = getWithdrawMethod =
              io.grpc.MethodDescriptor.<az.etibarli.grpc.WithdrawRequest, az.etibarli.grpc.Money>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "withdraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  az.etibarli.grpc.WithdrawRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  az.etibarli.grpc.Money.getDefaultInstance()))
              .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("withdraw"))
              .build();
        }
      }
    }
    return getWithdrawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<az.etibarli.grpc.DepositRequest,
      az.etibarli.grpc.Balance> getCashDepositMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cashDeposit",
      requestType = az.etibarli.grpc.DepositRequest.class,
      responseType = az.etibarli.grpc.Balance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<az.etibarli.grpc.DepositRequest,
      az.etibarli.grpc.Balance> getCashDepositMethod() {
    io.grpc.MethodDescriptor<az.etibarli.grpc.DepositRequest, az.etibarli.grpc.Balance> getCashDepositMethod;
    if ((getCashDepositMethod = BankServiceGrpc.getCashDepositMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getCashDepositMethod = BankServiceGrpc.getCashDepositMethod) == null) {
          BankServiceGrpc.getCashDepositMethod = getCashDepositMethod =
              io.grpc.MethodDescriptor.<az.etibarli.grpc.DepositRequest, az.etibarli.grpc.Balance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "cashDeposit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  az.etibarli.grpc.DepositRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  az.etibarli.grpc.Balance.getDefaultInstance()))
              .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("cashDeposit"))
              .build();
        }
      }
    }
    return getCashDepositMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BankServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BankServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BankServiceStub>() {
        @java.lang.Override
        public BankServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BankServiceStub(channel, callOptions);
        }
      };
    return BankServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BankServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BankServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BankServiceBlockingStub>() {
        @java.lang.Override
        public BankServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BankServiceBlockingStub(channel, callOptions);
        }
      };
    return BankServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BankServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BankServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BankServiceFutureStub>() {
        @java.lang.Override
        public BankServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BankServiceFutureStub(channel, callOptions);
        }
      };
    return BankServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class BankServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * unary
     * </pre>
     */
    public void getBalance(az.etibarli.grpc.BalanceCheckRequest request,
        io.grpc.stub.StreamObserver<az.etibarli.grpc.Balance> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBalanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * server-side streaming
     * </pre>
     */
    public void withdraw(az.etibarli.grpc.WithdrawRequest request,
        io.grpc.stub.StreamObserver<az.etibarli.grpc.Money> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawMethod(), responseObserver);
    }

    /**
     * <pre>
     * client-side streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<az.etibarli.grpc.DepositRequest> cashDeposit(
        io.grpc.stub.StreamObserver<az.etibarli.grpc.Balance> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCashDepositMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetBalanceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                az.etibarli.grpc.BalanceCheckRequest,
                az.etibarli.grpc.Balance>(
                  this, METHODID_GET_BALANCE)))
          .addMethod(
            getWithdrawMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                az.etibarli.grpc.WithdrawRequest,
                az.etibarli.grpc.Money>(
                  this, METHODID_WITHDRAW)))
          .addMethod(
            getCashDepositMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                az.etibarli.grpc.DepositRequest,
                az.etibarli.grpc.Balance>(
                  this, METHODID_CASH_DEPOSIT)))
          .build();
    }
  }

  /**
   */
  public static final class BankServiceStub extends io.grpc.stub.AbstractAsyncStub<BankServiceStub> {
    private BankServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BankServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary
     * </pre>
     */
    public void getBalance(az.etibarli.grpc.BalanceCheckRequest request,
        io.grpc.stub.StreamObserver<az.etibarli.grpc.Balance> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * server-side streaming
     * </pre>
     */
    public void withdraw(az.etibarli.grpc.WithdrawRequest request,
        io.grpc.stub.StreamObserver<az.etibarli.grpc.Money> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * client-side streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<az.etibarli.grpc.DepositRequest> cashDeposit(
        io.grpc.stub.StreamObserver<az.etibarli.grpc.Balance> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getCashDepositMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class BankServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<BankServiceBlockingStub> {
    private BankServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BankServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary
     * </pre>
     */
    public az.etibarli.grpc.Balance getBalance(az.etibarli.grpc.BalanceCheckRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBalanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * server-side streaming
     * </pre>
     */
    public java.util.Iterator<az.etibarli.grpc.Money> withdraw(
        az.etibarli.grpc.WithdrawRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getWithdrawMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BankServiceFutureStub extends io.grpc.stub.AbstractFutureStub<BankServiceFutureStub> {
    private BankServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BankServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<az.etibarli.grpc.Balance> getBalance(
        az.etibarli.grpc.BalanceCheckRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBalanceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BALANCE = 0;
  private static final int METHODID_WITHDRAW = 1;
  private static final int METHODID_CASH_DEPOSIT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BankServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BankServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BALANCE:
          serviceImpl.getBalance((az.etibarli.grpc.BalanceCheckRequest) request,
              (io.grpc.stub.StreamObserver<az.etibarli.grpc.Balance>) responseObserver);
          break;
        case METHODID_WITHDRAW:
          serviceImpl.withdraw((az.etibarli.grpc.WithdrawRequest) request,
              (io.grpc.stub.StreamObserver<az.etibarli.grpc.Money>) responseObserver);
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
        case METHODID_CASH_DEPOSIT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.cashDeposit(
              (io.grpc.stub.StreamObserver<az.etibarli.grpc.Balance>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BankServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return az.etibarli.grpc.BankServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BankService");
    }
  }

  private static final class BankServiceFileDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier {
    BankServiceFileDescriptorSupplier() {}
  }

  private static final class BankServiceMethodDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BankServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BankServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BankServiceFileDescriptorSupplier())
              .addMethod(getGetBalanceMethod())
              .addMethod(getWithdrawMethod())
              .addMethod(getCashDepositMethod())
              .build();
        }
      }
    }
    return result;
  }
}
