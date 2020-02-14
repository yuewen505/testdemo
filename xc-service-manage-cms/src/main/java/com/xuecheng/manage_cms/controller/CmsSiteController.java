package com.xuecheng.manage_cms.controller;

import com.xuecheng.api.cms.CmsSiteControllerApi;
import com.xuecheng.framework.domain.cms.CmsSite;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.manage_cms.service.PageSiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cms/site")
public class CmsSiteController implements CmsSiteControllerApi {
    @Autowired
    PageSiteService pageSiteService;
    @GetMapping("/sitelist")
    @Override
    public QueryResponseResult findSiteList(CmsSite cmsSite) {
        return pageSiteService.findSiteList();
    }

}
