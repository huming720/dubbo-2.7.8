package com.hm.dubbo.spi;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Protocol;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * 一句话注释
 *
 * @author Hm
 * @date 2020/12/21
 */
@ContextConfiguration
public class DubboSpiTest extends AbstractJUnit4SpringContextTests
{

    @Test
    public void testAdaptive(){
        Protocol protocol = ExtensionLoader.getExtensionLoader(Protocol.class).getAdaptiveExtension();
        System.out.println(protocol);
    }

}
