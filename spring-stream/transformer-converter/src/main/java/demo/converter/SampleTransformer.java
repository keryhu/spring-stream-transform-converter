package demo.converter;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.SendTo;

import demo.domain.Bar;

@EnableBinding(Processor.class)
public class SampleTransformer {
	
	//这个是大写的‘HI’
	private static final String TRANSFORMATION_VALUE = "HI";
	
	/**
	 * 在消息传递的时候，更改消息内容，就是转为大写“HI”
	 * @param barMessage
	 * @return
	 */
	@StreamListener(Processor.INPUT)
	@SendTo(Processor.OUTPUT)
	public Bar receive(Bar barMessage) {
		System.out.println("******************");
		System.out.println("At the transformer");
		System.out.println("******************");
		System.out.println("Received value "+ barMessage.getValue() + " of type " + barMessage.getClass());
		System.out.println("Transforming the value to " + TRANSFORMATION_VALUE + " and with the type " + barMessage.getClass());
		barMessage.setValue(TRANSFORMATION_VALUE);
		return barMessage;
	}

}
