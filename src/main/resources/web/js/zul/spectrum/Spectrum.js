zul.spectrum.Spectrum = zk.$extends(zul.inp.Textbox, {
    $define: {
        spectrum: function (s) {
            var n = this.$n();
            if (n)
                s.spectrum = s;
        },
        _preferredFormat: null
    },
    bind_: function () {
        this.$supers(zul.spectrum.Spectrum, 'bind_', arguments);
        var widget = this;
        var config = {
            preferredFormat: this.__preferredFormat,
            change: function (color) {
                widget.updateChange_();
            }
        };
        console.log(config);
        this.setSpectrum($('#' + this.uuid).spectrum(config));
    }
});