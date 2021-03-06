/* Copyright 2004-2005 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.codehaus.groovy.grails.plugins.codecs;

import org.codehaus.groovy.grails.support.encoding.CodecFactory;
import org.codehaus.groovy.grails.support.encoding.CodecIdentifier;
import org.codehaus.groovy.grails.support.encoding.Decoder;
import org.codehaus.groovy.grails.support.encoding.Encoder;

/**
 * Encodes and decodes strings to and from HTML.
 * 
 * @author Graeme Rocher
 * @author Lari Hotari
 * @since 1.1
 */
public class HTMLCodec implements CodecFactory {
    static final String CODEC_NAME = "HTML";

    private static Encoder encoder = new HTMLEncoder();
    private static Decoder decoder = new HTML4Decoder() {
        @Override
        public CodecIdentifier getCodecIdentifier() {
            return HTMLEncoder.HTML_CODEC_IDENTIFIER;
        }
    };

    public Encoder getEncoder() {
        return encoder;
    }

    public Decoder getDecoder() {
        return decoder;
    }
}
