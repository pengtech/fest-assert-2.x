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
package org.fest.assertions.api.chararray;

import static junit.framework.Assert.assertSame;
import static org.mockito.MockitoAnnotations.initMocks;

import java.util.Comparator;

import org.fest.assertions.api.CharArrayAssert;
import org.fest.assertions.api.CharArrayAssertBaseTest;
import org.fest.assertions.internal.CharArrays;
import org.junit.Before;
import org.mockito.Mock;

/**
 * Tests for <code>{@link org.fest.assertions.api.CharArrayAssert#usingComparator(java.util.Comparator)}</code>.
 * 
 * @author Joel Costigliola
 * @author Mikhail Mazursky
 */
public class CharArrayAssert_usingComparator_Test extends CharArrayAssertBaseTest {

  @Mock
  private Comparator<char[]> comparator;

  private CharArrays arraysBefore;

  @Before
  public void before() {
    initMocks(this);
    arraysBefore = getArrays(assertions);
  }

  @Override
  protected CharArrayAssert invoke_api_method() {
    // in that test, the comparator type is not important, we only check that we correctly switch of comparator
    return assertions.usingComparator(comparator);
  }

  @Override
  protected void verify_internal_effects() {
    assertSame(getObjects(assertions).getComparator(), comparator);
    assertSame(getArrays(assertions), arraysBefore);
  }
}
