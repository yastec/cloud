// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DbaasModel.proto

package io.fathom.cloud.protobuf;

public final class DbaasModel {
  private DbaasModel() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface InstanceDataOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional int64 id = 1;
    boolean hasId();
    long getId();
    
    // optional int64 project = 2;
    boolean hasProject();
    long getProject();
  }
  public static final class InstanceData extends
      com.google.protobuf.GeneratedMessage
      implements InstanceDataOrBuilder {
    // Use InstanceData.newBuilder() to construct.
    private InstanceData(Builder builder) {
      super(builder);
    }
    private InstanceData(boolean noInit) {}
    
    private static final InstanceData defaultInstance;
    public static InstanceData getDefaultInstance() {
      return defaultInstance;
    }
    
    public InstanceData getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.fathom.cloud.protobuf.DbaasModel.internal_static_fathomcloud_protobuf_InstanceData_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.fathom.cloud.protobuf.DbaasModel.internal_static_fathomcloud_protobuf_InstanceData_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional int64 id = 1;
    public static final int ID_FIELD_NUMBER = 1;
    private long id_;
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public long getId() {
      return id_;
    }
    
    // optional int64 project = 2;
    public static final int PROJECT_FIELD_NUMBER = 2;
    private long project_;
    public boolean hasProject() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public long getProject() {
      return project_;
    }
    
    private void initFields() {
      id_ = 0L;
      project_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, project_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, project_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static io.fathom.cloud.protobuf.DbaasModel.InstanceData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static io.fathom.cloud.protobuf.DbaasModel.InstanceData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static io.fathom.cloud.protobuf.DbaasModel.InstanceData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static io.fathom.cloud.protobuf.DbaasModel.InstanceData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static io.fathom.cloud.protobuf.DbaasModel.InstanceData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static io.fathom.cloud.protobuf.DbaasModel.InstanceData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static io.fathom.cloud.protobuf.DbaasModel.InstanceData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static io.fathom.cloud.protobuf.DbaasModel.InstanceData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static io.fathom.cloud.protobuf.DbaasModel.InstanceData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static io.fathom.cloud.protobuf.DbaasModel.InstanceData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(io.fathom.cloud.protobuf.DbaasModel.InstanceData prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements io.fathom.cloud.protobuf.DbaasModel.InstanceDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.fathom.cloud.protobuf.DbaasModel.internal_static_fathomcloud_protobuf_InstanceData_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.fathom.cloud.protobuf.DbaasModel.internal_static_fathomcloud_protobuf_InstanceData_fieldAccessorTable;
      }
      
      // Construct using io.fathom.cloud.protobuf.DbaasModel.InstanceData.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        id_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        project_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.fathom.cloud.protobuf.DbaasModel.InstanceData.getDescriptor();
      }
      
      public io.fathom.cloud.protobuf.DbaasModel.InstanceData getDefaultInstanceForType() {
        return io.fathom.cloud.protobuf.DbaasModel.InstanceData.getDefaultInstance();
      }
      
      public io.fathom.cloud.protobuf.DbaasModel.InstanceData build() {
        io.fathom.cloud.protobuf.DbaasModel.InstanceData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private io.fathom.cloud.protobuf.DbaasModel.InstanceData buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        io.fathom.cloud.protobuf.DbaasModel.InstanceData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public io.fathom.cloud.protobuf.DbaasModel.InstanceData buildPartial() {
        io.fathom.cloud.protobuf.DbaasModel.InstanceData result = new io.fathom.cloud.protobuf.DbaasModel.InstanceData(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.project_ = project_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.fathom.cloud.protobuf.DbaasModel.InstanceData) {
          return mergeFrom((io.fathom.cloud.protobuf.DbaasModel.InstanceData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(io.fathom.cloud.protobuf.DbaasModel.InstanceData other) {
        if (other == io.fathom.cloud.protobuf.DbaasModel.InstanceData.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasProject()) {
          setProject(other.getProject());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              id_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              project_ = input.readInt64();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional int64 id = 1;
      private long id_ ;
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public long getId() {
        return id_;
      }
      public Builder setId(long value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0L;
        onChanged();
        return this;
      }
      
      // optional int64 project = 2;
      private long project_ ;
      public boolean hasProject() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public long getProject() {
        return project_;
      }
      public Builder setProject(long value) {
        bitField0_ |= 0x00000002;
        project_ = value;
        onChanged();
        return this;
      }
      public Builder clearProject() {
        bitField0_ = (bitField0_ & ~0x00000002);
        project_ = 0L;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:fathomcloud.protobuf.InstanceData)
    }
    
    static {
      defaultInstance = new InstanceData(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:fathomcloud.protobuf.InstanceData)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_fathomcloud_protobuf_InstanceData_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_fathomcloud_protobuf_InstanceData_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020DbaasModel.proto\022\024fathomcloud.protobuf" +
      "\032\022CloudCommons.proto\"+\n\014InstanceData\022\n\n\002" +
      "id\030\001 \001(\003\022\017\n\007project\030\002 \001(\003B\032\n\030io.fathom.c" +
      "loud.protobuf"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_fathomcloud_protobuf_InstanceData_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_fathomcloud_protobuf_InstanceData_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_fathomcloud_protobuf_InstanceData_descriptor,
              new java.lang.String[] { "Id", "Project", },
              io.fathom.cloud.protobuf.DbaasModel.InstanceData.class,
              io.fathom.cloud.protobuf.DbaasModel.InstanceData.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.fathom.cloud.protobuf.CloudCommons.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
