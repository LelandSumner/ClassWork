public static int [] vowelCount(String str) {
   int [] count = new int[5];
   for (int i = 0; i < str.length(); i++) {
       char c = str.charAt(i);
       if (c == 'a')
          count[0]++;
       else if (c == 'e')
          count[1]++;
       else if (c == 'i')
          count[2]++;
       else if (c == 'o')
          count[3]++;
       else if (c == 'u')
          count[4]++;
   }
   return count;
}
