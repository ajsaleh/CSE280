package System;

import java.util.Scanner;
import ch05.queues.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Client {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		ArrayUnbndQueue<Parent> queue;
		queue = new ArrayUnbndQueue<Parent>();

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();

		Parent hold = new Parent();
		Parent show1 = new Parent();
		Parent show2 = new Parent();

		int cont,change1,change2,MP1,MP2,MP3,MP4;
		double AWT;
		String holder,MPP1,MPP2,MPP3,MPP4;
		String Title="";

		System.out.println("The day just started");

		//employee part 1 (done when program is started started)
		AWT=setWaitTime();
		System.out.println("The date was taken from computer. It was:");
		System.out.println(date);
		Title=setTitle();
		System.out.println("Process 1");
		MPP1=setProcessTitle();
		MP1=setProcesses();
		System.out.println("Process 2");
		MPP2=setProcessTitle();
		MP2=setProcesses();
		System.out.println("Process 3");
		MPP3=setProcessTitle();
		MP3=setProcesses();
		System.out.println("Process 4");
		MPP4=setProcessTitle();
		MP4=setProcesses();

		boolean day=false;

		//loop for custmer to enter their data
		while(day!=true)
		{
			
			//start of while loop
			
			try
			{
			System.out.println("list of commands:");
			System.out.println("1  - Add custmer");//
			System.out.println("2  - Update show1 to next custmer");
			System.out.println("3  - Update show2 to next custmer");
			System.out.println("4  - Push show1 to the next process");
			System.out.println("5  - Push show2 to the next process");
			System.out.println("6  - Change average wait time");
			System.out.println("7  - Update Date");//
			System.out.println("8  - Change Title");//
			System.out.println("9  - Change max process numbers");//
			System.out.println("10 - Que in front of line");
			System.out.println("");
			System.out.println("Please enter the number of the process you want to run");
			change1=scan.nextInt();
			
			
			switch (change1)
			{
			case 1:
			{
				System.out.println("what service do you want 1-4:");
				change2=scan.nextInt();
				switch(change2)
				{
				case 1:
				{
					hold=custmerAdd(AWT,date,queue.size(),MP1,MPP1);
					queue.enqueue(hold);
					break;
				}
				case 2:
				{
					hold=custmerAdd(AWT,date,queue.size(),MP2,MPP2);
					queue.enqueue(hold);
					break;
				}
				case 3:
				{
					hold=custmerAdd(AWT,date,queue.size(),MP3,MPP3);
					queue.enqueue(hold);
					break;
				}
				case 4:
				{
					hold=custmerAdd(AWT,date,queue.size(),MP4,MPP4);
					queue.enqueue(hold);
					break;
				}
				}
				
				break;
			}
			case 2:
			{
				if(queue.isEmpty()==false)
				{
				System.out.println("please enter the Workers name");
				holder=scan.nextLine();
				show1=queue.dequeue();
				show1.setTechnicianName(holder);
				}
				else
					System.out.println("The queue is empty");
				break;
			}
			case 3:
			{
				if(!queue.isEmpty())
				{
				System.out.println("Please enter the workers name");
				holder=scan.nextLine();
				show2=queue.dequeue();
				show2.setTechnicianName(holder);
				}
				else
					System.out.println("the queue is empty");
				break;
			}
			case 4:
			{
				show1.nextProcess();
				break;
			}
			case 5:
			{
				show2.nextProcess();
				break;
			}
			case 6:
			{
				AWT=setWaitTime();
				break;
			}
			case 7:
			{
				date= new Date();
				System.out.println("The date was taken from computer. It was:");
				System.out.println(date);
				break;
			}
			case 8:
			{
				Title=setTitle();
				break;
			}
			case 9:
			{
				System.out.println("Process 1");
				MPP1=setProcessTitle();
				MP1=setProcesses();
				System.out.println("Process 2");
				MPP2=setProcessTitle();
				MP2=setProcesses();
				System.out.println("Process 3");
				MPP3=setProcessTitle();
				MP3=setProcesses();
				System.out.println("Process 4");
				MPP4=setProcessTitle();
				MP4=setProcesses();
				break;
			}
			case 10:
			{
				System.out.println("what service do you want 1-4:");
				change2=scan.nextInt();
				switch(change2)
				{
				case 1:
				{
					hold=custmerAdd(AWT,date,queue.size(),MP1,MPP1);
					queue.frontQueue(hold);
					break;
				}
				case 2:
				{
					hold=custmerAdd(AWT,date,queue.size(),MP2,MPP2);
					queue.frontQueue(hold);
					break;
				}
				case 3:
				{
					hold=custmerAdd(AWT,date,queue.size(),MP3,MPP3);
					queue.frontQueue(hold);
					break;
				}
				case 4:
				{
					hold=custmerAdd(AWT,date,queue.size(),MP4,MPP4);
					queue.frontQueue(hold);
					break;
				}
				}
				break;
			}	
			}
			}
			catch (Exception e)
			{
				System.out.println("Switch didn't work");
			}
			
			try
			{
			System.out.println("Is the day over? 1 for no 2 for yes");
			cont=scan.nextInt();
			if(cont==2)
				day=true;
			}
			catch (Exception e)
			{
				System.out.println("Day end didn't work");
			}
			}


	}

	public static Parent custmerAdd( double AWT, Date test, int size,int MP, String Title)
	{
		Scanner scan = new Scanner(System.in);
		Parent hold = new Parent(); //parent to be returned
		String holder;
		double waitHold;
		hold.setDate(test);


		//client part to fill in name 
		System.out.println("please enter your name:");
		holder=scan.nextLine();
		hold.setName(holder);
		System.out.println("please enter why you are here:");
		holder=scan.nextLine();
		hold.setProduct(holder);
		System.out.println("Thank you ");
		//end of client entering

		//start of employee part 2
		waitHold=(size+1)*AWT;
		hold.setWaitTime(waitHold);
		hold.setTechnicianName("TBD");
		hold.setProcess(0);
		hold.setMaxProcess(MP);

		return hold;
	}
	public static double setWaitTime()
	{
		Scanner scan = new Scanner(System.in);
		double hold;
		System.out.println("please enter the average wait time:");
		hold=scan.nextDouble();

		return hold;
	}
	public static String setTitle() 
	{
		Scanner scan = new Scanner(System.in);
		String hold;
		System.out.println("please enter the Title of the Que:");
		hold=scan.nextLine();

		return hold;
	}
	public static int setProcesses()
	{
		Scanner scan = new Scanner(System.in);
		int hold;
		System.out.println("please enter the max number of steps in processes:");
		hold=scan.nextInt();

		return hold;
	}
	public static String setProcessTitle()
	{
		Scanner scan = new Scanner(System.in);
		String TitleHold;
		System.out.println("please enter the Title of the process:");
		TitleHold=scan.nextLine();

		return TitleHold;
	}
}
