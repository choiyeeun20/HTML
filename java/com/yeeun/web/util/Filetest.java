package com.yeeun.web.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


public class Filetest {
	public final static String FILE_PATH = "C:\\Users\\bit\\spring-workspace\\yeeun\\src\\main\\resources\\static\\member\\";
	public static void main(String[] args) {
		try {
			File file = new File(FILE_PATH+"list.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));//오버로딩
			BufferedReader reader = new BufferedReader(new FileReader(file));
			List<String>list = new ArrayList<>();
			while(true) {
				switch(JOptionPane.showInputDialog("0.종료  1.문자전송  2.문자읽기")) {
				case "0": return;
				case "1": 
					String message = JOptionPane.showInputDialog("메세지 입력");
					System.out.println("message");
					writer.write(message);
					writer.newLine();
					writer.flush(); //열고
					break;
				case "2": 
					while((message = reader.readLine())!=null){
						list.add(message+"/");
					}
					JOptionPane.showMessageDialog(null, list);
					reader.close(); //닫기
					break;
				}
			}
		}catch(Exception e){
		}
		
	}
}
		
		
		
	