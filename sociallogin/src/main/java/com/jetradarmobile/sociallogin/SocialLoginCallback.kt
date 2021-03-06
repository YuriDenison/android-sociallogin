package com.jetradarmobile.sociallogin

/**
 *  Callback interface. Handle login result
 */
interface SocialLoginCallback {

    /**
     * Calls when login was successful
     *
     * @param socialNetwork [SocialNetwork] implementation in which login was requested
     * @param token [SocialToken] authorization token and some user data
     */
    fun onLoginSuccess(socialNetwork: SocialNetwork, token: SocialToken)

    /**
     * Calls when some error occurred
     *
     * @param socialNetwork [SocialNetwork] implementation with which request was unsuccessful
     * @param errorMessage [String] errorMessage message
     */
    fun onLoginError(socialNetwork: SocialNetwork, errorMessage: String)
}