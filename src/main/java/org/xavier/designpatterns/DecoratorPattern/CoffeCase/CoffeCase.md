# In a nutshell
1. Decorator Pattern uses `has a` and `is a` .
2. For example BeverageDecorator `is a` AbstractBeverage bcz it extends or implements `AbstractBeverage`.While at the same time,**Beverage Decorator** `has a` instance of **AbstractBeverage**
3. So when you wanna decorate something ,you actually new an instance of the implementation of the `BeverageDecorator` with an object of `AbstractBeverage` as the param of constructor and take it as `AbstractBeverage`
4. 