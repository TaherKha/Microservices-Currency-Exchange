package xpl.ety;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
public class ExchangeValue {
	@Getter
	@Setter
	@Id
	private Long id;
	@Getter
	@Setter
	@Column(name = "currency_from")
	private String from;
	@Getter
	@Setter
	@Column(name = "currency_to")
	private String to;
	@Getter
	@Setter
	@Column(name = "conversion_multiple")
	private BigDecimal conversionMultiple;
	@Getter
	@Setter
	@Column(name = "port")
	private int port;

}
