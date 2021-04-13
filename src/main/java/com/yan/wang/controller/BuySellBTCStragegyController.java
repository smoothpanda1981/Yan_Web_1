package com.yan.wang.controller;

import com.yan.wang.model.BuySellBtcUsd;
import com.yan.wang.service.FinDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/strategy")
public class BuySellBTCStragegyController {

    @Autowired
    private FinDataService finDataService;

    @GetMapping("/list")
    public String listStrategy(Model model) {
        List<BuySellBtcUsd> buySellBtcUsdList = finDataService.getListBuySellBtcUsd();
        model.addAttribute("buySellBtcUsdList", buySellBtcUsdList);
        return "list_strategy";
    }

    public FinDataService getFinDataService() {
        return finDataService;
    }

    public void setFinDataService(FinDataService finDataService) {
        this.finDataService = finDataService;
    }
}