zul.spectrum.Spectrum = zk.$extends(zul.inp.Textbox, {
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
                console.log('got: '+color.toHexString());
                //widget.setValue(color.toHexString(), false);
                widget.updateChange_();
            }
        };
        console.log(config);
        this.setSpectrum($('#' + this.uuid).spectrum(config));
    }
});