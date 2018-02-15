
package com.networknt.miAsistente;

import com.networknt.config.Config;
import com.networknt.server.HandlerProvider;
import io.undertow.Handlers;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.Methods;
import com.networknt.info.ServerInfoGetHandler;
import com.networknt.health.HealthGetHandler;
import com.networknt.miAsistente.handler.*;

public class PathHandlerProvider implements HandlerProvider {
    @Override
    public HttpHandler getHandler() {
        return Handlers.routing()
        
            .add(Methods.GET, "/api-miAsistente/health", new HealthGetHandler())
        
            .add(Methods.GET, "/api-miAsistente/server/info", new ServerInfoGetHandler())
        
            .add(Methods.GET, "/api-miAsistente/cardView/{cardId}", new CardViewCardIdGetHandler())
        
        ;
    }
}
