package com.defang.demo.web;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.defang.demo.dubbo.IHelloService;
import com.defang.demo.service.MyService;

/**   
* @Description
* @author 张国豪
*/
/**
 * @Description
 * @author 张国豪
 */
@Controller
@RequestMapping
public class HomeController {
	@Reference(check = false)
	private IHelloService helloService;

	@Value("${server.port}")
	String port;

	/**
	 * 主页
	 * 
	 * @Function home
	 * @Description
	 *
	 * @param
	 * @return
	 * @throws
	 *
	 * 		@version v1.0
	 * @author 张国豪
	 * @date: 2018年9月17日 上午11:45:57
	 */
	@RequestMapping(value = "/home")
	public String home() {
		System.out.println("redirect to home page!");
		return "index";
	}

}
