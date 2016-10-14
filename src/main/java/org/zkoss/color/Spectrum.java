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

	private String preferredFormat = "hex";

	public String getPreferredFormat() {
		return preferredFormat;
	}

	public void setPreferredFormat(String preferredFormat) {
		if(this.preferredFormat == null || preferredFormat == null || !this.preferredFormat.equals(preferredFormat)) {
			this.preferredFormat = preferredFormat;
			smartUpdate("_preferredFormat", preferredFormat);
		}
	}

	@Override
	protected void renderProperties(ContentRenderer renderer) throws IOException {
		super.renderProperties(renderer);
		render(renderer, "_preferredFormat", preferredFormat);
	}

}
