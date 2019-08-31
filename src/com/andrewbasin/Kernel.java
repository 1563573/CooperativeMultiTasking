//Andrew Basin
//June 10 2019
//period 1 AP CS A
package com.andrewbasin;

import java.util.ArrayList;

//this class performs all the tasks given to it

public class Kernel
{
    public void Run() //loops through all code that should be run
    {
        while (true)
        {
            ArrayList<InflectionPoint> inflectionPoints2Delete = new ArrayList<InflectionPoint>();

            for (var i = 0; i < CurrentOperations.size(); i++)
            {
                if (CurrentOperations.get(i).Condition.apply(CurrentOperations.get(i))) //deletes and adds following actions as necessary per condition
                {
                    var nextInflectionPoint = CurrentOperations.get(i).Action.get();
                    if (nextInflectionPoint != null) CurrentOperations.set(i, nextInflectionPoint);
                    else inflectionPoints2Delete.add(CurrentOperations.get(i));
                }
            }

            for (InflectionPoint inflectionPoint : inflectionPoints2Delete) CurrentOperations.remove(inflectionPoint); //deletes all actions flagged for deletion in section above
        }
    }
    //endregion

    //region Properties
    public ArrayList<InflectionPoint> CurrentOperations = new ArrayList<InflectionPoint>(); //list of all actions being performed at a given moment
    //endregion
}
