/**
 * Copyright (C) 2023 The LibreMobileOS Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.libremobileos.server.applock

import android.content.Intent

import com.android.server.wm.ActivityInterceptorCallback.ActivityInterceptorInfo

/**
 * Internal class for system server to manage app lock.
 *
 * @hide
 */
interface AppLockManagerServiceInternal {

    /**
     * Whether user has to unlock this application in order to
     * open it.
     *
     * @param packageName the package name of the app to check.
     * @param userId the user id given by the caller.
     * @return true if user has to unlock, false otherwise.
     */
    fun requireUnlock(packageName: String, userId: Int): Boolean

    /**
     * Report that password for user has changed.
     *
     * @param userId the user for which password has changed.
     */
    fun reportPasswordChanged(userId: Int)

    /**
     * Check whether notification content should be hidden for a package.
     *
     * @param packageName the package to check for.
     * @param userId the user id given by the caller.
     * @return true if notification should be hidden, false otherwise.
     */
    fun shouldRedactNotification(packageName: String, userId: Int): Boolean

    /**
     * Notify that the device is locked for current user.
     */
    fun notifyDeviceLocked(locked: Boolean, userId: Int)

    /**
     * Whether to intercept the activity launch from a package. Used
     * to show confirm credentials prompt.
     *
     * @param info [ActivityInterceptorInfo] of intercepted activity.
     * @return [Intent] which will be fired. Return null if activity
     *    shouldn't be intercepted.
     */
    fun interceptActivity(info: ActivityInterceptorInfo): Intent?

    /**
     * Get the list of applications hidden from launcher.
     *
     * @param userId the user id given of the caller.
     * @return a hash set of package names.
     */
    fun getHiddenPackages(userId: Int): Set<String>

}

