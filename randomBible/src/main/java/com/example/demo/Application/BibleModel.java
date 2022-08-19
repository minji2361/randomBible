package com.example.demo.Application;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BibleModel {

	private int book;
	private int chapter;
	private int verse;
	private String content;
	private String bookName;
	
}
