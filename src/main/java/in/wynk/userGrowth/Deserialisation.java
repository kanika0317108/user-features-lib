package in.wynk.userGrowth;

import in.wynk.CompactedUserFeatures;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Deserialisation {
    public static CompactedUserFeatures deserialiseToProto(byte[] bytes) throws Exception {
        CompactedUserFeatures message = CompactedUserFeatures.parseFrom(bytes);
        return message;
    }
}
