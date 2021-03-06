/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2019 Chris Magnussen and Elior Boukhobza
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 *
 */

package com.mallowigi.idea.tabs.highlightTabPainters;

import javax.swing.*;
import java.awt.*;

public class TopHighlightTabPainter extends HighlightTabPainter {
  @Override
  public void paintBottom(final int borderThickness, final Graphics2D g2d, final Rectangle rect, final int width) {
    // do nothing
  }

  @Override
  public final void paintTop(final int borderThickness, final Graphics2D g2d, final Rectangle rect, final int width) {
    final int positionFromPlacement = getEditorTabPlacement();
    // Paint on bottom if tabs at bottom, otherwise paint on bottom
    if (positionFromPlacement == SwingConstants.BOTTOM) {
      paintOnBottom(borderThickness, g2d, rect, width);
    } else {
      paintOnTop(borderThickness, g2d, rect);
    }
  }

  @Override
  public void paintLeft(final int borderThickness, final Graphics2D g2d, final Rectangle rect, final int width) {
    // do nothing
  }

  @Override
  public void paintRight(final int borderThickness, final Graphics2D g2d, final Rectangle rect, final int width) {
    // do nothing
  }
}
