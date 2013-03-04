/*
 * Copyright 2003-2013 the original author or authors.
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
package groovy.mop.internal.pcollection;

import java.lang.invoke.MethodHandle;
import java.util.List;

public interface PSet<T> extends Iterable<T> {

    boolean isEmpty();
    PSet<T> plus(T element);
    PSet<T> plus(PSet<T> other);
    PSet<T> plus(PSet<T> other, MethodHandle compare);
    PSet<T> plus(List<T> other, MethodHandle compare);
    PSet<T> minus(T element);
    PSet<T> minus(PSet<T> other, MethodHandle compare);
}
