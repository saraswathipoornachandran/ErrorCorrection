package com.basic;

public class arr {

	public static void main(String[] args) {
	
int N=78945;
int temp= N;

int arr[]=new int[10];
int i=0;
while(temp>0)
{
	int remainder=temp%10;
	arr[i] = remainder;
	i++;
	temp =temp/10;
	
	
}
for(i=0;i<10;i++)
{
	System.out.println(arr[i]);
}


	}

}

