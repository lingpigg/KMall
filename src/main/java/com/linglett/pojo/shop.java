package com.linglett.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class shop {
    private long id;
    private String userId;
    private String shopName;
    private long orderId;
    private long commodityId;
}
