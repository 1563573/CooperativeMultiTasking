//Andrew Basin
//June 10 2019
//period 1 AP CS A
package com.andrewbasin;

import java.util.function.Function;
import java.util.function.Supplier;

//this class represents an action and the condition under which the action should take place
public class InflectionPoint
{
    public InflectionPoint(Function<InflectionPoint, Boolean> condition, Supplier<InflectionPoint> action) //constructor
    {
        Condition = condition;
        Action = action;
    }

    public Function<InflectionPoint, Boolean> Condition; //condition for yielding control
    public Supplier<InflectionPoint> Action; //next action to take place
}
