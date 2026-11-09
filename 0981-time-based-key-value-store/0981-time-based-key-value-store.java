class TimeMap {

    public TimeMap() {
        
    }
  private Map<String, TreeMap<Integer, String>> store = new HashMap<>();

    public void set(String key, String value, int timestamp) {
        store.computeIfAbsent(key, k -> new TreeMap<>()).put(timestamp, value);
    }

    public String get(String key, int timestamp) {
        TreeMap<Integer, String> history = store.get(key);
        if (history == null) return "";                      // key never set

        Map.Entry<Integer, String> e = history.floorEntry(timestamp);
        return e == null ? "" : e.getValue();                // nothing at or before this time
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */