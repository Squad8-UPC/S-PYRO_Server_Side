package com.squad8.spyro.config;

import org.eclipse.paho.client.mqttv3.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class MqttConfiguration {
    /*@Bean
    @ConfigurationProperties(prefix = "mqtt")
    public MqttConnectOptions mqttConnectOptions() {

        return new MqttConnectOptions();
    }

    @Bean
    public IMqttClient createClient(@Value("${mqtt.clientId}") String clientId,
                                    @Value("${mqtt.hostname}") String hostname, @Value("${mqtt.port}") int port) throws MqttException {

        IMqttClient mqttClient = new MqttClient("ws://" + hostname + ":" + port +"/mqtt", clientId);

        mqttClient.connect(mqttConnectOptions());
        mqttClient.subscribe("topic");

        System.out.println("Suscrito");

        mqttClient.setCallback(new MqttCallback() {
            @Override
            public void connectionLost(Throwable cause) {

            }

            @Override
            public void messageArrived(String topic, MqttMessage message) throws Exception {
                System.out.println(new String(message.getPayload()));
            }

            @Override
            public void deliveryComplete(IMqttDeliveryToken token) {

            }
        });
        return mqttClient;
    }*/
}
