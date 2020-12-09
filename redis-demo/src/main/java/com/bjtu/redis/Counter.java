package com.bjtu.redis;

import org.json.JSONException;
import org.json.JSONObject;

public class Counter {
    private String counterName;
    private String counterIndex;
    private String type;
    private String keyFields;
    private int valueFields;
//    private String FREQ;

    public Counter(JSONObject object) {
        try {
            counterName = object.getString("counterName");
            counterIndex = object.getString("counterIndex");
            type = object.getString("type");
            keyFields = object.getString("keyFields");
            valueFields = object.getInt("valueFields");
//            FREQ = object.getString("FREQ");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Counter{" +
                "counterName='" + counterName + '\'' +
                "counterIndex='" + counterIndex + '\'' +
                ", type='" + type + '\'' +
                ", keyFields='" + keyFields + '\'' +
                ", valueFields=" + valueFields + '\'' +
//                ", FREQ='" + FREQ + '\'' +
                '}';
    }
}