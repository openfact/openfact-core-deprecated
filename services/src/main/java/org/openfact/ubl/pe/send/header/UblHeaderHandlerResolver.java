package org.openfact.ubl.pe.send.header;

import java.util.ArrayList;
import java.util.List;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

public class UblHeaderHandlerResolver implements HandlerResolver {

	@Override
	public List<Handler> getHandlerChain(PortInfo portInfo) {
		List<Handler> handlerChain = new ArrayList<>();
		UblHeaderHandler ublHeaderHandler = new UblHeaderHandler();
		handlerChain.add(ublHeaderHandler);
		return handlerChain;
	}

}