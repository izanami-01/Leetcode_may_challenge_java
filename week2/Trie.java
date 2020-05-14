class Trie {
    private Trie child[];
    private boolean isEndOfWord;
    
    /** Initialize your data structure here. */
    public Trie() {
        child = new Trie[26];
        isEndOfWord = false;
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        Trie current = this;
        for(char c : word.toCharArray()){
            if((current.child[c-'a'])==null)
                current.child[c-'a'] = new Trie();
                current  = current.child[c-'a'];
            }
        current.isEndOfWord = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Trie current = this;
        for(char c : word.toCharArray()){
            current = current.child[c-'a'];
            if(current==null)
                return false;
            }
        if(current.isEndOfWord)
            return true;
        return false;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
         Trie current = this;
        for(char c : prefix.toCharArray()){
            current = current.child[c-'a'];
            if(current==null)
                return false;
            }
       return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */