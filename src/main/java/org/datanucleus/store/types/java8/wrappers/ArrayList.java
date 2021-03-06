/**********************************************************************
Copyright (c) 2014 Andy Jefferson and others. All rights reserved.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

Contributors:
    ...
**********************************************************************/
package org.datanucleus.store.types.java8.wrappers;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

import org.datanucleus.metadata.AbstractMemberMetaData;
import org.datanucleus.state.ObjectProvider;

/**
 * A mutable second-class wrapper object. Extends the standard DataNucleus wrapper adding on Java8 methods.
 */
public class ArrayList extends org.datanucleus.store.types.wrappers.ArrayList
{
    /**
     * Constructor, using the ObjectProvider of the "owner" and the member.
     * @param ownerOP The owner ObjectProvider
     * @param mmd Metadata for the member
     */
    public ArrayList(ObjectProvider ownerOP, AbstractMemberMetaData mmd)
    {
        super(ownerOP, mmd);
    }

    /* (non-Javadoc)
     * @see java.util.Collection#stream()
     */
    @Override
    public Stream stream()
    {
        return delegate.stream();
    }

    /* (non-Javadoc)
     * @see java.util.Collection#parallelStream()
     */
    @Override
    public Stream parallelStream()
    {
        return delegate.parallelStream();
    }

    /* (non-Javadoc)
     * @see java.util.ArrayList#trimToSize()
     */
    @Override
    public void trimToSize()
    {
        delegate.trimToSize();
    }

    /* (non-Javadoc)
     * @see java.util.ArrayList#ensureCapacity(int)
     */
    @Override
    public void ensureCapacity(int minCapacity)
    {
        delegate.ensureCapacity(minCapacity);
    }

    /* (non-Javadoc)
     * @see java.util.ArrayList#forEach(java.util.function.Consumer)
     */
    @Override
    public void forEach(Consumer action)
    {
        delegate.forEach(action);
    }

    /* (non-Javadoc)
     * @see java.util.Iterable#spliterator()
     */
    @Override
    public Spliterator spliterator()
    {
        return delegate.spliterator();
    }

    /* (non-Javadoc)
     * @see java.util.Collection#removeIf(java.util.function.Predicate)
     */
    @Override
    public boolean removeIf(Predicate filter)
    {
        return delegate.removeIf(filter);
    }

    /* (non-Javadoc)
     * @see java.util.ArrayList#replaceAll(java.util.function.UnaryOperator)
     */
    @Override
    public void replaceAll(UnaryOperator operator)
    {
        delegate.replaceAll(operator);
    }

    /* (non-Javadoc)
     * @see java.util.ArrayList#sort(java.util.Comparator)
     */
    @Override
    public void sort(Comparator c)
    {
        delegate.sort(c);
    }
}