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
 * 发送消息payload 为Foo，且Foo的值为 hi
 * @author hushuming
 *
 */
@EnableBinding(MultiSource.class) //binding 的是 自己创建的 source output interface
public class SourceMoudle {
	
	
	
	@Bean
	@InboundChannelAdapter(value = MultiSource.SAMPLE, poller = @Poller(fixedDelay = "1000", maxMessagesPerPoll = "1"))
	//发送消息的时候，foo ，  且foo的值是设置为 hi
	public  MessageSource<Foo> messageSource() {
		
		return new MessageSource<Foo>() {
			public Message<Foo> receive() {
				System.out.println("******************");
				System.out.println("At the Source");
				System.out.println("******************");
				Foo foo = new Foo();
				foo.setValue("hi");
				System.out.println("Sending value: " + foo.getValue() + " of type " + foo.getClass());
				return MessageBuilder.withPayload(foo).build();
			}
		};
	}
	
	


}
