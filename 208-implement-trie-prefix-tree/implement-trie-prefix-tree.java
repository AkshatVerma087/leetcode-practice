class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isComplete;

    TrieNode() {
        isComplete = false;
    }
}

class Trie {
    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;

        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int idx = ch - 'a';

            if(node.children[idx] == null) {
                node.children[idx] = new TrieNode();
            }

            node = node.children[idx];
        }

        node.isComplete = true;
    }

    public boolean search(String word) {
        TrieNode node = root;

        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int idx = ch - 'a';

            if(node.children[idx] == null) {
                return false;
            }

            node = node.children[idx];
        }

        return node.isComplete;
    }

    public boolean startsWith(String prefix) {
        TrieNode node = root;

        for(int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            int idx = ch - 'a';

            if(node.children[idx] == null) {
                return false;
            }

            node = node.children[idx];
        }

        return true;
    }
}