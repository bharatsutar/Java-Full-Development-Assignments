package com.Phase_1_AssistedProject;

public class Synchronization {
	public void send(String msg) 
    { 
        System.out.println("Sending\t"  + msg ); 
        try
        { 
            Thread.sleep(1000); 
        } 
        catch (InterruptedException e) 
        { 
            System.out.println("Thread  interrupted."); 
        } 
        System.out.println("\n" + msg + "Sent"); 
    } 
} 
class ThreadedSend extends Thread 
{ 
    private String msg; 
    private Thread t; 
    Synchronization  sender; 
    ThreadedSend(String m,  Synchronization obj) 
    { 
        msg = m; 
        sender = obj; 
    } 
  
    public void run() 
    {  
        synchronized(sender) 
        { 
            sender.send(msg); 
        } 
    } 
} 
class SyncDemo 
{ 
    public static void main(String args[]) 
    { 
    	Synchronization snd = new Synchronization(); 
        ThreadedSend S1 = 
            new ThreadedSend( " Hi " , snd ); 
        ThreadedSend S2 = 
            new ThreadedSend( " Bye " , snd ); 
        S1.start(); 
        S2.start(); 
        try
        { 
            S1.join(); 
            S2.join(); 
        } 
        catch(InterruptedException e) 
        { 
            System.out.println("Interrupted"); 
        } 
    } 
}                             

