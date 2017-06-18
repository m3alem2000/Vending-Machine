# Vending-Machine

Inventory of products and coins are created one time when the program first run. The design of this vending machine is built on sequence of events.
1. You start off with product selection. If you select a product that has zero quantity, it will tell you item is sold out. and if all item has zero quantity, it will tell you machine is out of order.
2. Once you select a product, and you know what the price is, you are prompted to Insert Coin.
3. For insertng coins, I created a random coin generator that have four choices (Quarter, Dime, Nickle, and Penny). Penny represent a coin that is not acceptable, so it could be any coin that does not fall within the diameter/weight of an acceptable coin. If penny is inserted, it will get returned. Machine will only accept Quarters, Dimes, and Nickles. The generator uses weight and diameter values and pass it to the CoinValue class where it will get assigned its value. If machine has no coins to return back, it will tell you Exact Change Only. All inserted coins will be added to the coin inventory or it will be subtracted upon return to customer. Once you insert money equal or more to the price of the item, you order will be finished, product dispense and change retured. The machine will display again select item.
