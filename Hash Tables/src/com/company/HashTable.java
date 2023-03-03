package com.company;

import java.util.LinkedList;

public class HashTable {
    private class Entry{
        int key;
        String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry>[] entries = new LinkedList[5];

    public void put(int key, String value){
        var entry = getEntry(key);
        if (entry!=null){
            entry.value = value;
            return;
        }

        var bucket = entries[hash(key)];
        if (bucket==null)
            entries[hash(key)] = new LinkedList<>();

        entries[hash(key)].add(new Entry(key, value));

//        getOrCreateBucket(key).add(new Entry(key, value));
    }

    public String get(int key){
        var entry = getEntry(key);
        return (entry==null) ? null : entry.value;
    }

    public void remove(int key){
        var entry = getEntry(key);

        if (entry==null) throw new IllegalStateException();
        getBucket(key).remove(entry);
    }

    private LinkedList<Entry> getOrCreateBucket(int key){
        int index = hash(key);
        var bucket = entries[index];
        if (bucket==null)
            entries[index] = new LinkedList<>();

        return bucket;
    }

    private LinkedList<Entry> getBucket(int key){
        return entries[hash(key)];
    }

    private Entry getEntry(int key){
        var bucket = getBucket(key);
        if (bucket!=null){
            for (var entry:bucket){
                if (entry.key==key){
                    return entry;
                }
            }
        }
        return null;
    }

    private int hash(int key){
        return key % entries.length;
    }

    @Override
    public String toString() {
        StringBuilder el = new StringBuilder("{ ");
        for (var entry:entries){
            if (entry==null) continue;
            for (var bucket:entry){
                el.append(bucket.key).append(" : ").append(bucket.value).append(" ");
            }
        }
        el.append("}");
        return el.toString();
    }
}
