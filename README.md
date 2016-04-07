The console export:

	keryhudeMacBook-Pro:transformer-converter hushuming$ java -jar transformer-converter-0.0.1-SNAPSHOT.jar
	Error: Unable to access jarfile transformer-converter-0.0.1-SNAPSHOT.jar
	keryhudeMacBook-Pro:transformer-converter hushuming$ java -jar target/transformer-converter-0.0.1-SNAPSHOT.jar
	2016-04-07 19:19:38.353  INFO 76016 --- [           main] s.c.a.AnnotationConfigApplicationContext : Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@780e82c1: startup date [Thu Apr 07 19:19:38 CST 2016]; root of context hierarchy
	2016-04-07 19:19:38.803  INFO 76016 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'configurationPropertiesRebinderAutoConfiguration' of type [class org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration$$EnhancerBySpringCGLIB$$2b605a94] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
	
	  .   ____          _            __ _ _
	 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
	( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
	 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
	  '  |____| .__|_| |_|_| |_\__, | / / / /
	 =========|_|==============|___/=/_/_/_/
	 :: Spring Boot ::        (v1.3.3.RELEASE)
	
	2016-04-07 19:19:39.210  INFO 76016 --- [           main] demo.Application                         : No active profile set, falling back to default profiles: default
	2016-04-07 19:19:39.232  INFO 76016 --- [           main] ationConfigEmbeddedWebApplicationContext : Refreshing org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@110206e9: startup date [Thu Apr 07 19:19:39 CST 2016]; parent: org.springframework.context.annotation.AnnotationConfigApplicationContext@780e82c1
	2016-04-07 19:19:40.436  INFO 76016 --- [           main] o.s.b.f.config.PropertiesFactoryBean     : Loading properties file from URL [jar:file:/Users/hushuming/Desktop/git-repo/spring-cloud-stream/transform-converter/spring-stream/transformer-converter/target/transformer-converter-0.0.1-SNAPSHOT.jar!/lib/spring-integration-core-4.2.5.RELEASE.jar!/META-INF/spring.integration.default.properties]
	2016-04-07 19:19:40.442  INFO 76016 --- [           main] o.s.i.config.IntegrationRegistrar        : No bean named 'integrationHeaderChannelRegistry' has been explicitly defined. Therefore, a default DefaultHeaderChannelRegistry will be created.
	2016-04-07 19:19:40.594  INFO 76016 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Overriding bean definition for bean 'beanNameViewResolver' with a different definition: replacing [Root bean: class [null]; scope=; abstract=false; lazyInit=false; autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration$WhitelabelErrorViewConfiguration; factoryMethodName=beanNameViewResolver; initMethodName=null; destroyMethodName=(inferred); defined in class path resource [org/springframework/boot/autoconfigure/web/ErrorMvcAutoConfiguration$WhitelabelErrorViewConfiguration.class]] with [Root bean: class [null]; scope=; abstract=false; lazyInit=false; autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration$WebMvcAutoConfigurationAdapter; factoryMethodName=beanNameViewResolver; initMethodName=null; destroyMethodName=(inferred); defined in class path resource [org/springframework/boot/autoconfigure/web/WebMvcAutoConfiguration$WebMvcAutoConfigurationAdapter.class]]
	2016-04-07 19:19:41.114  INFO 76016 --- [           main] o.s.cloud.context.scope.GenericScope     : BeanFactory id=769ec5ae-64e7-35b2-bd12-4f5ffb92a733
	2016-04-07 19:19:41.132  INFO 76016 --- [           main] faultConfiguringBeanFactoryPostProcessor : No bean named 'errorChannel' has been explicitly defined. Therefore, a default PublishSubscribeChannel will be created.
	2016-04-07 19:19:41.137  INFO 76016 --- [           main] faultConfiguringBeanFactoryPostProcessor : No bean named 'taskScheduler' has been explicitly defined. Therefore, a default ThreadPoolTaskScheduler will be created.
	2016-04-07 19:19:41.269  INFO 76016 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.stream.config.ChannelBindingServiceConfiguration$PostProcessorConfiguration' of type [class org.springframework.cloud.stream.config.ChannelBindingServiceConfiguration$PostProcessorConfiguration$$EnhancerBySpringCGLIB$$58d96a43] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
	2016-04-07 19:19:41.533  INFO 76016 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'messageBuilderFactory' of type [class org.springframework.integration.support.DefaultMessageBuilderFactory] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
	2016-04-07 19:19:41.544  INFO 76016 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'converterConfig' of type [class demo.converter.ConverterConfig$$EnhancerBySpringCGLIB$$db1cd45] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
	2016-04-07 19:19:41.563  INFO 76016 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'fooConverter' of type [class demo.converter.FooToBarConverter] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
	2016-04-07 19:19:41.592  INFO 76016 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.stream.config.ChannelBindingServiceConfiguration' of type [class org.springframework.cloud.stream.config.ChannelBindingServiceConfiguration$$EnhancerBySpringCGLIB$$c299e9d] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
	2016-04-07 19:19:41.617  INFO 76016 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'compositeMessageConverterFactory' of type [class org.springframework.cloud.stream.converter.CompositeMessageConverterFactory] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
	2016-04-07 19:19:41.726  INFO 76016 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration' of type [class org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration$$EnhancerBySpringCGLIB$$2b605a94] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
	2016-04-07 19:19:41.751  INFO 76016 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.autoconfigure.RefreshEndpointAutoConfiguration' of type [class org.springframework.cloud.autoconfigure.RefreshEndpointAutoConfiguration$$EnhancerBySpringCGLIB$$5e3e55ca] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
	2016-04-07 19:19:42.267  INFO 76016 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat initialized with port(s): 8081 (http)
	2016-04-07 19:19:42.289  INFO 76016 --- [           main] o.apache.catalina.core.StandardService   : Starting service Tomcat
	2016-04-07 19:19:42.291  INFO 76016 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.0.32
	2016-04-07 19:19:42.460  INFO 76016 --- [ost-startStop-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
	2016-04-07 19:19:42.460  INFO 76016 --- [ost-startStop-1] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 3228 ms
	2016-04-07 19:19:43.035  INFO 76016 --- [ost-startStop-1] o.s.b.c.e.ServletRegistrationBean        : Mapping servlet: 'dispatcherServlet' to [/]
	2016-04-07 19:19:43.042  INFO 76016 --- [ost-startStop-1] o.s.b.c.embedded.FilterRegistrationBean  : Mapping filter: 'metricFilter' to: [/*]
	2016-04-07 19:19:43.042  INFO 76016 --- [ost-startStop-1] o.s.b.c.embedded.FilterRegistrationBean  : Mapping filter: 'characterEncodingFilter' to: [/*]
	2016-04-07 19:19:43.043  INFO 76016 --- [ost-startStop-1] o.s.b.c.embedded.FilterRegistrationBean  : Mapping filter: 'hiddenHttpMethodFilter' to: [/*]
	2016-04-07 19:19:43.043  INFO 76016 --- [ost-startStop-1] o.s.b.c.embedded.FilterRegistrationBean  : Mapping filter: 'httpPutFormContentFilter' to: [/*]
	2016-04-07 19:19:43.043  INFO 76016 --- [ost-startStop-1] o.s.b.c.embedded.FilterRegistrationBean  : Mapping filter: 'requestContextFilter' to: [/*]
	2016-04-07 19:19:43.043  INFO 76016 --- [ost-startStop-1] o.s.b.c.embedded.FilterRegistrationBean  : Mapping filter: 'webRequestLoggingFilter' to: [/*]
	2016-04-07 19:19:43.043  INFO 76016 --- [ost-startStop-1] o.s.b.c.embedded.FilterRegistrationBean  : Mapping filter: 'applicationContextIdFilter' to: [/*]
	2016-04-07 19:19:43.247  INFO 76016 --- [           main] o.s.b.f.config.PropertiesFactoryBean     : Loading properties file from URL [jar:file:/Users/hushuming/Desktop/git-repo/spring-cloud-stream/transform-converter/spring-stream/transformer-converter/target/transformer-converter-0.0.1-SNAPSHOT.jar!/lib/spring-integration-core-4.2.5.RELEASE.jar!/META-INF/spring.integration.default.properties]
	2016-04-07 19:19:43.264  INFO 76016 --- [           main] o.s.integration.channel.DirectChannel    : Channel 'application:8081.input' has 1 subscriber(s).
	2016-04-07 19:19:43.276  INFO 76016 --- [           main] o.s.integration.channel.DirectChannel    : Channel 'application:8081.sample-sink' has 1 subscriber(s).
	2016-04-07 19:19:43.484  INFO 76016 --- [           main] o.s.s.c.ThreadPoolTaskScheduler          : Initializing ExecutorService  'taskScheduler'
	2016-04-07 19:19:43.681  INFO 76016 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : Looking for @ControllerAdvice: org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@110206e9: startup date [Thu Apr 07 19:19:39 CST 2016]; parent: org.springframework.context.annotation.AnnotationConfigApplicationContext@780e82c1
	2016-04-07 19:19:43.853  INFO 76016 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.BasicErrorController.error(javax.servlet.http.HttpServletRequest)
	2016-04-07 19:19:43.854  INFO 76016 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],produces=[text/html]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
	2016-04-07 19:19:43.916  INFO 76016 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
	2016-04-07 19:19:43.916  INFO 76016 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
	2016-04-07 19:19:43.987  INFO 76016 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**/favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
	2016-04-07 19:19:45.005  INFO 76016 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/env],methods=[POST]}" onto public java.lang.Object org.springframework.cloud.context.environment.EnvironmentManagerMvcEndpoint.value(java.util.Map<java.lang.String, java.lang.String>)
	2016-04-07 19:19:45.005  INFO 76016 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/env/reset],methods=[POST]}" onto public java.util.Map<java.lang.String, java.lang.Object> org.springframework.cloud.context.environment.EnvironmentManagerMvcEndpoint.reset()
	2016-04-07 19:19:45.006  INFO 76016 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/pause || /pause.json],methods=[POST]}" onto public java.lang.Object org.springframework.cloud.endpoint.GenericPostableMvcEndpoint.invoke()
	2016-04-07 19:19:45.007  INFO 76016 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/dump || /dump.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
	2016-04-07 19:19:45.008  INFO 76016 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/configprops || /configprops.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
	2016-04-07 19:19:45.011  INFO 76016 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/env/{name:.*}],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EnvironmentMvcEndpoint.value(java.lang.String)
	2016-04-07 19:19:45.011  INFO 76016 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/env || /env.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
	2016-04-07 19:19:45.012  INFO 76016 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/info || /info.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
	2016-04-07 19:19:45.012  INFO 76016 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/mappings || /mappings.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
	2016-04-07 19:19:45.013  INFO 76016 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/refresh || /refresh.json],methods=[POST]}" onto public java.lang.Object org.springframework.cloud.endpoint.GenericPostableMvcEndpoint.invoke()
	2016-04-07 19:19:45.014  INFO 76016 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/metrics/{name:.*}],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.MetricsMvcEndpoint.value(java.lang.String)
	2016-04-07 19:19:45.014  INFO 76016 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/metrics || /metrics.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
	2016-04-07 19:19:45.015  INFO 76016 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/restart || /restart.json],methods=[POST]}" onto public java.lang.Object org.springframework.cloud.context.restart.RestartMvcEndpoint.invoke()
	2016-04-07 19:19:45.016  INFO 76016 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/channels || /channels.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
	2016-04-07 19:19:45.017  INFO 76016 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/beans || /beans.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
	2016-04-07 19:19:45.017  INFO 76016 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/resume || /resume.json],methods=[POST]}" onto public java.lang.Object org.springframework.cloud.endpoint.GenericPostableMvcEndpoint.invoke()
	2016-04-07 19:19:45.019  INFO 76016 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/autoconfig || /autoconfig.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
	2016-04-07 19:19:45.020  INFO 76016 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/health || /health.json],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.HealthMvcEndpoint.invoke(java.security.Principal)
	2016-04-07 19:19:45.021  INFO 76016 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/trace || /trace.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
	2016-04-07 19:19:45.184  INFO 76016 --- [           main] o.s.i.codec.kryo.CompositeKryoRegistrar  : configured Kryo registration [40, java.io.File] with serializer org.springframework.integration.codec.kryo.FileSerializer
	2016-04-07 19:19:45.331  INFO 76016 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
	2016-04-07 19:19:45.347  INFO 76016 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'integrationMbeanExporter' has been autodetected for JMX exposure
	2016-04-07 19:19:45.349  INFO 76016 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'configurationPropertiesRebinder' has been autodetected for JMX exposure
	2016-04-07 19:19:45.350  INFO 76016 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'refreshEndpoint' has been autodetected for JMX exposure
	2016-04-07 19:19:45.351  INFO 76016 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'restartEndpoint' has been autodetected for JMX exposure
	2016-04-07 19:19:45.352  INFO 76016 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'refreshScope' has been autodetected for JMX exposure
	2016-04-07 19:19:45.353  INFO 76016 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'environmentManager' has been autodetected for JMX exposure
	2016-04-07 19:19:45.356  INFO 76016 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'environmentManager': registering with JMX server as MBean [org.springframework.cloud.context.environment:name=environmentManager,type=EnvironmentManager]
	2016-04-07 19:19:45.386  INFO 76016 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'restartEndpoint': registering with JMX server as MBean [org.springframework.cloud.context.restart:name=restartEndpoint,type=RestartEndpoint]
	2016-04-07 19:19:45.410  INFO 76016 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'refreshScope': registering with JMX server as MBean [org.springframework.cloud.context.scope.refresh:name=refreshScope,type=RefreshScope]
	2016-04-07 19:19:45.445  INFO 76016 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'integrationMbeanExporter': registering with JMX server as MBean [org.springframework.integration.monitor:name=integrationMbeanExporter,type=IntegrationMBeanExporter]
	2016-04-07 19:19:45.498  INFO 76016 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'configurationPropertiesRebinder': registering with JMX server as MBean [org.springframework.cloud.context.properties:name=configurationPropertiesRebinder,context=110206e9,type=ConfigurationPropertiesRebinder]
	2016-04-07 19:19:45.502  INFO 76016 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'refreshEndpoint': registering with JMX server as MBean [org.springframework.cloud.endpoint:name=refreshEndpoint,type=RefreshEndpoint]
	2016-04-07 19:19:45.523  INFO 76016 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Registering beans for JMX exposure on startup
	2016-04-07 19:19:45.524  INFO 76016 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Registering MessageChannel nullChannel
	2016-04-07 19:19:45.528  INFO 76016 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Located managed bean 'org.springframework.integration:type=MessageChannel,name=nullChannel': registering with JMX server as MBean [org.springframework.integration:type=MessageChannel,name=nullChannel]
	2016-04-07 19:19:45.547  INFO 76016 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Registering MessageChannel errorChannel
	2016-04-07 19:19:45.548  INFO 76016 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Located managed bean 'org.springframework.integration:type=MessageChannel,name=errorChannel': registering with JMX server as MBean [org.springframework.integration:type=MessageChannel,name=errorChannel]
	2016-04-07 19:19:45.604  INFO 76016 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Registering MessageChannel input
	2016-04-07 19:19:45.606  INFO 76016 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Located managed bean 'org.springframework.integration:type=MessageChannel,name=input': registering with JMX server as MBean [org.springframework.integration:type=MessageChannel,name=input]
	2016-04-07 19:19:45.623  INFO 76016 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Registering MessageChannel output
	2016-04-07 19:19:45.625  INFO 76016 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Located managed bean 'org.springframework.integration:type=MessageChannel,name=output': registering with JMX server as MBean [org.springframework.integration:type=MessageChannel,name=output]
	2016-04-07 19:19:45.649  INFO 76016 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Registering MessageChannel sample-sink
	2016-04-07 19:19:45.650  INFO 76016 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Located managed bean 'org.springframework.integration:type=MessageChannel,name=sample-sink': registering with JMX server as MBean [org.springframework.integration:type=MessageChannel,name=sample-sink]
	2016-04-07 19:19:45.673  INFO 76016 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Registering MessageChannel sample-source
	2016-04-07 19:19:45.681  INFO 76016 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Located managed bean 'org.springframework.integration:type=MessageChannel,name=sample-source': registering with JMX server as MBean [org.springframework.integration:type=MessageChannel,name=sample-source]
	2016-04-07 19:19:45.706  INFO 76016 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Located managed bean 'org.springframework.integration:type=MessageHandler,name=errorLogger,bean=internal': registering with JMX server as MBean [org.springframework.integration:type=MessageHandler,name=errorLogger,bean=internal]
	2016-04-07 19:19:45.729  INFO 76016 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Located managed bean 'org.springframework.integration:type=ManagedEndpoint,name=sourceMoudle.messageSource1.inboundChannelAdapter,bean=endpoint': registering with JMX server as MBean [org.springframework.integration:type=ManagedEndpoint,name=sourceMoudle.messageSource1.inboundChannelAdapter,bean=endpoint]
	2016-04-07 19:19:45.733  INFO 76016 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Registered endpoint without MessageSource: org.springframework.integration:type=ManagedEndpoint,name=sourceMoudle.messageSource1.inboundChannelAdapter,bean=endpoint
	2016-04-07 19:19:46.137  INFO 76016 --- [           main] o.s.c.support.DefaultLifecycleProcessor  : Starting beans in phase -2147482648
	2016-04-07 19:19:46.226  INFO 76016 --- [           main] s.c.a.AnnotationConfigApplicationContext : Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@57c5993e: startup date [Thu Apr 07 19:19:46 CST 2016]; root of context hierarchy
	2016-04-07 19:19:46.249  INFO 76016 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'configurationPropertiesRebinderAutoConfiguration' of type [class org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration$$EnhancerBySpringCGLIB$$2b605a94] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
	2016-04-07 19:19:46.366  INFO 76016 --- [           main] demo.Application                         : No active profile set, falling back to default profiles: default
	2016-04-07 19:19:46.375  INFO 76016 --- [           main] s.c.a.AnnotationConfigApplicationContext : Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@162aae51: startup date [Thu Apr 07 19:19:46 CST 2016]; parent: org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@110206e9
	2016-04-07 19:19:46.538  INFO 76016 --- [           main] demo.Application                         : Started Application in 0.388 seconds (JVM running for 9.586)
	2016-04-07 19:19:46.644  INFO 76016 --- [           main] o.s.i.endpoint.EventDrivenConsumer       : Adding {message-handler:outbound.xformed} as a subscriber to the 'output' channel
	2016-04-07 19:19:46.644  INFO 76016 --- [           main] o.s.integration.channel.DirectChannel    : Channel 'application:8081.output' has 1 subscriber(s).
	2016-04-07 19:19:46.644  INFO 76016 --- [           main] o.s.i.endpoint.EventDrivenConsumer       : started outbound.xformed
	2016-04-07 19:19:46.645  INFO 76016 --- [           main] o.s.i.endpoint.EventDrivenConsumer       : Adding {message-handler:outbound.testtock} as a subscriber to the 'sample-source' channel
	2016-04-07 19:19:46.646  INFO 76016 --- [           main] o.s.integration.channel.DirectChannel    : Channel 'application:8081.sample-source' has 1 subscriber(s).
	2016-04-07 19:19:46.646  INFO 76016 --- [           main] o.s.i.endpoint.EventDrivenConsumer       : started outbound.testtock
	2016-04-07 19:19:46.647  INFO 76016 --- [           main] o.s.c.support.DefaultLifecycleProcessor  : Starting beans in phase -2147482648
	2016-04-07 19:19:46.647  INFO 76016 --- [           main] o.s.c.support.DefaultLifecycleProcessor  : Starting beans in phase 0
	2016-04-07 19:19:46.710  INFO 76016 --- [           main] o.s.i.endpoint.EventDrivenConsumer       : Adding {logging-channel-adapter:_org.springframework.integration.errorLogger} as a subscriber to the 'errorChannel' channel
	2016-04-07 19:19:46.710  INFO 76016 --- [           main] o.s.i.channel.PublishSubscribeChannel    : Channel 'application:8081.errorChannel' has 1 subscriber(s).
	2016-04-07 19:19:46.711  INFO 76016 --- [           main] o.s.i.endpoint.EventDrivenConsumer       : started _org.springframework.integration.errorLogger
	2016-04-07 19:19:46.714  INFO 76016 --- [           main] o.s.i.e.SourcePollingChannelAdapter      : started sourceMoudle.messageSource1.inboundChannelAdapter
	******************
	At the Source
	******************
	Sending value: hi of type class demo.domain.Foo
	2016-04-07 19:19:46.714  INFO 76016 --- [           main] o.s.c.support.DefaultLifecycleProcessor  : Starting beans in phase 2147482647
	2016-04-07 19:19:46.756  INFO 76016 --- [           main] o.s.integration.channel.DirectChannel    : Channel 'testtock.anonymous.61fc01c4-17a1-46b5-9579-286413dc45e0.bridge' has 1 subscriber(s).
	2016-04-07 19:19:46.772  INFO 76016 --- [           main] .s.i.r.i.RedisQueueMessageDrivenEndpoint : started inbound.testtock.anonymous.61fc01c4-17a1-46b5-9579-286413dc45e0
	2016-04-07 19:19:46.774  INFO 76016 --- [           main] o.s.integration.channel.DirectChannel    : Channel 'xformed.anonymous.15592563-9e98-4fba-af0c-6fabd3ad4acc.bridge' has 1 subscriber(s).
	2016-04-07 19:19:46.776  INFO 76016 --- [           main] .s.i.r.i.RedisQueueMessageDrivenEndpoint : started inbound.xformed.anonymous.15592563-9e98-4fba-af0c-6fabd3ad4acc
	2016-04-07 19:19:46.778  INFO 76016 --- [           main] o.s.c.support.DefaultLifecycleProcessor  : Starting beans in phase 0
	2016-04-07 19:19:46.778  INFO 76016 --- [           main] o.s.c.support.DefaultLifecycleProcessor  : Starting beans in phase 2147482647
	2016-04-07 19:19:46.997  INFO 76016 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8081 (http)
	2016-04-07 19:19:47.016  INFO 76016 --- [           main] demo.Application                         : Started Application in 9.447 seconds (JVM running for 10.064)
	******************
	At the Source
	******************
	Sending value: hi of type class demo.domain.Foo
	******************
	At the Source
	******************
	Sending value: hi of type class demo.domain.Foo
	******************
	At the Source
	******************
	Sending value: hi of type class demo.domain.Foo
	******************
	At the Source
	******************
	Sending value: hi of type class demo.domain.Foo
	2016-04-07 19:19:50.811 ERROR 76016 --- [hannel-adapter1] o.s.c.s.b.r.RedisMessageChannelBinder$2  : Failed to deliver message; retries exhausted; message sent to queue 'ERRORS:testtock.anonymous.61fc01c4-17a1-46b5-9579-286413dc45e0' 
	
	org.springframework.messaging.converter.MessageConversionException: No converter found to convert to class demo.domain.Bar, message=GenericMessage [payload=hi, headers={contentType=text/plain, id=72274970-5e79-a8ef-d3f1-fcd4ede2fa55, timestamp=1460027990799}]
		at org.springframework.messaging.handler.annotation.support.PayloadArgumentResolver.resolveArgument(PayloadArgumentResolver.java:118) ~[spring-messaging-4.2.5.RELEASE.jar!/:4.2.5.RELEASE]
		at org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolverComposite.resolveArgument(HandlerMethodArgumentResolverComposite.java:98) ~[spring-messaging-4.2.5.RELEASE.jar!/:4.2.5.RELEASE]
		at org.springframework.messaging.handler.invocation.InvocableHandlerMethod.getMethodArgumentValues(InvocableHandlerMethod.java:138) ~[spring-messaging-4.2.5.RELEASE.jar!/:4.2.5.RELEASE]
		at org.springframework.messaging.handler.invocation.InvocableHandlerMethod.invoke(InvocableHandlerMethod.java:107) ~[spring-messaging-4.2.5.RELEASE.jar!/:4.2.5.RELEASE]
		at org.springframework.cloud.stream.binding.StreamListenerAnnotationBeanPostProcessor$StreamListenerMessageHandler.handleRequestMessage(StreamListenerAnnotationBeanPostProcessor.java:192) ~[spring-cloud-stream-1.0.0.RC1.jar!/:1.0.0.RC1]
		at org.springframework.integration.handler.AbstractReplyProducingMessageHandler.handleMessageInternal(AbstractReplyProducingMessageHandler.java:99) ~[spring-integration-core-4.2.5.RELEASE.jar!/:na]
		at org.springframework.integration.handler.AbstractMessageHandler.handleMessage(AbstractMessageHandler.java:127) ~[spring-integration-core-4.2.5.RELEASE.jar!/:na]
		at org.springframework.integration.dispatcher.AbstractDispatcher.tryOptimizedDispatch(AbstractDispatcher.java:116) ~[spring-integration-core-4.2.5.RELEASE.jar!/:na]
		at org.springframework.integration.dispatcher.UnicastingDispatcher.doDispatch(UnicastingDispatcher.java:147) ~[spring-integration-core-4.2.5.RELEASE.jar!/:na]
		at org.springframework.integration.dispatcher.UnicastingDispatcher.dispatch(UnicastingDispatcher.java:120) ~[spring-integration-core-4.2.5.RELEASE.jar!/:na]
		at org.springframework.integration.channel.AbstractSubscribableChannel.doSend(AbstractSubscribableChannel.java:77) ~[spring-integration-core-4.2.5.RELEASE.jar!/:na]
		at org.springframework.integration.channel.AbstractMessageChannel.send(AbstractMessageChannel.java:442) [spring-integration-core-4.2.5.RELEASE.jar!/:na]
		at org.springframework.integration.channel.AbstractMessageChannel.send(AbstractMessageChannel.java:392) [spring-integration-core-4.2.5.RELEASE.jar!/:na]
		at org.springframework.messaging.core.GenericMessagingTemplate.doSend(GenericMessagingTemplate.java:115) [spring-messaging-4.2.5.RELEASE.jar!/:4.2.5.RELEASE]
		at org.springframework.messaging.core.GenericMessagingTemplate.doSend(GenericMessagingTemplate.java:45) [spring-messaging-4.2.5.RELEASE.jar!/:4.2.5.RELEASE]
		at org.springframework.messaging.core.AbstractMessageSendingTemplate.send(AbstractMessageSendingTemplate.java:105) [spring-messaging-4.2.5.RELEASE.jar!/:4.2.5.RELEASE]
		at org.springframework.integration.handler.AbstractMessageProducingHandler.sendOutput(AbstractMessageProducingHandler.java:231) ~[spring-integration-core-4.2.5.RELEASE.jar!/:na]
		at org.springframework.integration.handler.AbstractMessageProducingHandler.produceOutput(AbstractMessageProducingHandler.java:154) ~[spring-integration-core-4.2.5.RELEASE.jar!/:na]
		at org.springframework.integration.handler.AbstractMessageProducingHandler.sendOutputs(AbstractMessageProducingHandler.java:102) ~[spring-integration-core-4.2.5.RELEASE.jar!/:na]
		at org.springframework.integration.handler.AbstractReplyProducingMessageHandler.handleMessageInternal(AbstractReplyProducingMessageHandler.java:105) ~[spring-integration-core-4.2.5.RELEASE.jar!/:na]
		at org.springframework.integration.handler.AbstractMessageHandler.handleMessage(AbstractMessageHandler.java:127) ~[spring-integration-core-4.2.5.RELEASE.jar!/:na]
		at org.springframework.integration.dispatcher.AbstractDispatcher.tryOptimizedDispatch(AbstractDispatcher.java:116) ~[spring-integration-core-4.2.5.RELEASE.jar!/:na]
		at org.springframework.integration.dispatcher.UnicastingDispatcher.doDispatch(UnicastingDispatcher.java:147) ~[spring-integration-core-4.2.5.RELEASE.jar!/:na]
		at org.springframework.integration.dispatcher.UnicastingDispatcher.dispatch(UnicastingDispatcher.java:120) ~[spring-integration-core-4.2.5.RELEASE.jar!/:na]
		at org.springframework.integration.channel.AbstractSubscribableChannel.doSend(AbstractSubscribableChannel.java:77) ~[spring-integration-core-4.2.5.RELEASE.jar!/:na]
		at org.springframework.integration.channel.AbstractMessageChannel.send(AbstractMessageChannel.java:442) [spring-integration-core-4.2.5.RELEASE.jar!/:na]
		at org.springframework.cloud.stream.binder.redis.RedisMessageChannelBinder$2$1.doWithRetry(RedisMessageChannelBinder.java:201) ~[spring-cloud-stream-binder-redis-1.0.0.RC1.jar!/:1.0.0.RC1]
		at org.springframework.cloud.stream.binder.redis.RedisMessageChannelBinder$2$1.doWithRetry(RedisMessageChannelBinder.java:197) ~[spring-cloud-stream-binder-redis-1.0.0.RC1.jar!/:1.0.0.RC1]
		at org.springframework.retry.support.RetryTemplate.doExecute(RetryTemplate.java:263) [spring-retry-1.1.2.RELEASE.jar!/:na]
		at org.springframework.retry.support.RetryTemplate.execute(RetryTemplate.java:168) [spring-retry-1.1.2.RELEASE.jar!/:na]
		at org.springframework.cloud.stream.binder.redis.RedisMessageChannelBinder$2.doSend(RedisMessageChannelBinder.java:197) [spring-cloud-stream-binder-redis-1.0.0.RC1.jar!/:1.0.0.RC1]
		at org.springframework.integration.channel.AbstractMessageChannel.send(AbstractMessageChannel.java:442) [spring-integration-core-4.2.5.RELEASE.jar!/:na]
		at org.springframework.integration.channel.AbstractMessageChannel.send(AbstractMessageChannel.java:392) [spring-integration-core-4.2.5.RELEASE.jar!/:na]
		at org.springframework.messaging.core.GenericMessagingTemplate.doSend(GenericMessagingTemplate.java:115) [spring-messaging-4.2.5.RELEASE.jar!/:4.2.5.RELEASE]
		at org.springframework.messaging.core.GenericMessagingTemplate.doSend(GenericMessagingTemplate.java:45) [spring-messaging-4.2.5.RELEASE.jar!/:4.2.5.RELEASE]
		at org.springframework.messaging.core.AbstractMessageSendingTemplate.send(AbstractMessageSendingTemplate.java:105) [spring-messaging-4.2.5.RELEASE.jar!/:4.2.5.RELEASE]
		at org.springframework.integration.endpoint.MessageProducerSupport.sendMessage(MessageProducerSupport.java:105) [spring-integration-core-4.2.5.RELEASE.jar!/:na]
		at org.springframework.integration.redis.inbound.RedisQueueMessageDrivenEndpoint.popMessageAndSend(RedisQueueMessageDrivenEndpoint.java:241) [spring-integration-redis-4.2.5.RELEASE.jar!/:na]
		at org.springframework.integration.redis.inbound.RedisQueueMessageDrivenEndpoint.access$300(RedisQueueMessageDrivenEndpoint.java:55) [spring-integration-redis-4.2.5.RELEASE.jar!/:na]
		at org.springframework.integration.redis.inbound.RedisQueueMessageDrivenEndpoint$ListenerTask.run(RedisQueueMessageDrivenEndpoint.java:345) [spring-integration-redis-4.2.5.RELEASE.jar!/:na]
		at org.springframework.integration.util.ErrorHandlingTaskExecutor$1.run(ErrorHandlingTaskExecutor.java:55) [spring-integration-core-4.2.5.RELEASE.jar!/:na]
		at java.lang.Thread.run(Thread.java:745) [na:1.8.0_40]
	
	******************
	At the Source
	******************
	Sending value: hi of type class demo.domain.Foo
	******************
	At the Source
	******************
	Sending value: hi of type class demo.domain.Foo
	******************
	At the Source
	******************
	Sending value: hi of type class demo.domain.Foo
	2016-04-07 19:19:53.825 ERROR 76016 --- [hannel-adapter1] o.s.c.s.b.r.RedisMessageChannelBinder$2  : Failed to deliver message; retries exhausted; message sent to queue 'ERRORS:testtock.anonymous.61fc01c4-17a1-46b5-9579-286413dc45e0' 
	
	org.springframework.messaging.converter.MessageConversionException: No converter found to convert to class demo.domain.Bar, message=GenericMessage [payload=hi, headers={contentType=text/plain, id=bdf7613e-8111-e804-0c63-41d2b06559ed, timestamp=1460027993824}]
		at org.springframework.messaging.handler.annotation.support.PayloadArgumentResolver.resolveArgument(PayloadArgumentResolver.java:118) ~[spring-messaging-4.2.5.RELEASE.jar!/:4.2.5.RELEASE]
		at org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolverComposite.resolveArgument(HandlerMethodArgumentResolverComposite.java:98) ~[spring-messaging-4.2.5.RELEASE.jar!/:4.2.5.RELEASE]
		at org.springframework.messaging.handler.invocation.InvocableHandlerMethod.getMethodArgumentValues(InvocableHandlerMethod.java:138) ~[spring-messaging-4.2.5.RELEASE.jar!/:4.2.5.RELEASE]
		at org.springframework.messaging.handler.invocation.InvocableHandlerMethod.invoke(InvocableHandlerMethod.java:107) ~[spring-messaging-4.2.5.RELEASE.jar!/:4.2.5.RELEASE]
		at org.springframework.cloud.stream.binding.StreamListenerAnnotationBeanPostProcessor$StreamListenerMessageHandler.handleRequestMessage(StreamListenerAnnotationBeanPostProcessor.java:192) ~[spring-cloud-stream-1.0.0.RC1.jar!/:1.0.0.RC1]
		at org.springframework.integration.handler.AbstractReplyProducingMessageHandler.handleMessageInternal(AbstractReplyProducingMessageHandler.java:99) ~[spring-integration-core-4.2.5.RELEASE.jar!/:na]
		at org.springframework.integration.handler.AbstractMessageHandler.handleMessage(AbstractMessageHandler.java:127) ~[spring-integration-core-4.2.5.RELEASE.jar!/:na]
		at org.springframework.integration.dispatcher.AbstractDispatcher.tryOptimizedDispatch(AbstractDispatcher.java:116) ~[spring-integration-core-4.2.5.RELEASE.jar!/:na]
		at org.springframework.integration.dispatcher.UnicastingDispatcher.doDispatch(UnicastingDispatcher.java:147) ~[spring-integration-core-4.2.5.RELEASE.jar!/:na]
		at org.springframework.integration.dispatcher.UnicastingDispatcher.dispatch(UnicastingDispatcher.java:120) ~[spring-integration-core-4.2.5.RELEASE.jar!/:na]
		at org.springframework.integration.channel.AbstractSubscribableChannel.doSend(AbstractSubscribableChannel.java:77) ~[spring-integration-core-4.2.5.RELEASE.jar!/:na]
		at org.springframework.integration.channel.AbstractMessageChannel.send(AbstractMessageChannel.java:442) [spring-integration-core-4.2.5.RELEASE.jar!/:na]
		at org.springframework.integration.channel.AbstractMessageChannel.send(AbstractMessageChannel.java:392) [spring-integration-core-4.2.5.RELEASE.jar!/:na]
		at org.springframework.messaging.core.GenericMessagingTemplate.doSend(GenericMessagingTemplate.java:115) [spring-messaging-4.2.5.RELEASE.jar!/:4.2.5.RELEASE]
		at org.springframework.messaging.core.GenericMessagingTemplate.doSend(GenericMessagingTemplate.java:45) [spring-messaging-4.2.5.RELEASE.jar!/:4.2.5.RELEASE]
		at org.springframework.messaging.core.AbstractMessageSendingTemplate.send(AbstractMessageSendingTemplate.java:105) [spring-messaging-4.2.5.RELEASE.jar!/:4.2.5.RELEASE]
		at org.springframework.integration.handler.AbstractMessageProducingHandler.sendOutput(AbstractMessageProducingHandler.java:231) ~[spring-integration-core-4.2.5.RELEASE.jar!/:na]
		at org.springframework.integration.handler.AbstractMessageProducingHandler.produceOutput(AbstractMessageProducingHandler.java:154) ~[spring-integration-core-4.2.5.RELEASE.jar!/:na]
		at org.springframework.integration.handler.AbstractMessageProducingHandler.sendOutputs(AbstractMessageProducingHandler.java:102) ~[spring-integration-core-4.2.5.RELEASE.jar!/:na]
		at org.springframework.integration.handler.AbstractReplyProducingMessageHandler.handleMessageInternal(AbstractReplyProducingMessageHandler.java:105) ~[spring-integration-core-4.2.5.RELEASE.jar!/:na]

