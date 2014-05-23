package com.pdager.tianyi.user.account;

import java.nio.charset.Charset;

import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.filter.CharacterEncodingFilter;

@Configuration
public class WebConfiguration {
	@Bean
	public HttpMessageConverters customConverters() {
		// 字符串编码转换
		HttpMessageConverter<String> StringMessageConverter = new StringHttpMessageConverter(
				Charset.forName("UTF-8"));
		return new HttpMessageConverters(StringMessageConverter);
	}

	@Bean
	public FilterRegistrationBean filterRegistrationBean() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
		// 请求编码过滤
		CharacterEncodingFilter filter = new CharacterEncodingFilter();
		filter.setEncoding("UTF-8");
		filterRegistrationBean.setFilter(filter);
		filterRegistrationBean.setOrder(1);
		return filterRegistrationBean;
	}
}
