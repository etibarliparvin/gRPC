// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agent3/agent3.proto

package com.proto.agent3;

public final class Agent3 {
  private Agent3() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_agent3_AgentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_agent3_AgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_agent3_AgentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_agent3_AgentResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023agent3/agent3.proto\022\006agent3\"\032\n\014AgentRe" +
      "quest\022\n\n\002id\030\001 \001(\003\"%\n\rAgentResponse\022\024\n\014ti" +
      "cket_count\030\001 \001(\0032G\n\014AgentService\0227\n\010getC" +
      "ount\022\024.agent3.AgentRequest\032\025.agent3.Agen" +
      "tResponseB\024\n\020com.proto.agent3P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_agent3_AgentRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_agent3_AgentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_agent3_AgentRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_agent3_AgentResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_agent3_AgentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_agent3_AgentResponse_descriptor,
        new java.lang.String[] { "TicketCount", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
