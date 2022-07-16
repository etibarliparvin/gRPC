package az.etibarli.gameserver.server;

import az.etibarli.models.Die;
import az.etibarli.models.GameState;
import az.etibarli.models.Player;
import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.concurrent.ThreadLocalRandom;

@NoArgsConstructor
@AllArgsConstructor
public class DieStreamingRequest implements StreamObserver<Die> {

    private Player client;
    private Player server;
    private StreamObserver<GameState> gameStateStreamObserver;

    @Override
    public void onNext(Die die) {
        this.client = this.getNewPlayerPosition(this.client, die.getValue());

        if (this.client.getPosition() != 100) {
            this.server = this.getNewPlayerPosition(this.server, ThreadLocalRandom.current().nextLong(1, 7));
        }

        this.gameStateStreamObserver.onNext(this.getGameState());
    }

    @Override
    public void onError(Throwable t) {

    }

    @Override
    public void onCompleted() {
        this.gameStateStreamObserver.onCompleted();
    }

    private GameState getGameState() {
        return GameState.newBuilder()
                .addPlayer(this.client)
                .addPlayer(this.server)
                .build();
    }

    private Player getNewPlayerPosition(Player player, long dieValue) {
        long position = player.getPosition() + dieValue;
        if (position <= 100) {
            player = player.toBuilder()
                    .setPosition(position)
                    .build();
        }
        return player;
    }
}
