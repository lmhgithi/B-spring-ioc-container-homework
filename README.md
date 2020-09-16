## 主观题：
@Component 已经可以支持声明一个 bean 了，为何还要再弄个 @Bean 出来？

## 回答
两者的区别是：@Component可以让Spring自动扫描到，并且让Spring自己创建一个Bean，而@Bean是直接告诉Spring这就是一个Bean。

那么如果想将第三方的类变成组件，你又没有没有源代码，也就没办法使用@Component进行自动配置，这种时候使用@Bean就比较合适了。
