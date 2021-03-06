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
package org.fest.assertions.api;

import static org.fest.test.ExpectedException.none;
import static org.junit.Assert.assertSame;

import org.fest.test.ExpectedException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

/**
 * Tests for {@link CharacterAssert#isLessThan(char)}.
 *
 * @author Yvonne Wang
 */
public class CharacterAssert_isLessThan_char_Test {
  @Rule
  public ExpectedException thrown = none();
  private CharacterAssert assertions;
  private final Character actual = new Character('a');
  private final char expected = 'b';

  @Before
  public void setUp() {
    assertions = new CharacterAssert(actual);
  }

  @Test
  public void should_pass_if_actual_is_less_than_expected() {
    assertions.isLessThan(expected);
  }

  @Test
  public void should_return_this() {
    CharacterAssert returned = assertions.isLessThan(expected);
    assertSame(assertions, returned);
  }

  @Test
  public void should_throw_error_if_actual_is_null() {
    thrown.expect(AssertionError.class);
    assertions = new CharacterAssert(null);
    assertions.isLessThan(expected);
  }

  @Test
  public void should_fail_if_actual_is_greater_than_expected() {
    thrown.expect(AssertionError.class);
    assertions = new CharacterAssert('c');
    assertions.isLessThan(expected);
  }

  @Test
  public void should_fail_if_actual_is_equal_to_expected() {
    thrown.expect(AssertionError.class);
    assertions.isLessThan(actual.charValue());
  }
}
