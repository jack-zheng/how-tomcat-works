# how tomcat works

读书笔记，代码部分

## ex01

现在的浏览器对头信息的要求比较严格，实验中直接用 Chrome 访问页面显示不了。用命令行的 curl 测试凑合着看吧

多次测试，只有 tomcat-catalina 4.x 的以来才是正确的，5.x 目录已经变了

## ex04

Bootstrap 中少写了 `System.in.read();` 导致服务器启动就退出，还以为版本有问题，各种 git 上找项目，google 上找异常，花了半天的时间才把问题找到 （；￣ェ￣）

启动之后，在 idea 的 console 中打字真会退出服务诶，666。我肯定想不到这中处理方式，长见识了

tomcat-catalina 旧版的还有一个 sources 的 maven 依赖，虽然有点区别，可以将就着关联一下 jar 查看用用

这个练习中已经开始使用 Catalina 自带的 response 实现了，它的 header 部分已经相当完善了，所以可以直接在 Chrome 中进行访问测试

```http
http://localhost:8080/servlet/ModernServlet?userName=tarzan&password=pwd
http://localhost:8080/servlet/PrimitiveServlet
```
