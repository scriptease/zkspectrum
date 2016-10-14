zul.color.ColorPicker = zk.$extends(zk.Widget, {
    $define: {
        colorPicker: function (s) {
            var n = this.$n();
            if (n)
                s.colorPicker = s;
        },
        _color: null
    },
    bind_: function () {
        this.$supers(zul.color.ColorPicker, 'bind_', arguments);
        var widget = this;
        var config = {
            color: this.__color,
            change: function (color) {
                widget.fire('onChange', {
                    color: color.toHexString()
                });
            }
        };
        console.log(config);
        this.setColorPicker($('#' + this.uuid).colorPicker(config));
    }
});