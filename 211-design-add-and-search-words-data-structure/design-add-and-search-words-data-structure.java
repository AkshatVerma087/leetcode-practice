class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isComplete;

    TrieNode() {
        isComplete = false;
    }
}
class WordDictionary {
    TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }
    
    public void addWord(String word) {
        TrieNode node = root;
        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int idx = ch - 'a';

            if(ch != '.' && node.children[idx] == null) node.children[idx] = new TrieNode();

            node = node.children[idx];
        }
        node.isComplete = true;
    }

    public boolean search(String word) {
        return searchHelper(word, root);
    }
    
    public boolean searchHelper(String word, TrieNode root) {
        TrieNode node = root;
        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(ch == '.') {
                for(TrieNode c : node.children) {
                    if(c != null && searchHelper(word.substring(i+1), c)) return true;
                }

                return false;
            }
            int idx = ch - 'a';

            if(node.children[idx] == null) return false;

            node = node.children[idx];
        }

        return node.isComplete;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */