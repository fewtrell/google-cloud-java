// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1beta2/workflow_templates.proto

package com.google.cloud.dataproc.v1beta2;

/**
 * <pre>
 * A request to update a workflow template.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest}
 */
public  final class UpdateWorkflowTemplateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest)
    UpdateWorkflowTemplateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateWorkflowTemplateRequest.newBuilder() to construct.
  private UpdateWorkflowTemplateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateWorkflowTemplateRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateWorkflowTemplateRequest(
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
            com.google.cloud.dataproc.v1beta2.WorkflowTemplate.Builder subBuilder = null;
            if (template_ != null) {
              subBuilder = template_.toBuilder();
            }
            template_ = input.readMessage(com.google.cloud.dataproc.v1beta2.WorkflowTemplate.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(template_);
              template_ = subBuilder.buildPartial();
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
    return com.google.cloud.dataproc.v1beta2.WorkflowTemplatesProto.internal_static_google_cloud_dataproc_v1beta2_UpdateWorkflowTemplateRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1beta2.WorkflowTemplatesProto.internal_static_google_cloud_dataproc_v1beta2_UpdateWorkflowTemplateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest.class, com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest.Builder.class);
  }

  public static final int TEMPLATE_FIELD_NUMBER = 1;
  private com.google.cloud.dataproc.v1beta2.WorkflowTemplate template_;
  /**
   * <pre>
   * Required. The updated workflow template.
   * The `template.version` field must match the current version.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.WorkflowTemplate template = 1;</code>
   */
  public boolean hasTemplate() {
    return template_ != null;
  }
  /**
   * <pre>
   * Required. The updated workflow template.
   * The `template.version` field must match the current version.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.WorkflowTemplate template = 1;</code>
   */
  public com.google.cloud.dataproc.v1beta2.WorkflowTemplate getTemplate() {
    return template_ == null ? com.google.cloud.dataproc.v1beta2.WorkflowTemplate.getDefaultInstance() : template_;
  }
  /**
   * <pre>
   * Required. The updated workflow template.
   * The `template.version` field must match the current version.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.WorkflowTemplate template = 1;</code>
   */
  public com.google.cloud.dataproc.v1beta2.WorkflowTemplateOrBuilder getTemplateOrBuilder() {
    return getTemplate();
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
    if (template_ != null) {
      output.writeMessage(1, getTemplate());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (template_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTemplate());
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
    if (!(obj instanceof com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest other = (com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest) obj;

    boolean result = true;
    result = result && (hasTemplate() == other.hasTemplate());
    if (hasTemplate()) {
      result = result && getTemplate()
          .equals(other.getTemplate());
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
    if (hasTemplate()) {
      hash = (37 * hash) + TEMPLATE_FIELD_NUMBER;
      hash = (53 * hash) + getTemplate().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest prototype) {
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
   * A request to update a workflow template.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest)
      com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dataproc.v1beta2.WorkflowTemplatesProto.internal_static_google_cloud_dataproc_v1beta2_UpdateWorkflowTemplateRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1beta2.WorkflowTemplatesProto.internal_static_google_cloud_dataproc_v1beta2_UpdateWorkflowTemplateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest.class, com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest.newBuilder()
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
      if (templateBuilder_ == null) {
        template_ = null;
      } else {
        template_ = null;
        templateBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dataproc.v1beta2.WorkflowTemplatesProto.internal_static_google_cloud_dataproc_v1beta2_UpdateWorkflowTemplateRequest_descriptor;
    }

    public com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest.getDefaultInstance();
    }

    public com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest build() {
      com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest buildPartial() {
      com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest result = new com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest(this);
      if (templateBuilder_ == null) {
        result.template_ = template_;
      } else {
        result.template_ = templateBuilder_.build();
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
      if (other instanceof com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest) {
        return mergeFrom((com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest other) {
      if (other == com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest.getDefaultInstance()) return this;
      if (other.hasTemplate()) {
        mergeTemplate(other.getTemplate());
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
      com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.dataproc.v1beta2.WorkflowTemplate template_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dataproc.v1beta2.WorkflowTemplate, com.google.cloud.dataproc.v1beta2.WorkflowTemplate.Builder, com.google.cloud.dataproc.v1beta2.WorkflowTemplateOrBuilder> templateBuilder_;
    /**
     * <pre>
     * Required. The updated workflow template.
     * The `template.version` field must match the current version.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.WorkflowTemplate template = 1;</code>
     */
    public boolean hasTemplate() {
      return templateBuilder_ != null || template_ != null;
    }
    /**
     * <pre>
     * Required. The updated workflow template.
     * The `template.version` field must match the current version.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.WorkflowTemplate template = 1;</code>
     */
    public com.google.cloud.dataproc.v1beta2.WorkflowTemplate getTemplate() {
      if (templateBuilder_ == null) {
        return template_ == null ? com.google.cloud.dataproc.v1beta2.WorkflowTemplate.getDefaultInstance() : template_;
      } else {
        return templateBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The updated workflow template.
     * The `template.version` field must match the current version.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.WorkflowTemplate template = 1;</code>
     */
    public Builder setTemplate(com.google.cloud.dataproc.v1beta2.WorkflowTemplate value) {
      if (templateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        template_ = value;
        onChanged();
      } else {
        templateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The updated workflow template.
     * The `template.version` field must match the current version.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.WorkflowTemplate template = 1;</code>
     */
    public Builder setTemplate(
        com.google.cloud.dataproc.v1beta2.WorkflowTemplate.Builder builderForValue) {
      if (templateBuilder_ == null) {
        template_ = builderForValue.build();
        onChanged();
      } else {
        templateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The updated workflow template.
     * The `template.version` field must match the current version.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.WorkflowTemplate template = 1;</code>
     */
    public Builder mergeTemplate(com.google.cloud.dataproc.v1beta2.WorkflowTemplate value) {
      if (templateBuilder_ == null) {
        if (template_ != null) {
          template_ =
            com.google.cloud.dataproc.v1beta2.WorkflowTemplate.newBuilder(template_).mergeFrom(value).buildPartial();
        } else {
          template_ = value;
        }
        onChanged();
      } else {
        templateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The updated workflow template.
     * The `template.version` field must match the current version.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.WorkflowTemplate template = 1;</code>
     */
    public Builder clearTemplate() {
      if (templateBuilder_ == null) {
        template_ = null;
        onChanged();
      } else {
        template_ = null;
        templateBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The updated workflow template.
     * The `template.version` field must match the current version.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.WorkflowTemplate template = 1;</code>
     */
    public com.google.cloud.dataproc.v1beta2.WorkflowTemplate.Builder getTemplateBuilder() {
      
      onChanged();
      return getTemplateFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The updated workflow template.
     * The `template.version` field must match the current version.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.WorkflowTemplate template = 1;</code>
     */
    public com.google.cloud.dataproc.v1beta2.WorkflowTemplateOrBuilder getTemplateOrBuilder() {
      if (templateBuilder_ != null) {
        return templateBuilder_.getMessageOrBuilder();
      } else {
        return template_ == null ?
            com.google.cloud.dataproc.v1beta2.WorkflowTemplate.getDefaultInstance() : template_;
      }
    }
    /**
     * <pre>
     * Required. The updated workflow template.
     * The `template.version` field must match the current version.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.WorkflowTemplate template = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dataproc.v1beta2.WorkflowTemplate, com.google.cloud.dataproc.v1beta2.WorkflowTemplate.Builder, com.google.cloud.dataproc.v1beta2.WorkflowTemplateOrBuilder> 
        getTemplateFieldBuilder() {
      if (templateBuilder_ == null) {
        templateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataproc.v1beta2.WorkflowTemplate, com.google.cloud.dataproc.v1beta2.WorkflowTemplate.Builder, com.google.cloud.dataproc.v1beta2.WorkflowTemplateOrBuilder>(
                getTemplate(),
                getParentForChildren(),
                isClean());
        template_ = null;
      }
      return templateBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest)
  private static final com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest();
  }

  public static com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateWorkflowTemplateRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateWorkflowTemplateRequest>() {
    public UpdateWorkflowTemplateRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new UpdateWorkflowTemplateRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateWorkflowTemplateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateWorkflowTemplateRequest> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

