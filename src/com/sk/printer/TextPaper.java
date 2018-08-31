package com.sk.printer;

public class TextPaper implements IPaper {
	private StringBuffer buffer = new StringBuffer();
	private String paperType;
	@Override
	public void printChar(char c) {
		buffer.append(c);
		System.out.println(c);

	}

	@Override
	public String getContent() {
		return buffer.toString();
	}

	public StringBuffer getBuffer() {
		return buffer;
	}

	public void setBuffer(StringBuffer buffer) {
		this.buffer = buffer;
	}

	public String getPaperType() {
		return paperType;
	}

	public void setPaperType(String paperType) {
		this.paperType = paperType;
	}

	@Override
	public void getMyPaperType() {
	    System.out.println(this.getPaperType());
	
	}
	
	

}
