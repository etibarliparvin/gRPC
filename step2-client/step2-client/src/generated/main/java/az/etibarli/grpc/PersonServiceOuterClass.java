// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/person-service.proto

package az.etibarli.grpc;

public final class PersonServiceOuterClass {
  private PersonServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PersonRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PersonRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PersonResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PersonResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031grpc/person-service.proto\"\035\n\rPersonReq" +
      "uest\022\014\n\004name\030\001 \001(\t\"*\n\016PersonResponse\022\n\n\002" +
      "id\030\001 \001(\005\022\014\n\004name\030\002 \001(\t2>\n\rPersonService\022" +
      "-\n\nsavePerson\022\016.PersonRequest\032\017.PersonRe" +
      "sponseB\024\n\020az.etibarli.grpcP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PersonRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PersonRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PersonRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_PersonResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_PersonResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PersonResponse_descriptor,
        new java.lang.String[] { "Id", "Name", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
