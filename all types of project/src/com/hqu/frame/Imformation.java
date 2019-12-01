package com.hqu.frame;

import java.io.Serializable;

public class Imformation implements Serializable{
	public String nametext;
	public String ziptext;
	public String addtext;
	public String teltext;
	public String mobiltext;
	public String emailtext;
	
	public Imformation(String nametext, String ziptext, String addtext,
			String teltext, String mobiltext, String emailtext) {
		super();
		this.nametext = nametext;
		this.ziptext = ziptext;
		this.addtext = addtext;
		this.teltext = teltext;
		this.mobiltext = mobiltext;
		this.emailtext = emailtext;
	}
	public String getNametext() {
		return nametext;
	}
	public void setNametext(String nametext) {
		this.nametext = nametext;
	}
	public String getZiptext() {
		return ziptext;
	}
	public void setZiptext(String ziptext) {
		this.ziptext = ziptext;
	}
	public String getAddtext() {
		return addtext;
	}
	public void setAddtext(String addtext) {
		this.addtext = addtext;
	}
	public String getTeltext() {
		return teltext;
	}
	public void setTeltext(String teltext) {
		this.teltext = teltext;
	}
	public String getMobiltext() {
		return mobiltext;
	}
	public void setMobiltext(String mobiltext) {
		this.mobiltext = mobiltext;
	}
	public String getEmailtext() {
		return emailtext;
	}
	public void setEmailtext(String emailtext) {
		this.emailtext = emailtext;
	}
	@Override
	public String toString() {
		return "Imformation [nametext=" + nametext + ", ziptext=" + ziptext
				+ ", addtext=" + addtext + ", teltext=" + teltext
				+ ", mobiltext=" + mobiltext + ", emailtext=" + emailtext + "]";
	}
	
}
