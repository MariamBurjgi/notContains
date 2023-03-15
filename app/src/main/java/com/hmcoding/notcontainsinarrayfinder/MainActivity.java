package com.hmcoding.notcontainsinarrayfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public static int notContains(int[] nums) {
        int n=nums.length;


        for (int i = 0; i < n; i++) {
            while (nums[i]>0 && nums[i]<=n && nums[nums[i]-1] != nums[i]) {
                int temp=nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=temp;
            }
        }

        int i = 0;
        while (i < n && nums[i] == i + 1) {
            i++;
        }

        if (i == n) {
            return n + 1;
        }

        return i + 1;
    }
}