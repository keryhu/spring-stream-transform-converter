package demo.sink;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

import demo.domain.Bar;

/**
 * 最后接受到的消息是 经过 FooToBarConverter  和  SampleTransformer 两者转换后的结果
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
