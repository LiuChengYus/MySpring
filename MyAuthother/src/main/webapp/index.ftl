<html>
<head><title>ViralPatel.net - FreeMarker Hello World</title>
<body>
<#--<form name="user" action="hello" method="post">
    XiaoGongZhu: <input type="text" name="name" /> <br/>
    XiaoXianNv: <input type="text" name="age" /> <br/>
    <input type="submit" value="Save" />
</form>-->
<table class="datatable">
    <tr>
        <th>name</th> <th>age</th>
    </tr>
<#list users as user>
    <tr>
        <td>${user.name}</td> <td>${user.age}</td>
    </tr>
</#list>
</table>
</body>
</html>