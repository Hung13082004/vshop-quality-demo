package com.vshop;

public class VoucherCalculator {
    /**
     * Hàm tính toán giá trị đơn hàng cuối cùng của V-Shop (Phiên bản bị lỗi 11/11)
     */
    public double calculateFinalPrice(double cartTotal, double shippingFee, double voucherValue) {
        double finalPrice = cartTotal + shippingFee - voucherValue;
        return finalPrice;
    }
}