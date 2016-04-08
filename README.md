#Main function

1.  发送消息的是 payload 是Foo，且Foo 的value为hi
1.   经过FooToBarConverter 转换，将Foo值转为Bar类型，且Bar 的 value 是hi
1.   经过SampleTransform转换，将Bar的value值，更高为HI
1.    接受到的消息为Bar 类型，值为 HI