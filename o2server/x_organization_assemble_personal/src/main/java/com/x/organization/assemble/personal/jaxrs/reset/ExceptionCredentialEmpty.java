package com.x.organization.assemble.personal.jaxrs.reset;

import com.x.base.core.project.exception.PromptException;

public class ExceptionCredentialEmpty extends PromptException {

	private static final long serialVersionUID = 1859164370743532895L;

	public ExceptionCredentialEmpty() {
		super("用户标识不能为空.");
	}
}
