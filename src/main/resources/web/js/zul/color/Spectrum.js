zul.color.Spectrum = zk.$extends(zul.inp.Textbox, {
    $define: {
        _flat: null,
        _showInput: null,
        _showInitial: null,
        _allowEmpty: null,
        _showAlpha: null,
        _disabled: null,
        _localStorageKey: null,
        _showPalette: null,
        _showPaletteOnly: null,
        _togglePaletteOnly: null,
        _showSelectionPalette: null,
        _clickoutFiresChange: null,
        _cancelText: null,
        _chooseText: null,
        _togglePaletteMoreText: null,
        _togglePaletteLessText: null,
        _containerClassName: null,
        _replacerClassName: null,
        _preferredFormat: null
    },
    bind_: function () {
        this.$supers(zul.color.Spectrum, 'bind_', arguments);
        var widget = this;
        var config = {
            flat: this.__flat,
            showInput: this.__showInput,
            showInitial: this.__showInitial,
            allowEmpty: this.__allowEmpty,
            showAlpha: this.__showAlpha,
            disabled: this.__disabled,
            localStorageKey: this.__localStorageKey,
            showPalette: this.__showPalette,
            showPaletteOnly: this.__showPaletteOnly,
            togglePaletteOnly: this.__togglePaletteOnly,
            showSelectionPalette: this.__showSelectionPalette,
            clickoutFiresChange: this.__clickoutFiresChange,
            cancelText: this.__cancelText,
            chooseText: this.__chooseText,
            togglePaletteMoreText: this.__togglePaletteMoreText,
            togglePaletteLessText: this.__togglePaletteLessText,
            containerClassName: this.__containerClassName,
            replacerClassName: this.__replacerClassName,
            preferredFormat: this.__preferredFormat,
            change: function () {
                widget.updateChange_();
            }
        };
        $('#' + this.uuid).spectrum(config);
    }
});