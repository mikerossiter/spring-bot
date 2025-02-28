package org.finos.springbot.workflow.response.handlers;

import java.util.function.Consumer;

import org.finos.springbot.workflow.response.Response;
import org.springframework.core.PriorityOrdered;

public interface ResponseHandler extends Consumer<Response>, PriorityOrdered {

	public final int MEDIUM_PRIORITY = 100;
	public final int LOW_PRIORITY = 1000;
	
}
