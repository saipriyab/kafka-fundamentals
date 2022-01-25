package com.learning.kafka.kafka_example;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.RecordMetadata;

public class OrderCallback implements Callback {

	@Override
	public void onCompletion(RecordMetadata metadata, Exception arg1) {
		System.out.println(metadata.offset());
		System.out.println(metadata.partition());
		System.out.println("message sent succesfully");

	}

}
