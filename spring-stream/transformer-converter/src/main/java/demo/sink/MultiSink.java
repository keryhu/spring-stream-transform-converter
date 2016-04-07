package demo.sink;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * 自定义source interface,为了证明多个intput，output的例子，此处是2个input
 * @author hushuming
 *
 */
public interface MultiSink {
	
	String SAMPLE = "sample-sink";


	
	//此处用的是 sub订阅通道
	@Input(SAMPLE)
	SubscribableChannel input1();

	

}
