// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 * <pre>
 * Request message for UpdateStoredInfoType.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.UpdateStoredInfoTypeRequest}
 */
public  final class UpdateStoredInfoTypeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.UpdateStoredInfoTypeRequest)
    UpdateStoredInfoTypeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateStoredInfoTypeRequest.newBuilder() to construct.
  private UpdateStoredInfoTypeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateStoredInfoTypeRequest() {
    name_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateStoredInfoTypeRequest(
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

            name_ = s;
            break;
          }
          case 18: {
            com.google.privacy.dlp.v2.StoredInfoTypeConfig.Builder subBuilder = null;
            if (config_ != null) {
              subBuilder = config_.toBuilder();
            }
            config_ = input.readMessage(com.google.privacy.dlp.v2.StoredInfoTypeConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(config_);
              config_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.google.protobuf.FieldMask.Builder subBuilder = null;
            if (updateMask_ != null) {
              subBuilder = updateMask_.toBuilder();
            }
            updateMask_ = input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(updateMask_);
              updateMask_ = subBuilder.buildPartial();
            }

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
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_UpdateStoredInfoTypeRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_UpdateStoredInfoTypeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest.class, com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Resource name of organization and storedInfoType to be updated, for
   * example `organizations/433245324/storedInfoTypes/432452342` or
   * projects/project-id/storedInfoTypes/432452342.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Resource name of organization and storedInfoType to be updated, for
   * example `organizations/433245324/storedInfoTypes/432452342` or
   * projects/project-id/storedInfoTypes/432452342.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONFIG_FIELD_NUMBER = 2;
  private com.google.privacy.dlp.v2.StoredInfoTypeConfig config_;
  /**
   * <pre>
   * Updated configuration for the storedInfoType. If not provided, a new
   * version of the storedInfoType will be created with the existing
   * configuration.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.StoredInfoTypeConfig config = 2;</code>
   */
  public boolean hasConfig() {
    return config_ != null;
  }
  /**
   * <pre>
   * Updated configuration for the storedInfoType. If not provided, a new
   * version of the storedInfoType will be created with the existing
   * configuration.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.StoredInfoTypeConfig config = 2;</code>
   */
  public com.google.privacy.dlp.v2.StoredInfoTypeConfig getConfig() {
    return config_ == null ? com.google.privacy.dlp.v2.StoredInfoTypeConfig.getDefaultInstance() : config_;
  }
  /**
   * <pre>
   * Updated configuration for the storedInfoType. If not provided, a new
   * version of the storedInfoType will be created with the existing
   * configuration.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.StoredInfoTypeConfig config = 2;</code>
   */
  public com.google.privacy.dlp.v2.StoredInfoTypeConfigOrBuilder getConfigOrBuilder() {
    return getConfig();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 3;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (config_ != null) {
      output.writeMessage(2, getConfig());
    }
    if (updateMask_ != null) {
      output.writeMessage(3, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (config_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getConfig());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getUpdateMask());
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
    if (!(obj instanceof com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest other = (com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && (hasConfig() == other.hasConfig());
    if (hasConfig()) {
      result = result && getConfig()
          .equals(other.getConfig());
    }
    result = result && (hasUpdateMask() == other.hasUpdateMask());
    if (hasUpdateMask()) {
      result = result && getUpdateMask()
          .equals(other.getUpdateMask());
    }
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasConfig()) {
      hash = (37 * hash) + CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getConfig().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest parseFrom(
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
  public static Builder newBuilder(com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest prototype) {
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
   * Request message for UpdateStoredInfoType.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.UpdateStoredInfoTypeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.UpdateStoredInfoTypeRequest)
      com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_UpdateStoredInfoTypeRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_UpdateStoredInfoTypeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest.class, com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest.newBuilder()
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
      name_ = "";

      if (configBuilder_ == null) {
        config_ = null;
      } else {
        config_ = null;
        configBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_UpdateStoredInfoTypeRequest_descriptor;
    }

    public com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest.getDefaultInstance();
    }

    public com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest build() {
      com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest buildPartial() {
      com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest result = new com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest(this);
      result.name_ = name_;
      if (configBuilder_ == null) {
        result.config_ = config_;
      } else {
        result.config_ = configBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
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
      if (other instanceof com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest) {
        return mergeFrom((com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest other) {
      if (other == com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasConfig()) {
        mergeConfig(other.getConfig());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
      com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Resource name of organization and storedInfoType to be updated, for
     * example `organizations/433245324/storedInfoTypes/432452342` or
     * projects/project-id/storedInfoTypes/432452342.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Resource name of organization and storedInfoType to be updated, for
     * example `organizations/433245324/storedInfoTypes/432452342` or
     * projects/project-id/storedInfoTypes/432452342.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Resource name of organization and storedInfoType to be updated, for
     * example `organizations/433245324/storedInfoTypes/432452342` or
     * projects/project-id/storedInfoTypes/432452342.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resource name of organization and storedInfoType to be updated, for
     * example `organizations/433245324/storedInfoTypes/432452342` or
     * projects/project-id/storedInfoTypes/432452342.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resource name of organization and storedInfoType to be updated, for
     * example `organizations/433245324/storedInfoTypes/432452342` or
     * projects/project-id/storedInfoTypes/432452342.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private com.google.privacy.dlp.v2.StoredInfoTypeConfig config_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2.StoredInfoTypeConfig, com.google.privacy.dlp.v2.StoredInfoTypeConfig.Builder, com.google.privacy.dlp.v2.StoredInfoTypeConfigOrBuilder> configBuilder_;
    /**
     * <pre>
     * Updated configuration for the storedInfoType. If not provided, a new
     * version of the storedInfoType will be created with the existing
     * configuration.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.StoredInfoTypeConfig config = 2;</code>
     */
    public boolean hasConfig() {
      return configBuilder_ != null || config_ != null;
    }
    /**
     * <pre>
     * Updated configuration for the storedInfoType. If not provided, a new
     * version of the storedInfoType will be created with the existing
     * configuration.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.StoredInfoTypeConfig config = 2;</code>
     */
    public com.google.privacy.dlp.v2.StoredInfoTypeConfig getConfig() {
      if (configBuilder_ == null) {
        return config_ == null ? com.google.privacy.dlp.v2.StoredInfoTypeConfig.getDefaultInstance() : config_;
      } else {
        return configBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Updated configuration for the storedInfoType. If not provided, a new
     * version of the storedInfoType will be created with the existing
     * configuration.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.StoredInfoTypeConfig config = 2;</code>
     */
    public Builder setConfig(com.google.privacy.dlp.v2.StoredInfoTypeConfig value) {
      if (configBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        config_ = value;
        onChanged();
      } else {
        configBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Updated configuration for the storedInfoType. If not provided, a new
     * version of the storedInfoType will be created with the existing
     * configuration.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.StoredInfoTypeConfig config = 2;</code>
     */
    public Builder setConfig(
        com.google.privacy.dlp.v2.StoredInfoTypeConfig.Builder builderForValue) {
      if (configBuilder_ == null) {
        config_ = builderForValue.build();
        onChanged();
      } else {
        configBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Updated configuration for the storedInfoType. If not provided, a new
     * version of the storedInfoType will be created with the existing
     * configuration.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.StoredInfoTypeConfig config = 2;</code>
     */
    public Builder mergeConfig(com.google.privacy.dlp.v2.StoredInfoTypeConfig value) {
      if (configBuilder_ == null) {
        if (config_ != null) {
          config_ =
            com.google.privacy.dlp.v2.StoredInfoTypeConfig.newBuilder(config_).mergeFrom(value).buildPartial();
        } else {
          config_ = value;
        }
        onChanged();
      } else {
        configBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Updated configuration for the storedInfoType. If not provided, a new
     * version of the storedInfoType will be created with the existing
     * configuration.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.StoredInfoTypeConfig config = 2;</code>
     */
    public Builder clearConfig() {
      if (configBuilder_ == null) {
        config_ = null;
        onChanged();
      } else {
        config_ = null;
        configBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Updated configuration for the storedInfoType. If not provided, a new
     * version of the storedInfoType will be created with the existing
     * configuration.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.StoredInfoTypeConfig config = 2;</code>
     */
    public com.google.privacy.dlp.v2.StoredInfoTypeConfig.Builder getConfigBuilder() {
      
      onChanged();
      return getConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Updated configuration for the storedInfoType. If not provided, a new
     * version of the storedInfoType will be created with the existing
     * configuration.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.StoredInfoTypeConfig config = 2;</code>
     */
    public com.google.privacy.dlp.v2.StoredInfoTypeConfigOrBuilder getConfigOrBuilder() {
      if (configBuilder_ != null) {
        return configBuilder_.getMessageOrBuilder();
      } else {
        return config_ == null ?
            com.google.privacy.dlp.v2.StoredInfoTypeConfig.getDefaultInstance() : config_;
      }
    }
    /**
     * <pre>
     * Updated configuration for the storedInfoType. If not provided, a new
     * version of the storedInfoType will be created with the existing
     * configuration.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.StoredInfoTypeConfig config = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2.StoredInfoTypeConfig, com.google.privacy.dlp.v2.StoredInfoTypeConfig.Builder, com.google.privacy.dlp.v2.StoredInfoTypeConfigOrBuilder> 
        getConfigFieldBuilder() {
      if (configBuilder_ == null) {
        configBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.StoredInfoTypeConfig, com.google.privacy.dlp.v2.StoredInfoTypeConfig.Builder, com.google.privacy.dlp.v2.StoredInfoTypeConfigOrBuilder>(
                getConfig(),
                getParentForChildren(),
                isClean());
        config_ = null;
      }
      return configBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     * <pre>
     * Mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
            com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * Mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.UpdateStoredInfoTypeRequest)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.UpdateStoredInfoTypeRequest)
  private static final com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest();
  }

  public static com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateStoredInfoTypeRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateStoredInfoTypeRequest>() {
    public UpdateStoredInfoTypeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new UpdateStoredInfoTypeRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateStoredInfoTypeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateStoredInfoTypeRequest> getParserForType() {
    return PARSER;
  }

  public com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

