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

import static org.mockito.Mockito.verify;

import org.fest.assertions.api.ShortArrayAssert;
import org.fest.assertions.api.ShortArrayAssertBaseTest;
import org.junit.Test;

/**
 * Tests for <code>{@link org.fest.assertions.api.ShortArrayAssert#isNullOrEmpty()}</code>.
 * 
 * @author Alex Ruiz
 */
public class ShortArrayAssert_isNullOrEmpty_Test extends ShortArrayAssertBaseTest {


  @Override
  protected ShortArrayAssert invoke_api_method() {
    assertions.isNullOrEmpty();
    return null;
  }

  @Override
  protected void verify_internal_effects() {
    verify(arrays).assertNullOrEmpty(getInfo(assertions), getActual(assertions));
  }
  
  
  @Override
  @Test
  public void should_return_this() {
    // Disable this test, the isNullOrEmpty method is void.
  }
}
