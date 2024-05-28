#Information on the contents of the files.

The src and target files are from the spring boot API i started working on. However I ended up switching to AWS Gateway API as it was easier to implement with the AWS services we were using such as dynamodb, cognito, and s3. Git did not let me upload the full Maven Springboot folder so I just uploaded the src and target folders. 

The medidocapi-medidoc-oas30.json has the code for the AWS gateway API in it, and the Lmabda code file contains the code that the gateway API uses to get / put / delete / etc data from s3 and dynamboDB.
