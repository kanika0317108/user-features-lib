// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: subs.proto
// Protobuf Java Version: 4.29.1

package in.wynk;

public interface UserPowerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:UserPower)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>required int64 f0 = 1;</code>
   * @return Whether the f0 field is set.
   */
  boolean hasF0();
  /**
   * <code>required int64 f0 = 1;</code>
   * @return The f0.
   */
  long getF0();

  /**
   * <code>required .UserPowerAttr f1 = 2;</code>
   * @return Whether the f1 field is set.
   */
  boolean hasF1();
  /**
   * <code>required .UserPowerAttr f1 = 2;</code>
   * @return The f1.
   */
  in.wynk.UserPowerAttr getF1();
  /**
   * <code>required .UserPowerAttr f1 = 2;</code>
   */
  in.wynk.UserPowerAttrOrBuilder getF1OrBuilder();

  /**
   * <code>required int32 arity = 3;</code>
   * @return Whether the arity field is set.
   */
  boolean hasArity();
  /**
   * <code>required int32 arity = 3;</code>
   * @return The arity.
   */
  int getArity();
}
