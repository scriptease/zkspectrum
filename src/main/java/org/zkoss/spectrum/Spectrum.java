package org.zkoss.spectrum;

import java.io.IOException;

import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.sys.ComponentCtrl;
import org.zkoss.zk.ui.sys.ContentRenderer;
import org.zkoss.zul.impl.XulElement;

/**
 * @author Sean Connolly
 */
public class Spectrum extends XulElement {

	static {
		addClientEvent(Spectrum.class, Events.ON_CHANGE, ComponentCtrl.CE_IMPORTANT);
	}

	private String color = "#fff";

	public void setColor(String color) {
		if(this.color == null || color == null || !this.color.equals(color)) {
			this.color = color;
			smartUpdate("_color", color);
		}
	}

	@Override
	protected void renderProperties(ContentRenderer renderer) throws IOException {
		super.renderProperties(renderer);
		render(renderer, "_color", color);
	}

}
