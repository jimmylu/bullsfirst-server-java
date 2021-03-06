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
package org.archfirst.common.quantity;

import java.math.BigDecimal;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * DecimalQuantityAdapter
 *
 * @author Naresh Bhatia
 */
public class DecimalQuantityAdapter extends XmlAdapter<BigDecimal, DecimalQuantity> {
    
    public DecimalQuantity unmarshal(BigDecimal val) throws Exception {
        return new DecimalQuantity(val);
    }
    
    public BigDecimal marshal(DecimalQuantity val) throws Exception {
        return val.getValue();
    }
}