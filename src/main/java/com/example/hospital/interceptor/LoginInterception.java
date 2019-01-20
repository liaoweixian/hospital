package com.example.hospital.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.example.hospital.pojo.HospitalUserT;

public class LoginInterception implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    	System.out.println("拦截器启动");
    	String servletPath = request.getServletPath();
    	/*System.out.println(servletPath);
    	String contextPath = request.getContextPath();
    	System.out.println(contextPath);
    	String requestURI = request.getRequestURI();
    	System.out.println(requestURI);*/
    	
    	if(!(servletPath.startsWith("/user/") || !(servletPath.equals("/view/index")))) {//如果不是
    		HttpSession session = request.getSession();
    		HospitalUserT user = (HospitalUserT) session.getAttribute("user");
    		//数据库判断该用户是否存在，并且密码是否正确
    		if(user == null) {//如果没有登录
    			System.out.println("你没有登录"+user);
    			response.sendRedirect(request.getContextPath()+"/");
    			return false;
    		}else {
    			return true;
    		}
    	}else {
    		return true;
    	}
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
