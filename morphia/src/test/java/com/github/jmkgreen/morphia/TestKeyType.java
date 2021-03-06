/**
 * Copyright (C) 2010 Olafur Gauti Gudmundsson
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.jmkgreen.morphia;

import org.junit.Assert;
import org.junit.Test;

import com.github.jmkgreen.morphia.testmodel.Rectangle;


/**
 *
 * @author Scott Hernandez
 */
@SuppressWarnings({"unused"})
public class TestKeyType extends TestBase {
	@Test
    public void testKeyComparisons() throws Exception {
		Rectangle r = new Rectangle(2,1);
		Key<Rectangle> k1 = new Key<Rectangle>(Rectangle.class, r.getId());
		Key<Rectangle> k2 = this.ds.getMapper().getKey(r);

		Assert.assertTrue(k1.equals(k2));
		Assert.assertTrue(k2.equals(k1));

	}

}
