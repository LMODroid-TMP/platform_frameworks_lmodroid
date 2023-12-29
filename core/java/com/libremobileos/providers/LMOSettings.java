/**
 * Copyright (C) 2023 The LibreMobileOS Foundation
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

package com.libremobileos.providers;

import android.provider.Settings;
import android.util.Log;


/**
 * LMOSettings contains LMO specific preferences in System, Secure, and Global.
 */
public final class LMOSettings {
    private static final String TAG = "LMOSettings";

    /**
     * System settings, containing miscellaneous LMO system preferences. This table holds simple
     * name/value pairs. There are convenience functions for accessing individual settings entries.
     */
    public static final class System extends Settings.NameValueTable {
        // region System Settings

        /**
         * Whether the phone ringtone should be played in an increasing manner
         * @hide
         */
        public static final String INCREASING_RING = "increasing_ring";

        /**
         * Start volume fraction for increasing ring volume
         * @hide
         */
        public static final String INCREASING_RING_START_VOLUME = "increasing_ring_start_vol";

        /**
         * Ramp up time (seconds) for increasing ring
         * @hide
         */
        public static final String INCREASING_RING_RAMP_UP_TIME = "increasing_ring_ramp_up_time";

        /**
         * Whether the phone vibrates on call connect
         * @hide
         */
        public static final String VIBRATE_ON_CONNECT = "vibrate_on_connect";

        /**
         * Whether the phone vibrates on call waiting
         * @hide
         */
        public static final String VIBRATE_ON_CALLWAITING = "vibrate_on_callwaiting";

        /**
         * Whether the phone vibrates on disconnect
         * @hide
         */
        public static final String VIBRATE_ON_DISCONNECT = "vibrate_on_disconnect";

        /**
         * Whether to allow one finger quick settings expansion on the right side of the statusbar.
         *
         * @hide
         */
        public static final String STATUS_BAR_QUICK_QS_PULLDOWN = "qs_quick_pulldown";

        /**
         * Whether the HighTouchPollingRate is activated or not.
         * 0 = off, 1 = on
         * @hide
         */
        public static final String HIGH_TOUCH_POLLING_RATE_ENABLE =
                "high_touch_polling_rate_enable";

        /**
         * Whether the HighTouchSensitivity is activated or not.
         * 0 = off, 1 = on
         * @hide
         */
        public static final String HIGH_TOUCH_SENSITIVITY_ENABLE =
                "high_touch_sensitivity_enable";

        /**
         * Check the proximity sensor during wakeup
         *
         * @hide
         */
        public static final String PROXIMITY_ON_WAKE = "proximity_on_wake";

        /**
         * Whether to wake the display when plugging or unplugging the charger
         *
         * @hide
         */
        public static final String WAKE_WHEN_PLUGGED_OR_UNPLUGGED = "wake_when_plugged_or_unplugged";

        /**
         * List of long-screen apps.
         * @hide
         */
        public static final String LONG_SCREEN_APPS = "long_screen_apps";

        /**
         * Whether or not to vibrate when a touchscreen gesture is detected
         * @hide
         */
        public static final String TOUCHSCREEN_GESTURE_HAPTIC_FEEDBACK = "touchscreen_gesture_haptic_feedback";

        /**
         * Activate torchlight when power button is
         * long-pressed while the display is off
         * The value is boolean (1 or 0).
         * @hide
         */
        public static final String TORCH_LONG_PRESS_POWER_GESTURE =
                "torch_long_press_power_gesture";

        /**
         * When the torch has been turned on by long press on power,
         * automatically turn off after a configurable number of seconds.
         * The value is an integer number of seconds in the range 0-3600.
         * 0 means never automatically turn off.
         * @hide
         */
        public static final String TORCH_LONG_PRESS_POWER_TIMEOUT =
                "torch_long_press_power_timeout";

        /**
         * Whether to scramble a pin unlock layout
         * @hide
         */
        public static final String LOCKSCREEN_PIN_SCRAMBLE_LAYOUT =
                "lockscreen_scramble_pin_layout";

        /**
         * Whether auto brightness is applied one shot when screen is turned on
         * @hide
         */
        public static final String AUTO_BRIGHTNESS_ONE_SHOT = "auto_brightness_one_shot";

