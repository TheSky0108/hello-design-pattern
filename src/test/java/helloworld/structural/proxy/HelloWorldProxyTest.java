package helloworld.structural.proxy;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldProxyTest {

    @Test
    public void testHelloWorldFacade(){
        HelloWorldProxy helloWorldProxy = new HelloWorldProxy(new HelloWorldProxy.DefaultHelloWorld());
        assertThat(helloWorldProxy.helloWorld(),is("Hello Proxy!"));
    }
}
