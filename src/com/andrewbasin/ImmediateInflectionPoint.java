//Andrew Basin
//June 10 2019
//period 1 AP CS A
package com.andrewbasin;

import java.util.function.Supplier;

//this class calls a different inflection point immediatly after its instantiation
public class ImmediateInflectionPoint extends InflectionPoint
{
    public ImmediateInflectionPoint(Supplier<InflectionPoint> action)//constructor
    {
        super(null, action);
        Condition = (x) -> true;
    }
}
