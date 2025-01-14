package in.wynk.userGrowth;

import in.wynk.CompactedUserFeatures;

public class Deserialisation {
    public static CompactedUserFeatures deserialiseToProto(byte[] bytes) throws Exception {
        CompactedUserFeatures message = CompactedUserFeatures.parseFrom(bytes);
        return message;
    }
}
