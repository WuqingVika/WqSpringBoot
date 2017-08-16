详情见《屎香香的学习笔记》 :blush:
# TestWechat
SpringBoot框架学习之路:smirk:  

## 第一章 常用模板 :blush:
 - 1.Thymeleaf模板引擎渲染web视图
     - 引入依赖，至[pom.xml](https://github.com/WuqingVika/WqSpringBoot/blob/master/pom.xml)中。
     - 增加templates目录，添加[index.html](https://github.com/WuqingVika/WqSpringBoot/blob/master/src/main/resources/templates/index.html)
     - 在Controller目录下，编写[ThymeleafController](https://github.com/WuqingVika/WqSpringBoot/blob/master/src/main/java/com/wuqingvika/controller/ThymeleafController.java)
     - 配置thymeleaf模板解析器属性，至[application.yml](https://github.com/WuqingVika/WqSpringBoot/blob/master/src/main/resources/application.yml)
 - 2.Freemarker模板引擎渲染web视图
      - 引入依赖，至[pom.xml](https://github.com/WuqingVika/WqSpringBoot/blob/master/pom.xml)中。
      - 增加templates目录，添加[freemarker.html](https://github.com/WuqingVika/WqSpringBoot/blob/master/src/main/resources/templates/freemarker.html)
      - 在Controller目录下，添加[freemarker()](https://github.com/WuqingVika/WqSpringBoot/blob/master/src/main/java/com/wuqingvika/controller/ThymeleafController.java)方法
      - 配置freemarker模板解析器属性，至[application.yml](https://github.com/WuqingVika/WqSpringBoot/blob/master/src/main/resources/application.yml)见注释(注：将原来的thymeleaf相关配置注释掉:blush:)
