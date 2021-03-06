package com.coreman2200.ringstrings.profiledata;

import android.location.Location;

import com.coreman2200.ringstrings.numbersystem.NumberSystemType;
import com.coreman2200.ringstrings.protos.LocalProfileDataBundle;

import org.robolectric.shadows.ShadowLocation;

import java.util.GregorianCalendar;

/**
 * IProfileDataBundle
 * Interface for Profiles (data structures used to store raw user input/data)
 *
 * Created by Cory Higginbottom on 5/27/15
 * http://github.com/coreman2200
 *
 * Licensed under the GNU General Public License (GPL), Version 2.0.
 * You may not use this file except in compliance with this License.
 *
 * You may obtain a copy of the GPLv2 License at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 */

public interface IProfileDataBundle {
    String getFirstName();
    String getMiddleName();
    String getLastName();
    GregorianCalendar getBirthDate();
    int getBirthDay();
    int getBirthMonth();
    int getBirthYear();
    Location getBirthLocation();
    Location getCurrentLocation();
    int getProfileId();
}
