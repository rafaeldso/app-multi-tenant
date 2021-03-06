package com.rafael.multitenancy.filter;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MultiTenancyInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception {
		System.out.println(">>>> MultiTenancyInterceptor: preHandle() - Inicio");
		@SuppressWarnings("unchecked")
		Map<String, Object> pathVars = (Map<String, Object>) req
				.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);

		if (pathVars.containsKey("tenantid")) {
			req.setAttribute("CURRENT_TENANT_IDENTIFIER", pathVars.get("tenantid"));
		}
		System.out.println(">>>> MultiTenancyInterceptor: preHandle() - FIM");
		return true;
	}
}
