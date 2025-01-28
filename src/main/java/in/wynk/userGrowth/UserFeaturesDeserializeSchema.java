package in.wynk.userGrowth;

import in.wynk.CompactedUserFeatures;

public class UserFeaturesDeserializeSchema {
    public static CompactedUserFeatures deserialiseToProto(byte[] bytes) throws Exception {
        return CompactedUserFeatures.parseFrom(bytes);
    }
}