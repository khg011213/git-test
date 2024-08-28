package day_08_02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.zip.Inflater;

class PrintLove{
	private String love = "";
	
	public PrintLove(String love) {
		this.love = love;
	}
	
	public void love() {
int len = love.length();
		
		for(int i = 0; i<len; i++) {
			System.out.println(love.substring(i, love.length()) + love.substring(0, i));
		}
	}
	
}

public class Wrapper2 {
	public static void main(String[] args) {
		
		PrintLove pl = new PrintLove("문자열을 입력받아 한 글자씩 회전시켜");
		pl.love();
		

	}
}
