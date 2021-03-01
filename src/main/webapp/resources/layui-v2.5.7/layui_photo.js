/* layui 照片层 缩放 js*/
$(document).on("mousewheel DOMMouseScroll", ".layui-layer-phimg img", function (e) {
    var delta = (e.originalEvent.wheelDelta && (e.originalEvent.wheelDelta > 0 ? 1 : -1)) || // chrome & ie
        (e.originalEvent.detail && (e.originalEvent.detail > 0 ? -1 : 1)); // firefox
    var imagep = $(".layui-layer-phimg").parent().parent();
    var image = $(".layui-layer-phimg").parent();
    var h = image.height();
    var w = image.width();
    if (delta > 0) {
        h = h * 1.05;
        w = w * 1.05;
    } else if (delta < 0) {
        if (h > 100) {
            h = h * 0.95;
            w = w * 0.95;
        }
    }
    imagep.css("top", (window.innerHeight - h) / 2);
    imagep.css("left", (window.innerWidth - w) / 2);
    image.height(h);
    image.width(w);
    imagep.height(h);
    imagep.width(w);
});