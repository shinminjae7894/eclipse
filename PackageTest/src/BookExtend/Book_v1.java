package BookExtend;

import BookPack.Book;

public class Book_v1 extends Book{
		private String pubName;
		
		public Book_v1(String t, String a, int y, String p){
			title = t;
			author = a;
			year = y;
			
			//super(t, a, y);
			pubName = p;
		}
		
		public void display(){
			System.out.println(title + ", " + author+ ", " +
				year + ", " + pubName);
		}
	}


