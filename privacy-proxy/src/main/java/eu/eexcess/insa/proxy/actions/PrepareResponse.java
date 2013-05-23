package eu.eexcess.insa.proxy.actions;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;

public class PrepareResponse implements Processor {

	public void process(Exchange exchange) throws Exception {
		Message in = exchange.getIn();
		
		in.setBody("<ul><li>toto</li><li>titi</li></ul>");
	}

}
