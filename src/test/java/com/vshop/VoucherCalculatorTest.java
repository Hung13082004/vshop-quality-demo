package com.vshop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VoucherCalculatorTest {

    @Test
    public void testVoucherLonHonTongTien() {
        VoucherCalculator calc = new VoucherCalculator();
        
        // Tổng tiền 120k nhưng áp voucher 200k
        double result = calc.calculateFinalPrice(100.0, 20.0, 200.0);
        
        // Kỳ vọng là 0 đồng, không được âm. Thực tế code đang lỗi sẽ ra -80.
        assertEquals(0.0, result, "❌ LỖI NGHIÊM TRỌNG: Giá trị đơn hàng bị âm!");
    }
}