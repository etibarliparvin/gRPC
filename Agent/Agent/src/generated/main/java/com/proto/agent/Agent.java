// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agent/agent.proto

package com.proto.agent;

public final class Agent {
  private Agent() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ticket_AgentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ticket_AgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ticket_AgentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ticket_AgentResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021agent/agent.proto\022\006ticket\"\032\n\014AgentRequ" +
      "est\022\n\n\002id\030\001 \001(\003\"O\n\rAgentResponse\022\014\n\004name" +
      "\030\001 \001(\t\022\013\n\003age\030\002 \001(\003\022\024\n\014ticket_count\030\003 \001(" +
      "\003\022\r\n\005bonus\030\004 \001(\0102C\n\014AgentService\0223\n\004send" +
      "\022\024.ticket.AgentRequest\032\025.ticket.AgentRes" +
      "ponseB\023\n\017com.proto.agentP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ticket_AgentRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ticket_AgentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ticket_AgentRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_ticket_AgentResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ticket_AgentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ticket_AgentResponse_descriptor,
        new java.lang.String[] { "Name", "Age", "TicketCount", "Bonus", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
