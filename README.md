# test-cicd

## Github Actions & AWS CodeDeploy 테스트

### 배포 flow
1. github push event 발생 -> AWS S3 `.zip` 파일 전송
2. AWS CodeDeploy에 배포 요청
3. AWS S3의 `.zip`을 AWS EC2에 전달
4. AWS CodeDeploy가 EC2의 `appspec.yml` 읽어서 빌드 파일 실행