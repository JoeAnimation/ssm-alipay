package com.alipay.dataobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author Administrator
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Product implements Serializable {
    private String id;

    private String name;

    private String price;
}