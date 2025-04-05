package practice3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Book> books = new ArrayList<>();
		
		inputData(books, scanner);
		printData(books);
		total(books);
		
	}
	
	public static void inputData(ArrayList<Book> books, Scanner scanner) {
		System.out.println("何冊の本を入力しますか？");
		int number = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = 0; i < number; i++) {
			Book book = new Book();
			System.out.println("本のタイトルを入力してください");
			book.title = scanner.nextLine();
			System.out.println("本の著者を入力してください");
			book.author = scanner.nextLine();
			System.out.println("本のページ数を入力してください");
			book.pages = scanner.nextInt();
			scanner.nextLine();
			
			books.add(book);
		}
	}
	
	public static void printData(ArrayList<Book> books) {
		System.out.println("タイトル      |著者      |ページ数  |ランク");
		System.out.println("-------------------------------------------");
		
		for (int i = 0; i < books.size(); i++) {
			System.out.printf("%-15s | %-12s | %6d | %s\n",
					books.get(i).title, books.get(i).author,
					books.get(i).pages, books.get(i).getRank());
		}
	}
	
	public static void total(ArrayList<Book> books) {
		int totalBooks = 0;
		int totalPages =0;
		
		for(int i = 0; i < books.size(); i++) {
			totalPages += books.get(i).pages;
		}
		totalBooks = books.size();
		System.out.println("合計冊数：" + totalBooks + "冊");
		System.out.println("合計ページ数" + totalPages + "ページ");
	}

}
