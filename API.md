---
title GAME
---

# 1.获取系统时间

### 请求方式：GET（HTTPS）
### 请求地址：http://proschan.top:33727/game-bin/util/gainTime
### 请求包体：
### 返回结果：
	{
		"date":"2018年03月07日 16时03分38秒",
		"error":"success"
	}

# 2.获取hello

### 请求方式：GET（HTTPS）
### 请求地址：http://proschan.top:33727/blog/gainHello
### 请求包体：
	{
		"name":"proschan"
	}

参数说明：
1. name (非必须)	姓名

### 返回结果：
	{
		"date":"2018年03月07日 16时05分27秒",
		"error":"success","content":"proschan,HELLO WORD!"
	}

# 3.注册账号

### 请求方式：POST（HTTPS）
### 请求地址：http://proschan.top:33727/blog/register
### 请求包体：
	{
		“device_id”:”3d5c68q”
	}

参数说明：
1. name (必须) 设备序列号

### 返回结果：
	{
		“code”:200(这个是状态码)
		“success”:true 用户有没有注册成功
		“msg”:“注册成功”
		“data”:””用户的存档，没有的话传空字符串
	}




 * Author:proschan
 * Date:2018/3/8




---------------------我是分割线，未开发-------------------------
—上传结果
  -POST
	…/update_result
  -包体
	{
	“device_id”:”xxooxxo”
	“data”:”A0110010B0110001C1010110”(可能需要你用正则表达式)
	}
  -返回结果
	{
	“code”:200
	“success”:true
	“msg”:””正确或者错误的信息，返回给我让我知道下
	}