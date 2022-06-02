# /bin/sh
docker build  -t  bootdo:v1.0.0 .
docker tag bootdo:v1.0.0 10.10.101.22:8443/middleware/bootdo:v1.0.0
docker push 10.10.101.22:8443/middleware/bootdo:v1.0.0