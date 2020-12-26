package com.lbq.config;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class MyConfig {

	public static TransportClient client() throws UnknownHostException{
		InetSocketTransportAddress node = new InetSocketTransportAddress(
				InetAddress.getByName("localhost"),9300
				);
		Settings settings = Settings.builder().put("cluster.name", "elasticsearch").build();
		TransportClient client = new PreBuiltTransportClient(settings);
		client.addTransportAddress(node);
		return client;
	}
}
