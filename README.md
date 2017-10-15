# Android_MenuRes
访问Android Menu菜单资源

```java
/**
 * 菜单Menu资源包含选项菜单Option Menu和上下文菜单Context Menu。
 *
 * 上下文菜单：
 * 1、在menu目录下定义菜单资源文件
 * 2、为组件注册上下文菜单
 * 3、重写onCreateContextMenu()
 * 4、重写onContextItemSelected()，并return true
 *
 * 运行程序，在TextView上长按不放，将弹出上下文菜单，选择菜单项即可改变颜色
 */
 
/**
 * 菜单Menu资源包含选项菜单Option Menu和上下文菜单Context Menu。
 *
 * 选项菜单：
 * 1、在menu目录下定义菜单资源文件
 * 2、重写onCreateOptionsMenu()，并return true
 * 3、重写onOptionsItemSelected()，并return true
 */
```
![](https://github.com/ykevinyou/Android_MenuRes/blob/master/screenshot/%E4%B8%8A%E4%B8%8B%E6%96%87%E8%8F%9C%E5%8D%95.png "上下文")
</br>
![](https://github.com/ykevinyou/Android_MenuRes/blob/master/screenshot/%E9%80%89%E9%A1%B9%E8%8F%9C%E5%8D%951.png)
![](https://github.com/ykevinyou/Android_MenuRes/blob/master/screenshot/%E9%80%89%E9%A1%B9%E8%8F%9C%E5%8D%952.png)
