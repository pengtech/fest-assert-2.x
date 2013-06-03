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
package org.fest.assertions.api.shortarray;

import static org.fest.util.Lists.newArrayList;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.fest.assertions.api.ShortArrayAssert;
import org.fest.assertions.api.ShortArrayAssertBaseTest;

/**
 * Tests for <code>{@link org.fest.assertions.api.ShortArrayAssert#hasSameSizeAs(Iterable)}</code>.
 * 
 * @author Nicolas François
 */
public class ShortArrayAssert_hasSameSizeAs_with_Iterable_Test extends ShortArrayAssertBaseTest {

  private final List<String> other = newArrayList("Yoda", "Luke");

  @Override
  protected ShortArrayAssert invoke_api_method() {
    return assertions.hasSameSizeAs(other);
  }

  @Override
  protected void verify_internal_effects() {
    verify(arrays).assertHasSameSizeAs(getInfo(assertions), getActual(assertions), other);
  }
}
