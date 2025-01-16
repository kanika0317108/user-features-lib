package in.wynk.userGrowth;

import in.wynk.CompactedUserFeatures;

public class Deserialisation {
    public static CompactedUserFeatures deserialiseToProto(byte[] bytes) throws Exception {
        return CompactedUserFeatures.parseFrom(bytes);
    }
}