/**
 * Copyright 2016-2017 Symphony Integrations - Symphony LLC
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
 */

package org.symphonyoss.integration.model.healthcheck;

/**
 * Holds the information about the configurator application.
 * It contains the load and icon URL's.
 * Created by rsanchez on 01/02/17.
 */
public class IntegrationConfigurator {

  private String loadUrl;

  private String iconUrl;

  public String getLoadUrl() {
    return loadUrl;
  }

  public void setLoadUrl(String loadUrl) {
    this.loadUrl = loadUrl;
  }

  public String getIconUrl() {
    return iconUrl;
  }

  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }
}
