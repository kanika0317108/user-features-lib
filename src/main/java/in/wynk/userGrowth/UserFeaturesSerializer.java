package in.wynk.userGrowth;
import com.google.protobuf.util.JsonFormat;
import in.wynk.CompactedUserFeatures;

public class UserFeaturesSerializer {
    public static byte[] serialize(String json) throws Exception {
        CompactedUserFeatures.Builder structBuilder = CompactedUserFeatures.newBuilder();
        JsonFormat.parser().ignoringUnknownFields().merge(json, structBuilder);
        return structBuilder.build().toByteArray();
    }
}