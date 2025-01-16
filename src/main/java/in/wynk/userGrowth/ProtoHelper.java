package in.wynk.userGrowth;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProtoHelper {
    public static Map<String, Object> protoToMap(Message message) {
        Map<String, Object> resultMap = new HashMap<>();
        for (Descriptors.FieldDescriptor field : message.getAllFields().keySet()) {
            Object value = message.getField(field);
            if (field.isRepeated()) {
                List<?> repeatedValues = (List<?>) value;
                resultMap.put(field.getName(), processRepeatedField(repeatedValues));
            } else if (field.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                Message nestedMessage = (Message) value;
                Map<String, Object> nestedMap = protoToMap(nestedMessage);
                resultMap.putAll(nestedMap);
            } else {
                resultMap.put(field.getName(), value);
            }
        }

        return resultMap;
    }

    private static List<Object> processRepeatedField(List<?> repeatedValues) {
        return repeatedValues.stream()
                .map(value -> {
                    if (value instanceof Message) {
                        return protoToMap((Message) value);
                    }
                    return value;
                })
                .collect(Collectors.toList());
    }
}