package com.vshop;

public class VoucherCalculator {
    /**
     * Hàm tính toán giá trị đơn hàng cuối cùng của V-Shop (Đã vá lỗi bằng Poka-Yoke)
     */
    public double calculateFinalPrice(double cartTotal, double shippingFee, double voucherValue) {
        double finalPrice = cartTotal + shippingFee - voucherValue;
        
        // CƠ CHẾ POKA-YOKE: Nếu giá trị âm, tự động ép về 0 đồng.
        return Math.max(0, finalPrice);
    }
}