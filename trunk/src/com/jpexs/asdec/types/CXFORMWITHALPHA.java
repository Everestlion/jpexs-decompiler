/*
 *  Copyright (C) 2010-2011 JPEXS
 * 
 *  This program is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU General Public License
 *  as published by the Free Software Foundation; either version 2
 *  of the License, or (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package com.jpexs.asdec.types;

/**
 * Defines a transform that can be applied to the color space of a graphic object.
 *
 * @author JPEXS
 */
public class CXFORMWITHALPHA {
    /**
     * Has color addition values
     */
    public boolean hasAddTerms;
    /**
     * Has color multiply values
     */
    public boolean hasMultTerms;
    /**
     * Red multiply value
     */
    public int redMultTerm;
    /**
     * Green multiply value
     */
    public int greenMultTerm;
    /**
     * Blue multiply value
     */
    public int blueMultTerm;
    /**
     * Alpha multiply value
     */
    public int alphaMultTerm;
    /**
     * Red addition value
     */
    public int redAddTerm;
    /**
     * Green addition value
     */
    public int greenAddTerm;
    /**
     * Blue addition value
     */
    public int blueAddTerm;
    /**
     * Alpha addition value
     */
    public int alphaAddTerm;

    public int nbits;
}
