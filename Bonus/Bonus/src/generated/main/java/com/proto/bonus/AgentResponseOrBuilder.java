// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bonus/agent.proto

package com.proto.bonus;

public interface AgentResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bonus.AgentResponse)
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
   * <code>int64 age = 2;</code>
   * @return The age.
   */
  long getAge();

  /**
   * <code>int64 ticket_count = 3;</code>
   * @return The ticketCount.
   */
  long getTicketCount();

  /**
   * <code>bool bonus = 4;</code>
   * @return The bonus.
   */
  boolean getBonus();
}
