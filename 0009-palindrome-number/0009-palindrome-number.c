bool isPalindrome(int x){
  int temp = x;
  long rev = 0;

  if(x < 0){
    return false;
  }

  while(temp != 0){
    rev = rev * 10 + temp % 10;
    temp /= 10;
  }
  return rev == x;
}