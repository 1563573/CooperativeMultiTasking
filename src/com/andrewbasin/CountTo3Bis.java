//Andrew Basin
//June 10 2019
//period 1 AP CS A
package com.andrewbasin;

//this class serves as a test task for the program

public class CountTo3Bis extends ImmediateInflectionPoint
{
    public CountTo3Bis() //runs task, constructor
    {
        super(()->
        {
            return new TimerInflectionPoint(500, () ->
            {
                System.out.println("1Bis");
                return new TimerInflectionPoint(1000, () ->
                {
                    System.out.println("2Bis");
                    return new TimerInflectionPoint(1000, () ->
                    {
                        System.out.println("3Bis");
                        return null;
                    });
                });
            });
        });
    }
}
