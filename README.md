# springboot1.5.x velocity2
springboot maven 搭建

springboot1.5以上因不支持velocity

不过此工程配置可支持velocity

问题的核心在于高版本的springboot未注入spring-context-support,因此只需在pom中添加即可
        <!--velocity配置-->
        		<dependency>
        			<groupId>org.apache.velocity</groupId>
        			<artifactId>velocity</artifactId>
        			<version>1.7</version>
        		</dependency>
        		<dependency>
        			<groupId>org.apache.velocity</groupId>
        			<artifactId>velocity-tools</artifactId>
        			<version>${velocity.tools.version}</version>
        		</dependency>
        		<dependency>
        			<groupId>org.springframework</groupId>
        			<artifactId>spring-context-support</artifactId>
        			<version>4.3.14.RELEASE</version>
        		</dependency>
        <!---->



>本项目根据 http://download.csdn.net/download/qq_30023773/10032465
>提供的gradle版改编而来
>github地址：https://github.com/liuzhaohong/springboot
