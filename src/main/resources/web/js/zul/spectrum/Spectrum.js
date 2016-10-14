zul.spectrum.Spectrum = zk.$extends(zk.Widget, {
    $define: {
        spectrum: function (s) {
            var n = this.$n();
            if (n)
                s.spectrum = s;
        },
        _color: null
    },
    bind_: function () {
        this.$supers(zul.spectrum.Spectrum, 'bind_', arguments);
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
        this.setSpectrum($('#' + this.uuid).spectrum(config));
    }
});