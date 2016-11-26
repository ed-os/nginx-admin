/*******************************************************************************
 * Copyright 2016 JSL Solucoes LTDA - https://jslsolucoes.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.jslsolucoes.nginx.admin.repository;

import java.util.List;

import com.jslsolucoes.nginx.admin.model.User;

public interface UserRepository {
	public User authenticate(User user);

	public List<String> validateBeforeResetPassword(User user);

	public void resetPassword(User user);

	public void changePassword(User user, String password);

	public List<String> validateBeforeChangePassword(User user, String oldPassword, String password,
			String passwordConfirm);

	public User loadForSession(User user);

	public void reconfigure(User user, String login, String password);

	public List<String> validateBeforeChangeLogin(User user, String oldPassword, String login);

	public void changeLogin(User user, String login);

	public User load(User user);
}
