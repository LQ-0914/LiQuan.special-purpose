package com.qa.SpringBoot.Configuration;

import java.io.FileWriter;
import java.io.IOException;

import org.springframework.context.annotation.Configuration;

@Configuration
public class AlipayConfig{

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
			public static String app_id = "2021000117636237";
			
			// 商户私钥，您的PKCS8格式RSA2私钥
		    public static String merchant_private_key ="MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCG3cCKPTeI8hNL+HRifqmFUG8q3+xpKboK/Hx03V6UNkjwhl0uxJZL4v4+3maSHRvxc0SFB5g4efUCGxx+bv0d5Z3sY4qEUiRRSDUXz/E7N1wd47RlK+cXtQ2xLrlrBa7ExE2LDRk9Cjagb2/8ocN6U7sFL8YG5JwqIRZ3Qq0IVXX4MDSZB1vH4n4w18oHAHBzECq/+j5k8CLyC/MxuNfZ9xMfKczVwro6SIe4mTRIqMFaCA4NyWjPB3zXpJrYIktJgsAMNzibl0S9ONvCoWiS06sz7yFkPVWRKjV9D3no8boykqcqxRITRxn9HszbDtOJ9ncwtil1y3AD6RtsyKX/AgMBAAECggEAJI3IGO/ctIaASnAOA4A3LEYPy3wj1KEVptKmXPp/HwbToDWa3gk0f18H8DxRarrvDvNiF/hl/rC3gpmckHw+qLLKqf6U1aZ553n9wfV/ecBYfFVyWJWcriVJj8ONR/+jTfuy1MR5Gb1B7xwlK0Eg/W/iWdaIAuhFl3meYDa3NXGlml4SluI03qspGTuVTpofvMSUHwfmm2ZNkfziPWflbnIXTWSlKMFzhMhRugjcleC/b8oJW7mUEqVSqzKDl3U8rHX94swdUP3PpVPVqI3NuOqgYqYkOoKx20/FUe1CZU+XY2+nnANg+kqjnzE/lSolSJNHurROHXdwicgHCT5bIQKBgQDjiLeQjqdrhEA6KEMDYpSWuR5D48vYH0VPqMOw0mxLDwZIk+SM//z1TvrHjfgSINAb/ACHhY7UiyjlukaCzVVLdPb3CGhw7yvJgy8yqLZMgPnLs6m+aafYjZ9zETJfu4YWLhwpRQqutUcirPclsdXDweGfB10yucNCXIbzalaITwKBgQCXvSRf4wwi7JIVnwv767JdCROZPidQY/K6JcdtY0oHvIVlkRRMXiFApIOv9lz0sIoCebGOUWvFKWdE26kj3/TYuHKPKxDi1qyHIQapvoLOYPfCV3aP5D8Y/p5WE5FKZEXMljXpOmm9JOe2QoXlajIuQKTYMMiaAtgsBaiPuonrUQKBgGjKY3hRKuwKiaX/OvXJJhPQiA7OT+hmZn6MhCvgjX14GvW8HyuNDgxQZpEXYmO+9vmccwX3TdO3j4tV4fmF5b2Nzdvx5F/21tzE7SzQpLzRPbpCMW//qwzCFOhiyCds7xEyBUhAgu35kRx4Oo8CuyegGHAsbRDamwHqKUDb/aRjAoGAU8sobic0yYh4t6Xn+UtUaRodD5AKJ9O589/u/FJLTHBn/gma+v00Qb1X13EmLh3baLiJO71s1SkjFRx0kBIZ5SAeaz9uCMZh6hFr24sQMyXLTC/+kkGKMqRRDdmqbzlmbi85QD14rPHXX4fm5yS451/daGGwNZSCifTp+80YYrECgYEAtqdmiU33kYadZNn3Xo9UqRtViUIi1PN3TY4/9h3mT3+bBTDLyPJupKQka+v8ZBQiASmfeRTf+FznRXqST5sPA/evT5q3u3kVrx0r5YAPWfImhR2izhrcdx42cvLMdH3HthyZdbvQTG8EoL4zbwAmJzPxZCAYh+tBq6x6nzap87M=";
			// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
		    public static String alipay_public_key ="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAweT873/m4wnUfZXilVIn1JrwqUmu2wUkJB5bBSG+6l+hRG8VmPbdhLi0J0PBTt8JA+Bh9/VjhPFdM5gQYjlepFjbiiRpv/0wlt96s/a1J+bDgCESpNt0wLgzhNLc9BSnOKbscgSEz7Co9ikmfDElq3VWFNjuyDNUpYCJy3hPvHYhoXxul7mdoNIoV4ev7rqO8u7d1nzygy2iKBS/3C5HE3iPGpcnDyGCa2MNC2SD1ulUevDfSGyHIo7aVIPuluQrTVT5ceze6W/Fx1D3J3gX6HSCUrBrqsbcdxLMdAMDEhcoyoQCCZYXHjYs9QJkR41aIk4Vr+USIHg8MJZlu9YB1wIDAQAB";
			// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
			public static String notify_url = "http://localhost:8081/payMonneyController/su";

			// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
			public static String return_url = "http://localhost:8081/payMonneyController/su";

			// 签名方式
			public static String sign_type = "RSA2";
			
			// 字符编码格式
			public static String charset = "utf-8";
			
			// 支付宝网关
			public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
			
			// 支付宝网关
			public static String log_path = "C:\\";


		//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

		    /** 
		     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
		     * @param sWord 要写入日志里的文本内容
		     */
		    public static void logResult(String sWord) {
		        FileWriter writer = null;
		        try {
		            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
		            writer.write(sWord);
		        } catch (Exception e) {
		            e.printStackTrace();
		        } finally {
		            if (writer != null) {
		                try {
		                    writer.close();
		                } catch (IOException e) {
		                    e.printStackTrace();
		                }
		            }
		        }
		    }
		

		  
		  
		  
		  
		  
		  
	  }
	
	
	
	
	
	
	
	
	

