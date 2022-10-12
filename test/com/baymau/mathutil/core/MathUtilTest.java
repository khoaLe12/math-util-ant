/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.baymau.mathutil.core;

import org.junit.Test;
import junit.framework.Assert;


/**
 *
 * @author KHOA
 */
public class MathUtilTest {
    
        //Hàm getF() đc thiết kế để trả về con long nếu n đưa vào 0..20
        //Hàm getF() đc thiết kế ném ra EXCEPTION nếu ta đưa vào n < 0 || n > 20
        //tức là nếu gọi getF(-5) thì chỗ gọi sẽ nhận về EXCEPTION tên là
        // IllegalArgumentException
        //đưa cà chớn, nhận ngoại lệ!!!
        //bắt xem màn hình có ném đúng ngoại lệ hay ko nếu data cà chớn
        // THẤY NGOẠI LỆ MỪNG RƠI NƯỚC MẮT
        
        @Test(expected = Exception.class)
        //vietsub: Khi chạy hàm này kiểm tra giùm xem có 1 ngoại lệ thuộc nhóm/class IllegalArgumentException xuất hiện hay ko
        //nó xh = cách nó đc new IllegalArgumentException ở đâu đó
        //nếu có xh, mừng quá, đúng như thiết kế, màu xanh
        //Kỳ vọng mày xh, dù mày là exception, và mày xh thật, màu xanh
        public void testFactorialGivenWrongArgumentThroughsException(){
            MathUtil.getFactorial(-5);
        }
    
        
        @Test
        public void testFactorialGivenRightArgumentReturnsWell1(){
            long expected = 1;
            long actual = MathUtil.getFactorial(0);
            Assert.assertEquals(expected,actual);
            
            
            expected = 1;
            actual = MathUtil.getFactorial(1);
            Assert.assertEquals(expected, actual);
            
            Assert.assertEquals(2, MathUtil.getFactorial(2));
            
            
        }
        
        
        @Test
        public void testFactorialGivenRightArgumentReturnsWell2(){
            Assert.assertEquals(6, MathUtil.getFactorial(3));
            
            Assert.assertEquals(24, MathUtil.getFactorial(4));
            
            Assert.assertEquals(120, MathUtil.getFactorial(5));
            
            Assert.assertEquals(720, MathUtil.getFactorial(6));
        }
        
        
       @Test 
        public void tryJUnitFirst(){
            Assert.assertEquals(69, 69);
        
        }
    
}


//Test @ đc gọi ANNOTATION, ký hiệu, flag để đánh dấu đoạn code
//Mang 1 ý nghĩa nào đó. Và khi biên dịch/complie code thì
//thư viện đi kèm nó sẽ tự động generate thêm code cho mình tùy theo\
//@
//ví dụ @Test thì thư viện JUnit nãy import nó sẽ ngầm tự generate
//hàm này thành public static void main() và gửi main này cho JVM
//Kỹ thuật dùng thư viện, phải theo cú pháp của nó thông qua những



//Quy tác chơi xanh đỏ
//Xanh: khi tất cả các test case đều xanh, tức là tất cả 
//          Expected phải == actual

//Đỏ: chỉ cần có 1 test case màu đỏ, xem như hàm toang/tạch
//  Chỉ cần có 1 expected != actual, xem như bỏ đi hết các test case
//1 thằng gây sai cho kết quả
//Lý do: hàm đã đúng thì phải đúng hết cho các case đã đc nêu ra
//      Chỉ cần có 1 sự ko == nhau của actual vs expected, hàm ko
//      ổn định về kết quả trả về -> SAI

//Ko thể test hết các case(NL2) nhưng đã test case nào thì phải ngon
// Xanh Case đó

//Nói thêm về màu đỏ:
//Đỏ xảy ra khi: có 1 sự ko bàng nhau của expected và actual
//Lý do  expected và actual ko bằng nhau
//Có 2 lý do
//LD1: Expected đúng, mình tính bên ngoài, = tay khi chưa có hàm
//  Actual  Sai, tình huống này hàm cùi bắp, BUG

//LD2: Expected sai, vứt luôn test case này đi
//Kỳ vọng mà sai, hy vọng j ở actual.



//DDT - Data Driven Testing
//Tách bộ kiểm thử data sang 1 chỗ
//Lát hồi nhồi/nạp/fill/điền/feed data này tuần tự vào chỗ kiểm thử
//ví dụ tách data đã kiểm thử ở trên thành
//0     1
//1     1
//2     2
//3     6
//4     24
//5     120
//6     720
//[7][2]


//Assert.assertEquals(720, MathUtil.getFactorial(6));
//Thay vì lệnh so sánh viết cho từng case, ta biến lệnh này
//trở thành tổng quát, ko điền data cụ thể, mà sẽ lấy từ đâu đó 


//Assert.assertEquals(???, MathUtil.getFactorial(???));
//??? này là lấy từ tập data ở trên
//code gọn hơn, đẹp hơn,dễ bảo trì hơn, kiểm soát đc đủ thiếu của các case
//kĩ thuật tách code test ra khỏi data của nó, lát hồi fill lại sau
//đc gọi là kĩ thuật viết test case theo kiểu tham số hóa
//                                                      PARAMETERIZES
//Hoặc đc goi là                        DDT - DATA DRIVEN TESTING
//Viết Kiểm Thử Hướng Về Tách Data Riêng Ra!!!

//TDD






