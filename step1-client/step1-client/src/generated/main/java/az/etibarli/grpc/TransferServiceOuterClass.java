// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/transfer-service.proto

package az.etibarli.grpc;

public final class TransferServiceOuterClass {
  private TransferServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TransferRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TransferRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Account_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Account_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TransferResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TransferResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033grpc/transfer-service.proto\"K\n\017Transfe" +
      "rRequest\022\024\n\014from_account\030\001 \001(\005\022\022\n\nto_acc" +
      "ount\030\002 \001(\005\022\016\n\006amount\030\003 \001(\005\"1\n\007Account\022\026\n" +
      "\016account_number\030\001 \001(\005\022\016\n\006amount\030\002 \001(\005\"O\n" +
      "\020TransferResponse\022\037\n\006status\030\001 \001(\0162\017.Tran" +
      "sferStatus\022\032\n\010accounts\030\002 \003(\0132\010.Account*)" +
      "\n\016TransferStatus\022\n\n\006FAILED\020\000\022\013\n\007SUCCESS\020" +
      "\0012F\n\017TransferService\0223\n\010transfer\022\020.Trans" +
      "ferRequest\032\021.TransferResponse(\0010\001B\024\n\020az." +
      "etibarli.grpcP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TransferRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TransferRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TransferRequest_descriptor,
        new java.lang.String[] { "FromAccount", "ToAccount", "Amount", });
    internal_static_Account_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Account_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Account_descriptor,
        new java.lang.String[] { "AccountNumber", "Amount", });
    internal_static_TransferResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_TransferResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TransferResponse_descriptor,
        new java.lang.String[] { "Status", "Accounts", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
