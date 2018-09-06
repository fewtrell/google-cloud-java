// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

/**
 * Protobuf type {@code google.pubsub.v1.MessageStoragePolicy}
 */
public  final class MessageStoragePolicy extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.pubsub.v1.MessageStoragePolicy)
    MessageStoragePolicyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MessageStoragePolicy.newBuilder() to construct.
  private MessageStoragePolicy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MessageStoragePolicy() {
    allowedPersistenceRegions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MessageStoragePolicy(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              allowedPersistenceRegions_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            allowedPersistenceRegions_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        allowedPersistenceRegions_ = allowedPersistenceRegions_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_MessageStoragePolicy_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_MessageStoragePolicy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.pubsub.v1.MessageStoragePolicy.class, com.google.pubsub.v1.MessageStoragePolicy.Builder.class);
  }

  public static final int ALLOWED_PERSISTENCE_REGIONS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList allowedPersistenceRegions_;
  /**
   * <pre>
   * The list of GCP regions where messages that are published to the topic may
   * be persisted in storage. Messages published by publishers running in
   * non-allowed GCP regions (or running outside of GCP altogether) will be
   * routed for storage in one of the allowed regions. An empty list indicates a
   * misconfiguration at the project or organization level, which will result in
   * all Publish operations failing.
   * </pre>
   *
   * <code>repeated string allowed_persistence_regions = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getAllowedPersistenceRegionsList() {
    return allowedPersistenceRegions_;
  }
  /**
   * <pre>
   * The list of GCP regions where messages that are published to the topic may
   * be persisted in storage. Messages published by publishers running in
   * non-allowed GCP regions (or running outside of GCP altogether) will be
   * routed for storage in one of the allowed regions. An empty list indicates a
   * misconfiguration at the project or organization level, which will result in
   * all Publish operations failing.
   * </pre>
   *
   * <code>repeated string allowed_persistence_regions = 1;</code>
   */
  public int getAllowedPersistenceRegionsCount() {
    return allowedPersistenceRegions_.size();
  }
  /**
   * <pre>
   * The list of GCP regions where messages that are published to the topic may
   * be persisted in storage. Messages published by publishers running in
   * non-allowed GCP regions (or running outside of GCP altogether) will be
   * routed for storage in one of the allowed regions. An empty list indicates a
   * misconfiguration at the project or organization level, which will result in
   * all Publish operations failing.
   * </pre>
   *
   * <code>repeated string allowed_persistence_regions = 1;</code>
   */
  public java.lang.String getAllowedPersistenceRegions(int index) {
    return allowedPersistenceRegions_.get(index);
  }
  /**
   * <pre>
   * The list of GCP regions where messages that are published to the topic may
   * be persisted in storage. Messages published by publishers running in
   * non-allowed GCP regions (or running outside of GCP altogether) will be
   * routed for storage in one of the allowed regions. An empty list indicates a
   * misconfiguration at the project or organization level, which will result in
   * all Publish operations failing.
   * </pre>
   *
   * <code>repeated string allowed_persistence_regions = 1;</code>
   */
  public com.google.protobuf.ByteString
      getAllowedPersistenceRegionsBytes(int index) {
    return allowedPersistenceRegions_.getByteString(index);
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
    for (int i = 0; i < allowedPersistenceRegions_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, allowedPersistenceRegions_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < allowedPersistenceRegions_.size(); i++) {
        dataSize += computeStringSizeNoTag(allowedPersistenceRegions_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAllowedPersistenceRegionsList().size();
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
    if (!(obj instanceof com.google.pubsub.v1.MessageStoragePolicy)) {
      return super.equals(obj);
    }
    com.google.pubsub.v1.MessageStoragePolicy other = (com.google.pubsub.v1.MessageStoragePolicy) obj;

    boolean result = true;
    result = result && getAllowedPersistenceRegionsList()
        .equals(other.getAllowedPersistenceRegionsList());
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
    if (getAllowedPersistenceRegionsCount() > 0) {
      hash = (37 * hash) + ALLOWED_PERSISTENCE_REGIONS_FIELD_NUMBER;
      hash = (53 * hash) + getAllowedPersistenceRegionsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.pubsub.v1.MessageStoragePolicy parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.pubsub.v1.MessageStoragePolicy parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.pubsub.v1.MessageStoragePolicy parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.pubsub.v1.MessageStoragePolicy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.pubsub.v1.MessageStoragePolicy parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.pubsub.v1.MessageStoragePolicy parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.pubsub.v1.MessageStoragePolicy parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.pubsub.v1.MessageStoragePolicy parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.pubsub.v1.MessageStoragePolicy parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.pubsub.v1.MessageStoragePolicy parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.pubsub.v1.MessageStoragePolicy parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.pubsub.v1.MessageStoragePolicy parseFrom(
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
  public static Builder newBuilder(com.google.pubsub.v1.MessageStoragePolicy prototype) {
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
   * Protobuf type {@code google.pubsub.v1.MessageStoragePolicy}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.pubsub.v1.MessageStoragePolicy)
      com.google.pubsub.v1.MessageStoragePolicyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_MessageStoragePolicy_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_MessageStoragePolicy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.pubsub.v1.MessageStoragePolicy.class, com.google.pubsub.v1.MessageStoragePolicy.Builder.class);
    }

    // Construct using com.google.pubsub.v1.MessageStoragePolicy.newBuilder()
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
      allowedPersistenceRegions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_MessageStoragePolicy_descriptor;
    }

    public com.google.pubsub.v1.MessageStoragePolicy getDefaultInstanceForType() {
      return com.google.pubsub.v1.MessageStoragePolicy.getDefaultInstance();
    }

    public com.google.pubsub.v1.MessageStoragePolicy build() {
      com.google.pubsub.v1.MessageStoragePolicy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.pubsub.v1.MessageStoragePolicy buildPartial() {
      com.google.pubsub.v1.MessageStoragePolicy result = new com.google.pubsub.v1.MessageStoragePolicy(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        allowedPersistenceRegions_ = allowedPersistenceRegions_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.allowedPersistenceRegions_ = allowedPersistenceRegions_;
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
      if (other instanceof com.google.pubsub.v1.MessageStoragePolicy) {
        return mergeFrom((com.google.pubsub.v1.MessageStoragePolicy)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.pubsub.v1.MessageStoragePolicy other) {
      if (other == com.google.pubsub.v1.MessageStoragePolicy.getDefaultInstance()) return this;
      if (!other.allowedPersistenceRegions_.isEmpty()) {
        if (allowedPersistenceRegions_.isEmpty()) {
          allowedPersistenceRegions_ = other.allowedPersistenceRegions_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAllowedPersistenceRegionsIsMutable();
          allowedPersistenceRegions_.addAll(other.allowedPersistenceRegions_);
        }
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
      com.google.pubsub.v1.MessageStoragePolicy parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.pubsub.v1.MessageStoragePolicy) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList allowedPersistenceRegions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureAllowedPersistenceRegionsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        allowedPersistenceRegions_ = new com.google.protobuf.LazyStringArrayList(allowedPersistenceRegions_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * The list of GCP regions where messages that are published to the topic may
     * be persisted in storage. Messages published by publishers running in
     * non-allowed GCP regions (or running outside of GCP altogether) will be
     * routed for storage in one of the allowed regions. An empty list indicates a
     * misconfiguration at the project or organization level, which will result in
     * all Publish operations failing.
     * </pre>
     *
     * <code>repeated string allowed_persistence_regions = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getAllowedPersistenceRegionsList() {
      return allowedPersistenceRegions_.getUnmodifiableView();
    }
    /**
     * <pre>
     * The list of GCP regions where messages that are published to the topic may
     * be persisted in storage. Messages published by publishers running in
     * non-allowed GCP regions (or running outside of GCP altogether) will be
     * routed for storage in one of the allowed regions. An empty list indicates a
     * misconfiguration at the project or organization level, which will result in
     * all Publish operations failing.
     * </pre>
     *
     * <code>repeated string allowed_persistence_regions = 1;</code>
     */
    public int getAllowedPersistenceRegionsCount() {
      return allowedPersistenceRegions_.size();
    }
    /**
     * <pre>
     * The list of GCP regions where messages that are published to the topic may
     * be persisted in storage. Messages published by publishers running in
     * non-allowed GCP regions (or running outside of GCP altogether) will be
     * routed for storage in one of the allowed regions. An empty list indicates a
     * misconfiguration at the project or organization level, which will result in
     * all Publish operations failing.
     * </pre>
     *
     * <code>repeated string allowed_persistence_regions = 1;</code>
     */
    public java.lang.String getAllowedPersistenceRegions(int index) {
      return allowedPersistenceRegions_.get(index);
    }
    /**
     * <pre>
     * The list of GCP regions where messages that are published to the topic may
     * be persisted in storage. Messages published by publishers running in
     * non-allowed GCP regions (or running outside of GCP altogether) will be
     * routed for storage in one of the allowed regions. An empty list indicates a
     * misconfiguration at the project or organization level, which will result in
     * all Publish operations failing.
     * </pre>
     *
     * <code>repeated string allowed_persistence_regions = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAllowedPersistenceRegionsBytes(int index) {
      return allowedPersistenceRegions_.getByteString(index);
    }
    /**
     * <pre>
     * The list of GCP regions where messages that are published to the topic may
     * be persisted in storage. Messages published by publishers running in
     * non-allowed GCP regions (or running outside of GCP altogether) will be
     * routed for storage in one of the allowed regions. An empty list indicates a
     * misconfiguration at the project or organization level, which will result in
     * all Publish operations failing.
     * </pre>
     *
     * <code>repeated string allowed_persistence_regions = 1;</code>
     */
    public Builder setAllowedPersistenceRegions(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAllowedPersistenceRegionsIsMutable();
      allowedPersistenceRegions_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of GCP regions where messages that are published to the topic may
     * be persisted in storage. Messages published by publishers running in
     * non-allowed GCP regions (or running outside of GCP altogether) will be
     * routed for storage in one of the allowed regions. An empty list indicates a
     * misconfiguration at the project or organization level, which will result in
     * all Publish operations failing.
     * </pre>
     *
     * <code>repeated string allowed_persistence_regions = 1;</code>
     */
    public Builder addAllowedPersistenceRegions(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAllowedPersistenceRegionsIsMutable();
      allowedPersistenceRegions_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of GCP regions where messages that are published to the topic may
     * be persisted in storage. Messages published by publishers running in
     * non-allowed GCP regions (or running outside of GCP altogether) will be
     * routed for storage in one of the allowed regions. An empty list indicates a
     * misconfiguration at the project or organization level, which will result in
     * all Publish operations failing.
     * </pre>
     *
     * <code>repeated string allowed_persistence_regions = 1;</code>
     */
    public Builder addAllAllowedPersistenceRegions(
        java.lang.Iterable<java.lang.String> values) {
      ensureAllowedPersistenceRegionsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, allowedPersistenceRegions_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of GCP regions where messages that are published to the topic may
     * be persisted in storage. Messages published by publishers running in
     * non-allowed GCP regions (or running outside of GCP altogether) will be
     * routed for storage in one of the allowed regions. An empty list indicates a
     * misconfiguration at the project or organization level, which will result in
     * all Publish operations failing.
     * </pre>
     *
     * <code>repeated string allowed_persistence_regions = 1;</code>
     */
    public Builder clearAllowedPersistenceRegions() {
      allowedPersistenceRegions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of GCP regions where messages that are published to the topic may
     * be persisted in storage. Messages published by publishers running in
     * non-allowed GCP regions (or running outside of GCP altogether) will be
     * routed for storage in one of the allowed regions. An empty list indicates a
     * misconfiguration at the project or organization level, which will result in
     * all Publish operations failing.
     * </pre>
     *
     * <code>repeated string allowed_persistence_regions = 1;</code>
     */
    public Builder addAllowedPersistenceRegionsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureAllowedPersistenceRegionsIsMutable();
      allowedPersistenceRegions_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.pubsub.v1.MessageStoragePolicy)
  }

  // @@protoc_insertion_point(class_scope:google.pubsub.v1.MessageStoragePolicy)
  private static final com.google.pubsub.v1.MessageStoragePolicy DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.pubsub.v1.MessageStoragePolicy();
  }

  public static com.google.pubsub.v1.MessageStoragePolicy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MessageStoragePolicy>
      PARSER = new com.google.protobuf.AbstractParser<MessageStoragePolicy>() {
    public MessageStoragePolicy parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new MessageStoragePolicy(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MessageStoragePolicy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MessageStoragePolicy> getParserForType() {
    return PARSER;
  }

  public com.google.pubsub.v1.MessageStoragePolicy getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

