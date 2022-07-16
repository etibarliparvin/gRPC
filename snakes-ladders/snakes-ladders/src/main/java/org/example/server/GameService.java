package org.example.server;

import az.etibarli.grpc.Die;
import az.etibarli.grpc.GameServiceGrpc;
import az.etibarli.grpc.GameState;
import az.etibarli.grpc.Player;
import io.grpc.stub.StreamObserver;

public class GameService extends GameServiceGrpc.GameServiceImplBase {

    @Override
    public StreamObserver<Die> roll(StreamObserver<GameState> responseObserver) {
        Player client = Player.newBuilder().setName("client").setPosition(0).build();
        Player server = Player.newBuilder().setName("server").setPosition(0).build();

        return new DieStreamingRequest(client, server, responseObserver);
    }
}
