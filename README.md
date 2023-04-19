# legalaid
法律援助小程序
法律援助小程序技术架构
技术架构图
![image](https://user-images.githubusercontent.com/104672201/233026627-95268582-c47f-450b-b9d1-a585adb8e579.png)

技术栈
开发环境
Jdk: >= 1.8
Mysql: >= 5.7
Maven: >= 3.0
Node:14
Redis:3
测试环境
Junit单元测试
Postman接口测试
部署环境
Docker部署
Linux部署
Jenkins部署
主框架
Spring Boot 3.2.x
Spring Framework 5.2.x
Apache Shiro 1.7
持久层
Mybatis-plus 3.5.x
Alibaba Druid 1.2.x
视图层
Vue 2.6.x
Axios 0.21.x
ElementUI 2.15.x
Color-ui 2.1.x
法律援助小程序1.0版本
需求功能列表
系统名称	功能	一级菜单	二级菜单	功能详情
法律小程序	移动端	首页	轮播图	轮播广告图
			搜索	全局关键字搜索ES
			业务范围	宫格菜单，点击跳转到对应的宣传页
			关于我们	关于我们的介绍，点击不跳转
			经典案例	一个经典案例，点击跳转到经典案例详情页、击经典案例跳转到资讯经典案例
			我们的团队	点击左右滑动个人跳转到个人详情页、查看全部点击跳转到团队
			服务单位	服务单位左右滑动
			法律法规	点击跳转到资讯法律法规，首页只显示5条法律法规
		团队	轮播图	轮播团队宣传图
			搜索	全局关键字搜索ES
			律师团队	头像、名称、律所、标签、咨询价格、立即咨询
			律师详情	头像、名称、律所、标签、评分、是否在线
				律师简介
		资讯	菜单	部资讯菜单栏控制
			业内资讯	资讯内容详情页
			法律速递	　
			企业新闻	　
			视频专区	　
		我的	关于我们	联系地址、地图
		客服	电话	点击悬浮电话按钮弹出是否拨打电话
			微信直聊	点击微信悬浮按钮，弹出对话框在线咨询客服
技术栈
Hutool
PageHelper
阿里云对象存储OSS(Object Storage Service)
