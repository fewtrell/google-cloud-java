// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/v1/transaction.proto

package com.google.spanner.v1;

/**
 * <pre>
 * This message is used to select the transaction in which a
 * [Read][google.spanner.v1.Spanner.Read] or
 * [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql] call runs.
 * See [TransactionOptions][google.spanner.v1.TransactionOptions] for more information about transactions.
 * </pre>
 *
 * Protobuf type {@code google.spanner.v1.TransactionSelector}
 */
public  final class TransactionSelector extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.spanner.v1.TransactionSelector)
    TransactionSelectorOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TransactionSelector.newBuilder() to construct.
  private TransactionSelector(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TransactionSelector() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TransactionSelector(
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
            com.google.spanner.v1.TransactionOptions.Builder subBuilder = null;
            if (selectorCase_ == 1) {
              subBuilder = ((com.google.spanner.v1.TransactionOptions) selector_).toBuilder();
            }
            selector_ =
                input.readMessage(com.google.spanner.v1.TransactionOptions.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.google.spanner.v1.TransactionOptions) selector_);
              selector_ = subBuilder.buildPartial();
            }
            selectorCase_ = 1;
            break;
          }
          case 18: {
            selectorCase_ = 2;
            selector_ = input.readBytes();
            break;
          }
          case 26: {
            com.google.spanner.v1.TransactionOptions.Builder subBuilder = null;
            if (selectorCase_ == 3) {
              subBuilder = ((com.google.spanner.v1.TransactionOptions) selector_).toBuilder();
            }
            selector_ =
                input.readMessage(com.google.spanner.v1.TransactionOptions.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.google.spanner.v1.TransactionOptions) selector_);
              selector_ = subBuilder.buildPartial();
            }
            selectorCase_ = 3;
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
    return com.google.spanner.v1.TransactionProto.internal_static_google_spanner_v1_TransactionSelector_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.spanner.v1.TransactionProto.internal_static_google_spanner_v1_TransactionSelector_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.spanner.v1.TransactionSelector.class, com.google.spanner.v1.TransactionSelector.Builder.class);
  }

  private int selectorCase_ = 0;
  private java.lang.Object selector_;
  public enum SelectorCase
      implements com.google.protobuf.Internal.EnumLite {
    SINGLE_USE(1),
    ID(2),
    BEGIN(3),
    SELECTOR_NOT_SET(0);
    private final int value;
    private SelectorCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SelectorCase valueOf(int value) {
      return forNumber(value);
    }

    public static SelectorCase forNumber(int value) {
      switch (value) {
        case 1: return SINGLE_USE;
        case 2: return ID;
        case 3: return BEGIN;
        case 0: return SELECTOR_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public SelectorCase
  getSelectorCase() {
    return SelectorCase.forNumber(
        selectorCase_);
  }

  public static final int SINGLE_USE_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Execute the read or SQL query in a temporary transaction.
   * This is the most efficient way to execute a transaction that
   * consists of a single SQL query.
   * </pre>
   *
   * <code>.google.spanner.v1.TransactionOptions single_use = 1;</code>
   */
  public boolean hasSingleUse() {
    return selectorCase_ == 1;
  }
  /**
   * <pre>
   * Execute the read or SQL query in a temporary transaction.
   * This is the most efficient way to execute a transaction that
   * consists of a single SQL query.
   * </pre>
   *
   * <code>.google.spanner.v1.TransactionOptions single_use = 1;</code>
   */
  public com.google.spanner.v1.TransactionOptions getSingleUse() {
    if (selectorCase_ == 1) {
       return (com.google.spanner.v1.TransactionOptions) selector_;
    }
    return com.google.spanner.v1.TransactionOptions.getDefaultInstance();
  }
  /**
   * <pre>
   * Execute the read or SQL query in a temporary transaction.
   * This is the most efficient way to execute a transaction that
   * consists of a single SQL query.
   * </pre>
   *
   * <code>.google.spanner.v1.TransactionOptions single_use = 1;</code>
   */
  public com.google.spanner.v1.TransactionOptionsOrBuilder getSingleUseOrBuilder() {
    if (selectorCase_ == 1) {
       return (com.google.spanner.v1.TransactionOptions) selector_;
    }
    return com.google.spanner.v1.TransactionOptions.getDefaultInstance();
  }

  public static final int ID_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Execute the read or SQL query in a previously-started transaction.
   * </pre>
   *
   * <code>bytes id = 2;</code>
   */
  public com.google.protobuf.ByteString getId() {
    if (selectorCase_ == 2) {
      return (com.google.protobuf.ByteString) selector_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  public static final int BEGIN_FIELD_NUMBER = 3;
  /**
   * <pre>
   * Begin a new transaction and execute this read or SQL query in
   * it. The transaction ID of the new transaction is returned in
   * [ResultSetMetadata.transaction][google.spanner.v1.ResultSetMetadata.transaction], which is a [Transaction][google.spanner.v1.Transaction].
   * </pre>
   *
   * <code>.google.spanner.v1.TransactionOptions begin = 3;</code>
   */
  public boolean hasBegin() {
    return selectorCase_ == 3;
  }
  /**
   * <pre>
   * Begin a new transaction and execute this read or SQL query in
   * it. The transaction ID of the new transaction is returned in
   * [ResultSetMetadata.transaction][google.spanner.v1.ResultSetMetadata.transaction], which is a [Transaction][google.spanner.v1.Transaction].
   * </pre>
   *
   * <code>.google.spanner.v1.TransactionOptions begin = 3;</code>
   */
  public com.google.spanner.v1.TransactionOptions getBegin() {
    if (selectorCase_ == 3) {
       return (com.google.spanner.v1.TransactionOptions) selector_;
    }
    return com.google.spanner.v1.TransactionOptions.getDefaultInstance();
  }
  /**
   * <pre>
   * Begin a new transaction and execute this read or SQL query in
   * it. The transaction ID of the new transaction is returned in
   * [ResultSetMetadata.transaction][google.spanner.v1.ResultSetMetadata.transaction], which is a [Transaction][google.spanner.v1.Transaction].
   * </pre>
   *
   * <code>.google.spanner.v1.TransactionOptions begin = 3;</code>
   */
  public com.google.spanner.v1.TransactionOptionsOrBuilder getBeginOrBuilder() {
    if (selectorCase_ == 3) {
       return (com.google.spanner.v1.TransactionOptions) selector_;
    }
    return com.google.spanner.v1.TransactionOptions.getDefaultInstance();
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
    if (selectorCase_ == 1) {
      output.writeMessage(1, (com.google.spanner.v1.TransactionOptions) selector_);
    }
    if (selectorCase_ == 2) {
      output.writeBytes(
          2, (com.google.protobuf.ByteString) selector_);
    }
    if (selectorCase_ == 3) {
      output.writeMessage(3, (com.google.spanner.v1.TransactionOptions) selector_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (selectorCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.google.spanner.v1.TransactionOptions) selector_);
    }
    if (selectorCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            2, (com.google.protobuf.ByteString) selector_);
    }
    if (selectorCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (com.google.spanner.v1.TransactionOptions) selector_);
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
    if (!(obj instanceof com.google.spanner.v1.TransactionSelector)) {
      return super.equals(obj);
    }
    com.google.spanner.v1.TransactionSelector other = (com.google.spanner.v1.TransactionSelector) obj;

    boolean result = true;
    result = result && getSelectorCase().equals(
        other.getSelectorCase());
    if (!result) return false;
    switch (selectorCase_) {
      case 1:
        result = result && getSingleUse()
            .equals(other.getSingleUse());
        break;
      case 2:
        result = result && getId()
            .equals(other.getId());
        break;
      case 3:
        result = result && getBegin()
            .equals(other.getBegin());
        break;
      case 0:
      default:
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
    switch (selectorCase_) {
      case 1:
        hash = (37 * hash) + SINGLE_USE_FIELD_NUMBER;
        hash = (53 * hash) + getSingleUse().hashCode();
        break;
      case 2:
        hash = (37 * hash) + ID_FIELD_NUMBER;
        hash = (53 * hash) + getId().hashCode();
        break;
      case 3:
        hash = (37 * hash) + BEGIN_FIELD_NUMBER;
        hash = (53 * hash) + getBegin().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.spanner.v1.TransactionSelector parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.spanner.v1.TransactionSelector parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.spanner.v1.TransactionSelector parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.spanner.v1.TransactionSelector parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.spanner.v1.TransactionSelector parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.spanner.v1.TransactionSelector parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.spanner.v1.TransactionSelector parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.spanner.v1.TransactionSelector parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.spanner.v1.TransactionSelector parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.spanner.v1.TransactionSelector parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.spanner.v1.TransactionSelector parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.spanner.v1.TransactionSelector parseFrom(
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
  public static Builder newBuilder(com.google.spanner.v1.TransactionSelector prototype) {
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
   * This message is used to select the transaction in which a
   * [Read][google.spanner.v1.Spanner.Read] or
   * [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql] call runs.
   * See [TransactionOptions][google.spanner.v1.TransactionOptions] for more information about transactions.
   * </pre>
   *
   * Protobuf type {@code google.spanner.v1.TransactionSelector}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.spanner.v1.TransactionSelector)
      com.google.spanner.v1.TransactionSelectorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.spanner.v1.TransactionProto.internal_static_google_spanner_v1_TransactionSelector_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.spanner.v1.TransactionProto.internal_static_google_spanner_v1_TransactionSelector_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.spanner.v1.TransactionSelector.class, com.google.spanner.v1.TransactionSelector.Builder.class);
    }

    // Construct using com.google.spanner.v1.TransactionSelector.newBuilder()
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
      selectorCase_ = 0;
      selector_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.spanner.v1.TransactionProto.internal_static_google_spanner_v1_TransactionSelector_descriptor;
    }

    public com.google.spanner.v1.TransactionSelector getDefaultInstanceForType() {
      return com.google.spanner.v1.TransactionSelector.getDefaultInstance();
    }

    public com.google.spanner.v1.TransactionSelector build() {
      com.google.spanner.v1.TransactionSelector result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.spanner.v1.TransactionSelector buildPartial() {
      com.google.spanner.v1.TransactionSelector result = new com.google.spanner.v1.TransactionSelector(this);
      if (selectorCase_ == 1) {
        if (singleUseBuilder_ == null) {
          result.selector_ = selector_;
        } else {
          result.selector_ = singleUseBuilder_.build();
        }
      }
      if (selectorCase_ == 2) {
        result.selector_ = selector_;
      }
      if (selectorCase_ == 3) {
        if (beginBuilder_ == null) {
          result.selector_ = selector_;
        } else {
          result.selector_ = beginBuilder_.build();
        }
      }
      result.selectorCase_ = selectorCase_;
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
      if (other instanceof com.google.spanner.v1.TransactionSelector) {
        return mergeFrom((com.google.spanner.v1.TransactionSelector)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.spanner.v1.TransactionSelector other) {
      if (other == com.google.spanner.v1.TransactionSelector.getDefaultInstance()) return this;
      switch (other.getSelectorCase()) {
        case SINGLE_USE: {
          mergeSingleUse(other.getSingleUse());
          break;
        }
        case ID: {
          setId(other.getId());
          break;
        }
        case BEGIN: {
          mergeBegin(other.getBegin());
          break;
        }
        case SELECTOR_NOT_SET: {
          break;
        }
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
      com.google.spanner.v1.TransactionSelector parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.spanner.v1.TransactionSelector) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int selectorCase_ = 0;
    private java.lang.Object selector_;
    public SelectorCase
        getSelectorCase() {
      return SelectorCase.forNumber(
          selectorCase_);
    }

    public Builder clearSelector() {
      selectorCase_ = 0;
      selector_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.spanner.v1.TransactionOptions, com.google.spanner.v1.TransactionOptions.Builder, com.google.spanner.v1.TransactionOptionsOrBuilder> singleUseBuilder_;
    /**
     * <pre>
     * Execute the read or SQL query in a temporary transaction.
     * This is the most efficient way to execute a transaction that
     * consists of a single SQL query.
     * </pre>
     *
     * <code>.google.spanner.v1.TransactionOptions single_use = 1;</code>
     */
    public boolean hasSingleUse() {
      return selectorCase_ == 1;
    }
    /**
     * <pre>
     * Execute the read or SQL query in a temporary transaction.
     * This is the most efficient way to execute a transaction that
     * consists of a single SQL query.
     * </pre>
     *
     * <code>.google.spanner.v1.TransactionOptions single_use = 1;</code>
     */
    public com.google.spanner.v1.TransactionOptions getSingleUse() {
      if (singleUseBuilder_ == null) {
        if (selectorCase_ == 1) {
          return (com.google.spanner.v1.TransactionOptions) selector_;
        }
        return com.google.spanner.v1.TransactionOptions.getDefaultInstance();
      } else {
        if (selectorCase_ == 1) {
          return singleUseBuilder_.getMessage();
        }
        return com.google.spanner.v1.TransactionOptions.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Execute the read or SQL query in a temporary transaction.
     * This is the most efficient way to execute a transaction that
     * consists of a single SQL query.
     * </pre>
     *
     * <code>.google.spanner.v1.TransactionOptions single_use = 1;</code>
     */
    public Builder setSingleUse(com.google.spanner.v1.TransactionOptions value) {
      if (singleUseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        selector_ = value;
        onChanged();
      } else {
        singleUseBuilder_.setMessage(value);
      }
      selectorCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Execute the read or SQL query in a temporary transaction.
     * This is the most efficient way to execute a transaction that
     * consists of a single SQL query.
     * </pre>
     *
     * <code>.google.spanner.v1.TransactionOptions single_use = 1;</code>
     */
    public Builder setSingleUse(
        com.google.spanner.v1.TransactionOptions.Builder builderForValue) {
      if (singleUseBuilder_ == null) {
        selector_ = builderForValue.build();
        onChanged();
      } else {
        singleUseBuilder_.setMessage(builderForValue.build());
      }
      selectorCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Execute the read or SQL query in a temporary transaction.
     * This is the most efficient way to execute a transaction that
     * consists of a single SQL query.
     * </pre>
     *
     * <code>.google.spanner.v1.TransactionOptions single_use = 1;</code>
     */
    public Builder mergeSingleUse(com.google.spanner.v1.TransactionOptions value) {
      if (singleUseBuilder_ == null) {
        if (selectorCase_ == 1 &&
            selector_ != com.google.spanner.v1.TransactionOptions.getDefaultInstance()) {
          selector_ = com.google.spanner.v1.TransactionOptions.newBuilder((com.google.spanner.v1.TransactionOptions) selector_)
              .mergeFrom(value).buildPartial();
        } else {
          selector_ = value;
        }
        onChanged();
      } else {
        if (selectorCase_ == 1) {
          singleUseBuilder_.mergeFrom(value);
        }
        singleUseBuilder_.setMessage(value);
      }
      selectorCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Execute the read or SQL query in a temporary transaction.
     * This is the most efficient way to execute a transaction that
     * consists of a single SQL query.
     * </pre>
     *
     * <code>.google.spanner.v1.TransactionOptions single_use = 1;</code>
     */
    public Builder clearSingleUse() {
      if (singleUseBuilder_ == null) {
        if (selectorCase_ == 1) {
          selectorCase_ = 0;
          selector_ = null;
          onChanged();
        }
      } else {
        if (selectorCase_ == 1) {
          selectorCase_ = 0;
          selector_ = null;
        }
        singleUseBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Execute the read or SQL query in a temporary transaction.
     * This is the most efficient way to execute a transaction that
     * consists of a single SQL query.
     * </pre>
     *
     * <code>.google.spanner.v1.TransactionOptions single_use = 1;</code>
     */
    public com.google.spanner.v1.TransactionOptions.Builder getSingleUseBuilder() {
      return getSingleUseFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Execute the read or SQL query in a temporary transaction.
     * This is the most efficient way to execute a transaction that
     * consists of a single SQL query.
     * </pre>
     *
     * <code>.google.spanner.v1.TransactionOptions single_use = 1;</code>
     */
    public com.google.spanner.v1.TransactionOptionsOrBuilder getSingleUseOrBuilder() {
      if ((selectorCase_ == 1) && (singleUseBuilder_ != null)) {
        return singleUseBuilder_.getMessageOrBuilder();
      } else {
        if (selectorCase_ == 1) {
          return (com.google.spanner.v1.TransactionOptions) selector_;
        }
        return com.google.spanner.v1.TransactionOptions.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Execute the read or SQL query in a temporary transaction.
     * This is the most efficient way to execute a transaction that
     * consists of a single SQL query.
     * </pre>
     *
     * <code>.google.spanner.v1.TransactionOptions single_use = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.spanner.v1.TransactionOptions, com.google.spanner.v1.TransactionOptions.Builder, com.google.spanner.v1.TransactionOptionsOrBuilder> 
        getSingleUseFieldBuilder() {
      if (singleUseBuilder_ == null) {
        if (!(selectorCase_ == 1)) {
          selector_ = com.google.spanner.v1.TransactionOptions.getDefaultInstance();
        }
        singleUseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.spanner.v1.TransactionOptions, com.google.spanner.v1.TransactionOptions.Builder, com.google.spanner.v1.TransactionOptionsOrBuilder>(
                (com.google.spanner.v1.TransactionOptions) selector_,
                getParentForChildren(),
                isClean());
        selector_ = null;
      }
      selectorCase_ = 1;
      onChanged();;
      return singleUseBuilder_;
    }

    /**
     * <pre>
     * Execute the read or SQL query in a previously-started transaction.
     * </pre>
     *
     * <code>bytes id = 2;</code>
     */
    public com.google.protobuf.ByteString getId() {
      if (selectorCase_ == 2) {
        return (com.google.protobuf.ByteString) selector_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <pre>
     * Execute the read or SQL query in a previously-started transaction.
     * </pre>
     *
     * <code>bytes id = 2;</code>
     */
    public Builder setId(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  selectorCase_ = 2;
      selector_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Execute the read or SQL query in a previously-started transaction.
     * </pre>
     *
     * <code>bytes id = 2;</code>
     */
    public Builder clearId() {
      if (selectorCase_ == 2) {
        selectorCase_ = 0;
        selector_ = null;
        onChanged();
      }
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.spanner.v1.TransactionOptions, com.google.spanner.v1.TransactionOptions.Builder, com.google.spanner.v1.TransactionOptionsOrBuilder> beginBuilder_;
    /**
     * <pre>
     * Begin a new transaction and execute this read or SQL query in
     * it. The transaction ID of the new transaction is returned in
     * [ResultSetMetadata.transaction][google.spanner.v1.ResultSetMetadata.transaction], which is a [Transaction][google.spanner.v1.Transaction].
     * </pre>
     *
     * <code>.google.spanner.v1.TransactionOptions begin = 3;</code>
     */
    public boolean hasBegin() {
      return selectorCase_ == 3;
    }
    /**
     * <pre>
     * Begin a new transaction and execute this read or SQL query in
     * it. The transaction ID of the new transaction is returned in
     * [ResultSetMetadata.transaction][google.spanner.v1.ResultSetMetadata.transaction], which is a [Transaction][google.spanner.v1.Transaction].
     * </pre>
     *
     * <code>.google.spanner.v1.TransactionOptions begin = 3;</code>
     */
    public com.google.spanner.v1.TransactionOptions getBegin() {
      if (beginBuilder_ == null) {
        if (selectorCase_ == 3) {
          return (com.google.spanner.v1.TransactionOptions) selector_;
        }
        return com.google.spanner.v1.TransactionOptions.getDefaultInstance();
      } else {
        if (selectorCase_ == 3) {
          return beginBuilder_.getMessage();
        }
        return com.google.spanner.v1.TransactionOptions.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Begin a new transaction and execute this read or SQL query in
     * it. The transaction ID of the new transaction is returned in
     * [ResultSetMetadata.transaction][google.spanner.v1.ResultSetMetadata.transaction], which is a [Transaction][google.spanner.v1.Transaction].
     * </pre>
     *
     * <code>.google.spanner.v1.TransactionOptions begin = 3;</code>
     */
    public Builder setBegin(com.google.spanner.v1.TransactionOptions value) {
      if (beginBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        selector_ = value;
        onChanged();
      } else {
        beginBuilder_.setMessage(value);
      }
      selectorCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * Begin a new transaction and execute this read or SQL query in
     * it. The transaction ID of the new transaction is returned in
     * [ResultSetMetadata.transaction][google.spanner.v1.ResultSetMetadata.transaction], which is a [Transaction][google.spanner.v1.Transaction].
     * </pre>
     *
     * <code>.google.spanner.v1.TransactionOptions begin = 3;</code>
     */
    public Builder setBegin(
        com.google.spanner.v1.TransactionOptions.Builder builderForValue) {
      if (beginBuilder_ == null) {
        selector_ = builderForValue.build();
        onChanged();
      } else {
        beginBuilder_.setMessage(builderForValue.build());
      }
      selectorCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * Begin a new transaction and execute this read or SQL query in
     * it. The transaction ID of the new transaction is returned in
     * [ResultSetMetadata.transaction][google.spanner.v1.ResultSetMetadata.transaction], which is a [Transaction][google.spanner.v1.Transaction].
     * </pre>
     *
     * <code>.google.spanner.v1.TransactionOptions begin = 3;</code>
     */
    public Builder mergeBegin(com.google.spanner.v1.TransactionOptions value) {
      if (beginBuilder_ == null) {
        if (selectorCase_ == 3 &&
            selector_ != com.google.spanner.v1.TransactionOptions.getDefaultInstance()) {
          selector_ = com.google.spanner.v1.TransactionOptions.newBuilder((com.google.spanner.v1.TransactionOptions) selector_)
              .mergeFrom(value).buildPartial();
        } else {
          selector_ = value;
        }
        onChanged();
      } else {
        if (selectorCase_ == 3) {
          beginBuilder_.mergeFrom(value);
        }
        beginBuilder_.setMessage(value);
      }
      selectorCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * Begin a new transaction and execute this read or SQL query in
     * it. The transaction ID of the new transaction is returned in
     * [ResultSetMetadata.transaction][google.spanner.v1.ResultSetMetadata.transaction], which is a [Transaction][google.spanner.v1.Transaction].
     * </pre>
     *
     * <code>.google.spanner.v1.TransactionOptions begin = 3;</code>
     */
    public Builder clearBegin() {
      if (beginBuilder_ == null) {
        if (selectorCase_ == 3) {
          selectorCase_ = 0;
          selector_ = null;
          onChanged();
        }
      } else {
        if (selectorCase_ == 3) {
          selectorCase_ = 0;
          selector_ = null;
        }
        beginBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Begin a new transaction and execute this read or SQL query in
     * it. The transaction ID of the new transaction is returned in
     * [ResultSetMetadata.transaction][google.spanner.v1.ResultSetMetadata.transaction], which is a [Transaction][google.spanner.v1.Transaction].
     * </pre>
     *
     * <code>.google.spanner.v1.TransactionOptions begin = 3;</code>
     */
    public com.google.spanner.v1.TransactionOptions.Builder getBeginBuilder() {
      return getBeginFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Begin a new transaction and execute this read or SQL query in
     * it. The transaction ID of the new transaction is returned in
     * [ResultSetMetadata.transaction][google.spanner.v1.ResultSetMetadata.transaction], which is a [Transaction][google.spanner.v1.Transaction].
     * </pre>
     *
     * <code>.google.spanner.v1.TransactionOptions begin = 3;</code>
     */
    public com.google.spanner.v1.TransactionOptionsOrBuilder getBeginOrBuilder() {
      if ((selectorCase_ == 3) && (beginBuilder_ != null)) {
        return beginBuilder_.getMessageOrBuilder();
      } else {
        if (selectorCase_ == 3) {
          return (com.google.spanner.v1.TransactionOptions) selector_;
        }
        return com.google.spanner.v1.TransactionOptions.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Begin a new transaction and execute this read or SQL query in
     * it. The transaction ID of the new transaction is returned in
     * [ResultSetMetadata.transaction][google.spanner.v1.ResultSetMetadata.transaction], which is a [Transaction][google.spanner.v1.Transaction].
     * </pre>
     *
     * <code>.google.spanner.v1.TransactionOptions begin = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.spanner.v1.TransactionOptions, com.google.spanner.v1.TransactionOptions.Builder, com.google.spanner.v1.TransactionOptionsOrBuilder> 
        getBeginFieldBuilder() {
      if (beginBuilder_ == null) {
        if (!(selectorCase_ == 3)) {
          selector_ = com.google.spanner.v1.TransactionOptions.getDefaultInstance();
        }
        beginBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.spanner.v1.TransactionOptions, com.google.spanner.v1.TransactionOptions.Builder, com.google.spanner.v1.TransactionOptionsOrBuilder>(
                (com.google.spanner.v1.TransactionOptions) selector_,
                getParentForChildren(),
                isClean());
        selector_ = null;
      }
      selectorCase_ = 3;
      onChanged();;
      return beginBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.spanner.v1.TransactionSelector)
  }

  // @@protoc_insertion_point(class_scope:google.spanner.v1.TransactionSelector)
  private static final com.google.spanner.v1.TransactionSelector DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.spanner.v1.TransactionSelector();
  }

  public static com.google.spanner.v1.TransactionSelector getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TransactionSelector>
      PARSER = new com.google.protobuf.AbstractParser<TransactionSelector>() {
    public TransactionSelector parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new TransactionSelector(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TransactionSelector> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TransactionSelector> getParserForType() {
    return PARSER;
  }

  public com.google.spanner.v1.TransactionSelector getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

