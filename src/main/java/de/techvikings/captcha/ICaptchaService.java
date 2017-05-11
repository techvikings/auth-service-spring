package de.techvikings.captcha;

import de.techvikings.web.error.ReCaptchaInvalidException;

public interface ICaptchaService {
	void processResponse(final String response) throws ReCaptchaInvalidException;

	String getReCaptchaSite();

	String getReCaptchaSecret();
}
