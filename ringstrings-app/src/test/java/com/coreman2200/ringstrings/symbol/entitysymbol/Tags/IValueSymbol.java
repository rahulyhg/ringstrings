package com.coreman2200.ringstrings.symbol.entitysymbol.Tags;

import com.coreman2200.ringstrings.symbol.symbolinterface.ISymbol;

/**
 * IValueSymbol
 * Permits for values (such as tag counts) to be used just as symbols
 *
 * Created by Cory Higginbottom on 11/5/15
 * http://github.com/coreman2200
 *
 * Licensed under the GNU General Public License (GPL), Version 2.0.
 * You may not use this file except in compliance with this License.
 *
 * You may obtain a copy of the GPLv2 License at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 */

public interface IValueSymbol extends ITagSymbol {
    void add(Integer val);
    void sub(Integer val);
    Integer getValue();

}
