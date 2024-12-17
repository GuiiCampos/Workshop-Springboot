package com.pessoal.estudos.entities.enums;

public enum OrderStatus {
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int value;

    private OrderStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static OrderStatus valueOf(int value) {
        for (OrderStatus code : OrderStatus.values()) {
            if (code.getValue() == value) {
                return code;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code");
    }
}
