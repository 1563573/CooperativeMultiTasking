//Andrew Basin
//June 10 2019
//period 1 AP CS A
package com.andrewbasin;


//this is the primary class of the program
public class Main
{
    public static void main(String[] args) throws Exception //starting method of the program
    {
        Kernel kernel = new Kernel();
        kernel.CurrentOperations.add(new CountTo3()); //adds CountTo3 as task for kernel to perform
        kernel.CurrentOperations.add(new CountTo3Bis()); ////adds CountTo3Bis as task for kernel to perform
        kernel.Run(); //runs tasks given to kernel
    }
}
