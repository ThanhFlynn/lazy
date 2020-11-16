package bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<News> listNews = new ArrayList<>();
        int choose;
        do{
            System.out.println("/********************/");
            System.out.println("1. Insert news");
            System.out.println("2. View list news");
            System.out.println("3. Average rate");
            System.out.println("4. Exit");
            System.out.println("/********************/\n");
            System.out.print("Choose : ");
            choose =  sc.nextInt();
            switch (choose){
                case 1:
                    System.out.println("1. Insert news");
                    insertNews(listNews);
                    break;
                case 2:
                    if(listNews.size()==0){
                        System.out.println("Chưa có tin tức nào trong danh sách.");
                    } else {
                        System.out.println("2. View list news");
                        System.out.println("\t\t\t============= DANH SÁCH NEWS =============");
                        tieude();
                        for(int i = 0 ; i < listNews.size(); i++){
                            listNews.get(i).display();
                        }
                    }
                    break;
                case 3:
                    if(listNews.size()==0){
                        System.out.println("Chưa có tin tức nào trong danh sách.");
                    } else {
                        System.out.println("2. View list news");
                        System.out.println("\t\t\t============= DANH SÁCH NEWS =============");
                        tieude();
                        for(int i = 0 ; i < listNews.size(); i++){
                            listNews.get(i).Calculate();
                            listNews.get(i).display();
                        }
                    }
                    break;
                case 4:
                    System.out.println("End!");
            }
        }while(choose != 4);
    }
    public static void insertNews(List<News> list){
        News a = new News();
        System.out.print("Nhập id: ");
        a.setId(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhập tiêu đề : ");
        a.setTitle(sc.nextLine());
        System.out.print("Nhập ngày xuất bản : ");
        a.setPublishDate(sc.nextLine());
        System.out.print("Nhập tên tác giả : ");
        a.setAuthor(sc.nextLine());
        System.out.print("Nhập content : ");
        a.setContent(sc.nextLine());
        System.out.print("Nhập 3 đánh giá : ");
        for(int i = 0 ; i  < 3 ; i++){
            a.rateList[i] = sc.nextFloat();
        }
        list.add(a);
    }
    public static void tieude() {
        System.out.printf("%-25s%-15s%-20s%-20s%-15s\n", "Title", "Publish Date", "Author", "Content", "Average rate");
    }
}