package com.intercepter;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author level
 * @create 2019/5/26 - 12:44
 */
public class Interceptor1 implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        System.out.println("方法前");
        String requestURI = request.getRequestURI();
        if (!requestURI.contains("/login/loginUser")){
            String users2 = (String) request.getSession().getAttribute("users2");
            if (null==users2){
                response.sendRedirect(request.getContextPath()+"/login/loginUser");
                return  false;
            }
        };
        return true;
    }


    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                            @Nullable ModelAndView modelAndView) throws Exception {

    }


    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
                                 @Nullable Exception ex) throws Exception {
        System.out.println("方法后");
    }

}
