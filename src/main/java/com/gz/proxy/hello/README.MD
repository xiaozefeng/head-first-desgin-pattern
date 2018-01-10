# RMI Remote Method Invocation 远程方法调用

## 制作远程服务
1. 制作远程接口  
`public interface MyRemote extends Remote{`

2. 制作远程实现  
`public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {`

3. 产生`stub` 和 `skeleton`  
`Naming.rebind("RemoteHello", new MyRemoteImpl());`

4. 启动 rmiregistry  
`rmiregistry &`

5. 开始远程服务  
进入classes目录   
cd ~/head-first-desgin-pattern/target/classes
`java com.gz.proxy.gumball.MyRemoteImpl &`

## 客户端调用
1. 从rmiregistry 发现服务  
`MyRemote remote = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");`

2. 调用服务  
`java com.gz.proxy.gumball.MyRemoteClient`