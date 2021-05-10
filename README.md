# showKeyBoard
监听键盘输入指令

代码很简单，引用了NativeHook得JNI工具，加上了全局键盘监听的事件，细看源码分析即可。
## v1.0
### 描述
监听输入指令，显示到黑幕上，通过每次键盘的press 和 release 将按下和释放的按键从容器中插入取出，并且每次遍历容器进行显示。
### 效果图
<a href='http://cdn.zjhwork.xyz/vsfileserver/2105091739422236859.png' target="_blank"><img src='http://cdn.zjhwork.xyz/vsfileserver/2105091739422236859.png'></a>
### jar包地址
<a href="http://cdn.zjhwork.xyz/vsfileserver/2105101322341834266.jar" target="_blank">点击下载v1.0</a>
## v2.0 
### 描述
在`v1.0`的基础上，绘制了键盘图，每次按压和释放会修改键盘的底色和文字颜色，达到按下的效果，如果出现绘制卡顿的情况，则通过按下小键盘的`-`清除卡顿的按钮。
### 效果图
<a href='http://cdn.zjhwork.xyz/vsfileserver/2105091740131921687.png' target="_blank"><img src='http://cdn.zjhwork.xyz/vsfileserver/2105091740131921687.png'></a>
### jar包地址
<a href="http://cdn.zjhwork.xyz/vsfileserver/2105101322532971244.jar" target="_blank">点击下载v2.0</a>

## v3.0
### 描述
在`v2.0`的基础上，加入了图片，通过每次按压，重新绘制JPanel的背景图，达到猫咪点击的效果  
### 演示地址
<a href="http://cdn.zjhwork.xyz/vsfileserver/2105101316846289848.mp4" target="_blank">敲击演示</a>
### jar包地址
<a href="http://cdn.zjhwork.xyz/vsfileserver/2105101322701963714.jar" target="_blank">点击下载v3.0</a>
