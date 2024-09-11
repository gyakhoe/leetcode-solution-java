package com.gyakhoe.algomap.easy;

public class FirstBadVersionSolution {


    private boolean isBadVersion(int n) {
        int random = (int) (Math.random() * 100);
        return (random % 2) == 0;
    }

    public int firstBadVersion(int n) {
        if(n==1) return n;

        int start =1;
        int end = n;
        int badVersion = 1;
        while(start <= end){
            int mid = start +(end-start)/2;
            if(isBadVersion(mid)){
                badVersion = mid;
                end = mid-1;
            }
            else start=mid+1;
        }
        return badVersion;
    }
}
