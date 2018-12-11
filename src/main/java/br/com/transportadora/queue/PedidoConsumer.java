package br.com.transportadora.queue;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PedidoConsumer {

	@RabbitListener(queues = "${jsa.rabbitmq.queue}")
	public void recievedMessage(String cep) {
		System.out.println("Recieved Message: " + cep + "R$ 29,00");
	}
}
