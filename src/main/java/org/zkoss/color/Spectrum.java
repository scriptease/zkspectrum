package org.zkoss.color;

import java.io.IOException;

import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.sys.ComponentCtrl;
import org.zkoss.zk.ui.sys.ContentRenderer;
import org.zkoss.zul.Textbox;

/**
 * @author Sean Connolly
 */
public class Spectrum extends Textbox {

	static {
		addClientEvent(Spectrum.class, Events.ON_CHANGE, ComponentCtrl.CE_IMPORTANT);
	}

	private String preferredFormat = null;
	private Boolean flat = false;
	private Boolean showInput = false;
	private Boolean showInitial = false;
	private Boolean allowEmpty = false;
	private Boolean showAlpha = false;
	private Boolean disabled = false;
	private String localStorageKey = null;
	private Boolean showPalette = false;
	private Boolean showPaletteOnly = false;
	private Boolean togglePaletteOnly = false;
	private Boolean showSelectionPalette = false;
	private Boolean clickoutFiresChange = false;
	private String cancelText = null;
	private String chooseText = null;
	private String togglePaletteMoreText = null;
	private String togglePaletteLessText = null;
	private String containerClassName = null;
	private String replacerClassName = null;

	public String getPreferredFormat() {
		return preferredFormat;
	}

	public void setPreferredFormat(String preferredFormat) {
		if(this.preferredFormat == null || preferredFormat == null || !this.preferredFormat.equals(preferredFormat)) {
			this.preferredFormat = preferredFormat;
			smartUpdate("_preferredFormat", preferredFormat);
		}
	}

	public Boolean getFlat() {
		return flat;
	}

	public void setFlat(Boolean flat) {
		if(this.flat == null || flat == null || !this.flat.equals(flat)) {
			this.flat = flat;
			smartUpdate("_flat", flat);
		}
	}

	public Boolean getShowInput() {
		return showInput;
	}

	public void setShowInput(Boolean showInput) {
		if(this.showInput == null || showInput == null || !this.showInput.equals(showInput)) {
			this.showInput = showInput;
			smartUpdate("_showInput", showInput);
		}
	}

	public Boolean getShowInitial() {
		return showInitial;
	}

	public void setShowInitial(Boolean showInitial) {
		if(this.showInitial == null || showInitial == null || !this.showInitial.equals(showInitial)) {
			this.showInitial = showInitial;
			smartUpdate("_showInitial", showInitial);
		}
	}

	public Boolean getAllowEmpty() {
		return allowEmpty;
	}

	public void setAllowEmpty(Boolean allowEmpty) {
		if(this.allowEmpty == null || allowEmpty == null || !this.allowEmpty.equals(allowEmpty)) {
			this.allowEmpty = allowEmpty;
			smartUpdate("_allowEmpty", allowEmpty);
		}
	}

	public Boolean getShowAlpha() {
		return showAlpha;
	}

	public void setShowAlpha(Boolean showAlpha) {
		if(this.showAlpha == null || showAlpha == null || !this.showAlpha.equals(showAlpha)) {
			this.showAlpha = showAlpha;
			smartUpdate("_showAlpha", showAlpha);
		}
	}

	public Boolean getDisabled() {
		return disabled;
	}

	public void setDisabled(Boolean disabled) {
		// TODO merge with Textbox.setDisabled
		if(this.disabled == null || disabled == null || !this.disabled.equals(disabled)) {
			this.disabled = disabled;
			smartUpdate("_disabled", disabled);
		}
	}

	public String getLocalStorageKey() {
		return localStorageKey;
	}

	public void setLocalStorageKey(String localStorageKey) {
		if(this.localStorageKey == null || localStorageKey == null || !this.localStorageKey.equals(localStorageKey)) {
			this.localStorageKey = localStorageKey;
			smartUpdate("_localStorageKey", localStorageKey);
		}
	}

	public Boolean getShowPalette() {
		return showPalette;
	}

	public void setShowPalette(Boolean showPalette) {
		if(this.showPalette == null || showPalette == null || !this.showPalette.equals(showPalette)) {
			this.showPalette = showPalette;
			smartUpdate("_showPalette", showPalette);
		}
	}

	public Boolean getShowPaletteOnly() {
		return showPaletteOnly;
	}

	public void setShowPaletteOnly(Boolean showPaletteOnly) {
		if(this.showPaletteOnly == null || showPaletteOnly == null || !this.showPaletteOnly.equals(showPaletteOnly)) {
			this.showPaletteOnly = showPaletteOnly;
			smartUpdate("_showPaletteOnly", showPaletteOnly);
		}
	}

	public Boolean getTogglePaletteOnly() {
		return togglePaletteOnly;
	}

