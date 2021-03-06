/*
 * Strongback
 * Copyright 2015, Strongback and individual contributors by the @authors tag.
 * See the COPYRIGHT.txt in the distribution for a full listing of individual
 * contributors.
 *
 * Licensed under the MIT License; you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://opensource.org/licenses/MIT
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.strongback.mock;

import org.strongback.components.Fuse;

/**
 * Factory for mock components.
 *
 * @author Randall Hauch
 */
public class Mock {

    /**
     * Create a mock clock.
     *
     * @return the mock clock; never null
     */
    public static MockClock clock() {
        return new MockClock();
    }

    /**
     * Create a mock accelerometer.
     *
     * @return the mock accelerometer; never null
     */
    public static MockAccelerometer accelerometer() {
        return new MockAccelerometer();
    }

    /**
     * Create a mock 2-axis accelerometer.
     *
     * @return the mock 2-axis accelerometer; never null
     */
    public static MockTwoAxisAccelerometer accelerometer2Axis() {
        return new MockTwoAxisAccelerometer();
    }

    /**
     * Create a mock 3-axis accelerometer.
     *
     * @return the mock 3-axis accelerometer; never null
     */
    public static MockThreeAxisAccelerometer accelerometer3Axis() {
        return new MockThreeAxisAccelerometer();
    }

    /**
     * Create a mock angle sensor.
     *
     * @return the mock angle sensor; never null
     */
    public static MockAngleSensor angleSensor() {
        return new MockAngleSensor();
    }

    /**
     * Create a mock compass.
     *
     * @return the mock compass; never null
     */
    public static MockCompass compass() {
        return new MockCompass();
    }

    /**
     * Create a mock current sensor.
     *
     * @return the mock current sensor; never null
     */
    public static MockCurrentSensor currentSensor() {
        return new MockCurrentSensor();
    }

    /**
     * Create a mock distance sensor.
     *
     * @return the mock distance sensor; never null
     */
    public static MockDistanceSensor distanceSensor() {
        return new MockDistanceSensor();
    }

    /**
     * Create a mock voltage sensor.
     *
     * @return the mock voltage sensor; never null
     */
    public static MockVoltageSensor voltageSensor() {
        return new MockVoltageSensor();
    }

    /**
     * Create a mock temperature sensor.
     *
     * @return the mock temperature sensor; never null
     */
    public static MockTemperatureSensor temperatureSensor() {
        return new MockTemperatureSensor();
    }

    /**
     * Create a mock switch that has already been triggered.
     *
     * @return the mock switch; never null
     */
    public static MockSwitch triggeredSwitch() {
        MockSwitch s = new MockSwitch();
        s.setTriggered();
        return s;
    }

    /**
     * Create a mock switch that has not yet been triggered.
     *
     * @return the mock switch; never null
     */
    public static MockSwitch notTriggeredSwitch() {
        MockSwitch s = new MockSwitch();
        s.setNotTriggered();
        return s;
    }

    /**
     * Create a fuse that has not yet been triggered.
     *
     * @return the mock switch; never null
     */
    public static Fuse triggeredFuse() {
        return Fuse.create().trigger();
    }

    /**
     * Create a fuse that has not yet been triggered.
     *
     * @return the mock switch; never null
     */
    public static Fuse notTriggeredFuse() {
        return Fuse.create().reset();
    }

    /**
     * Create a solenoid that operates instantaneously and immediately stops.
     *
     * @return the mock solenoid; never null
     */
    public static MockSolenoid instantaneousSolenoid() {
        return new MockSolenoid(true);
    }

    /**
     * Create a solenoid that operates infinitely slowly and must be manually {@link MockSolenoid#stop() stopped}.
     *
     * @return the mock solenoid; never null
     */
    public static MockSolenoid manualSolenoid() {
        return new MockSolenoid(true);
    }

    /**
     * Create a mock gyroscope.
     *
     * @return the mock gyroscope; never null
     */
    public static MockGyroscope gyroscope() {
        return new MockGyroscope();
    }

    /**
     * Create a mock motor.
     *
     * @return the mock motor; never null
     */
    public static MockMotor stoppedMotor() {
        return new MockMotor(0.0);
    }

    /**
     * Create a running mock motor.
     *
     * @param speed the initial speed
     * @return the mock motor; never null
     */
    public static MockMotor runningMotor(double speed) {
        return new MockMotor(speed);
    }

    /**
     * Create a stopped mock Talon SRX motor.
     *
     * @return the mock TalonSRX motor; never null
     */
    public static MockTalonSRX stoppedTalonSRX() {
        return new MockTalonSRX(0.0);
    }

    /**
     * Create a running mock Talon SRX motor.
     *
     * @param speed the initial speed
     * @return the mock TalonSRX motor; never null
     */
    public static MockTalonSRX runningTalonSRX(double speed) {
        return new MockTalonSRX(speed);
    }
}
