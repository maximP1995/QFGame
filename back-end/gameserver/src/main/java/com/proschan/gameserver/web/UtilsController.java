package com.proschan.gameserver.web;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

/**
 * Copyright@znt
 * Author:proschan
 * Date:2018/3/24
 * Description:
 */
@RestController
@RequestMapping(value="/game-bin/util")
public class UtilsController {

    @ApiOperation(value="获取系统时间", notes="")
    @RequestMapping(value={""}, method= RequestMethod.GET)
    public String gainSysTime(){
        LocalDate localDate = LocalDate.now();
        return localDate.toString();
    }
}
