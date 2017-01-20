package com.hb.pm;

import java.util.Scanner;

public class Ex01 {
	public static Scanner sc;

	public static void main(String[] args) {
		// bbs
		// 1.越鯉系 2.越床奄 3.越左奄 4.越呪舛 0.曽戟
		// 1. 越腰硲 薦鯉
		//    ---------------
		//    1		 薦鯉1
		//    2		 -
		//    3		 -
		//    ~
		//    10	 薦鯉10
		// 2. 	越薦鯉:
		//		越彰戚:
		//		鎧遂:
		// 3. 越腰硲>2
		//    	越薦鯉: 薦鯉2
		//		越彰戚:	guest
		//		鎧  遂:	aaaaaa
		// 3. 呪舛拝 腰硲>2
		//    	越薦鯉: 薦鯉22
		//		越彰戚:いしけしい
		//		鎧遂:けいしかし
		sc = new Scanner(System.in);
		System.out.println("BBS 惟獣毒 ver 2.0.0");
//		String[] record = new String[]{"薦鯉","越彰戚","鎧遂"};
		String[][] records = new String[10][];
		for(int i=0; i<records.length; i++){
			records[i]=new String[]{"-","",""};
		}
		String input1="";
		int cnt=0;
		while(true){
			System.out.print("1.越鯉系 2.越床奄 3.越左奄 4.越呪舛 0.曽戟>");
			input1=sc.nextLine();
			if(input1.equals("1")){
				System.out.println("-------------------------");
				System.out.println("越腰硲\t薦鯉");
				System.out.println("-------------------------");
				for(int i=0; i<records.length; i++){
					System.out.println(i+1+"\t"+records[i][0]);
				}
				System.out.println("-------------------------\n");
			}else if(input1.equals("2")){
//				System.out.print("薦  鯉:");
//				String inp1=sc.nextLine();
//				System.out.print("越彰戚:");
//				String inp2=sc.nextLine();
//				System.out.print("鎧  遂:");
//				String inp3=sc.nextLine();
//				System.out.println();
//				records[cnt]=new String[]{inp1,inp2,inp3};
				input(records,cnt);
				cnt++;
			}else if(input1.equals("3")){
				System.out.print("越腰硲 識澱>");
				input1 = sc.nextLine();
				int num = Integer.parseInt(input1);
				System.out.println("薦  鯉:"+records[num-1][0]);
				System.out.println("越彰戚:"+records[num-1][1]);
				System.out.println("鎧  遂:"+records[num-1][2]);
				System.out.println("\n");
			}else if(input1.equals("4")){
				System.out.print("越腰硲 識澱>");
				input1 = sc.nextLine();
				int num = Integer.parseInt(input1);
//				System.out.print("薦  鯉:");
//				String inp1=sc.nextLine();
//				System.out.print("越彰戚:");
//				String inp2=sc.nextLine();
//				System.out.print("鎧  遂:");
//				String inp3=sc.nextLine();
//				records[num-1] = new String[]{inp1,inp2,inp3};
				input(records,num-1);
				System.out.println();
			}else if(input1.equals("0")){
				System.out.println("\n\n姶紫杯艦陥\n");
				break;
			}
		}
	}
	
	public static void input(String[][] records,int num){
		String[] subs={"薦  鯉:","越彰戚:","鎧  遂:"};
		for(int i=0; i<subs.length; i++){
			subs[i]=func01(subs[i]);
		}
		records[num] = new String[]{subs[0],subs[1],subs[2]};
	}
	public static String func01(String st1){
		System.out.print(st1);
		String inp1=sc.nextLine();
		return inp1;
	}

}















