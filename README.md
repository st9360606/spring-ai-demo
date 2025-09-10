<p align="center">
	<img alt="logo" src="https://oscimg.oschina.net/oscnet/up-b99b286755aef70355a7084753f89cdb7c9.png">
</p>
<h1 align="center" style="margin: 30px 0 30px; font-weight: bold;">RuoYi v3.6.3</h1>
<h4 align="center">基於 Vue/Element UI 和 Spring Boot/Spring Cloud & Alibaba 前後端分離的分散式微服務架構</h4>
<p align="center">
	<a href="https://gitee.com/y_project/RuoYi-Cloud/stargazers"><img src="https://gitee.com/y_project/RuoYi-Cloud/badge/star.svg?theme=dark"></a>
	<a href="https://gitee.com/y_project/RuoYi-Cloud"><img src="https://img.shields.io/badge/RuoYi-v3.6.3-brightgreen.svg"></a>
	<a href="https://gitee.com/y_project/RuoYi-Cloud/blob/master/LICENSE"><img src="https://img.shields.io/github/license/mashape/apistatus.svg"></a>
</p>

## 平台簡介

若依是一套全部開源的快速開發平台，毫無保留給個人及企業免費使用。

* 採用前後端分離的模式，微服務版本前端(基於 [RuoYi-Vue](https://gitee.com/y_project/RuoYi-Vue))。
* 後端採用 Spring Boot、Spring Cloud & Alibaba。
* 註冊中心、配置中心選型 Nacos，權限認證使用 Redis。
* 流量控制框架選型 Sentinel，分散式事務選型 Seata。
* 提供了技術棧（[Vue3](https://v3.cn.vuejs.org) [Element Plus](https://element-plus.org/zh-CN) [Vite](https://cn.vitejs.dev)）版本 [RuoYi-Cloud-Vue3](https://github.com/yangzongzhuan/RuoYi-Cloud-Vue3)，保持同步更新。
* 如需不分離應用，請移步 [RuoYi](https://gitee.com/y_project/RuoYi)，如需分離應用，請移步 [RuoYi-Vue](https://gitee.com/y_project/RuoYi-Vue)
* 阿里雲折扣場：[點我進入](http://aly.share.vip)，騰訊雲秒殺場：[點我進入](http://txy.share.vip)&nbsp;&nbsp;
* 阿里雲優惠券：[點我領取](https://www.aliyun.com/minisite/goods?userCode=brki8iof&share_source=copy_link)，騰訊雲優惠券：[點我領取](https://cloud.tencent.com/redirect.php?redirect=1025&cps_key=198c8df2ed259157187173bc7f4f32fd&from=console)&nbsp;&nbsp;

#### 友情連結 [若依/RuoYi-Cloud](https://gitee.com/zhangmrit/share-cloud) Ant Design 版本。

## 系統模組

~~~
com.share     
├── share-ui              // 前端框架 [80]
├── share-gateway         // 網關模組 [8080]
├── share-auth            // 認證中心 [9200]
├── share-api             // 介面模組
│       └── share-api-system                          // 系統介面
├── share-common          // 通用模組
│       └── share-common-core                         // 核心模組
│       └── share-common-datascope                    // 權限範圍
│       └── share-common-datasource                   // 多資料來源
│       └── share-common-log                          // 日誌記錄
│       └── share-common-redis                        // 快取服務
│       └── share-common-seata                        // 分散式事務
│       └── share-common-security                     // 安全模組
│       └── share-common-swagger                      // 系統介面
├── share-modules         // 業務模組
│       └── share-system                              // 系統模組 [9201]
│       └── share-gen                                 // 程式碼生成 [9202]
│       └── share-job                                 // 排程任務 [9203]
│       └── share-file                                // 檔案服務 [9300]
├── share-visual          // 圖形化管理模組
│       └── share-visual-monitor                      // 監控中心 [9100]
├──pom.xml                // 公共依賴
~~~

## 架構圖

<img src="https://oscimg.oschina.net/oscnet/up-82e9722ecb846786405a904bafcf19f73f3.png"/>

## 內建功能

1.  使用者管理：使用者是系統操作人員，該功能主要完成系統使用者配置。
2.  部門管理：配置系統組織架構（公司、部門、小組），樹狀結構展現支援資料權限。
3.  職位管理：配置系統使用者所屬擔任職務。
4.  選單管理：配置系統選單，操作權限，按鈕權限標識等。
5.  角色管理：角色選單權限分配、設定角色按機構進行資料範圍權限劃分。
6.  字典管理：對系統中經常使用的一些較為固定的資料進行維護。
7.  參數管理：對系統動態配置常用參數。
8.  通知公告：系統通知公告資訊發布維護。
9.  操作日誌：系統正常操作日誌記錄和查詢；系統異常資訊日誌記錄和查詢。
10. 登入日誌：系統登入日誌記錄查詢包含登入異常。
11. 線上使用者：當前系統中活躍使用者狀態監控。
12. 排程任務：線上（新增、修改、刪除) 任務排程包含執行結果日誌。
13. 程式碼生成：前後端程式碼的生成（java、html、xml、sql）支援 CRUD 下載。
14. 系統介面：根據業務程式碼自動生成相關的 API 介面文件。
15. 系統監控：監視當前系統 CPU、記憶體、磁碟、堆疊等相關資訊。
16. 線上建構器：拖曳表單元素生成相應的 HTML 程式碼。
17. 連線池監控：監視當前系統資料庫連線池狀態，可進行分析 SQL 找出系統效能瓶頸。


## 示範圖

<table>
    <tr>
        <td><img src="https://oscimg.oschina.net/oscnet/cd1f90be5f2684f4560c9519c0f2a232ee8.jpg"/></td>
        <td><img src="https://oscimg.oschina.net/oscnet/1cbcf0e6f257c7d3a063c0e3f2ff989e4b3.jpg"/></td>
    </tr>
    <tr>
        <td><img src="https://oscimg.oschina.net/oscnet/up-8074972883b5ba0622e13246738ebba237a.png"/></td>
        <td><img src="https://oscimg.oschina.net/oscnet/up-9f88719cdfca9af2e58b352a20e23d43b12.png"/></td>
    </tr>
    <tr>
        <td><img src="https://oscimg.oschina.net/oscnet/up-39bf2584ec3a529b0d5a3b70d15c9b37646.png"/></td>
        <td><img src="https://oscimg.oschina.net/oscnet/up-4148b24f58660a9dc347761e4cf6162f28f.png"/></td>
    </tr>
	<tr>
        <td><img src="https://oscimg.oschina.net/oscnet/up-b2d62ceb95d2dd9b3fbe157bb70d26001e9.png"/></td>
        <td><img src="https://oscimg.oschina.net/oscnet/up-d67451d308b7a79ad6819723396f7c3d77a.png"/></td>
    </tr>	 
    <tr>
        <td><img src="https://oscimg.oschina.net/oscnet/5e8c387724954459291aafd5eb52b456f53.jpg"/></td>
        <td><img src="https://oscimg.oschina.net/oscnet/644e78da53c2e92a95dfda4f76e6d117c4b.jpg"/></td>
    </tr>
	<tr>
        <td><img src="https://oscimg.oschina.net/oscnet/up-8370a0d02977eebf6dbf854c8450293c937.png"/></td>
        <td><img src="https://oscimg.oschina.net/oscnet/up-49003ed83f60f633e7153609a53a2b644f7.png"/></td>
    </tr>
	<tr>
        <td><img src="https://oscimg.oschina.net/oscnet/up-d4fe726319ece268d4746602c39cffc0621.png"/></td>
        <td><img src="https://oscimg.oschina.net/oscnet/up-c195234bbcd30be6927f037a6755e6ab69c.png"/></td>
    </tr>
	<tr>
        <td><img src="https://oscimg.oschina.net/oscnet/up-ece3fd37a3d4bb75a3926e905a3c5629055.png"/></td>
        <td><img src="https://oscimg.oschina.net/oscnet/up-92ffb7f3835855cff100fa0f754a6be0d99.png"/></td>
    </tr>
    <tr>
        <td><img src="https://oscimg.oschina.net/oscnet/up-ff9e3066561574aca73005c5730c6a41f15.png"/></td>
    </tr>
</table>
