//Andrew Basin
//June 10 2019
//period 1 AP CS A
package com.andrewbasin;

import java.time.LocalDateTime;
import java.util.function.Function;
import java.util.function.Supplier;

//this class waits for a certain amount of time before performing an action

public class TimerInflectionPoint extends InflectionPoint
{
    public TimerInflectionPoint(int milliseconds, Supplier<InflectionPoint> action)//constructor
    {
        super(null, action);
        Milliseconds = milliseconds;
        Start = LocalDateTime.now();
        Condition = (x) -> //sets conditional method
        {
            var me = (TimerInflectionPoint) x;
            return me.Start.plusNanos((long)milliseconds * 1000000).compareTo(LocalDateTime.now()) < 0;
        };
    }

    protected LocalDateTime Start;//starting time of pause
    protected int Milliseconds;//length of pause
}
