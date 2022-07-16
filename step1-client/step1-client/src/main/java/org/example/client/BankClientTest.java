package org.example.client;

import az.etibarli.grpc.*;
import com.google.common.util.concurrent.Uninterruptibles;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class BankClientTest {
    public static void main(String[] args) throws InterruptedException {
//        BankServiceGrpc.BankServiceBlockingStub stub = getStub(1991);
//        BalanceCheckRequest request = BalanceCheckRequest.newBuilder()
//                .setAccountNumber(5)
//                .build();
//        Balance balance = stub.getBalance(request);
//        System.out.println("Received balance : " + balance);

        System.out.println("---------------------------------------------------------------------------");

//        BankServiceGrpc.BankServiceBlockingStub stub = getBlockingStut(1991);
//        WithdrawRequest withdrawRequest = WithdrawRequest.newBuilder().setAccountNumber(7).setAmount(40).build();
//        stub.withdraw(withdrawRequest).forEachRemaining(money -> System.out.println("Received : " + money.getValue()));

//        CountDownLatch latch = new CountDownLatch(1);
//        BankServiceGrpc.BankServiceStub stub = getNonBlockingStub(1991);
//        WithdrawRequest withdrawRequest = WithdrawRequest.newBuilder().setAccountNumber(7).setAmount(40).build();
//        stub.withdraw(withdrawRequest, new MoneyStreamingResponse(latch));
//        latch.await();

//        System.out.println("----------------------------------------------------------------------------");
//        CountDownLatch latch = new CountDownLatch(1);
//        BankServiceGrpc.BankServiceStub stub = getNonBlockingStub(1991);
//        StreamObserver<DepositRequest> streamObserver = stub.cashDeposit(new BalanceStreamObserver(latch));
//        for (int i = 0; i < 10; i++) {
//            DepositRequest request = DepositRequest.newBuilder().setAccountNumber(8).setAmount(10).build();
//            streamObserver.onNext(request);
//        }
//        streamObserver.onCompleted();
//        latch.await();

        System.out.println("----------------------------------------------------------------------------");
        CountDownLatch latch = new CountDownLatch(1);
        TransferServiceGrpc.TransferServiceStub stub = getStub(1991);
        TransferStreamingResponse response = new TransferStreamingResponse(latch);
        StreamObserver<TransferRequest> requestStreamObserver = stub.transfer(response);

        for (int i = 0; i < 100; i++) {
            TransferRequest request = TransferRequest.newBuilder()
                    .setFromAccount(ThreadLocalRandom.current().nextInt(1, 11))
                    .setToAccount(ThreadLocalRandom.current().nextInt(1, 11))
                    .setAmount(ThreadLocalRandom.current().nextInt(1, 21))
                    .build();
            requestStreamObserver.onNext(request);
        }
        requestStreamObserver.onCompleted();
        latch.await();
    }

    private static BankServiceGrpc.BankServiceBlockingStub getBlockingStub(int port) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", port)
                .usePlaintext()
                .build();
        return BankServiceGrpc.newBlockingStub(channel);
    }

    private static BankServiceGrpc.BankServiceStub getNonBlockingStub(int port) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", port)
                .usePlaintext()
                .build();
        return BankServiceGrpc.newStub(channel);
    }

    public static TransferServiceGrpc.TransferServiceStub getStub (int port) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", port)
                .usePlaintext()
                .build();
        return TransferServiceGrpc.newStub(channel);
    }
}
