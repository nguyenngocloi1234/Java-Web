package com.codegym;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    //cau hinh lop AppConfiguration
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{AppConfiguration.class};
    }
    //khong cau hinh
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }
    // cau hinh mapping url voi servlet
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}