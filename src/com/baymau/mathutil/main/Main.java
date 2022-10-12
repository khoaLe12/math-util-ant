/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.baymau.mathutil.main;

import com.baymau.mathutil.core.MathUtil;

/**
 *
 * @author KHOA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        System.out.println("This message come from main method");
        
        tryTTDFirst();
    }
    
    public static void tryTTDFirst(){
        
        //Test case #1 - tình huống xài hàm số 1:
        //n=0; hy vọng trả về expected = 1;
        //  thực tế hàm trả về mấy, actual, đoán xem, chạy ms biết!!
        
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        // so sánh 2 giá trị để hàm viết đúng hay ko???
        // 3 thứ này tổ hơp nên 1 thứ gọi là TEST CASE - TÌNH HUỐNG XÀI APP
        System.out.println("0! Status | Expected = " + expected + " | Actual = " + actual);
        
        //vietsub: 0! có đúng bằng 1 hay ko
        
        //Test case số 2: n =1 hy vọng trả về 1 luôn, thực tế là mấy chạy hằn ms biết
        expected = 1;
        actual = MathUtil.getFactorial(1);
        System.out.println("1! Status | Expected = " + expected + " | Actual = " + actual);
        
        
        //Test case số 3: n = 2 hy vọng trả về 2 luôn, thực tế là mấy chạy hằn ms biết
        System.out.println("2! Status | Expected = 2 " + " | Actual = " + MathUtil.getFactorial(2));
    }
    
}
