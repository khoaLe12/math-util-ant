/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.baymau.mathutil.core;

/**
 *
 * @author KHOA
 */

// Ta sẽ clone bộ thư viện/công cụ Math util của JDK
//Giả lập các hàm của class Math và JDK
// Những gì là công cụ dùng cho các hàm khác, class khác thì thường sẽ đc
//thiết kế là STATIC
// STCTIC LÀ CHẤM TRỰC TIẾP QUA TÊN CLASS, ÉO CÓ NEW


public class MathUtil {
    public static final double PI = 3.141592653589793;

    
    //Hàm tính n giai thừa bằng 1.2.3.4....n
    //Quy ước:
    //Ko có giai thừa cho số âm
    //0! = 1! = 1
    //21 giai thừa là vượt 18 số 0, vượt kiểu long
    //hàm của chúng ta design là: chỉ chấp nhận tính giai thừa của n từ 0..20
    // <0 || > 20 chửi, m đưa n cà chớn
    public static long getFactorial(int n){
        if(n<0 || n>20)
            throw new IllegalArgumentException("Invalid number n. n must be between 0 to 20");
        
        if(n==0 || n==1) 
            return 1;
        
        long product = 1;
        
        for (int i = 2; i <= n; i++) 
            product *= i;
        
        return product;
    }
}


//Kỹ thuật lập trình kiểu mới (vẫn giữ nguyên những kiến thức lập trình đã có)
//1 PLUGIN MỚI CHO TRÌNH ĐỘ CỦA DEV - VIẾT CODE LUÔN CHÚ Ý CAM KẾT CODE CÓ CHÂT LƯỢNG
//CHẤT LƯỢNG KO NÓI = MIỆNG, CHẤT LƯỢNG NÓI = CODE
//KĨ THUẬT TDD - TEST DRIVEN DEVELOPMENT
//VIẾT CODE VÀ VIẾT CODE ĐỂ TEST CODE SONG SONG VỚI NHAU
// MỖI HÀM DEVELOPER VIẾT RA PHẢI VIẾT NGAY CÁI TEST CASE, PHẢI VIẾT NGAY HÀNH ĐỘNG
//KIỂM THỬ HÀM, ĐỂ BIẾT RÀNG VỪA HÀM CHẠY SAI HAY ĐÚNG