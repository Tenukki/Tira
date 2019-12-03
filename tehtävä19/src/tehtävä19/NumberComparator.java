/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtävä19;

import java.util.Comparator;

/**
 *
 * @author Santeri
 */
public class NumberComparator implements Comparator{
    public int compare(Object o1,Object o2){
        TrafficCard a1 = (TrafficCard) o1;
        TrafficCard a2 = (TrafficCard) o2;
        
        if(a1.getmTravellerNumber() == a2.getmTravellerNumber()){
            return 0;
        }else if(a1.getmTravellerNumber() > a2.getmTravellerNumber()){
            return 1;
        }else{
            return -1;
        }
    }
}
