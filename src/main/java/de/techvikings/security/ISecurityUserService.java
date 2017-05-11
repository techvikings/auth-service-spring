package de.techvikings.security;

public interface ISecurityUserService {

	String validatePasswordResetToken(long id, String token);

}
