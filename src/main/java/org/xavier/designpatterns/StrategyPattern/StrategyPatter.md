# Strategy Pattern
1. Basically it's all about abstraction and probably dependency injection.
2. When you have a family of algorithms ,and you want to encapsulate each one.Meanwhile,you wanna use them interchangeably,`Strategy Pattern`is for you.
3. Basically you just abstract a method to an interface,and inject that interface(constructor or setter or whatsoever),and invoke the method that the specific interface has.

> Strategy Pattern is very alike the **Bridge Pattern** which has two hierarchies.


> That means you have an abstraction that has another 
> abstraction,so you can pair any concretion of the first 
> abstraction with any concretion of the second abstraction.
 