package demo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 为了验证 converter， 建立的一个 Bar class
 * @author hushuming
 *
 */
@AllArgsConstructor
public class Bar {
	
	@Getter
	@Setter
	private String value="this is Bar.class init value=bar";

}