	public void setTogglePaletteOnly(Boolean togglePaletteOnly) {
		if(this.togglePaletteOnly == null || togglePaletteOnly == null
				|| !this.togglePaletteOnly.equals(togglePaletteOnly)) {
			this.togglePaletteOnly = togglePaletteOnly;
			smartUpdate("_togglePaletteOnly", togglePaletteOnly);
		}
	}

	public Boolean getShowSelectionPalette() {
		return showSelectionPalette;
	}

	public void setShowSelectionPalette(Boolean showSelectionPalette) {
		if(this.showSelectionPalette == null || showSelectionPalette == null
				|| !this.showSelectionPalette.equals(showSelectionPalette)) {
			this.showSelectionPalette = showSelectionPalette;
			smartUpdate("_showSelectionPalette", showSelectionPalette);
		}
	}

	public Boolean getClickoutFiresChange() {
		return clickoutFiresChange;
	}

	public void setClickoutFiresChange(Boolean clickoutFiresChange) {
		if(this.clickoutFiresChange == null || clickoutFiresChange == null
				|| !this.clickoutFiresChange.equals(clickoutFiresChange)) {
			this.clickoutFiresChange = clickoutFiresChange;
			smartUpdate("_clickoutFiresChange", clickoutFiresChange);
		}
	}

	public String getCancelText() {
		return cancelText;
	}

	public void setCancelText(String cancelText) {
		if(this.cancelText == null || cancelText == null || !this.cancelText.equals(cancelText)) {
			this.cancelText = cancelText;
			smartUpdate("_cancelText", cancelText);
		}
	}

	public String getChooseText() {
		return chooseText;
	}

	public void setChooseText(String chooseText) {
		if(this.chooseText == null || chooseText == null || !this.chooseText.equals(chooseText)) {
			this.chooseText = chooseText;
			smartUpdate("_chooseText", chooseText);
		}
	}

	public String getTogglePaletteMoreText() {
		return togglePaletteMoreText;
	}

	public void setTogglePaletteMoreText(String togglePaletteMoreText) {
		if(this.togglePaletteMoreText == null || togglePaletteMoreText == null
				|| !this.togglePaletteMoreText.equals(togglePaletteMoreText)) {
			this.togglePaletteMoreText = togglePaletteMoreText;
			smartUpdate("_togglePaletteMoreText", togglePaletteMoreText);
		}
	}

	public String getTogglePaletteLessText() {
		return togglePaletteLessText;
	}

	public void setTogglePaletteLessText(String togglePaletteLessText) {
		if(this.togglePaletteLessText == null || togglePaletteLessText == null
				|| !this.togglePaletteLessText.equals(togglePaletteLessText)) {
			this.togglePaletteLessText = togglePaletteLessText;
			smartUpdate("_togglePaletteLessText", togglePaletteLessText);
		}
	}

	public String getContainerClassName() {
		return containerClassName;
	}

	public void setContainerClassName(String containerClassName) {
		if(this.containerClassName == null || containerClassName == null
				|| !this.containerClassName.equals(containerClassName)) {
			this.containerClassName = containerClassName;
			smartUpdate("_containerClassName", containerClassName);
		}
	}

	public String getReplacerClassName() {
		return replacerClassName;
	}

	public void setReplacerClassName(String replacerClassName) {
		if(this.replacerClassName == null || replacerClassName == null
				|| !this.replacerClassName.equals(replacerClassName)) {
			this.replacerClassName = replacerClassName;
			smartUpdate("_replacerClassName", replacerClassName);
		}
	}

	@Override
	protected void renderProperties(ContentRenderer renderer) throws IOException {
		super.renderProperties(renderer);
		render(renderer, "_preferredFormat", preferredFormat);
		render(renderer, "_flat", flat);
		render(renderer, "_showInput", showInput);
		render(renderer, "_showInitial", showInitial);
		render(renderer, "_allowEmpty", allowEmpty);
		render(renderer, "_showAlpha", showAlpha);
		render(renderer, "_disabled", disabled);
		render(renderer, "_localStorageKey", localStorageKey);
		render(renderer, "_showPalette", showPalette);
		render(renderer, "_showPaletteOnly", showPaletteOnly);
		render(renderer, "_togglePaletteOnly", togglePaletteOnly);
		render(renderer, "_showSelectionPalette", showSelectionPalette);
		render(renderer, "_clickoutFiresChange", clickoutFiresChange);
		render(renderer, "_cancelText", cancelText);
		render(renderer, "_chooseText", chooseText);
		render(renderer, "_togglePaletteMoreText", togglePaletteMoreText);
		render(renderer, "_togglePaletteLessText", togglePaletteLessText);
		render(renderer, "_containerClassName", containerClassName);
		render(renderer, "_replacerClassName", replacerClassName);
	}

}
