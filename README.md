# bootdo
基于sprintboot的博客系统

支持helm部署

## 部署方式
1、构建镜像

docker build .

2、修改deploy\helm下的vlaues.yaml文件

将镜像仓库和镜像名及版本号修改为自己的

3、helm部署

helm install bootdo . -n 分区名称
