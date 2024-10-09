package com.gyakhoe.algomap.medium;

import java.util.HashMap;
import java.util.Map;

public class ImplementTrieSolution {

    private class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        boolean isEndOfWord = false;
    }

    private TrieNode root;

    public ImplementTrieSolution() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        for(char c : word.toCharArray()){
            node.children.putIfAbsent(c, new TrieNode());
            node = node.children.get(c);
        }
        node.isEndOfWord = true;
    }

    public boolean search(String word) {
        TrieNode node = root;
        for(char c: word.toCharArray()){
            if(!node.children.containsKey(c)){
                return false;
            }
            node = node.children.get(c);
        }
        return node.isEndOfWord;
    }

    public boolean startsWith(String prefix){
        TrieNode node = root;
        for(char c: prefix.toCharArray()){
            if(!node.children.containsKey(c)){
                return false;
            }
            node = node.children.get(c);
        }
        return true;
    }
}
