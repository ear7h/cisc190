String stringy;
char choice;
int total = 0;
Scanner in = new Scanner(System.in);
System.out.print("enter a string");
stringy = in.nextLine();
System.out.print("enter a char");
choice = in.next.charAt(0);

for(int i = 0; i < stringy.length(); i++){
	if(string.charAt(i) == choice){
		total ++;
	}
}

System.out.println(total);