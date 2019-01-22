package com.defang.demo.dubbo.impl;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;
import com.defang.demo.dubbo.IHelloService;

/**
 * @Description
 * @author 张国豪
 */
@Service(interfaceClass = IHelloService.class)
@Component
public class HelloServiceImpl implements IHelloService {

	public static final Logger LOGGER = LoggerFactory.getLogger(HelloServiceImpl.class);

	@Override
	public int hello() {
		LOGGER.info(
				String.format("IHelloService.hello call from %s", RpcContext.getContext().getRemoteAddressString()));

		// TODO sleep调整为 1000以上将会引发dubbo超时重试
		try {
			Thread.sleep(0 * 1000l);
		} catch (InterruptedException e) {
			LOGGER.error("error sleep", e);
		}
		return new Random().nextInt(Integer.MAX_VALUE);
	}
}
