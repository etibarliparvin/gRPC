// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/game.proto

package az.etibarli.models;

public interface GameStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GameState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Player player = 1;</code>
   */
  java.util.List<az.etibarli.models.Player> 
      getPlayerList();
  /**
   * <code>repeated .Player player = 1;</code>
   */
  az.etibarli.models.Player getPlayer(int index);
  /**
   * <code>repeated .Player player = 1;</code>
   */
  int getPlayerCount();
  /**
   * <code>repeated .Player player = 1;</code>
   */
  java.util.List<? extends az.etibarli.models.PlayerOrBuilder> 
      getPlayerOrBuilderList();
  /**
   * <code>repeated .Player player = 1;</code>
   */
  az.etibarli.models.PlayerOrBuilder getPlayerOrBuilder(
      int index);
}
