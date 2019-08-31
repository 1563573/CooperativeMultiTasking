//Andrew Basin
//June 10 2019
//period 1 AP CS A
package com.andrewbasin;

//this class serves as a test task for the program

public class CountTo3 extends ImmediateInflectionPoint
{
    public CountTo3() //runs task, constructor
    {
        super(()->
        {
            return new TimerInflectionPoint(500, () ->
            {
                System.out.println("1");
                return new TimerInflectionPoint(1000, () ->
                {
                    System.out.println("2");
                    return new TimerInflectionPoint(1000, () ->
                    {
                        System.out.println("3");
                        return null;
                    });
                });
            });
        });
    }
}
