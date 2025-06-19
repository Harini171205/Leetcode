class Solution {
    public String defangIPaddr(String address) {
        String[] s = address.split("\\.");
        address = String.join("[.]",s);
        return address;
    }
}