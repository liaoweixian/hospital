package com.example.hospital.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
<<<<<<< HEAD

public class LoginInterception implements HandlerInterceptor {
   /* @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String name = request.getParameter("name");
        System.out.println("----111111-----");
        if(name == null){
            response.sendRedirect("/index");
            return true;
        }else {
            return true;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }*/
=======
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterception implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        /*String name = request.getParameter("name");
        System.out.println("----111111-----");
        if(name == null){
            response.sendRedirect("/index");
            return true;
        }else {
            return true;
        }*/
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
>>>>>>> branch 'master' of https://github.com/liaoweixian/hospital.git
}
