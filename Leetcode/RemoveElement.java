package com.Leetcode;

import java.util.Iterator;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {3,2,2,3};
		int val=3;
		System.out.println(removeElement(arr,val));
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static int removeElement(int[] nums, int val) {
        if(nums.length==0){
            return 0;
        }
        
        
        int j=0;
        
        for(int i =0;i<nums.length;i++){
            
            
            if(nums[i]!=val){
                
                nums[i]=nums[j];
                j++;
            }
            
        }
        return j;
	}

}
