// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1beta1/asset_service.proto

package com.google.cloud.asset.v1beta1;

/**
 * <pre>
 * A Google Cloud Storage (GCS) location.
 * </pre>
 *
 * Protobuf type {@code google.cloud.asset.v1beta1.GcsDestination}
 */
public  final class GcsDestination extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.asset.v1beta1.GcsDestination)
    GcsDestinationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GcsDestination.newBuilder() to construct.
  private GcsDestination(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GcsDestination() {
    uri_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GcsDestination(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            uri_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.asset.v1beta1.AssetServiceProto.internal_static_google_cloud_asset_v1beta1_GcsDestination_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.asset.v1beta1.AssetServiceProto.internal_static_google_cloud_asset_v1beta1_GcsDestination_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.asset.v1beta1.GcsDestination.class, com.google.cloud.asset.v1beta1.GcsDestination.Builder.class);
  }

  public static final int URI_FIELD_NUMBER = 1;
  private volatile java.lang.Object uri_;
  /**
   * <pre>
   * The path of the GCS objects. It's the same path that is used by gsutil, for
   * example: "gs://bucket_name/object_path". See:
   * https://cloud.google.com/storage/docs/viewing-editing-metadata for more
   * information.
   * </pre>
   *
   * <code>string uri = 1;</code>
   */
  public java.lang.String getUri() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The path of the GCS objects. It's the same path that is used by gsutil, for
   * example: "gs://bucket_name/object_path". See:
   * https://cloud.google.com/storage/docs/viewing-editing-metadata for more
   * information.
   * </pre>
   *
   * <code>string uri = 1;</code>
   */
  public com.google.protobuf.ByteString
      getUriBytes() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      uri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getUriBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, uri_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUriBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, uri_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.asset.v1beta1.GcsDestination)) {
      return super.equals(obj);
    }
    com.google.cloud.asset.v1beta1.GcsDestination other = (com.google.cloud.asset.v1beta1.GcsDestination) obj;

    boolean result = true;
    result = result && getUri()
        .equals(other.getUri());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + URI_FIELD_NUMBER;
    hash = (53 * hash) + getUri().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.asset.v1beta1.GcsDestination parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.asset.v1beta1.GcsDestination parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.asset.v1beta1.GcsDestination parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.asset.v1beta1.GcsDestination parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.asset.v1beta1.GcsDestination parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.asset.v1beta1.GcsDestination parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.asset.v1beta1.GcsDestination parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.asset.v1beta1.GcsDestination parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.asset.v1beta1.GcsDestination parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.asset.v1beta1.GcsDestination parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.asset.v1beta1.GcsDestination parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.asset.v1beta1.GcsDestination parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.asset.v1beta1.GcsDestination prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * A Google Cloud Storage (GCS) location.
   * </pre>
   *
   * Protobuf type {@code google.cloud.asset.v1beta1.GcsDestination}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.asset.v1beta1.GcsDestination)
      com.google.cloud.asset.v1beta1.GcsDestinationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.asset.v1beta1.AssetServiceProto.internal_static_google_cloud_asset_v1beta1_GcsDestination_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.asset.v1beta1.AssetServiceProto.internal_static_google_cloud_asset_v1beta1_GcsDestination_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.asset.v1beta1.GcsDestination.class, com.google.cloud.asset.v1beta1.GcsDestination.Builder.class);
    }

    // Construct using com.google.cloud.asset.v1beta1.GcsDestination.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      uri_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.asset.v1beta1.AssetServiceProto.internal_static_google_cloud_asset_v1beta1_GcsDestination_descriptor;
    }

    public com.google.cloud.asset.v1beta1.GcsDestination getDefaultInstanceForType() {
      return com.google.cloud.asset.v1beta1.GcsDestination.getDefaultInstance();
    }

    public com.google.cloud.asset.v1beta1.GcsDestination build() {
      com.google.cloud.asset.v1beta1.GcsDestination result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.asset.v1beta1.GcsDestination buildPartial() {
      com.google.cloud.asset.v1beta1.GcsDestination result = new com.google.cloud.asset.v1beta1.GcsDestination(this);
      result.uri_ = uri_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.asset.v1beta1.GcsDestination) {
        return mergeFrom((com.google.cloud.asset.v1beta1.GcsDestination)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.asset.v1beta1.GcsDestination other) {
      if (other == com.google.cloud.asset.v1beta1.GcsDestination.getDefaultInstance()) return this;
      if (!other.getUri().isEmpty()) {
        uri_ = other.uri_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.asset.v1beta1.GcsDestination parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.asset.v1beta1.GcsDestination) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object uri_ = "";
    /**
     * <pre>
     * The path of the GCS objects. It's the same path that is used by gsutil, for
     * example: "gs://bucket_name/object_path". See:
     * https://cloud.google.com/storage/docs/viewing-editing-metadata for more
     * information.
     * </pre>
     *
     * <code>string uri = 1;</code>
     */
    public java.lang.String getUri() {
      java.lang.Object ref = uri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The path of the GCS objects. It's the same path that is used by gsutil, for
     * example: "gs://bucket_name/object_path". See:
     * https://cloud.google.com/storage/docs/viewing-editing-metadata for more
     * information.
     * </pre>
     *
     * <code>string uri = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUriBytes() {
      java.lang.Object ref = uri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The path of the GCS objects. It's the same path that is used by gsutil, for
     * example: "gs://bucket_name/object_path". See:
     * https://cloud.google.com/storage/docs/viewing-editing-metadata for more
     * information.
     * </pre>
     *
     * <code>string uri = 1;</code>
     */
    public Builder setUri(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      uri_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The path of the GCS objects. It's the same path that is used by gsutil, for
     * example: "gs://bucket_name/object_path". See:
     * https://cloud.google.com/storage/docs/viewing-editing-metadata for more
     * information.
     * </pre>
     *
     * <code>string uri = 1;</code>
     */
    public Builder clearUri() {
      
      uri_ = getDefaultInstance().getUri();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The path of the GCS objects. It's the same path that is used by gsutil, for
     * example: "gs://bucket_name/object_path". See:
     * https://cloud.google.com/storage/docs/viewing-editing-metadata for more
     * information.
     * </pre>
     *
     * <code>string uri = 1;</code>
     */
    public Builder setUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      uri_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.asset.v1beta1.GcsDestination)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.asset.v1beta1.GcsDestination)
  private static final com.google.cloud.asset.v1beta1.GcsDestination DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.asset.v1beta1.GcsDestination();
  }

  public static com.google.cloud.asset.v1beta1.GcsDestination getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GcsDestination>
      PARSER = new com.google.protobuf.AbstractParser<GcsDestination>() {
    public GcsDestination parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GcsDestination(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GcsDestination> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GcsDestination> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.asset.v1beta1.GcsDestination getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

