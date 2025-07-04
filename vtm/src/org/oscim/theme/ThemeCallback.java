/*
 * Copyright 2016-2019 devemux86
 *
 * This program is free software: you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.oscim.theme;

import org.oscim.backend.canvas.Bitmap;
import org.oscim.core.MapElement;
import org.oscim.theme.styles.RenderStyle;

/**
 * Callback methods for render theme.
 */
public interface ThemeCallback {
    /**
     * @return the resource {@link Bitmap}
     */
    Bitmap getBitmap(Bitmap bitmap);

    /**
     * @return the color-int
     */
    int getColor(RenderStyle origin, int color);

    /**
     * @return the text
     */
    String getText(MapElement element, String text);
}
