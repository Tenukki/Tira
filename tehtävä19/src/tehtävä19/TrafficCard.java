/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtävä19;

import java.util.*;

/**
 *
 * @author kamaj
 */
public class TrafficCard {
    int mTravellerNumber;
    String mOwnerName;
    float mBalance;
    
    public TrafficCard(int tNumber, String oName, float balance){
        mTravellerNumber = tNumber;
        mOwnerName = oName;
        mBalance = balance;
    }

    public float getmBalance() {
        return mBalance;
    }

    public String getmOwnerName() {
        return mOwnerName;
    }

    public int getmTravellerNumber() {
        return mTravellerNumber;
    }
    
    @Override
    public String toString(){
        return "owner: "+mOwnerName+" number: "+mTravellerNumber+" balance: "+mBalance;
    }

    //sortataan suuremmista pienempään
    
}
