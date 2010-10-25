/*
 * Created on Oct 24, 2010
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright @2010 the original author or authors.
 */
package org.fest.assertions.error;

import static junit.framework.Assert.assertEquals;
import static org.fest.assertions.data.Delta.delta;
import static org.fest.assertions.error.IsNotEqualWithDelta.isNotEqual;

import org.fest.assertions.description.Description;
import org.fest.assertions.internal.TestDescription;
import org.junit.*;

/**
 * Tests for <code>{@link IsNotEqualWithDelta#create(Description)}</code>.
 *
 * @author Alex Ruiz
 */
public class IsNotEqualWithDelta_create_Test {

  private ErrorMessage errorMessage;

  @Before public void setUp() {
    errorMessage = isNotEqual(6f, 8f, delta(1f));
  }

  @Test public void should_create_error_message() {
    String message = errorMessage.create(new TestDescription("Test"));
    assertEquals("[Test] expected:<8.0> but was:<6.0> with delta:<1.0>", message);
  }
}