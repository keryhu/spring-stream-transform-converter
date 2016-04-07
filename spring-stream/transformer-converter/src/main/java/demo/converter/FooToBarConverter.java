package demo.converter;

import org.springframework.cloud.stream.converter.AbstractFromMessageConverter;
import org.springframework.messaging.Message;
import org.springframework.messaging.converter.MessageConversionException;
import org.springframework.util.MimeType;

import demo.domain.Bar;
import demo.domain.Foo;

/**
 * foo.class 转为Bar.class 的 bean
 * @author hushuming
 *
 */

public class FooToBarConverter extends AbstractFromMessageConverter{
	
	public FooToBarConverter() {
		super(MimeType.valueOf("test/bar"));
	}

	@Override
	protected Class<?>[] supportedPayloadTypes() {
		// TODO Auto-generated method stub
		return new Class<?>[] {Foo.class};
	}

	@Override
	protected Class<?>[] supportedTargetTypes() {
		// TODO Auto-generated method stub
		return new Class[] {Bar.class};
	}
	
	@Override
	public Object convertFromInternal(Message<?> message, Class<?> targetClass, Object conversionHint){
		
		Object result = null;
		try {
			if (message.getPayload() instanceof Foo) {
				Foo fooPayload = (Foo) message.getPayload();
				result = new Bar(fooPayload.getValue());
			}
		}
		catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new MessageConversionException(e.getMessage());
		}
		return result;
	}

}
