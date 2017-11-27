import java.util.Scanner;


class Stars{
	public void printStars(){
	int a;
	Scanner input = new Scanner(System.in);
	System.out.println("masukan nilai : ");
	a=input.nextInt();
	for(int i=0;i<a;i++){
		
			for(int j=0;j<a;j++){
		System.out.print("*");
		
	}
	System.out.println("");
	}
	}
}