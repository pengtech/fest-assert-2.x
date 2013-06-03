/*
 * Created on Mar 29, 2009
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
 * Copyright @2013 the original author or authors.
 */
package org.fest.assertions.api.intarray;

import static org.fest.assertions.test.IntArrays.newArray;
import static org.mockito.Mockito.verify;

import org.fest.assertions.api.IntArrayAssert;
import org.fest.assertions.api.IntArrayAssertBaseTest;

/**
 * Tests for <code>{@link org.fest.assertions.api.IntArrayAssert#endsWith(int...)}</code>.
 * 
 * @author Alex Ruiz
 */
public class IntArrayAssert_endsWith_Test extends IntArrayAssertBaseTest {

  @Override
  protected IntArrayAssert invoke_api_method() {
    return assertions.endsWith(6, 8);
  }

  @Override
  protected void verify_internal_effects() {
    verify(arrays).assertEndsWith(getInfo(assertions), getActual(assertions), newArray(6, 8));
  }
}
