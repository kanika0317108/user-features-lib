// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: subs.proto
// Protobuf Java Version: 4.29.1

package in.wynk;

public interface LifecycleDataAttrOrBuilder extends
    // @@protoc_insertion_point(interface_extends:LifecycleDataAttr)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string user_id = 1;</code>
   * @return Whether the userId field is set.
   */
  boolean hasUserId();
  /**
   * <code>optional string user_id = 1;</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <code>optional string user_id = 1;</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * date
   * </pre>
   *
   * <code>optional string xstream__xstream_lifecycle_dataset__last_seen = 2;</code>
   * @return Whether the xstreamXstreamLifecycleDatasetLastSeen field is set.
   */
  boolean hasXstreamXstreamLifecycleDatasetLastSeen();
  /**
   * <pre>
   * date
   * </pre>
   *
   * <code>optional string xstream__xstream_lifecycle_dataset__last_seen = 2;</code>
   * @return The xstreamXstreamLifecycleDatasetLastSeen.
   */
  java.lang.String getXstreamXstreamLifecycleDatasetLastSeen();
  /**
   * <pre>
   * date
   * </pre>
   *
   * <code>optional string xstream__xstream_lifecycle_dataset__last_seen = 2;</code>
   * @return The bytes for xstreamXstreamLifecycleDatasetLastSeen.
   */
  com.google.protobuf.ByteString
      getXstreamXstreamLifecycleDatasetLastSeenBytes();

  /**
   * <pre>
   * date
   * </pre>
   *
   * <code>optional string xstream__xstream_lifecycle_dataset__install_date = 3;</code>
   * @return Whether the xstreamXstreamLifecycleDatasetInstallDate field is set.
   */
  boolean hasXstreamXstreamLifecycleDatasetInstallDate();
  /**
   * <pre>
   * date
   * </pre>
   *
   * <code>optional string xstream__xstream_lifecycle_dataset__install_date = 3;</code>
   * @return The xstreamXstreamLifecycleDatasetInstallDate.
   */
  java.lang.String getXstreamXstreamLifecycleDatasetInstallDate();
  /**
   * <pre>
   * date
   * </pre>
   *
   * <code>optional string xstream__xstream_lifecycle_dataset__install_date = 3;</code>
   * @return The bytes for xstreamXstreamLifecycleDatasetInstallDate.
   */
  com.google.protobuf.ByteString
      getXstreamXstreamLifecycleDatasetInstallDateBytes();

  /**
   * <code>optional int32 xstream__xstream_lifecycle_dataset__registration_flag = 4;</code>
   * @return Whether the xstreamXstreamLifecycleDatasetRegistrationFlag field is set.
   */
  boolean hasXstreamXstreamLifecycleDatasetRegistrationFlag();
  /**
   * <code>optional int32 xstream__xstream_lifecycle_dataset__registration_flag = 4;</code>
   * @return The xstreamXstreamLifecycleDatasetRegistrationFlag.
   */
  int getXstreamXstreamLifecycleDatasetRegistrationFlag();
}
