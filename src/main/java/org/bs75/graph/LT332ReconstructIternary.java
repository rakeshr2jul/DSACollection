package org.bs75.graph;

import java.util.*;
import java.util.stream.Collectors;

public class LT332ReconstructIternary {


    public static List<String> findItinerary(List<List<String>> tickets) {
        Map<String, PriorityQueue<String>>  flights = new HashMap<>();
        LinkedList<String>  path = new LinkedList<>();

        for(List<String> ticket : tickets) {
            String from = ticket.get(0);
            String to = ticket.get(1);
            if(!flights.containsKey(from))
                flights.putIfAbsent(from, new PriorityQueue<>());
            flights.get(from).add(to);
        }
        dfs("JFK",flights,path);
        return path;
    }

    public static void dfs(String departure, Map<String, PriorityQueue<String>>  flights,LinkedList<String>  path  ) {
        PriorityQueue<String> arrivals = flights.get(departure);
        while (arrivals != null && !arrivals.isEmpty())
            dfs(arrivals.poll(),flights,path);
        path.addFirst(departure);
    }
    public static void main(String args[]){

      String dataset [][]=  {{"JFK","SFO"},{"JFK","ATL"},{"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"}};
      List<List<String>> list = Arrays.stream(dataset)
                .map(Arrays::asList)
                .collect(Collectors.toList());

      List<String> ls = findItinerary(list);

      for(String s : ls){
          System.out.print(s+" ");
      }

    }
}
