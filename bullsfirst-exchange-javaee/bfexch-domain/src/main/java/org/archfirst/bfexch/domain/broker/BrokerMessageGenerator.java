/**
 * Copyright 2011 Archfirst
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
package org.archfirst.bfexch.domain.broker;

import org.archfirst.bfexch.domain.trading.order.ExecutionReport;
import org.archfirst.bfexch.domain.trading.order.Order;

/**
 * Interface to converts domain entities to exchange messages in text format.
 *
 * @author Naresh Bhatia
 */
public interface BrokerMessageGenerator {

    String generateExecutionReport(ExecutionReport executionReport);

    String generateOrderCancelReject(Order order);
}