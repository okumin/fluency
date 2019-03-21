/*
 * Copyright 2019 Mitsunori Komatsu (komamitsu)
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

package org.komamitsu.fluency.fluentd.ingester.sender.failuredetect;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhiAccrualFailureDetectStrategyTest
{
    @Test
    void validateConfig()
    {
        {
            PhiAccrualFailureDetectStrategy.Config config = new PhiAccrualFailureDetectStrategy.Config();
            config.setPhiThreshold(0);
            assertThrows(IllegalArgumentException.class, () -> new PhiAccrualFailureDetectStrategy(config));
        }

        {
            PhiAccrualFailureDetectStrategy.Config config = new PhiAccrualFailureDetectStrategy.Config();
            config.setArrivalWindowSize(0);
            assertThrows(IllegalArgumentException.class, () -> new PhiAccrualFailureDetectStrategy(config));
        }
    }
}