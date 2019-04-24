/*
 * Copyright (c) 2011 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package aiss.controller.oauth;

import com.google.api.client.http.BasicAuthentication;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.Key;
import com.google.api.client.util.Preconditions;

import java.util.Collection;

/**
 * OAuth 2.0 request for an access token using an authorization code as specified in <a
 * href="http://tools.ietf.org/html/rfc6749#section-4.1.3">Access Token Request</a>.
 *
 * <p>
 * Use {@link Credential} to access protected resources from the resource server using the
 * {@link TokenResponse} returned by {@link #execute()}. On error, it will instead throw
 * {@link TokenResponseException}.
 * </p>
 *
 * <p>
 * Sample usage:
 * </p>
 *
 * <pre>
  static void requestAccessToken() throws IOException {
    try {
      TokenResponse response =
          new AuthorizationCodeTokenRequest(new NetHttpTransport(), new JacksonFactory(),
              new GenericUrl("https://server.example.com/token"), "SplxlOBeZQQYbYS6WxSbIA")
              .setRedirectUri("https://client.example.com/rd")
              .setClientAuthentication(
                  new BasicAuthentication("s6BhdRkqt3", "7Fjfp0ZBr1KtDRbnfVdmIw")).execute();
      System.out.println("Access token: " + response.getAccessToken());
    } catch (TokenResponseException e) {
      if (e.getDetails() != null) {
        System.err.println("Error: " + e.getDetails().getError());
        if (e.getDetails().getErrorDescription() != null) {
          System.err.println(e.getDetails().getErrorDescription());
        }
        if (e.getDetails().getErrorUri() != null) {
          System.err.println(e.getDetails().getErrorUri());
        }
      } else {
        System.err.println(e.getMessage());
      }
    }
  }
 * </pre>
 *
 * <p>
 * Some OAuth 2.0 providers don't support {@link BasicAuthentication} but instead support
 * {@link ClientParametersAuthentication}. In the above sample code, simply replace the class name
 * and it will work the same way.
 * </p>
 *
 * <p>
 * Implementation is not thread-safe.
 * </p>
 *
 * @since 1.7
 * @author Yaniv Inbar
 */
public class AuthorizationCodeTokenRequestModificado extends TokenRequestModificado {

  /** Authorization code received from the authorization server. */
  @Key
  private String code;

  /**
   * Redirect URI parameter matching the redirect URI parameter in the authorization request or
   * {@code null} for none.
   */
  @Key("redirect_uri")
  private String redirectUri;

  /**
   * @param transport HTTP transport
   * @param jsonFactory JSON factory
   * @param tokenServerUrl token server URL
   * @param code authorization code generated by the authorization server
   */
  public AuthorizationCodeTokenRequestModificado(
      HttpTransport transport, JsonFactory jsonFactory, GenericUrl tokenServerUrl, String code) {
    super(transport, jsonFactory, tokenServerUrl, "authorization_code");
    setCode(code);
  }

  @Override
  public AuthorizationCodeTokenRequestModificado setRequestInitializer(
      HttpRequestInitializer requestInitializer) {
    return (AuthorizationCodeTokenRequestModificado) super.setRequestInitializer(requestInitializer);
  }

  @Override
  public AuthorizationCodeTokenRequestModificado setTokenServerUrl(GenericUrl tokenServerUrl) {
    return (AuthorizationCodeTokenRequestModificado) super.setTokenServerUrl(tokenServerUrl);
  }

  @Override
  public AuthorizationCodeTokenRequestModificado setScopes(Collection<String> scopes) {
    return (AuthorizationCodeTokenRequestModificado) super.setScopes(scopes);
  }

  @Override
  public AuthorizationCodeTokenRequestModificado setGrantType(String grantType) {
    return (AuthorizationCodeTokenRequestModificado) super.setGrantType(grantType);
  }

  @Override
  public AuthorizationCodeTokenRequestModificado setClientAuthentication(
      HttpExecuteInterceptor clientAuthentication) {
    return (AuthorizationCodeTokenRequestModificado) super.setClientAuthentication(clientAuthentication);
  }

  /** Returns the authorization code generated by the authorization server. */
  public final String getCode() {
    return code;
  }

  /**
   * Sets the authorization code generated by the authorization server.
   *
   * <p>
   * Overriding is only supported for the purpose of calling the super implementation and changing
   * the return type, but nothing else.
   * </p>
   */
  public AuthorizationCodeTokenRequestModificado setCode(String code) {
    this.code = Preconditions.checkNotNull(code);
    return this;
  }

  /**
   * Returns the redirect URI parameter matching the redirect URI parameter in the authorization
   * request or {@code null} for none.
   */
  public final String getRedirectUri() {
    return redirectUri;
  }

  /**
   * Sets the redirect URI parameter matching the redirect URI parameter in the authorization
   * request or {@code null} for none.
   *
   * <p>
   * Overriding is only supported for the purpose of calling the super implementation and changing
   * the return type, but nothing else.
   * </p>
   */
  public AuthorizationCodeTokenRequestModificado setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

  @Override
  public AuthorizationCodeTokenRequestModificado set(String fieldName, Object value) {
    return (AuthorizationCodeTokenRequestModificado) super.set(fieldName, value);
  }
}