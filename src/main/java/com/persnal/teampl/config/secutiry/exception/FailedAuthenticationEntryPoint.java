package com.persnal.teampl.config.secutiry.exception;

import com.google.gson.Gson;
import com.persnal.teampl.common.ResponseCode;
import com.persnal.teampl.common.ResponseMessage;
import com.persnal.teampl.common.global.GlobalVariable;
import com.persnal.teampl.dto.response.Response;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import java.io.IOException;

public class FailedAuthenticationEntryPoint  implements AuthenticationEntryPoint {
    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        logger.error(GlobalVariable.LOG_PATTERN.getClass().getName(), "Authentication Failed");

        response.setContentType("application/json");
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);// 인증실패

        Response authenticationFailed = new Response(ResponseCode.AUTHENTICATION_FAILED, ResponseMessage.AUTHENTICATION_FAILED);
        response.getWriter().write(new Gson().toJson(authenticationFailed));
    }
}
