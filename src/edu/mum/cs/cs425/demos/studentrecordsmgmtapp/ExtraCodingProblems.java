package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

public class ExtraCodingProblems {


    public void printHelloWorld(int[] nums){

        for(int i : nums){
            if(i%5 == 0 && i%7 == 0){
                System.out.println("HelloWorld");
            }else if(i%5 == 0){
                System.out.println("Hello");
            }else if(i%7 == 0){
                System.out.println("World");
            }
        }
    }

    public int findSecondBiggest(int[] nums){
        int firstLargest = nums[0];
        int secondLargest = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (firstLargest < nums[i]) {
                secondLargest = firstLargest;
                firstLargest = nums[i];
            } else
            if (nums[i] > secondLargest && nums[i] != firstLargest) {
                secondLargest = nums[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        ExtraCodingProblems extraCodingProblems = new ExtraCodingProblems();
        int[] nums= {1,2,3,4,5};
        extraCodingProblems.printHelloWorld(nums);
        System.out.println("==========================");
        System.out.println(extraCodingProblems.findSecondBiggest(nums));

    }
}
