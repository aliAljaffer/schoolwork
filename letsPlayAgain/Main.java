class Main {
  public static void main(String[] args) {
    Player p = new Player("Bob", 95, 50);
    System.out.println(p);
    p.eat();
    if (p.canAfford(50)) {   
      p.spendCoins(50);
    }
    System.out.println(p);
  }
}
