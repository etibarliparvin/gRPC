// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/GreetingService.proto

package az.etibarli.grpc;

public interface HelloRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:HelloRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>repeated string hobbies = 2;</code>
   * @return A list containing the hobbies.
   */
  java.util.List<java.lang.String>
      getHobbiesList();
  /**
   * <code>repeated string hobbies = 2;</code>
   * @return The count of hobbies.
   */
  int getHobbiesCount();
  /**
   * <code>repeated string hobbies = 2;</code>
   * @param index The index of the element to return.
   * @return The hobbies at the given index.
   */
  java.lang.String getHobbies(int index);
  /**
   * <code>repeated string hobbies = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the hobbies at the given index.
   */
  com.google.protobuf.ByteString
      getHobbiesBytes(int index);
}
