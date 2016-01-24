/*
 * Copyright 2015 Vitaly Litvak (vitavaque@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.traccar.web.client.theme;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.sencha.gxt.theme.gray.client.window.GrayWindowAppearance;

public class WindowAppearance extends GrayWindowAppearance {
    public WindowAppearance() {
        this((WindowResources) GWT.create(WindowResources.class), (FramedPanelTemplate)GWT.create(FramedPanelTemplate.class));
    }

    public WindowAppearance(WindowResources var1, FramedPanelTemplate var2) {
        super(var1);
    }

    public interface WindowResources extends GrayWindowResources {
        @ClientBundle.Source({"com/sencha/gxt/theme/gray/client/window/Window.css", "Window.css"})
        @Override
        GrayWindowStyle style();
    }
}
