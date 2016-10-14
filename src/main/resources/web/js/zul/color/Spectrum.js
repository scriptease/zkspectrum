zul.color.Spectrum = zk.$extends(zul.inp.Textbox, {
    $define: {
        _preferredFormat: null
    },
    bind_: function () {
        this.$supers(zul.color.Spectrum, 'bind_', arguments);
        var widget = this;
        var config = {
            preferredFormat: this.__preferredFormat,
            change: function () {
                widget.updateChange_();
            }
        };
        $('#' + this.uuid).spectrum(config);
    }
});