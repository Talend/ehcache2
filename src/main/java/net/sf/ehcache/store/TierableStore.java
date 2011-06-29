/**
 *  Copyright 2003-2010 Terracotta, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package net.sf.ehcache.store;

/**
 * This is the interface for all tierable stores.
 *
 * @author Ludovic Orban
 */
public interface TierableStore extends Store {
    
    /**
     * Acquire the read lock of the specified key
     * @param key the key to read-lock
     */
    void readLock(Object key);

    /**
     * Unlock the read lock of the specified key
     * @param key the key to read-unlock
     */
    void readUnlock(Object key);

    /**
     * Acquire the write lock of the specified key
     * @param key the key to write-lock
     */
    void writeLock(Object key);

    /**
     * Unlock the write lock of the specified key
     * @param key the key to write-unlock
     */
    void writeUnlock(Object key);

    /**
     * Acquire the read lock of all keys
     */
    void readLock();

    /**
     * Unlock the read lock of all keys
     */
    void readUnlock();

    /**
     * Acquire the write lock of all keys
     */
    void writeLock();

    /**
     * Unlock the write lock of all keys
     */
    void writeUnlock();

}
