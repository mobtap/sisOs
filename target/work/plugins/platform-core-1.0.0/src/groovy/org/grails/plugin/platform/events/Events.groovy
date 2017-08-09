/* Copyright 2011-2013 the original author or authors:
 *
 *    Marc Palmer (marc@grailsrocks.com)
 *    Stéphane Maldini (smaldini@vmware.com)
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
package org.grails.plugin.platform.events

import java.util.concurrent.ExecutionException
import java.util.concurrent.TimeUnit
import java.util.concurrent.TimeoutException

interface Events {

    List<EventDefinition> getEventDefinitions()

    EventReply event(String namespace, String topic, data)
    EventReply event(String namespace, String topic, data, Map params)
    EventReply event(String namespace, String topic, data, Map params, Closure callback)

    // We have to use a list here as [] and ... were failing to compile for some WTF reason - MP
    Object[] waitFor(EventReply[] replies) throws ExecutionException, InterruptedException, TimeoutException
    Object[] waitFor(long l, TimeUnit timeUnit, EventReply[] replies) throws ExecutionException, InterruptedException, TimeoutException
}
