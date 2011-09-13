/* Copyright 2006-2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the 'License');
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an 'AS IS' BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
security {
	oauthProvider {		
		active = true
		user {
			approvalParameter = "user_oauth_approval"
			approvalParameterValue = true
			authUrl = '/oauth/user/authorize'
			confirmUrl = '/login/confirm'
		}
		client {
			authUrl = '/oauth/authorize'
		}
		verificationCode {
			clientAuthenticationCache = 'oauthClientAuthenticationCache'
			services = 'oauthInMemoryVerificationCodeServices'
		}
		tokenServices {
			tokenSecretLengthBytes = 80
			refreshTokenValiditySeconds = 60 * 10 //default 10 minutes
			accessTokenValiditySeconds = 60 * 60 * 12 //default 12 hours
			reuseRefreshToken = true
			supportRefreshToken = true
		}
	}
}
