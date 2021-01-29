package xpl.ctr;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import xpl.mdl.CurrencyConversion;
import xpl.pxy.CurrencyExchangeServiceProxy;

@RestController
public class CurrencyConversionController {

	@Autowired
	private CurrencyExchangeServiceProxy proxy;

	// invoking currency exchange service
	@GetMapping(value = "/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion convertCurrency(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {

		CurrencyConversion conversion = proxy.retrieveExchangeValue(from, to);

		return new CurrencyConversion(conversion.getId(), from, to, conversion.getConversionMultiple(), quantity,
				quantity.multiply(conversion.getConversionMultiple()), conversion.getPort());
	}
}
