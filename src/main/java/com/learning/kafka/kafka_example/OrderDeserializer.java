package com.learning.kafka.kafka_example;

import java.io.IOException;

import org.apache.kafka.common.serialization.Deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;

public class OrderDeserializer implements Deserializer<Order> {

	@Override
	public Order deserialize(String arg0, byte[] data) {
		Order order = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			order = mapper.readValue(data, Order.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return order;
	}

}
