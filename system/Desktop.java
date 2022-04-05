package org.system;

public class Desktop extends Computer {

	
	public void desktopSize()
	{
		
		System.out.println("Desktop world");
	}
	
	
	public void desktopConfig(){
		System.out.println("config Intialize");
		
	}
	
	public static void main(String[] args)
	{
		
//		Computer comp=new Computer();
//		comp.computerMethod();
//		comp.computerGames();
//		
	
	
	Desktop top=new Desktop();
	top.desktopSize();
	top.desktopConfig();
	top.computerGames();
	top.computerMethod();
	
	
}
	
	
}
