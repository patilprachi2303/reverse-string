// print n to 1 numbers
/*class test{
	public static void printnum(int n){
		if(n==0)
			return;
		System.out.println(n);
		printnum(n-1);
	}
	public static void main(String args[]){
		int n=6;
		printnum(6);
	}
}
//print 1 to n numbers
class test{
	public static void printnum(int n){
		if(n==6)
			return;
		System.out.println(n);
		printnum(n+1);
	}
	public static void main(String args[]){
		int n=1;
		printnum(n);
	}
}
//sum of n numbers
class test{
	public static void printsum(int n, int sum, int i){
		if(i==n){
			sum+=n;
			System.out.println("sum ="+sum);
			return;
		}
		sum+=i;
		printsum(n,sum,i+1);
	}
	public static void main(String args[]){
		int n=5;
		printsum(5,0,1);
	}
}
//factorial of numbers
class test{
	public static int factorial(int n){
		if(n==0 || n==1){
			return 1;
		}
		int fact_nm1=factorial(n-1);
		int fact_n=n*fact_nm1;
		return fact_n;
	}
	public static void main(String args[]){
		int n=5;
		int answer=factorial(n);
		System.out.println(answer);
	}
}

//fabinoacii series
class test{
	public static void fibonaci(int a,int b,int n){
		if(n==0)
			return;
		int c=a+b;
		System.out.print(" "+c);
		fibonaci(b,c,n-1);
	}
	public static void main(String args[]){
		int a=0,b=1;
		int n=7;
		System.out.print(a+" "+b);
		fibonaci(a,b,n-2);
	}
}
//sorted arrya or not 
class test{
	public static boolean issorted(int []a,int i){
		if(i==a.length-1 ){
			return true;
		}
		if(a[i]>a[i+1])
			return false;
		return issorted(a,i+1);
	}
	public static void main(String args[]){
		int a[]={1,2,3,4,5,0};
		if(issorted(a,0))//0 is index from which sorting is checked
			System.out.println("array is sorted");
	    else 
			System.out.println("is not sorted");
	}
}

//first occurence of ele in array
class test{
	public static int firstoccur(int []a,int target,int i){
		if(i==a.length-1 ){
			return -1;
		}
		if(a[i]==target)
			return i;
		return firstoccur(a,target,i+1);
	}
	public static void main(String args[]){
		int a[]={1,2,3,4,5,0,6,4};
			System.out.println("element found at "+firstoccur(a,10,0));
	}
}

//last occurence 
class test{
	public static int lastoccur(int []a,int target,int i){
		if(i==-1 ){
			return -1;
		}
		if(a[i]==target)
			return i;
		return lastoccur(a,target,i-1);
	}
	public static void main(String args[]){
		int a[]={1,2,3,4,5,0,6,4,7,8};
			System.out.println("element found at "+lastoccur(a,4,a.length-1));
	}
}

//x^n 
class test{
	public static int pow(int x,int n){
		if(n==0 ){
			return 1;
		}
		//int xpowOfnm1=pow(x,n-1);
		//return x*xpowOfnm1;
		return x*pow(x,n-1);
	}
	static int optimizedpow(int x,int n){
		//base condition 
		if(n==0)
			return 1;
		//int halfpowsq=optimizedpow(x,n/2)* optimizedpow(x,n/2);//ithe ajun pn O(n) cha complexity ahe so reduce karyala khalil 2 step
		int halfpow=optimizedpow(x,n/2);
		int halfpowsq=halfpow * halfpow;
		//if n is odd 
		if(n%2!=0)
			return x*halfpowsq;
		return halfpowsq;//if n is even
	}
	public static void main(String args[]){
		int x=2,n=10;
			System.out.println(pow(x,n));//O(n);
			System.out.println(optimizedpow(x,n));//require less call stacks in stack memeory O(logn)
	}
}

//tiling problem 
class test{
	public static int findways(int n){
		//base condition 
		if(n==1 || n==0)
			return 1;//for 1 or 0 there isalways one way of placing tile
		//vertical choice 2*1 chi tile 2*n vr thevli tr remaining n-1 area rahato becoz tile chi height 1 ahe  so
		int verticalchoose=findways(n-1);
		
		//horizontal choice jr horizontal tile thevli tr n-2 evda raea rahato becoz tile chi length 2 ahe
		int horizontalchoice=findways(n-2);
		
		//totoal ways are 
		int totoal=horizontalchoice+ verticalchoose;
		return totoal;c
	}
	public static void main(String args[]){
		int n=3;
		System.out.println(findways(n));
	}
}*/

//remove duplicate from string 
class test{
	public static void removeduplicate(String str,int i,StringBuilder sb,boolean[] map){
		if(i==str.length()){
			System.out.println(sb);
			return;
		}
		
		//kam
		char currchar=str.charAt(i);
		if(map[currchar-'a']==true){
			//duplicate character
			removeduplicate(str,i+1,sb,map);
		}
		else {
			//char occur first time in string 
			map[currchar-'a']=true;
			removeduplicate(str,i+1,sb.append(currchar),map);
		}
	}
	public static void main(String args[]){
		String str="prachipatil";
		removeduplicate(str,0,new StringBuilder(""),new boolean[26]);
	}
}