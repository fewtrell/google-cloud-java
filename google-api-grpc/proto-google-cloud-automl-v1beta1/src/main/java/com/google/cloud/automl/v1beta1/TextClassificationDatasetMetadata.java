// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/text.proto

package com.google.cloud.automl.v1beta1;

/**
 * <pre>
 * Dataset metadata for classification.
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1beta1.TextClassificationDatasetMetadata}
 */
public  final class TextClassificationDatasetMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1beta1.TextClassificationDatasetMetadata)
    TextClassificationDatasetMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TextClassificationDatasetMetadata.newBuilder() to construct.
  private TextClassificationDatasetMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TextClassificationDatasetMetadata() {
    classificationType_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TextClassificationDatasetMetadata(
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
          case 8: {
            int rawValue = input.readEnum();

            classificationType_ = rawValue;
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
    return com.google.cloud.automl.v1beta1.TextProto.internal_static_google_cloud_automl_v1beta1_TextClassificationDatasetMetadata_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1beta1.TextProto.internal_static_google_cloud_automl_v1beta1_TextClassificationDatasetMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadata.class, com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadata.Builder.class);
  }

  public static final int CLASSIFICATION_TYPE_FIELD_NUMBER = 1;
  private int classificationType_;
  /**
   * <pre>
   * Required.
   * Type of the classification problem.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.ClassificationType classification_type = 1;</code>
   */
  public int getClassificationTypeValue() {
    return classificationType_;
  }
  /**
   * <pre>
   * Required.
   * Type of the classification problem.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.ClassificationType classification_type = 1;</code>
   */
  public com.google.cloud.automl.v1beta1.ClassificationProto.ClassificationType getClassificationType() {
    com.google.cloud.automl.v1beta1.ClassificationProto.ClassificationType result = com.google.cloud.automl.v1beta1.ClassificationProto.ClassificationType.valueOf(classificationType_);
    return result == null ? com.google.cloud.automl.v1beta1.ClassificationProto.ClassificationType.UNRECOGNIZED : result;
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
    if (classificationType_ != com.google.cloud.automl.v1beta1.ClassificationProto.ClassificationType.CLASSIFICATION_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, classificationType_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (classificationType_ != com.google.cloud.automl.v1beta1.ClassificationProto.ClassificationType.CLASSIFICATION_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, classificationType_);
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
    if (!(obj instanceof com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadata other = (com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadata) obj;

    boolean result = true;
    result = result && classificationType_ == other.classificationType_;
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
    hash = (37 * hash) + CLASSIFICATION_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + classificationType_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadata parseFrom(
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
  public static Builder newBuilder(com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadata prototype) {
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
   * Dataset metadata for classification.
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1beta1.TextClassificationDatasetMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1beta1.TextClassificationDatasetMetadata)
      com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.automl.v1beta1.TextProto.internal_static_google_cloud_automl_v1beta1_TextClassificationDatasetMetadata_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1beta1.TextProto.internal_static_google_cloud_automl_v1beta1_TextClassificationDatasetMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadata.class, com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadata.Builder.class);
    }

    // Construct using com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadata.newBuilder()
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
      classificationType_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.automl.v1beta1.TextProto.internal_static_google_cloud_automl_v1beta1_TextClassificationDatasetMetadata_descriptor;
    }

    public com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadata getDefaultInstanceForType() {
      return com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadata.getDefaultInstance();
    }

    public com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadata build() {
      com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadata buildPartial() {
      com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadata result = new com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadata(this);
      result.classificationType_ = classificationType_;
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
      if (other instanceof com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadata) {
        return mergeFrom((com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadata other) {
      if (other == com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadata.getDefaultInstance()) return this;
      if (other.classificationType_ != 0) {
        setClassificationTypeValue(other.getClassificationTypeValue());
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
      com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int classificationType_ = 0;
    /**
     * <pre>
     * Required.
     * Type of the classification problem.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.ClassificationType classification_type = 1;</code>
     */
    public int getClassificationTypeValue() {
      return classificationType_;
    }
    /**
     * <pre>
     * Required.
     * Type of the classification problem.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.ClassificationType classification_type = 1;</code>
     */
    public Builder setClassificationTypeValue(int value) {
      classificationType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required.
     * Type of the classification problem.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.ClassificationType classification_type = 1;</code>
     */
    public com.google.cloud.automl.v1beta1.ClassificationProto.ClassificationType getClassificationType() {
      com.google.cloud.automl.v1beta1.ClassificationProto.ClassificationType result = com.google.cloud.automl.v1beta1.ClassificationProto.ClassificationType.valueOf(classificationType_);
      return result == null ? com.google.cloud.automl.v1beta1.ClassificationProto.ClassificationType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Required.
     * Type of the classification problem.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.ClassificationType classification_type = 1;</code>
     */
    public Builder setClassificationType(com.google.cloud.automl.v1beta1.ClassificationProto.ClassificationType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      classificationType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required.
     * Type of the classification problem.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.ClassificationType classification_type = 1;</code>
     */
    public Builder clearClassificationType() {
      
      classificationType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1beta1.TextClassificationDatasetMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.TextClassificationDatasetMetadata)
  private static final com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadata();
  }

  public static com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TextClassificationDatasetMetadata>
      PARSER = new com.google.protobuf.AbstractParser<TextClassificationDatasetMetadata>() {
    public TextClassificationDatasetMetadata parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new TextClassificationDatasetMetadata(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TextClassificationDatasetMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TextClassificationDatasetMetadata> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

