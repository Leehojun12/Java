package com.fileio.exam;

import java.io.FileInputStream;

public class Exam02_FileRead01 {
	public static void main(String[] args) {
		
		// try~with~resource
		// try(객체 자동반납을 해주고 싶은 생성문) -> try문이 끝나면 알아서 객체를 반납
		try(FileInputStream fis = new FileInputStream("test.txt")){
			
			// 아스키코드
			System.out.println((char)fis.read());
			//데이터를 한버넹 읽어오기.
			byte[] fileContents = new byte[100];
			fis.read(fileContents);
			// test.txt 파일로부터 읽어들여온 데이터를 fileContents 배열안에 모두 담아 줌.
			
			for(byte b : fileContents) {
				System.out.print(b +" ");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	/*	// 파일 입력 -> Stream -> InputStream
		FileInputStream fis= null;
		try {
			//파일과 관련된 객체 인스턴스를 만드렀을 때에는 객체 반납을 마지막에 해줘야 함
			 fis = new FileInputStream("test.txt");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally { // 만약 try문 안쪽에서 예외가 발생하더라도 finally 안쪽의 코드는 무조건 실행 됨.
			try {
				fis.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}*/
	}
}
