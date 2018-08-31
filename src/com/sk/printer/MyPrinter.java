package com.sk.printer;

public class MyPrinter {

	public MyPrinter(){
		System.out.println("");
	}
	
	private Ink myInk;
	private IPaper myPaper;
	
	public void print(String str){
		myInk.getColor();
			for(int i=0;i<str.length();i++)
			{
				myPaper.printChar(str.charAt(i));
			}
		
		
	}
	
	public void getMyContent()
	{
		myPaper.getMyPaperType();
		System.out.println(myPaper.getContent());
	}

	public void setMyInk(Ink myInk) {
		this.myInk = myInk;
	}

	public void setMyPaper(IPaper myPaper) {
		this.myPaper = myPaper;
	}
	
	
}
