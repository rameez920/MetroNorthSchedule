
package metronorthschedule;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;


public class MetroNorthSchedule {

  
    public static void main(String[] args) throws IOException {
        File file = new File("src/resources/schedule.html"); 
        
        Document document = Jsoup.parse(file, "UTF-8");
        
        
        ArrayList<TrainTiming> timings = new ArrayList<>();
        
        Element table = document.getElementsByTag("table").get(1);
        Elements rows = table.select("tr");
       
        
        /*
        Element row = rows.get(1);
        Elements cols = row.select("td");
        String arrivalTime = cols.get(2).text();
        String departureTime = cols.get(0).text();
        
        TrainTiming trainTiming = new TrainTiming(arrivalTime, departureTime);
        System.out.println(trainTiming.toString());
        
        // System.out.println(cols.size());
        */
         
         
        
        //reads train timings from table and stores them in arrayList
        for (int i = 1; i < rows.size() - 2; i++) {
            Element row = rows.get(i);
            Elements cols = row.select("td");
            
            String departureTime = cols.get(0).text();
            String arrivalTime = cols.get(2).text();
            
            TrainTiming trainTiming = new TrainTiming(arrivalTime, departureTime);
            timings.add(trainTiming);
        }
       
       for (int i = 0; i < timings.size(); i++) {
           System.out.println(timings.get(i).toString());
       }
      
        
        
    
    }
    
}
