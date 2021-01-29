package xpl.mdl;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class LimitConfiguration {
	@Getter
	private int maximum;
	@Getter
	private int minimum;
}
