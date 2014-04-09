test
====

test repository, you can practice push/pull ops here

This is a repository for test. Just do anything you want
to do to learn how to use GitHub.

To learn about Github, you can goto
https://help.github.com/

------------------------------------------
上面一点是俞博文写的，我删了他写的下面的东西，改成了一个简单的介绍。
当然，网上使用git的讲解非常多，大家自己搜搜看看，我这里简单提示一点

常用操作:
1 pull：运行pull --all命令，pull的意思是哪，也就是把远程服务器上的东西全部同步到我的本地机器上，
这样别人写的代码（我没有的）自动加到我的工程里了。
任何时候你想获得服务器上的最新代码，就运行pull。一般 每天工作之前会pull一下

2.提交
如果是用GitHub有界面的那个，直接写上备注，点一下就提交了并同步了。
如果用命令行提交，分两步：
先运行 git add(add --all 或 add the-file-or-folder-you-want-to-add)。如果反悔了，运行git reset head取消
再运行 git commit --all -m'在这里写备注，例如：这次提交的代码是XXX包里的YYY，主要是完成了ZZZ功能，修复了XXX bug'
这样就把代码提交了

3.push： 代码提交后，只是存在本地磁盘上，别人用不到，要同步到服务器上，
运行git push --all 就把你本地的所有提交全部同步到服务器，即Github上了，这样大家运行pull时，就能把你push的代码拉到自己的机器上了。

4.常见错误
有时大家push时会报错“（）&%￥##%^$@pull)(*&”，注意其中有个pull
那是因为服务器上有新的东东了，而你还没pull到自己这，所以此时要先pull，把你没有的取过来，再push自己新加的。
如果pull来的东西与自己有冲突怎么办？请看下一篇

5.冲突了怎么办：
例如
第一天，大包在 com.bitranger.example.practice.bjt 里写了一个类
class ThisIsMyClassDoNotTouchIT {\
	String motto = "大包是神";\
}\
然后他push到服务器上了。

第二天，川神运行pull，把大包的代码同步到自己的工程里了，并将大包的类改成了
class ThisIsMyClassDoNotTouchIT {\
	String motto = "大包是屎";\
}\
然后川神首先把这段代码push到github上。

第三天，大包又把自己的类改成了这样\
class ThisIsMyClassDoNotTouchIT {\
	String motto = "大包是万物的神"\
}\
然后他运行push，就出错了，因为他的代码和服务器上的不同，这时就需要两个人自己协调一下了。

所以大家写代码时各自在各自的一亩三分地里写，如果要改动别人负责的包，要先商量好。

一般的情况是，一个repository由一个人控制（例如linux由Linus Torvalds控制），其他人动不了，
的开发者有改动，要向那个负责的人发pull request，再由负责人把别人的改动pull过来。

但是这样太麻烦了，所以我把这个repository设成writable的，组内的人都能写，不用向我发pull request








