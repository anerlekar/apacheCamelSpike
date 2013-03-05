import org.apache.camel.*;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.spi.Synchronization;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;


public class CamelContextTest extends CamelTestSupport {
    ProducerTemplate template =new ProducerTemplate() {
        @Override
        public CamelContext getCamelContext() {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public int getMaximumCacheSize() {
            return 0;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void setMaximumCacheSize(int i) {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public int getCurrentCacheSize() {
            return 0;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Endpoint getDefaultEndpoint() {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void setDefaultEndpoint(Endpoint endpoint) {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void setDefaultEndpointUri(String s) {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Exchange send(Exchange exchange) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Exchange send(Processor processor) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void sendBody(Object o) throws CamelExecutionException {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void sendBodyAndHeader(Object o, String s, Object o1) throws CamelExecutionException {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void sendBodyAndProperty(Object o, String s, Object o1) throws CamelExecutionException {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void sendBodyAndHeaders(Object o, Map<String, Object> stringObjectMap) throws CamelExecutionException {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Exchange send(String s, Exchange exchange) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Exchange send(String s, Processor processor) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Exchange send(String s, ExchangePattern exchangePattern, Processor processor) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Exchange send(Endpoint endpoint, Exchange exchange) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Exchange send(Endpoint endpoint, Processor processor) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Exchange send(Endpoint endpoint, ExchangePattern exchangePattern, Processor processor) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void sendBody(Endpoint endpoint, Object o) throws CamelExecutionException {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void sendBody(String s, Object o) throws CamelExecutionException {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Object sendBody(Endpoint endpoint, ExchangePattern exchangePattern, Object o) throws CamelExecutionException {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Object sendBody(String s, ExchangePattern exchangePattern, Object o) throws CamelExecutionException {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void sendBodyAndHeader(String s, Object o, String s1, Object o1) throws CamelExecutionException {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void sendBodyAndHeader(Endpoint endpoint, Object o, String s, Object o1) throws CamelExecutionException {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Object sendBodyAndHeader(Endpoint endpoint, ExchangePattern exchangePattern, Object o, String s, Object o1) throws CamelExecutionException {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Object sendBodyAndHeader(String s, ExchangePattern exchangePattern, Object o, String s1, Object o1) throws CamelExecutionException {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void sendBodyAndProperty(String s, Object o, String s1, Object o1) throws CamelExecutionException {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void sendBodyAndProperty(Endpoint endpoint, Object o, String s, Object o1) throws CamelExecutionException {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Object sendBodyAndProperty(Endpoint endpoint, ExchangePattern exchangePattern, Object o, String s, Object o1) throws CamelExecutionException {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Object sendBodyAndProperty(String s, ExchangePattern exchangePattern, Object o, String s1, Object o1) throws CamelExecutionException {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void sendBodyAndHeaders(String s, Object o, Map<String, Object> stringObjectMap) throws CamelExecutionException {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void sendBodyAndHeaders(Endpoint endpoint, Object o, Map<String, Object> stringObjectMap) throws CamelExecutionException {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Object sendBodyAndHeaders(String s, ExchangePattern exchangePattern, Object o, Map<String, Object> stringObjectMap) throws CamelExecutionException {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Object sendBodyAndHeaders(Endpoint endpoint, ExchangePattern exchangePattern, Object o, Map<String, Object> stringObjectMap) throws CamelExecutionException {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Exchange request(Endpoint endpoint, Processor processor) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Exchange request(String s, Processor processor) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Object requestBody(Object o) throws CamelExecutionException {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public <T> T requestBody(Object o, Class<T> tClass) throws CamelExecutionException {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Object requestBody(Endpoint endpoint, Object o) throws CamelExecutionException {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public <T> T requestBody(Endpoint endpoint, Object o, Class<T> tClass) throws CamelExecutionException {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Object requestBody(String s, Object o) throws CamelExecutionException {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public <T> T requestBody(String s, Object o, Class<T> tClass) throws CamelExecutionException {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Object requestBodyAndHeader(Object o, String s, Object o1) throws CamelExecutionException {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Object requestBodyAndHeader(Endpoint endpoint, Object o, String s, Object o1) throws CamelExecutionException {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public <T> T requestBodyAndHeader(Endpoint endpoint, Object o, String s, Object o1, Class<T> tClass) throws CamelExecutionException {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Object requestBodyAndHeader(String s, Object o, String s1, Object o1) throws CamelExecutionException {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public <T> T requestBodyAndHeader(String s, Object o, String s1, Object o1, Class<T> tClass) throws CamelExecutionException {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Object requestBodyAndHeaders(String s, Object o, Map<String, Object> stringObjectMap) throws CamelExecutionException {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public <T> T requestBodyAndHeaders(String s, Object o, Map<String, Object> stringObjectMap, Class<T> tClass) throws CamelExecutionException {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Object requestBodyAndHeaders(Endpoint endpoint, Object o, Map<String, Object> stringObjectMap) throws CamelExecutionException {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Object requestBodyAndHeaders(Object o, Map<String, Object> stringObjectMap) throws CamelExecutionException {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public <T> T requestBodyAndHeaders(Endpoint endpoint, Object o, Map<String, Object> stringObjectMap, Class<T> tClass) throws CamelExecutionException {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void setExecutorService(ExecutorService executorService) {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Future<Exchange> asyncSend(String s, Exchange exchange) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Future<Exchange> asyncSend(String s, Processor processor) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Future<Object> asyncSendBody(String s, Object o) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Future<Object> asyncRequestBody(String s, Object o) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Future<Object> asyncRequestBodyAndHeader(String s, Object o, String s1, Object o1) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Future<Object> asyncRequestBodyAndHeaders(String s, Object o, Map<String, Object> stringObjectMap) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public <T> Future<T> asyncRequestBody(String s, Object o, Class<T> tClass) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public <T> Future<T> asyncRequestBodyAndHeader(String s, Object o, String s1, Object o1, Class<T> tClass) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public <T> Future<T> asyncRequestBodyAndHeaders(String s, Object o, Map<String, Object> stringObjectMap, Class<T> tClass) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Future<Exchange> asyncSend(Endpoint endpoint, Exchange exchange) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Future<Exchange> asyncSend(Endpoint endpoint, Processor processor) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Future<Object> asyncSendBody(Endpoint endpoint, Object o) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Future<Object> asyncRequestBody(Endpoint endpoint, Object o) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Future<Object> asyncRequestBodyAndHeader(Endpoint endpoint, Object o, String s, Object o1) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Future<Object> asyncRequestBodyAndHeaders(Endpoint endpoint, Object o, Map<String, Object> stringObjectMap) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public <T> Future<T> asyncRequestBody(Endpoint endpoint, Object o, Class<T> tClass) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public <T> Future<T> asyncRequestBodyAndHeader(Endpoint endpoint, Object o, String s, Object o1, Class<T> tClass) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public <T> Future<T> asyncRequestBodyAndHeaders(Endpoint endpoint, Object o, Map<String, Object> stringObjectMap, Class<T> tClass) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public <T> T extractFutureBody(Future<Object> objectFuture, Class<T> tClass) throws CamelExecutionException {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public <T> T extractFutureBody(Future<Object> objectFuture, long l, TimeUnit timeUnit, Class<T> tClass) throws TimeoutException, CamelExecutionException {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Future<Exchange> asyncCallback(String s, Exchange exchange, Synchronization synchronization) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Future<Exchange> asyncCallback(Endpoint endpoint, Exchange exchange, Synchronization synchronization) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Future<Exchange> asyncCallback(String s, Processor processor, Synchronization synchronization) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Future<Exchange> asyncCallback(Endpoint endpoint, Processor processor, Synchronization synchronization) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Future<Object> asyncCallbackSendBody(String s, Object o, Synchronization synchronization) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Future<Object> asyncCallbackSendBody(Endpoint endpoint, Object o, Synchronization synchronization) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Future<Object> asyncCallbackRequestBody(String s, Object o, Synchronization synchronization) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Future<Object> asyncCallbackRequestBody(Endpoint endpoint, Object o, Synchronization synchronization) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void start() throws Exception {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void stop() throws Exception {
            //To change body of implemented methods use File | Settings | File Templates.
        }
    };
    ConsumerTemplate consumerTemplate=new ConsumerTemplate() {
        @Override
        public CamelContext getCamelContext() {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public int getMaximumCacheSize() {
            return 0;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void setMaximumCacheSize(int i) {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public int getCurrentCacheSize() {
            return 0;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Exchange receive(String s) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Exchange receive(Endpoint endpoint) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Exchange receive(String s, long l) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Exchange receive(Endpoint endpoint, long l) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Exchange receiveNoWait(String s) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Exchange receiveNoWait(Endpoint endpoint) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Object receiveBody(String s) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Object receiveBody(Endpoint endpoint) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Object receiveBody(String s, long l) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Object receiveBody(Endpoint endpoint, long l) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Object receiveBodyNoWait(String s) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Object receiveBodyNoWait(Endpoint endpoint) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public <T> T receiveBody(String s, Class<T> tClass) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public <T> T receiveBody(Endpoint endpoint, Class<T> tClass) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public <T> T receiveBody(String s, long l, Class<T> tClass) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public <T> T receiveBody(Endpoint endpoint, long l, Class<T> tClass) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public <T> T receiveBodyNoWait(String s, Class<T> tClass) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public <T> T receiveBodyNoWait(Endpoint endpoint, Class<T> tClass) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void doneUoW(Exchange exchange) {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void start() throws Exception {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void stop() throws Exception {
            //To change body of implemented methods use File | Settings | File Templates.
        }
    };
    @EndpointInject(uri = "mock:result")
    private Endpoint result;



    @EndpointInject(uri = "direct:start")
    private Endpoint start;

    @Test
    public void itSendsMessage() throws Exception {
        Exchange exchange = start.createExchange(ExchangePattern.InOut);
        exchange.getIn().setBody("this is the message");
        template.send(start, exchange);
        assertMockEndpointsSatisfied();
        Exchange resultExchange=consumerTemplate.receive(result);
//        resultExchange = result..getExchanges().get(0);
        System.out.println(resultExchange);
        Thread.sleep(3);
        System.out.println(resultExchange);
//        assertEquals("this is the message",resultExchange.getIn().getBody());
    }

    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("direct:start")
                        .to("smpp://hugo@localhost:11000?password=ggoohu&systemType=producer");

                from("smpp://hugo@localhost:11000?password=ggoohu&systemType=consumer")
                        .to("mock:result");
            }
        };
    }
}
