//
//public static int solve(int[] coins, int total){
//  //solve for each value 0 to total
//
//  int[] solved = new int[total + 1];
//
//  //coins needed to reach value of 0
//
//  solved[0] = 0;
//  for(int i = 1; i < solved.length; i++){
//    solved[i] = -1;
//  }
//  for(int i = 1; i  solved.length; i++){
//
//      int minCoins = -1;
//
//      for(int j = 0; j < coins.length; j++){
//        if(coins[j] > i){
//          continue;
//        }else if(coins[j] == i){
//          minCoins = 1;
//          break;
//        }else{
//          if(minCoins == -1){
//            minCoins = 1 + solved[i - coins[j]];
//          }else{
//            minCoins = Math.min(minCoins, 1 + solved[i - coins[j]]);
//          }
//        }
//      }
//      solved[i] = minCoins;
//  }
//  return solved[solved.length -1];
//}
