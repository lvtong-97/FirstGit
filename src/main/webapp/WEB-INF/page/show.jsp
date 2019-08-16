<%--
  Created by IntelliJ IDEA.
  User: tonglv
  Date: 2019-08-13
  Time: 11:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
@RequestMapping("/index1")
public ModelAndView index() {
ModelAndView mv = new ModelAndView("show");
return mv;
}
这种形式返回jsp页面可以使用@RestController

</body>
</html>
