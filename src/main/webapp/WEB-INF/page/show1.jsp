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
@RequestMapping("/index")
public String index(Model model){
model.addAttribute("name","nihao");
return "show";
}

这种方式返回jsp页面，不能使用@RestController 要用@Controller

</body>
</html>
