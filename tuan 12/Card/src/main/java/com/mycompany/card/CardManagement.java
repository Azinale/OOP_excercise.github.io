/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.card;

/**
 *
 * @author MLemLoli
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CardManagement {

	
	public CardManagement()
	{
		super();
	}
	/*
	    Thứ tự nhập như sau:
	    - Số lượng xe
	    - Trong vòng lặp để nhập thông tin mỗi thẻ: nhập số nguyên c = 0 (thẻ học sinh) hoặc 1 (thẻ nhân viên)
	    - Nhập thông tin mỗi thẻ: id, years, day, price, fee (với thẻ sinh viên), và card (với thẻ học sinh)
	*/
	public ArrayList<Card> readData (String fileName)
	{
		ArrayList<Card> cards = new ArrayList<>();
            try{
            Scanner sc = new Scanner(new File(fileName));
            int n = Integer.parseInt(sc.nextLine());
                for (int i = 0; i < n; i++) {
                        int c = Integer.parseInt(sc.nextLine());
                        String id = sc.nextLine();
                        int year = Integer.parseInt(sc.nextLine());                  
                        double day = Double.parseDouble(sc.nextLine());
                        double price = Double.parseDouble(sc.nextLine());
            
                if (c==0) {
                    double fee = Double.parseDouble(sc.nextLine());
                    StudentCard stcar = new StudentCard(id, year, day, price, fee);
                    cards.add(stcar);
                }
                 if (c==1) {
                    double tax = Double.parseDouble(sc.nextLine());
                    cards.add(new StaffCard(id, year, day, price, tax));
                }
                 }return cards;
                    
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.out.println("khong thay file");
            }
            catch(NumberFormatException e){
                System.out.println("nhap sai du lieu");
            }
		return null;
		
	}
	
	public void printArrayList(ArrayList<Card> cards) {
		for (int i =0;i<cards.size();i++){
			System.out.println(cards.get(i).toString());
	}
        }
	// Hoan thien phuong thuc findCards de tim nhung  xe co nam san xuat la year
	
	public ArrayList<Card> findCards (ArrayList<Card> cards, int year){
		//Begin editable part
                ArrayList<Card> finder = new ArrayList<>();
		for(int i = 0; i < cards.size(); i++) {
		    if(cards.get(i).getYear()==year) {		    
                        finder.add(cards.get(i));
                    }
		}
		return finder;
		//End editable part
	}
	
	// Hoan thien phuong thuc getMaxAmount de tim cac xe thuoc the loai typeOfCard
	public ArrayList<Card> getMaxAmount (ArrayList<Card> cards, String typeOfCard){
		//Begin editable part
                ArrayList<Card> maxcards = new ArrayList<>();
                double max = -1;
                for (int i = 0; i < maxcards.size(); i++) {
                    if (cards.get(i).getClass().getName().equals(typeOfCard)&&cards.get(i).getAmount()>max) {
                        max=cards.get(i).getAmount();
                    }
            }
                if (max>-1) {
                 for (int j = 0; j < maxcards.size(); j++) {
                       if (cards.get(j).getClass().getName().equals(typeOfCard)&&cards.get(j).getAmount()==max) {
                         maxcards.add(cards.get(j));
                     }
                        
                    }
            }
		return maxcards;
		//End editable part
	}
	
	
	// Hoan thien phuong thuc sortByAmount de sap xep cac xe theo thu tu giam dan
	public void sortByAmount (ArrayList<Card> cards) {
		//Begin editable part
                for (int i = 0; i < cards.size(); i++) {
                    for (int j = i+1; j < cards.size(); j++) {
                        if (cards.get(i).getAmount()<cards.get(j).getAmount()) {
                       Card temp = cards.get(i);
                        cards.set(i, cards.get(j));
                        cards.set(j, temp);
                        }
                    }
            }
		//End editable part
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		CardManagement cardMng = new CardManagement();
		ArrayList<Card> cards = cardMng.readData("datas.txt");
                //cardMng.printArrayList(cards);
                for (int i = 0; i < cards.size(); i++) {
				System.out.print(cards.get(i).getAmount() + " ");
			}
			System.out.println();
			ArrayList<Card> cardsList = cardMng.findCards(cards, 0);
			cardMng.printArrayList(cardsList);
			
			ArrayList<Card> cardsList1 = cardMng.getMaxAmount(cards, "StaffCard"+"StudentCard");
			cardMng.printArrayList(cardsList1);
			
			cardMng.sortByAmount(cards);
			cardMng.printArrayList(cards);
			
	}

}

