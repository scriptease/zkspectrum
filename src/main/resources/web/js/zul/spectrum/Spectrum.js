zul.spectrum.Spectrum = zk.$extends(zk.Widget, {
    $define: {
        spectrum: function (s) {
            var n = this.$n();
            if (n)
                s.spectrum = s;
        }
    },
    bind_: function () {
        this.$supers(zul.spectrum.Spectrum, 'bind_', arguments);
        var config = {
            color: "#f00"
        };
        this.setSpectrum(
            $('#' + this.uuid).spectrum(config)
        );
    }
});