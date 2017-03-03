package com.wbl.operatorsAndLoops;

public class LoopsAndConditions {
	
	public static void countVowels(String input){
		
		/*for(int i=1;i<=10;i++){
			System.out.println(i);
		}
	 */
		int count=0;
		
		if(!input.isEmpty()){
		String inputLower = input.toLowerCase();		
		int i;
		for(i=0;i<inputLower.length();i++){
		char ch =inputLower.charAt(i);
		System.out.println(inputLower.charAt(i));
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){			
			count++;
		}else{
			System.out.println(ch+" Not a vowel");
		}
		}
		
		System.out.println("Count of vowels:"+count);
		}
		
	}
	
	public static void switchCase(String input){
				
		switch(input){
		
		case "Mon":
			System.out.println("its monday");
			break;
		case "Tue":
			System.out.println("its tuesday");
			break;
		case "Wed":
			System.out.println("its wednesday");
			break;
		case "Thu":
			System.out.println("its thursday");
			break;
		default:
			System.out.println("Default logic");
		
		}
		
		System.out.println("END OF SWITCH");
	}
	
	//finding first occurance of given char in string- i/p- hello, e - return true or false
	public  static boolean forLoop(String input, char searchChar){
		boolean result=false;
		for(int i=0; i<input.length();i++){
			char ch= input.charAt(i);
			/*if(ch==searchChar){
				result=true;
				break;
			}*/
			System.out.println(ch);
			if(ch!=searchChar){
				continue;				
			}else{
				result=true;
				//break;
			}
			System.out.println("HELLO");
		}
		return result;
		
	}
	
	public static void whileAndDowhileLoop(){
		
		int i=11;
		while(i<=10){
			System.out.println("WHILE:"+i);
			i++;
		}
		
		int j=11;
		do{
			System.out.println("DO WHILE:"+j);
			j++;
		}while(j<=10);
	}
	
	public static void main(String args[]){
		//countVowels("hEellO");
		//switchCase("url");
		//boolean result =forLoop("Java",'a');
		//System.out.println(result);
		whileAndDowhileLoop();
	}

}
