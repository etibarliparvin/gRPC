package az.etibarli.gameserver.server;

import az.etibarli.models.Die;
import az.etibarli.models.GameServiceGrpc;
import az.etibarli.models.GameState;
import io.grpc.stub.StreamObserver;

public class GameService extends GameServiceGrpc.GameServiceImplBase {

    @Override
    public StreamObserver<Die> roll(StreamObserver<GameState> responseObserver) {
        StreamObserver<Die> streamObserver = new StreamObserver<Die>() {
            @Override
            public void onNext(Die value) {

            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {

            }
        };
        return null;
    }
}
