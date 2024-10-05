import java.util.*;
class demo{
	static void insertionsort(int a[]){
		for(int i=1;i<a.length;i++){
			int curr=a[i];
			int prev=i-1;
			while(prev>=0 && a[prev]>curr){
				a[prev+1]=a[prev];
				prev--;
			}
			a[prev+1]=curr;
		}
		System.out.println(Arrays.toString(a));
	}
	static void bubblesort(int []a){
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1-i;j++){
				//swap
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
	static void selectionsort(int []a){
		for(int i=0;i<a.length-1;i++){
			int minpos=i;
			for(int j=i+1;j<a.length;j++){
				if(a[minpos]>a[j])
					minpos=j;
			}
			//swap 
			int temp=a[minpos];
			a[minpos]=a[i];
			a[i]=temp;
		}
		System.out.println(Arrays.toString(a));
	}
	static void countingsort(int a[]){
		int max=Integer.MIN_VALUE;
		for(int i:a){
			if(i>max){
				max=i;
			}
		}
		int count[]=new int[max+1];
		for(int i:a){
			count[i]++;// 0 2 2 1 1 1 0 1
		}
		int j=0;
		for(int i=0;i<count.length;i++){
			while(count[i]>0){
				a[j]=i;
				j++;
				count[i]--;
			}
		}
		System.out.println(Arrays.toString(a));
	}
	public static void main(String arg[]){
		int a[]={1,4,2,5,2,1,3,7};//{5,4,1,3,2};//{1,2,3,4,5};
		bubblesort(a);
		selectionsort(a);
		insertionsort(a);
		
		Arrays.sort(a,0,3);//sort 0 1 2 ele of array 
		System.out.println(Arrays.toString(a));
		
		sort in descending order 
		Arrays.sort(a,Collections.reverseOrder());//change int a[] to Integer a[]
		System.out.println(Arrays.toString(a));
		
		countingsort(a);
	}
}