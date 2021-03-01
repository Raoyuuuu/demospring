
layui.use(['layer', 'form'], function() {
        var $ = layui.$,
        layer = layui.layer,
        form = layui.form

    form.on('submit(submit)', function(data){
        console.log(data.field) //当前容器的全部表单字段，名值对形式：{name: value}
        $.ajax({
            url:  'http://localhost:8081/login/checkLogin',
            type: "post",
            data:data.field,
            success : function(data) {
                window.location.href ="http://localhost:8081/page/hello.html" ;
            },
        })

        // return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
    });

    // form.render();
})