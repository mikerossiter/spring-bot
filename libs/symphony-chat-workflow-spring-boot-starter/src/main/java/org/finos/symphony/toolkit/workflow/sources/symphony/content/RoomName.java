package org.finos.symphony.toolkit.workflow.sources.symphony.content;

import org.finos.symphony.toolkit.workflow.annotations.Work;
import org.symphonyoss.TaxonomyElement;

@Work(index = false)
public class RoomName extends TaxonomyElement {

	public RoomName() {
		super();
	}

	public RoomName(String value) {
		super(value);
	}

	@Override
	public String getSymbolPrefix() {
		return "@";
	}

}
