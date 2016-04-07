package demo.source;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;

import demo.domain.Foo;

/**
 * 本例子是证明多个source，sink 的例子，
 * @author hushuming
 *
 */
@EnableBinding(MultiSource.class) //binding 的是 自己创建的 source output interface
public class SourceMoudle {
	
	
	
	@Bean
	//映射到自己创建的output1 messageChannel
	@InboundChannelAdapter(value = MultiSource.SAMPLE, poller = @Poller(fixedDelay = "1000", maxMessagesPerPoll = "1"))
	//发送消息的时候，foo的值是 ‘hi’
	public  MessageSource<String> messageSource1() {
		
		return new MessageSource<String>() {
			public Message<String> receive() {
				System.out.println("******************");
				System.out.println("At the Source");
				System.out.println("******************");
				Foo foo = new Foo();
				foo.setValue("hi");
				System.out.println("Sending value: " + foo.getValue() + " of type " + foo.getClass());
				return MessageBuilder.withPayload(foo.getValue()).build();
			}
		};
	}
	
	


}
