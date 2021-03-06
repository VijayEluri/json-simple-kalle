package org.json.simple.serialization.collections;
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.json.simple.parser.BufferedJSONStreamReader;
import org.json.simple.parser.ParseException;
import org.json.simple.serialization.Codec;
import org.json.simple.serialization.CodecRegistry;

import java.io.IOException;
import java.io.PrintWriter;


/**
 * @author karl.wettin@kodapan.se
 * @since 2009-jul-03 06:17:10
 */
public class PrimitiveArrayCodec extends Codec<Object> {

  private Class primitiveGenericType;
  private CodecRegistry codecRegistry;

  public PrimitiveArrayCodec(CodecRegistry codecRegistry, Class primitiveGenericType) {
    if (!primitiveGenericType.isPrimitive()) {
      throw new RuntimeException(primitiveGenericType.getName() + " is not a primitive!");
    }
    this.primitiveGenericType = primitiveGenericType;
    this.codecRegistry = codecRegistry;
  }


  /**
   * Appends the JSON value for a given object to a StringBuffer.
   * Output should include JSON synxtax such as "", ["",""], { ... }, etc
   *
   * @param object
   * @param definedType
   * @param json
   * @param path
   * @param indentation
   */
  public void marshal(Object object, Class definedType, PrintWriter json, String path, int indentation) {
    throw new UnsupportedOperationException("Primitive array of type \"" + primitiveGenericType.getName() + "[] is unsupported\"");

  }

  /**
   * @param jsr
   * @return
   */
  public Object[] unmarshal(BufferedJSONStreamReader jsr) throws ParseException, IOException {
    throw new UnsupportedOperationException("Not implemented");
  }

  public Class getPrimitiveGenericType() {
    return primitiveGenericType;
  }
}
