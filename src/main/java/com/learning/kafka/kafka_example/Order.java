package com.learning.kafka.kafka_example;

import lombok.Data;

@Data
public class Order {

	private String customerName;
	private String product;
	private int quantity;
}