        /**
         * Whether to take partial screenshot with volume down + power click.
         * 
         * @hide
         */
        public static final String CLICK_PARTIAL_SCREENSHOT = "click_partial_screenshot";

        /**
         * boolean value. toggles using arrow key locations on nav bar
         * as left and right dpad keys
         * 
         * @hide
         */
        public static final String NAVIGATION_BAR_MENU_ARROW_KEYS = "navigation_bar_menu_arrow_keys";

        /**
         * Whether the battery light should be enabled (if hardware supports it)
         * The value is boolean (1 or 0).
         * 
         * @hide
         */
        public static final String BATTERY_LIGHT_ENABLED = "battery_light_enabled";

        /**
         * Whether the battery LED should be disabled when the battery is fully charged.
         * The value is boolean (1 or 0).
         * 
         * @hide
         */
        public static final String BATTERY_LIGHT_FULL_CHARGE_DISABLED = "battery_light_full_charge_disabled";

        /**
         * Whether the battery LED should repeatedly flash when the battery is low
         * on charge. The value is boolean (1 or 0).
         * 
         * @hide
         */
        public static final String BATTERY_LIGHT_PULSE = "battery_light_pulse";

        /**
         * What color to use for the battery LED while charging - low
         * 
         * @hide
         */
        public static final String BATTERY_LIGHT_LOW_COLOR = "battery_light_low_color";

        /**
         * What color to use for the battery LED while charging - medium
         * 
         * @hide
         */
        public static final String BATTERY_LIGHT_MEDIUM_COLOR = "battery_light_medium_color";

        /**
         * What color to use for the battery LED while charging - full
         * 
         * @hide
         */
        public static final String BATTERY_LIGHT_FULL_COLOR = "battery_light_full_color";

        /**
         * Contains the battery light maximum brightness to use.
         * Values range from 1 to 255
         * 
         * @hide
         */
        public static final String BATTERY_LIGHT_BRIGHTNESS_LEVEL = "battery_light_brightness_level";

        /**
         * Contains the battery light maximum brightness to use when Do Not
         * Disturb is active.
         * Values range from 1 to 255
         * 
         * @hide
         */
        public static final String BATTERY_LIGHT_BRIGHTNESS_LEVEL_ZEN = "battery_light_brightness_level_zen";

        /**
         * Contains the notifications light maximum brightness to use.
         * Values range from 1 to 255
         * 
         * @hide
         */
        public static final String NOTIFICATION_LIGHT_BRIGHTNESS_LEVEL = "notification_light_brightness_level";

        /**
         * Contains the notifications light maximum brightness to use when Do Not
         * Disturb is active.
         * Values range from 1 to 255
         * 
         * @hide
         */
        public static final String NOTIFICATION_LIGHT_BRIGHTNESS_LEVEL_ZEN = "notification_light_brightness_level_zen";

        /**
         * Whether to allow notifications with the screen on or DayDreams.
         * The value is boolean (1 or 0). Default will always be false.
         * 
         * @hide
         */
        public static final String NOTIFICATION_LIGHT_SCREEN_ON = "notification_light_screen_on_enable";

        /**
         * What color to use for the notification LED by default
         * 
         * @hide
         */
        public static final String NOTIFICATION_LIGHT_PULSE_DEFAULT_COLOR = "notification_light_pulse_default_color";

        /**
         * How long to flash the notification LED by default
         * 
         * @hide
         */
        public static final String NOTIFICATION_LIGHT_PULSE_DEFAULT_LED_ON = "notification_light_pulse_default_led_on";

        /**
         * How long to wait between flashes for the notification LED by default
         * 
         * @hide
         */
        public static final String NOTIFICATION_LIGHT_PULSE_DEFAULT_LED_OFF = "notification_light_pulse_default_led_off";

        /**
         * What color to use for the missed call notification LED
         * 
         * @hide
         */
        public static final String NOTIFICATION_LIGHT_PULSE_CALL_COLOR = "notification_light_pulse_call_color";

        /**
         * How long to flash the missed call notification LED
         * 
         * @hide
         */
        public static final String NOTIFICATION_LIGHT_PULSE_CALL_LED_ON = "notification_light_pulse_call_led_on";

