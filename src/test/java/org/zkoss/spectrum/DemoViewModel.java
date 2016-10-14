package org.zkoss.spectrum;

import java.util.List;

import org.zkoss.bind.annotation.AfterCompose;
import org.zkoss.bind.annotation.ContextParam;
import org.zkoss.bind.annotation.ContextType;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.event.InputEvent;
import org.zkoss.zk.ui.select.Selectors;
import org.zkoss.zk.ui.select.annotation.Wire;

/**
 * @author Sean Connolly
 */
public class DemoViewModel {

	private static final EventListener<InputEvent> EVENT_PRINTER = new EventListener<InputEvent>() {

		@Override
		public void onEvent(InputEvent event) {
			System.out.println(event.getName() + ": " + event.getValue());
		}
	};

	@Wire("spectrum")
	private List<Spectrum> spectra;

	@AfterCompose
	public void afterCompose(@ContextParam(ContextType.VIEW) Component view) {
		Selectors.wireComponents(view, this, false);
		for(Spectrum spectrum : spectra) {
			spectrum.addEventListener(Events.ON_CHANGE, EVENT_PRINTER);
		}
	}

}
