package demo.sink;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

import demo.domain.Bar;

/**
 * 多个接受者sink
 * @author hushuming
 *
 */
@EnableBinding(MultiSink.class)  //binding 自定义的sink interface
public class SinkMoudle {
	
	//第一个接受者
	@StreamListener(MultiSink.SAMPLE)
	public void receive(Bar barMessage) {
		System.out.println("******************");
		System.out.println("At the Sink");
		System.out.println("******************");
		System.out.println("Received transformed message " + barMessage.getValue() + " of type " + barMessage.getClass());
	}
	

}
