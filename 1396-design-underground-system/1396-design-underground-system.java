class UndergroundSystem {

    public UndergroundSystem() {
        
    }
      private static class Trip {
        String station;
        int time;
        Trip(String station, int time) { this.station = station; this.time = time; }
    }
    Map<Integer, Trip> map= new HashMap<>();

    public void checkIn(int id, String stationName, int t) {
        Trip trip = new Trip(stationName, t);
        map.put(id,trip );
        
    }
    Map<String, double[]> map2 = new HashMap<>();
    
    public void checkOut(int id, String stationName, int t) {
       Trip tp= map.get(id);
       String route= tp.station + "->" + stationName;
       int totalTime= t-tp.time;

       map2.putIfAbsent(route,new double[]{0.0,0.0});
       map2.get(route)[0]+=totalTime;
       map2.get(route)[1]+=1.0;
       map.remove(id);
    }
    
    public double getAverageTime(String startStation, String endStation) {
      String st= startStation + "->" + endStation;
      double[] dt=  map2.get(st);
      double avg= dt[0]/dt[1];
      return avg;
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */