package net.qzlife.call;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// 掃描 mybatis mapper 包路徑
@MapperScan(basePackages = "net.azlife.call.mapper")
// 扫描 所有額外需要的包時重寫該註解, 包含一些自用的工具类包 所在的路径
@ComponentScan(basePackages = { "net.qzlife.call", "org.n3r.idworker" })
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
