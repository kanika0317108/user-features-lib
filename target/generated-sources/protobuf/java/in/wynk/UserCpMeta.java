// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: subs.proto
// Protobuf Java Version: 4.29.1

package in.wynk;

/**
 * Protobuf type {@code UserCpMeta}
 */
public final class UserCpMeta extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:UserCpMeta)
    UserCpMetaOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      UserCpMeta.class.getName());
  }
  // Use UserCpMeta.newBuilder() to construct.
  private UserCpMeta(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private UserCpMeta() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return in.wynk.Subs.internal_static_UserCpMeta_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return in.wynk.Subs.internal_static_UserCpMeta_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            in.wynk.UserCpMeta.class, in.wynk.UserCpMeta.Builder.class);
  }

  private int bitField0_;
  public static final int F0_FIELD_NUMBER = 1;
  private long f0_ = 0L;
  /**
   * <code>required int64 f0 = 1;</code>
   * @return Whether the f0 field is set.
   */
  @java.lang.Override
  public boolean hasF0() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>required int64 f0 = 1;</code>
   * @return The f0.
   */
  @java.lang.Override
  public long getF0() {
    return f0_;
  }

  public static final int F1_FIELD_NUMBER = 2;
  private in.wynk.UserCpMetaAttr f1_;
  /**
   * <code>required .UserCpMetaAttr f1 = 2;</code>
   * @return Whether the f1 field is set.
   */
  @java.lang.Override
  public boolean hasF1() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>required .UserCpMetaAttr f1 = 2;</code>
   * @return The f1.
   */
  @java.lang.Override
  public in.wynk.UserCpMetaAttr getF1() {
    return f1_ == null ? in.wynk.UserCpMetaAttr.getDefaultInstance() : f1_;
  }
  /**
   * <code>required .UserCpMetaAttr f1 = 2;</code>
   */
  @java.lang.Override
  public in.wynk.UserCpMetaAttrOrBuilder getF1OrBuilder() {
    return f1_ == null ? in.wynk.UserCpMetaAttr.getDefaultInstance() : f1_;
  }

  public static final int ARITY_FIELD_NUMBER = 3;
  private int arity_ = 0;
  /**
   * <code>required int32 arity = 3;</code>
   * @return Whether the arity field is set.
   */
  @java.lang.Override
  public boolean hasArity() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>required int32 arity = 3;</code>
   * @return The arity.
   */
  @java.lang.Override
  public int getArity() {
    return arity_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasF0()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasF1()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasArity()) {
      memoizedIsInitialized = 0;
      return false;
    }
    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(1, f0_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getF1());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt32(3, arity_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, f0_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getF1());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, arity_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof in.wynk.UserCpMeta)) {
      return super.equals(obj);
    }
    in.wynk.UserCpMeta other = (in.wynk.UserCpMeta) obj;

    if (hasF0() != other.hasF0()) return false;
    if (hasF0()) {
      if (getF0()
          != other.getF0()) return false;
    }
    if (hasF1() != other.hasF1()) return false;
    if (hasF1()) {
      if (!getF1()
          .equals(other.getF1())) return false;
    }
    if (hasArity() != other.hasArity()) return false;
    if (hasArity()) {
      if (getArity()
          != other.getArity()) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasF0()) {
      hash = (37 * hash) + F0_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getF0());
    }
    if (hasF1()) {
      hash = (37 * hash) + F1_FIELD_NUMBER;
      hash = (53 * hash) + getF1().hashCode();
    }
    if (hasArity()) {
      hash = (37 * hash) + ARITY_FIELD_NUMBER;
      hash = (53 * hash) + getArity();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static in.wynk.UserCpMeta parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.wynk.UserCpMeta parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.wynk.UserCpMeta parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.wynk.UserCpMeta parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.wynk.UserCpMeta parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.wynk.UserCpMeta parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.wynk.UserCpMeta parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static in.wynk.UserCpMeta parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static in.wynk.UserCpMeta parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static in.wynk.UserCpMeta parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static in.wynk.UserCpMeta parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static in.wynk.UserCpMeta parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(in.wynk.UserCpMeta prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code UserCpMeta}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:UserCpMeta)
      in.wynk.UserCpMetaOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return in.wynk.Subs.internal_static_UserCpMeta_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return in.wynk.Subs.internal_static_UserCpMeta_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              in.wynk.UserCpMeta.class, in.wynk.UserCpMeta.Builder.class);
    }

    // Construct using in.wynk.UserCpMeta.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getF1FieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      f0_ = 0L;
      f1_ = null;
      if (f1Builder_ != null) {
        f1Builder_.dispose();
        f1Builder_ = null;
      }
      arity_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return in.wynk.Subs.internal_static_UserCpMeta_descriptor;
    }

    @java.lang.Override
    public in.wynk.UserCpMeta getDefaultInstanceForType() {
      return in.wynk.UserCpMeta.getDefaultInstance();
    }

    @java.lang.Override
    public in.wynk.UserCpMeta build() {
      in.wynk.UserCpMeta result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public in.wynk.UserCpMeta buildPartial() {
      in.wynk.UserCpMeta result = new in.wynk.UserCpMeta(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(in.wynk.UserCpMeta result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.f0_ = f0_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.f1_ = f1Builder_ == null
            ? f1_
            : f1Builder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.arity_ = arity_;
        to_bitField0_ |= 0x00000004;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof in.wynk.UserCpMeta) {
        return mergeFrom((in.wynk.UserCpMeta)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(in.wynk.UserCpMeta other) {
      if (other == in.wynk.UserCpMeta.getDefaultInstance()) return this;
      if (other.hasF0()) {
        setF0(other.getF0());
      }
      if (other.hasF1()) {
        mergeF1(other.getF1());
      }
      if (other.hasArity()) {
        setArity(other.getArity());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      if (!hasF0()) {
        return false;
      }
      if (!hasF1()) {
        return false;
      }
      if (!hasArity()) {
        return false;
      }
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              f0_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getF1FieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              arity_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private long f0_ ;
    /**
     * <code>required int64 f0 = 1;</code>
     * @return Whether the f0 field is set.
     */
    @java.lang.Override
    public boolean hasF0() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required int64 f0 = 1;</code>
     * @return The f0.
     */
    @java.lang.Override
    public long getF0() {
      return f0_;
    }
    /**
     * <code>required int64 f0 = 1;</code>
     * @param value The f0 to set.
     * @return This builder for chaining.
     */
    public Builder setF0(long value) {

      f0_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>required int64 f0 = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearF0() {
      bitField0_ = (bitField0_ & ~0x00000001);
      f0_ = 0L;
      onChanged();
      return this;
    }

    private in.wynk.UserCpMetaAttr f1_;
    private com.google.protobuf.SingleFieldBuilder<
        in.wynk.UserCpMetaAttr, in.wynk.UserCpMetaAttr.Builder, in.wynk.UserCpMetaAttrOrBuilder> f1Builder_;
    /**
     * <code>required .UserCpMetaAttr f1 = 2;</code>
     * @return Whether the f1 field is set.
     */
    public boolean hasF1() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required .UserCpMetaAttr f1 = 2;</code>
     * @return The f1.
     */
    public in.wynk.UserCpMetaAttr getF1() {
      if (f1Builder_ == null) {
        return f1_ == null ? in.wynk.UserCpMetaAttr.getDefaultInstance() : f1_;
      } else {
        return f1Builder_.getMessage();
      }
    }
    /**
     * <code>required .UserCpMetaAttr f1 = 2;</code>
     */
    public Builder setF1(in.wynk.UserCpMetaAttr value) {
      if (f1Builder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        f1_ = value;
      } else {
        f1Builder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>required .UserCpMetaAttr f1 = 2;</code>
     */
    public Builder setF1(
        in.wynk.UserCpMetaAttr.Builder builderForValue) {
      if (f1Builder_ == null) {
        f1_ = builderForValue.build();
      } else {
        f1Builder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>required .UserCpMetaAttr f1 = 2;</code>
     */
    public Builder mergeF1(in.wynk.UserCpMetaAttr value) {
      if (f1Builder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          f1_ != null &&
          f1_ != in.wynk.UserCpMetaAttr.getDefaultInstance()) {
          getF1Builder().mergeFrom(value);
        } else {
          f1_ = value;
        }
      } else {
        f1Builder_.mergeFrom(value);
      }
      if (f1_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>required .UserCpMetaAttr f1 = 2;</code>
     */
    public Builder clearF1() {
      bitField0_ = (bitField0_ & ~0x00000002);
      f1_ = null;
      if (f1Builder_ != null) {
        f1Builder_.dispose();
        f1Builder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>required .UserCpMetaAttr f1 = 2;</code>
     */
    public in.wynk.UserCpMetaAttr.Builder getF1Builder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getF1FieldBuilder().getBuilder();
    }
    /**
     * <code>required .UserCpMetaAttr f1 = 2;</code>
     */
    public in.wynk.UserCpMetaAttrOrBuilder getF1OrBuilder() {
      if (f1Builder_ != null) {
        return f1Builder_.getMessageOrBuilder();
      } else {
        return f1_ == null ?
            in.wynk.UserCpMetaAttr.getDefaultInstance() : f1_;
      }
    }
    /**
     * <code>required .UserCpMetaAttr f1 = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        in.wynk.UserCpMetaAttr, in.wynk.UserCpMetaAttr.Builder, in.wynk.UserCpMetaAttrOrBuilder> 
        getF1FieldBuilder() {
      if (f1Builder_ == null) {
        f1Builder_ = new com.google.protobuf.SingleFieldBuilder<
            in.wynk.UserCpMetaAttr, in.wynk.UserCpMetaAttr.Builder, in.wynk.UserCpMetaAttrOrBuilder>(
                getF1(),
                getParentForChildren(),
                isClean());
        f1_ = null;
      }
      return f1Builder_;
    }

    private int arity_ ;
    /**
     * <code>required int32 arity = 3;</code>
     * @return Whether the arity field is set.
     */
    @java.lang.Override
    public boolean hasArity() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>required int32 arity = 3;</code>
     * @return The arity.
     */
    @java.lang.Override
    public int getArity() {
      return arity_;
    }
    /**
     * <code>required int32 arity = 3;</code>
     * @param value The arity to set.
     * @return This builder for chaining.
     */
    public Builder setArity(int value) {

      arity_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>required int32 arity = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearArity() {
      bitField0_ = (bitField0_ & ~0x00000004);
      arity_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:UserCpMeta)
  }

  // @@protoc_insertion_point(class_scope:UserCpMeta)
  private static final in.wynk.UserCpMeta DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new in.wynk.UserCpMeta();
  }

  public static in.wynk.UserCpMeta getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserCpMeta>
      PARSER = new com.google.protobuf.AbstractParser<UserCpMeta>() {
    @java.lang.Override
    public UserCpMeta parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<UserCpMeta> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserCpMeta> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public in.wynk.UserCpMeta getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