        /**
         * How long to wait between flashes for the missed call notification LED
         * 
         * @hide
         */
        public static final String NOTIFICATION_LIGHT_PULSE_CALL_LED_OFF = "notification_light_pulse_call_led_off";

        /**
         * What color to use for the voicemail notification LED
         * 
         * @hide
         */
        public static final String NOTIFICATION_LIGHT_PULSE_VMAIL_COLOR = "notification_light_pulse_vmail_color";

        /**
         * How long to flash the voicemail notification LED
         * 
         * @hide
         */
        public static final String NOTIFICATION_LIGHT_PULSE_VMAIL_LED_ON = "notification_light_pulse_vmail_led_on";

        /**
         * How long to wait between flashes for the voicemail notification LED
         * 
         * @hide
         */
        public static final String NOTIFICATION_LIGHT_PULSE_VMAIL_LED_OFF = "notification_light_pulse_vmail_led_off";

        /**
         * Whether to use the custom LED values for the notification pulse LED.
         * 0 = 0ff, 1 = on
         * 
         * @hide
         */
        public static final String NOTIFICATION_LIGHT_PULSE_CUSTOM_ENABLE = "notification_light_pulse_custom_enable";

        /**
         * Which custom LED values to use for the notification pulse LED.
         * 
         * @hide
         */
        public static final String NOTIFICATION_LIGHT_PULSE_CUSTOM_VALUES = "notification_light_pulse_custom_values";

        /**
         * Whether we automatically generate notification LED colors or just
         * use the boring default.
         *
         * @hide
         */
        public static final String NOTIFICATION_LIGHT_COLOR_AUTO = "notification_light_color_auto";

        /**
         * Whether the notification light will be allowed when in zen mode during
         * downtime
         * 
         * @hide
         */
        public static final String ZEN_ALLOW_LIGHTS = "allow_lights";

        /**
         * Whether to show the clock in the right or left position or show it in the
         * center
         * 0: show the clock in the left position (LTR)
         * 1: show the clock in the center
         * 2: show the clock in the right position (LTR)
         * default: 0
         * 
         * @hide
         */
        public static final String STATUS_BAR_CLOCK = "status_bar_clock";

    }

    /**
     * Secure settings, containing miscellaneous LMO secure preferences. This
     * table holds simple name/value pairs. There are convenience
     * functions for accessing individual settings entries.
     */
    public static final class Secure extends Settings.NameValueTable {
        // region Secure Settings

        /**
         * Whether to show media art on lockscreen
         * Boolean setting. 0 = off, 1 = on.
         * @hide
         */
        public static final String LOCKSCREEN_MEDIA_METADATA = "lockscreen_media_metadata";

        /**
         * Whether touch hovering is enabled on supported hardware
         * @hide
         */
        public static final String FEATURE_TOUCH_HOVERING = "feature_touch_hovering";

        /**
         * Whether to include options in power menu for rebooting into recovery or bootloader
         * @hide
         */
        public static final String ADVANCED_REBOOT = "advanced_reboot";

        /**
         * String to contain power menu actions
         * @hide
         */
        public static final String POWER_MENU_ACTIONS = "power_menu_actions";

        /**
         * Whether to show the brightness slider in quick settings panel.
         * 
         * @hide
         */
        public static final String QS_SHOW_BRIGHTNESS_SLIDER = "qs_show_brightness_slider";

        /**
         * Whether to show the auto brightness icon in quick settings panel.
         * 
         * @hide
         */
        public static final String QS_SHOW_AUTO_BRIGHTNESS = "qs_show_auto_brightness";

        /**
         * Whether to use black theme for dark mode
         * 
         * @hide
         */
        public static final String BERRY_BLACK_THEME = "berry_black_theme";

    }

    /**
     * Global settings, containing miscellaneous LMO global preferences. This
     * table holds simple name/value pairs. There are convenience
     * functions for accessing individual settings entries.
     */
    public static final class Global extends Settings.NameValueTable {
        // region Global Settings

        /**
         * Restrict USB
         * 0 = Off, never
         * 1 = Only when the screen is locked
         * 2 = On, always
         *
         * @hide
         */
        public static final String TRUST_RESTRICT_USB = "trust_restrict_usb";

    }
}
