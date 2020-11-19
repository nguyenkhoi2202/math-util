/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khoi.util.test;

import khoi.util.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nguyen Khoi
 */
public class MathUtilityTest {

    @Test
    // kí hiệu của JUnit đưa ra, biến hàm ngay sau đây thành hame main
    //public static void main(), app có nhìu main
    //F6 chyaj main() mặc định , shift-F6 là chạy main() ở @Test
    public void getFactorial_RunsWell_IfValidArgument() {
        assertEquals(720, MathUtility.getFactorial(6));
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(1, MathUtility.getFactorial(0));
    }
    //xanh chi dat dc neu tat ca cung xanh
    // do chi can it nhat 1 thg do la coi nhu tat ca do
    // y nghia: ham da dung thi phai dung het , sai chi 1 cai hay vai cai
    
}
//viết code dể test code chính
//viết code dùng thư viện JUnit, Nunit,... để test
//xem code chín chạy ôinr k trc khi đêm bên khách hàng trải nghiệm
//và thư viện này cung cấp cái cơ chế báo đung sai qa màu sắc xanh đỏ
//mắt chỉ  nhìn 2 màu là đủ, khỏi cần so sánh expected và actual rồi kết

