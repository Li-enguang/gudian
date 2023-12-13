package com.lieng.reiji.filter;

import com.alibaba.fastjson.JSON;
import com.lieng.reiji.common.R;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.init.ScriptUtils;
import org.springframework.util.AntPathMatcher;

@WebFilter(filterName = "loginCheckFilter", urlPatterns = {ScriptUtils.DEFAULT_BLOCK_COMMENT_START_DELIMITER})
/* loaded from: reiji-1.0-SNAPSHOT.jar:BOOT-INF/classes/com/lieng/reiji/filter/LoginCheckFilter.class */
public class LoginCheckFilter implements Filter {
    private static final Logger log = LoggerFactory.getLogger(LoginCheckFilter.class);
    public static final AntPathMatcher PATH_MATCHER = new AntPathMatcher();

    @Override // javax.servlet.Filter
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String requestURI = request.getRequestURI();
        if (!requestURI.contains(".")) {
            log.info("拦截到请求：{}", requestURI);
        }
        String[] urls = {"/employee/login", "/employee/logout", "/backend/**", "/front/**"};
        boolean check = check(urls, requestURI);
        if (check) {
            filterChain.doFilter(request, response);
        } else if (request.getSession().getAttribute("employee") != null) {
            filterChain.doFilter(request, response);
        } else {
            log.info("用户未登录");
            response.getWriter().write(JSON.toJSONString(R.error("NOTLOGIN")));
        }
    }

    public boolean check(String[] urls, String requestURI) {
        for (String url : urls) {
            boolean match = PATH_MATCHER.match(url, requestURI);
            if (match) {
                return true;
            }
        }
        return false;
    }
}