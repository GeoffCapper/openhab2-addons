/**
 * Copyright (c) 2010-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.mysensors.test;

import java.text.ParseException;

import org.junit.Test;
import org.openhab.binding.mysensors.internal.protocol.message.MySensorsMessage;

/**
 * Test cases for the MySensorsMessage parser
 *
 * @author Tim Oberföll
 *
 */
public class MySensorsMessageTest {

    
    /**
     * Empty message
     * @throws ParseException
     */
    @Test(expected = ParseException.class)
    public void parserTestEmpty() throws ParseException {
        MySensorsMessage.parse(" ");
    }
    
    /**
     * Short message
     * @throws ParseException
     */
    @Test(expected = ParseException.class)
    public void parserTestShort() throws ParseException {
        MySensorsMessage.parse("172;255;3;0;");
    }
}